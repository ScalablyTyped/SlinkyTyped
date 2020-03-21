package typingsSlinky.antd.components

import org.scalablytyped.runtime.StringDictionary
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.web.html.`*`.tag
import typingsSlinky.antd.actionButtonMod.ActionButtonProps
import typingsSlinky.antd.actionButtonMod.default
import typingsSlinky.antd.buttonButtonMod.ButtonType
import typingsSlinky.antd.buttonButtonMod.NativeButtonProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object ActionButton
  extends ExternalComponentWithAttributesWithRefType[tag.type, default] {
  @JSImport("antd/lib/modal/ActionButton", JSImport.Default)
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  /* The following DOM/SVG props were specified: autoFocus */
  def apply(
    closeModal: js.Function,
    actionFn: /* repeated */ js.Any => _ | js.Thenable[_] = null,
    buttonProps: NativeButtonProps = null,
    `type`: ButtonType = null,
    _overrides: StringDictionary[js.Any] = null
  ): BuildingComponent[tag.type, default] = {
    val __obj = js.Dynamic.literal(closeModal = closeModal.asInstanceOf[js.Any])
    if (actionFn != null) __obj.updateDynamic("actionFn")(js.Any.fromFunction1(actionFn))
    if (buttonProps != null) __obj.updateDynamic("buttonProps")(buttonProps.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  type Props = ActionButtonProps
}

