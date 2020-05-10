package typingsSlinky.awsSdk.quicksightMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LogicalTable extends js.Object {
  /**
    * A display name for the logical table.
    */
  var Alias: LogicalTableAlias = js.native
  /**
    * Transform operations that act on this logical table.
    */
  var DataTransforms: js.UndefOr[TransformOperationList] = js.native
  /**
    * Source of this logical table.
    */
  var Source: LogicalTableSource = js.native
}

object LogicalTable {
  @scala.inline
  def apply(Alias: LogicalTableAlias, Source: LogicalTableSource): LogicalTable = {
    val __obj = js.Dynamic.literal(Alias = Alias.asInstanceOf[js.Any], Source = Source.asInstanceOf[js.Any])
    __obj.asInstanceOf[LogicalTable]
  }
  @scala.inline
  implicit class LogicalTableOps[Self <: LogicalTable] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAlias(value: LogicalTableAlias): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Alias")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSource(value: LogicalTableSource): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Source")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDataTransforms(value: TransformOperationList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DataTransforms")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDataTransforms: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DataTransforms")(js.undefined)
        ret
    }
  }
  
}

