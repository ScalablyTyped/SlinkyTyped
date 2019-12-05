package typingsSlinky.reactDashToastDashNotifications.components

import org.scalablytyped.runtime.StringDictionary
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.web.html.`*`.tag
import typingsSlinky.reactDashToastDashNotifications.reactDashToastDashNotificationsMod.AppearanceTypes
import typingsSlinky.reactDashToastDashNotifications.reactDashToastDashNotificationsMod.Placement
import typingsSlinky.reactDashToastDashNotifications.reactDashToastDashNotificationsMod.ToastProps
import typingsSlinky.reactDashToastDashNotifications.reactDashToastDashNotificationsMod.TransitionState
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object DefaultToast
  extends ExternalComponentWithAttributesWithRefType[
      tag.type, 
      typingsSlinky.reactDashToastDashNotifications.reactDashToastDashNotificationsMod.DefaultToast
    ] {
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
  ): BuildingComponent[
    tag.type, 
    typingsSlinky.reactDashToastDashNotifications.reactDashToastDashNotificationsMod.DefaultToast
  ] = {
    val __obj = js.Dynamic.literal(appearance = appearance.asInstanceOf[js.Any], autoDismiss = autoDismiss.asInstanceOf[js.Any], autoDismissTimeout = autoDismissTimeout.asInstanceOf[js.Any], isRunning = isRunning.asInstanceOf[js.Any], onDismiss = js.Any.fromFunction1(onDismiss), onMouseEnter = js.Any.fromFunction0(onMouseEnter), onMouseLeave = js.Any.fromFunction0(onMouseLeave), placement = placement.asInstanceOf[js.Any], transitionDuration = transitionDuration.asInstanceOf[js.Any], transitionState = transitionState.asInstanceOf[js.Any])
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  type Props = ToastProps
}

