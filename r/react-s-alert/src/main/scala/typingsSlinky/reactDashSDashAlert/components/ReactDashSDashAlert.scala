package typingsSlinky.reactDashSDashAlert.components

import org.scalablytyped.runtime.StringDictionary
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.core.TagMod
import slinky.web.html.`*`.tag
import typingsSlinky.reactDashSDashAlert.reactDashSDashAlertMod.SAlert.SAlertBeepProps
import typingsSlinky.reactDashSDashAlert.reactDashSDashAlertMod.SAlert.SAlertProps
import typingsSlinky.reactDashSDashAlert.reactDashSDashAlertMod.SAlert.SAlertStackProps
import typingsSlinky.reactDashSDashAlert.reactDashSDashAlertMod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object ReactDashSDashAlert
  extends ExternalComponentWithAttributesWithRefType[tag.type, default] {
  @JSImport("react-s-alert", JSImport.Default)
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  def apply(
    beep: String | Boolean | SAlertBeepProps = null,
    contentTemplate: /* repeated */ js.Any => _ = null,
    customFields: js.Object = null,
    effect: String = null,
    html: js.UndefOr[Boolean] = js.undefined,
    message: String = null,
    offset: Int | Double = null,
    onClose: () => Unit = null,
    onShow: () => Unit = null,
    position: String = null,
    stack: Boolean | SAlertStackProps = null,
    timeout: String | Double = null,
    _overrides: StringDictionary[js.Any] = null
  ): BuildingComponent[tag.type, default] = {
    val __obj = js.Dynamic.literal()
    if (beep != null) __obj.updateDynamic("beep")(beep.asInstanceOf[js.Any])
    if (contentTemplate != null) __obj.updateDynamic("contentTemplate")(js.Any.fromFunction1(contentTemplate))
    if (customFields != null) __obj.updateDynamic("customFields")(customFields.asInstanceOf[js.Any])
    if (effect != null) __obj.updateDynamic("effect")(effect.asInstanceOf[js.Any])
    if (!js.isUndefined(html)) __obj.updateDynamic("html")(html.asInstanceOf[js.Any])
    if (message != null) __obj.updateDynamic("message")(message.asInstanceOf[js.Any])
    if (offset != null) __obj.updateDynamic("offset")(offset.asInstanceOf[js.Any])
    if (onClose != null) __obj.updateDynamic("onClose")(js.Any.fromFunction0(onClose))
    if (onShow != null) __obj.updateDynamic("onShow")(js.Any.fromFunction0(onShow))
    if (position != null) __obj.updateDynamic("position")(position.asInstanceOf[js.Any])
    if (stack != null) __obj.updateDynamic("stack")(stack.asInstanceOf[js.Any])
    if (timeout != null) __obj.updateDynamic("timeout")(timeout.asInstanceOf[js.Any])
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  def apply(mods: TagMod[tag.type]*): BuildingComponent[tag.type, default] = new slinky.core.BuildingComponent[
  slinky.web.html.`*`.tag.type, 
  typingsSlinky.reactDashSDashAlert.reactDashSDashAlertMod.default](js.Array(component.asInstanceOf[js.Any], js.Dictionary.empty)).apply(mods: _*)
  type Props = SAlertProps
}

