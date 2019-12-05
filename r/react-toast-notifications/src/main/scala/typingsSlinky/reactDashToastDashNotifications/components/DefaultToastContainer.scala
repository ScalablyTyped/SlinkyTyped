package typingsSlinky.reactDashToastDashNotifications.components

import org.scalablytyped.runtime.StringDictionary
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.web.html.`*`.tag
import typingsSlinky.reactDashToastDashNotifications.reactDashToastDashNotificationsMod.Placement
import typingsSlinky.reactDashToastDashNotifications.reactDashToastDashNotificationsMod.ToastContainerProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object DefaultToastContainer
  extends ExternalComponentWithAttributesWithRefType[
      tag.type, 
      typingsSlinky.reactDashToastDashNotifications.reactDashToastDashNotificationsMod.DefaultToastContainer
    ] {
  @JSImport("react-toast-notifications", "DefaultToastContainer")
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  def apply(hasToasts: Boolean, placement: Placement, _overrides: StringDictionary[js.Any] = null): BuildingComponent[
    tag.type, 
    typingsSlinky.reactDashToastDashNotifications.reactDashToastDashNotificationsMod.DefaultToastContainer
  ] = {
    val __obj = js.Dynamic.literal(hasToasts = hasToasts.asInstanceOf[js.Any], placement = placement.asInstanceOf[js.Any])
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  type Props = ToastContainerProps
}

