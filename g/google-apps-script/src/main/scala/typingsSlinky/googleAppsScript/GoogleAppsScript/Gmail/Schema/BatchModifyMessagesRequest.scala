package typingsSlinky.googleAppsScript.GoogleAppsScript.Gmail.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BatchModifyMessagesRequest extends js.Object {
  var addLabelIds: js.UndefOr[js.Array[String]] = js.native
  var ids: js.UndefOr[js.Array[String]] = js.native
  var removeLabelIds: js.UndefOr[js.Array[String]] = js.native
}

object BatchModifyMessagesRequest {
  @scala.inline
  def apply(): BatchModifyMessagesRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BatchModifyMessagesRequest]
  }
  @scala.inline
  implicit class BatchModifyMessagesRequestOps[Self <: BatchModifyMessagesRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAddLabelIds(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("addLabelIds")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAddLabelIds: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("addLabelIds")(js.undefined)
        ret
    }
    @scala.inline
    def withIds(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ids")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIds: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ids")(js.undefined)
        ret
    }
    @scala.inline
    def withRemoveLabelIds(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("removeLabelIds")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRemoveLabelIds: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("removeLabelIds")(js.undefined)
        ret
    }
  }
  
}

