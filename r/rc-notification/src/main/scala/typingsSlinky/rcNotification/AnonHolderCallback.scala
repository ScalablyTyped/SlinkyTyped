package typingsSlinky.rcNotification

import org.scalajs.dom.raw.HTMLDivElement
import typingsSlinky.rcNotification.notificationMod.HolderReadyCallback
import typingsSlinky.rcNotification.notificationMod.NoticeContent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonHolderCallback extends js.Object {
  var holderCallback: js.UndefOr[HolderReadyCallback] = js.native
  var notice: NoticeContent = js.native
}

object AnonHolderCallback {
  @scala.inline
  def apply(notice: NoticeContent): AnonHolderCallback = {
    val __obj = js.Dynamic.literal(notice = notice.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonHolderCallback]
  }
  @scala.inline
  implicit class AnonHolderCallbackOps[Self <: AnonHolderCallback] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withNotice(value: NoticeContent): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("notice")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHolderCallback(value: (/* div */ HTMLDivElement, /* noticeProps */ NoticePropskeyKey) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("holderCallback")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutHolderCallback: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("holderCallback")(js.undefined)
        ret
    }
  }
  
}

