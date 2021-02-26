package typingsSlinky.reapop.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.reapop.notificationButtonMod.Props
import typingsSlinky.reapop.themesTypesMod.Theme
import typingsSlinky.reapop.typesMod.Notification
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object NotificationButton {
  
  @scala.inline
  def apply(
    button: typingsSlinky.reapop.typesMod.NotificationButton,
    notification: Notification,
    position: Double
  ): Builder = {
    val __props = js.Dynamic.literal(button = button.asInstanceOf[js.Any], notification = notification.asInstanceOf[js.Any], position = position.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[Props]))
  }
  
  @JSImport("reapop/dist/components/NotificationButton", "NotificationButton")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, js.Object] {
    
    @scala.inline
    def theme(value: Theme): this.type = set("theme", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: Props): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
