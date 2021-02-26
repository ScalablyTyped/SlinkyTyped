package typingsSlinky.antd

import slinky.core.facade.ReactElement
import typingsSlinky.antd.anon.Instance
import typingsSlinky.antd.messageMod.ArgsProps
import typingsSlinky.antd.messageMod.MessageInstance
import typingsSlinky.rcNotification.notificationMod.NoticeContent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object useMessageMod {
  
  @JSImport("antd/lib/message/hooks/useMessage", JSImport.Default)
  @js.native
  def default(
    getRcNotificationInstance: js.Function2[/* args */ ArgsProps, /* callback */ js.Function1[/* info */ Instance, Unit], Unit],
    getRCNoticeProps: js.Function2[/* args */ ArgsProps, /* prefixCls */ String, NoticeContent]
  ): js.Function0[js.Tuple2[MessageInstance, ReactElement]] = js.native
}
