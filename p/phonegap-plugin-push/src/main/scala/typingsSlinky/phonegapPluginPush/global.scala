package typingsSlinky.phonegapPluginPush

import org.scalablytyped.runtime.TopLevel
import typingsSlinky.phonegapPluginPush.PhonegapPluginPush.InitOptions
import typingsSlinky.phonegapPluginPush.PhonegapPluginPush.PushNotificationStatic
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobalScope
@js.native
object global extends js.Object {
  
  @js.native
  class PushNotification protected ()
    extends typingsSlinky.phonegapPluginPush.PhonegapPluginPush.PushNotification {
    def this(options: InitOptions) = this()
  }
  @js.native
  object PushNotification extends TopLevel[PushNotificationStatic]
}
