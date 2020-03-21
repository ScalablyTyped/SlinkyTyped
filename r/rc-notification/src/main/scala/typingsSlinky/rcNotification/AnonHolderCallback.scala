package typingsSlinky.rcNotification

import org.scalajs.dom.raw.HTMLDivElement
import typingsSlinky.rcNotification.notificationMod.HolderReadyCallback
import typingsSlinky.rcNotification.notificationMod.NoticeContent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonHolderCallback extends js.Object {
  var holderCallback: js.UndefOr[HolderReadyCallback] = js.undefined
  var notice: NoticeContent
}

object AnonHolderCallback {
  @scala.inline
  def apply(
    notice: NoticeContent,
    holderCallback: (/* div */ HTMLDivElement, /* noticeProps */ NoticePropskeyKey) => Unit = null
  ): AnonHolderCallback = {
    val __obj = js.Dynamic.literal(notice = notice.asInstanceOf[js.Any])
    if (holderCallback != null) __obj.updateDynamic("holderCallback")(js.Any.fromFunction2(holderCallback))
    __obj.asInstanceOf[AnonHolderCallback]
  }
}

