package typingsSlinky.mfiles

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IMFDocListCtrl extends js.Object {
  def AttachToListingWindow(shellListing: js.Any): Unit = js.native
}

object IMFDocListCtrl {
  @scala.inline
  def apply(AttachToListingWindow: js.Any => Unit): IMFDocListCtrl = {
    val __obj = js.Dynamic.literal(AttachToListingWindow = js.Any.fromFunction1(AttachToListingWindow))
    __obj.asInstanceOf[IMFDocListCtrl]
  }
  @scala.inline
  implicit class IMFDocListCtrlOps[Self <: IMFDocListCtrl] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAttachToListingWindow(value: js.Any => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AttachToListingWindow")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

