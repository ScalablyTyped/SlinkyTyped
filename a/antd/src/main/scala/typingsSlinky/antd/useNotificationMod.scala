package typingsSlinky.antd

import slinky.core.facade.ReactElement
import typingsSlinky.antd.anon.Instance
import typingsSlinky.antd.notificationMod.ArgsProps
import typingsSlinky.antd.notificationMod.NotificationInstance
import typingsSlinky.rcNotification.notificationMod.NoticeContent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object useNotificationMod {
  
  @JSImport("antd/lib/notification/hooks/useNotification", JSImport.Default)
  @js.native
  def default(
    getNotificationInstance: js.Function2[/* args */ ArgsProps, /* callback */ js.Function1[/* info */ Instance, Unit], Unit],
    getRCNoticeProps: js.Function2[/* args */ ArgsProps, /* prefixCls */ String, NoticeContent]
  ): js.Function0[js.Tuple2[NotificationInstance, ReactElement]] = js.native
}
