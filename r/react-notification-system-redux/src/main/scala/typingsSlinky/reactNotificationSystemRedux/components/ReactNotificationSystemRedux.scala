package typingsSlinky.reactNotificationSystemRedux.components

import org.scalablytyped.runtime.StringDictionary
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.core.TagMod
import slinky.web.html.`*`.tag
import typingsSlinky.reactNotificationSystem.mod.Notification
import typingsSlinky.reactNotificationSystem.mod.Style
import typingsSlinky.reactNotificationSystemRedux.mod.NotificationsProps
import typingsSlinky.reactNotificationSystemRedux.mod.^
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object ReactNotificationSystemRedux
  extends ExternalComponentWithAttributesWithRefType[tag.type, ^] {
  @JSImport("react-notification-system-redux", JSImport.Namespace)
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  def apply(
    allowHTML: js.UndefOr[Boolean] = js.undefined,
    noAnimation: js.UndefOr[Boolean] = js.undefined,
    notifications: js.Array[Notification] = null,
    style: Style | Boolean = null,
    _overrides: StringDictionary[js.Any] = null
  ): BuildingComponent[tag.type, ^] = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(allowHTML)) __obj.updateDynamic("allowHTML")(allowHTML.asInstanceOf[js.Any])
    if (!js.isUndefined(noAnimation)) __obj.updateDynamic("noAnimation")(noAnimation.asInstanceOf[js.Any])
    if (notifications != null) __obj.updateDynamic("notifications")(notifications.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  def apply(mods: TagMod[tag.type]*): BuildingComponent[tag.type, ^] = new slinky.core.BuildingComponent[slinky.web.html.`*`.tag.type, typingsSlinky.reactNotificationSystemRedux.mod.^](js.Array(component.asInstanceOf[js.Any], js.Dictionary.empty)).apply(mods: _*)
  type Props = NotificationsProps
}

