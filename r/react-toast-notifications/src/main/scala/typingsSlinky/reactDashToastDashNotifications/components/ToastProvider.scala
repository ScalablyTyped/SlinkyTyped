package typingsSlinky.reactDashToastDashNotifications.components

import org.scalablytyped.runtime.StringDictionary
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.core.TagMod
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
    autoDismiss: Boolean | Double = null,
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
    if (autoDismiss != null) __obj.updateDynamic("autoDismiss")(autoDismiss.asInstanceOf[js.Any])
    if (autoDismissTimeout != null) __obj.updateDynamic("autoDismissTimeout")(autoDismissTimeout.asInstanceOf[js.Any])
    if (components != null) __obj.updateDynamic("components")(components.asInstanceOf[js.Any])
    if (placement != null) __obj.updateDynamic("placement")(placement.asInstanceOf[js.Any])
    if (transitionDuration != null) __obj.updateDynamic("transitionDuration")(transitionDuration.asInstanceOf[js.Any])
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  def apply(mods: TagMod[tag.type]*): BuildingComponent[
    tag.type, 
    typingsSlinky.reactDashToastDashNotifications.reactDashToastDashNotificationsMod.ToastProvider
  ] = new slinky.core.BuildingComponent[
  slinky.web.html.`*`.tag.type, 
  typingsSlinky.reactDashToastDashNotifications.reactDashToastDashNotificationsMod.ToastProvider](js.Array(component.asInstanceOf[js.Any], js.Dictionary.empty)).apply(mods: _*)
  type Props = ToastProviderProps
}

