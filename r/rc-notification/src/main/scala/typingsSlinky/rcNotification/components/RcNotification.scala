package typingsSlinky.rcNotification.components

import typingsSlinky.rcNotification.mod.default
import typingsSlinky.rcNotification.notificationMod.NotificationProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object RcNotification {
  
  @JSImport("rc-notification", JSImport.Default)
  @js.native
  val component: js.Object = js.native
  
  implicit def make(companion: RcNotification.type): SharedBuilder_NotificationProps131694593[default] = new SharedBuilder_NotificationProps131694593[default](js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: NotificationProps): SharedBuilder_NotificationProps131694593[default] = new SharedBuilder_NotificationProps131694593[default](js.Array(this.component, p.asInstanceOf[js.Any]))
}
