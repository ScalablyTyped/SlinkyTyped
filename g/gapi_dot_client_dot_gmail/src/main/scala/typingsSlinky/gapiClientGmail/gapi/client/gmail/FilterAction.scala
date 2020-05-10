package typingsSlinky.gapiClientGmail.gapi.client.gmail

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FilterAction extends js.Object {
  /** List of labels to add to the message. */
  var addLabelIds: js.UndefOr[js.Array[String]] = js.native
  /** Email address that the message should be forwarded to. */
  var forward: js.UndefOr[String] = js.native
  /** List of labels to remove from the message. */
  var removeLabelIds: js.UndefOr[js.Array[String]] = js.native
}

object FilterAction {
  @scala.inline
  def apply(): FilterAction = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FilterAction]
  }
  @scala.inline
  implicit class FilterActionOps[Self <: FilterAction] (val x: Self) extends AnyVal {
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
    def withForward(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("forward")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutForward: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("forward")(js.undefined)
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

