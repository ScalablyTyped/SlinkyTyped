package typingsSlinky.reapop.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.reapop.componentsContextMod.ComponentContextType
import typingsSlinky.reapop.notificationsSystemMod.Props
import typingsSlinky.reapop.themesTypesMod.Theme
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object NotificationsSystem {
  
  @JSImport("reapop/dist/components/NotificationsSystem", JSImport.Default)
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, js.Object] {
    
    @scala.inline
    def components(value: ComponentContextType): this.type = set("components", value.asInstanceOf[js.Any])
    
    @scala.inline
    def smallScreenBreakpoint(value: Double): this.type = set("smallScreenBreakpoint", value.asInstanceOf[js.Any])
    
    @scala.inline
    def theme(value: Theme): this.type = set("theme", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: Props): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  
  @scala.inline
  def apply(
    dismissNotification: /* id */ String => Unit,
    notifications: js.Array[typingsSlinky.reapop.typesMod.Notification]
  ): Builder = {
    val __props = js.Dynamic.literal(dismissNotification = js.Any.fromFunction1(dismissNotification), notifications = notifications.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[Props]))
  }
}
