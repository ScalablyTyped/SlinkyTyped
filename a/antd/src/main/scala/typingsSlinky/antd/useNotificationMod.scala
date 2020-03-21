package typingsSlinky.antd

import slinky.core.facade.ReactElement
import typingsSlinky.antd.notificationMod.ArgsProps
import typingsSlinky.antd.notificationMod.NotificationInstance
import typingsSlinky.rcNotification.notificationMod.NoticeContent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("antd/lib/notification/hooks/useNotification", JSImport.Namespace)
@js.native
object useNotificationMod extends js.Object {
  def default(
    getNotificationInstance: js.Function2[
      /* args */ ArgsProps, 
      /* callback */ js.Function1[/* info */ AnonInstance, Unit], 
      Unit
    ],
    getRCNoticeProps: js.Function2[/* args */ ArgsProps, /* prefixCls */ String, NoticeContent]
  ): js.Function0[js.Tuple2[NotificationInstance, ReactElement]] = js.native
}

