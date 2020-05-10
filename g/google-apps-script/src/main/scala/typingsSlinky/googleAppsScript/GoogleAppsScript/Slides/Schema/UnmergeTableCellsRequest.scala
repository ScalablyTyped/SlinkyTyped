package typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UnmergeTableCellsRequest extends js.Object {
  var objectId: js.UndefOr[String] = js.native
  var tableRange: js.UndefOr[TableRange] = js.native
}

object UnmergeTableCellsRequest {
  @scala.inline
  def apply(): UnmergeTableCellsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UnmergeTableCellsRequest]
  }
  @scala.inline
  implicit class UnmergeTableCellsRequestOps[Self <: UnmergeTableCellsRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withObjectId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("objectId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutObjectId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("objectId")(js.undefined)
        ret
    }
    @scala.inline
    def withTableRange(value: TableRange): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tableRange")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTableRange: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tableRange")(js.undefined)
        ret
    }
  }
  
}

