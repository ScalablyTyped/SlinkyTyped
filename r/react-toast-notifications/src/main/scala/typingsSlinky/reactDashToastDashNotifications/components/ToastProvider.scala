package typingsSlinky.reactDashToastDashNotifications.components

import org.scalablytyped.runtime.StringDictionary
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.web.html.`*`.tag
import typingsSlinky.reactDashToastDashNotifications.Anon_Toast
import typingsSlinky.reactDashToastDashNotifications.reactDashToastDashNotificationsMod.Placement
import typingsSlinky.reactDashToastDashNotifications.reactDashToastDashNotificationsMod.ToastProviderProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object ToastProvider
  extends ExternalComponentWithAttributesWithRefType[
      tag.type, 
      typingsSlinky.reactDashToastDashNotifications.reactDashToastDashNotificationsMod.ToastProvider
    ] {
  @JSImport("react-toast-notifications", "ToastProvider")
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  def apply(
    autoDismissTimeout: Int | Double = null,
    components: Anon_Toast = null,
    placement: Placement = null,
    transitionDuration: Int | Double = null,
    _overrides: StringDictionary[js.Any] = null
  ): BuildingComponent[
    tag.type, 
    typingsSlinky.reactDashToastDashNotifications.reactDashToastDashNotificationsMod.ToastProvider
  ] = {
    val __obj = js.Dynamic.literal()
    if (autoDismissTimeout != null) __obj.updateDynamic("autoDismissTimeout")(autoDismissTimeout.asInstanceOf[js.Any])
    if (components != null) __obj.updateDynamic("components")(components.asInstanceOf[js.Any])
    if (placement != null) __obj.updateDynamic("placement")(placement.asInstanceOf[js.Any])
    if (transitionDuration != null) __obj.updateDynamic("transitionDuration")(transitionDuration.asInstanceOf[js.Any])
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  type Props = ToastProviderProps
}

