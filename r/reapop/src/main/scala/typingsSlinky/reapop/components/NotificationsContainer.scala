package typingsSlinky.reapop.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent.Default
import typingsSlinky.reapop.notificationsContainerMod.Props
import typingsSlinky.reapop.typesMod.Position
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object NotificationsContainer {
  
  @JSImport("reapop/dist/components/NotificationsContainer", JSImport.Default)
  @js.native
  object component extends js.Object
  
  def withProps(p: Props): Default[tag.type, js.Object] = new Default[tag.type, js.Object](js.Array(this.component, p.asInstanceOf[js.Any]))
  
  @scala.inline
  def apply(
    dismissNotification: /* id */ String => Unit,
    notifications: js.Array[typingsSlinky.reapop.typesMod.Notification],
    position: Position,
    singleContainer: Boolean
  ): Default[tag.type, js.Object] = {
    val __props = js.Dynamic.literal(dismissNotification = js.Any.fromFunction1(dismissNotification), notifications = notifications.asInstanceOf[js.Any], position = position.asInstanceOf[js.Any], singleContainer = singleContainer.asInstanceOf[js.Any])
    new Default[tag.type, js.Object](js.Array(this.component, __props.asInstanceOf[Props]))
  }
}
