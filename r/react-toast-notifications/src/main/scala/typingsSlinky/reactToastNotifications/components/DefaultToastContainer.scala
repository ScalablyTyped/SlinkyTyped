package typingsSlinky.reactToastNotifications.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent.Default
import typingsSlinky.reactToastNotifications.mod.Placement
import typingsSlinky.reactToastNotifications.mod.ToastContainerProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object DefaultToastContainer {
  
  @JSImport("react-toast-notifications", "DefaultToastContainer")
  @js.native
  object component extends js.Object
  
  def withProps(p: ToastContainerProps): Default[tag.type, js.Object] = new Default[tag.type, js.Object](js.Array(this.component, p.asInstanceOf[js.Any]))
  
  @scala.inline
  def apply(hasToasts: Boolean, placement: Placement): Default[tag.type, js.Object] = {
    val __props = js.Dynamic.literal(hasToasts = hasToasts.asInstanceOf[js.Any], placement = placement.asInstanceOf[js.Any])
    new Default[tag.type, js.Object](js.Array(this.component, __props.asInstanceOf[ToastContainerProps]))
  }
}
