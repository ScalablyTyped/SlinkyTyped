package typingsSlinky.kendoUi.kendo.ui

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DropDownTreeMessages extends js.Object {
  var clear: js.UndefOr[String] = js.native
  var deleteTag: js.UndefOr[String] = js.native
  var singleTag: js.UndefOr[String] = js.native
}

object DropDownTreeMessages {
  @scala.inline
  def apply(): DropDownTreeMessages = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DropDownTreeMessages]
  }
  @scala.inline
  implicit class DropDownTreeMessagesOps[Self <: DropDownTreeMessages] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withClear(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clear")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutClear: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clear")(js.undefined)
        ret
    }
    @scala.inline
    def withDeleteTag(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deleteTag")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDeleteTag: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deleteTag")(js.undefined)
        ret
    }
    @scala.inline
    def withSingleTag(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("singleTag")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSingleTag: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("singleTag")(js.undefined)
        ret
    }
  }
  
}

