package typingsSlinky.reactToastNotifications.components

import org.scalablytyped.runtime.StringDictionary
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.web.html.`*`.tag
import typingsSlinky.reactToastNotifications.mod.AppearanceTypes
import typingsSlinky.reactToastNotifications.mod.Placement
import typingsSlinky.reactToastNotifications.mod.ToastProps
import typingsSlinky.reactToastNotifications.mod.TransitionState
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object DefaultToast
  extends ExternalComponentWithAttributesWithRefType[tag.type, typingsSlinky.reactToastNotifications.mod.DefaultToast] {
  @JSImport("react-toast-notifications", "DefaultToast")
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
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
    transitionState: TransitionState,
    _overrides: StringDictionary[js.Any] = null
  ): BuildingComponent[tag.type, typingsSlinky.reactToastNotifications.mod.DefaultToast] = {
    val __obj = js.Dynamic.literal(appearance = appearance.asInstanceOf[js.Any], autoDismiss = autoDismiss.asInstanceOf[js.Any], autoDismissTimeout = autoDismissTimeout.asInstanceOf[js.Any], isRunning = isRunning.asInstanceOf[js.Any], onDismiss = js.Any.fromFunction1(onDismiss), onMouseEnter = js.Any.fromFunction0(onMouseEnter), onMouseLeave = js.Any.fromFunction0(onMouseLeave), placement = placement.asInstanceOf[js.Any], transitionDuration = transitionDuration.asInstanceOf[js.Any], transitionState = transitionState.asInstanceOf[js.Any])
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  type Props = ToastProps
}

