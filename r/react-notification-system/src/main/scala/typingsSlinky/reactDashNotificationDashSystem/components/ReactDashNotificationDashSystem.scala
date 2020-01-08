package typingsSlinky.reactDashNotificationDashSystem.components

import org.scalablytyped.runtime.StringDictionary
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.core.TagMod
import slinky.web.html.`*`.tag
import typingsSlinky.reactDashNotificationDashSystem.reactDashNotificationDashSystemMod.Attributes
import typingsSlinky.reactDashNotificationDashSystem.reactDashNotificationDashSystemMod.Style
import typingsSlinky.reactDashNotificationDashSystem.reactDashNotificationDashSystemMod.^
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object ReactDashNotificationDashSystem
  extends ExternalComponentWithAttributesWithRefType[tag.type, ^] {
  @JSImport("react-notification-system", JSImport.Namespace)
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  def apply(
    allowHTML: js.UndefOr[Boolean] = js.undefined,
    noAnimation: js.UndefOr[Boolean] = js.undefined,
    style: Style | Boolean = null,
    _overrides: StringDictionary[js.Any] = null
  ): BuildingComponent[tag.type, ^] = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(allowHTML)) __obj.updateDynamic("allowHTML")(allowHTML.asInstanceOf[js.Any])
    if (!js.isUndefined(noAnimation)) __obj.updateDynamic("noAnimation")(noAnimation.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  def apply(mods: TagMod[tag.type]*): BuildingComponent[tag.type, ^] = new slinky.core.BuildingComponent[
  slinky.web.html.`*`.tag.type, 
  typingsSlinky.reactDashNotificationDashSystem.reactDashNotificationDashSystemMod.^](js.Array(component.asInstanceOf[js.Any], js.Dictionary.empty)).apply(mods: _*)
  type Props = Attributes
}

