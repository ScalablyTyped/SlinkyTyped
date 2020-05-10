package typingsSlinky.awsSdk.lakeformationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ColumnWildcard extends js.Object {
  /**
    * Excludes column names. Any column with this name will be excluded.
    */
  var ExcludedColumnNames: js.UndefOr[ColumnNames] = js.native
}

object ColumnWildcard {
  @scala.inline
  def apply(): ColumnWildcard = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ColumnWildcard]
  }
  @scala.inline
  implicit class ColumnWildcardOps[Self <: ColumnWildcard] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withExcludedColumnNames(value: ColumnNames): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ExcludedColumnNames")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExcludedColumnNames: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ExcludedColumnNames")(js.undefined)
        ret
    }
  }
  
}

