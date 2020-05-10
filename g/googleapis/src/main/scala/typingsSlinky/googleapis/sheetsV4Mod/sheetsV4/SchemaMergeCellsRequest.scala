package typingsSlinky.googleapis.sheetsV4Mod.sheetsV4

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Merges all cells in the range.
  */
@js.native
trait SchemaMergeCellsRequest extends js.Object {
  /**
    * How the cells should be merged.
    */
  var mergeType: js.UndefOr[String] = js.native
  /**
    * The range of cells to merge.
    */
  var range: js.UndefOr[SchemaGridRange] = js.native
}

object SchemaMergeCellsRequest {
  @scala.inline
  def apply(): SchemaMergeCellsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaMergeCellsRequest]
  }
  @scala.inline
  implicit class SchemaMergeCellsRequestOps[Self <: SchemaMergeCellsRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withMergeType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mergeType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMergeType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mergeType")(js.undefined)
        ret
    }
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
  }
  
}

