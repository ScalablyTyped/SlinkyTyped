package typingsSlinky.antd.components

import org.scalablytyped.runtime.StringDictionary
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.web.html.`*`.tag
import typingsSlinky.antd.esButtonButtonMod.ButtonType
import typingsSlinky.antd.esButtonButtonMod.NativeButtonProps
import typingsSlinky.antd.esModalActionButtonMod.ActionButtonProps
import typingsSlinky.antd.esModalActionButtonMod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* The following DOM/SVG props were specified: autoFocus */
object ActionButton
  extends ExternalComponentWithAttributesWithRefType[tag.type, default] {
  override val component: String | js.Object = js.constructorOf[typingsSlinky.antd.esModalActionButtonMod.default].asInstanceOf[String | js.Object]
  def apply(
    closeModal: js.Function,
    actionFn: /* repeated */ js.Any => _ | js.Thenable[_] = null,
    buttonProps: NativeButtonProps = null,
    `type`: ButtonType = null,
    overrides: StringDictionary[js.Any] = null
  ): BuildingComponent[tag.type, default] = {
    val __obj = js.Dynamic.literal(closeModal = closeModal.asInstanceOf[js.Any])
    if (actionFn != null) __obj.updateDynamic("actionFn")(js.Any.fromFunction1(actionFn))
    if (buttonProps != null) __obj.updateDynamic("buttonProps")(buttonProps.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (overrides != null) js.Dynamic.global.Object.assign(__obj, overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  type Props = ActionButtonProps
}

