package typingsSlinky.reactToastNotifications.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent.Default
import typingsSlinky.reactToastNotifications.mod.AppearanceTypes
import typingsSlinky.reactToastNotifications.mod.Placement
import typingsSlinky.reactToastNotifications.mod.ToastProps
import typingsSlinky.reactToastNotifications.mod.TransitionState
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object DefaultToast {
  
  @scala.inline
  def apply(
    appearance: AppearanceTypes,
    autoDismiss: Boolean | Double,
    autoDismissTimeout: Double,
    isRunning: Boolean,
    onDismiss: js.UndefOr[String] => Unit,
    onMouseEnter: () => Unit,
    onMouseLeave: () => Unit,
    placement: Placement,
    transitionDuration: Double,
    transitionState: TransitionState
  ): Default[tag.type, js.Object] = {
    val __props = js.Dynamic.literal(appearance = appearance.asInstanceOf[js.Any], autoDismiss = autoDismiss.asInstanceOf[js.Any], autoDismissTimeout = autoDismissTimeout.asInstanceOf[js.Any], isRunning = isRunning.asInstanceOf[js.Any], onDismiss = js.Any.fromFunction1(onDismiss), onMouseEnter = js.Any.fromFunction0(onMouseEnter), onMouseLeave = js.Any.fromFunction0(onMouseLeave), placement = placement.asInstanceOf[js.Any], transitionDuration = transitionDuration.asInstanceOf[js.Any], transitionState = transitionState.asInstanceOf[js.Any])
    new Default[tag.type, js.Object](js.Array(this.component, __props.asInstanceOf[ToastProps]))
  }
  
  @JSImport("react-toast-notifications", "DefaultToast")
  @js.native
  val component: js.Object = js.native
  
  def withProps(p: ToastProps): Default[tag.type, js.Object] = new Default[tag.type, js.Object](js.Array(this.component, p.asInstanceOf[js.Any]))
}
