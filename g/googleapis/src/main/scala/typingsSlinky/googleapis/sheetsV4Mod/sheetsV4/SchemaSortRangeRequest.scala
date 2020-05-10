package typingsSlinky.googleapis.sheetsV4Mod.sheetsV4

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Sorts data in rows based on a sort order per column.
  */
@js.native
trait SchemaSortRangeRequest extends js.Object {
  /**
    * The range to sort.
    */
  var range: js.UndefOr[SchemaGridRange] = js.native
  /**
    * The sort order per column. Later specifications are used when values are
    * equal in the earlier specifications.
    */
  var sortSpecs: js.UndefOr[js.Array[SchemaSortSpec]] = js.native
}

object SchemaSortRangeRequest {
  @scala.inline
  def apply(): SchemaSortRangeRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaSortRangeRequest]
  }
  @scala.inline
  implicit class SchemaSortRangeRequestOps[Self <: SchemaSortRangeRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withRange(value: SchemaGridRange): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("range")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRange: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("range")(js.undefined)
        ret
    }
    @scala.inline
    def withSortSpecs(value: js.Array[SchemaSortSpec]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sortSpecs")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSortSpecs: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sortSpecs")(js.undefined)
        ret
    }
  }
  
}

