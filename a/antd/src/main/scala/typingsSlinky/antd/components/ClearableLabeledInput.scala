package typingsSlinky.antd.components

import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.raw.HTMLElement
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.core.TagMod
import slinky.core.facade.ReactElement
import slinky.web.SyntheticMouseEvent
import slinky.web.html.`*`.tag
import typingsSlinky.antd.antdStrings.input
import typingsSlinky.antd.antdStrings.large
import typingsSlinky.antd.antdStrings.small
import typingsSlinky.antd.antdStrings.text
import typingsSlinky.antd.libInputClearableLabeledInputMod.ClearableInputProps
import typingsSlinky.antd.libInputClearableLabeledInputMod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object ClearableLabeledInput
  extends ExternalComponentWithAttributesWithRefType[tag.type, default] {
  @JSImport("antd/lib/input/ClearableLabeledInput", JSImport.Default)
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  /* The following DOM/SVG props were specified: className, disabled */
  def apply(
    element: ReactElement,
    handleReset: SyntheticMouseEvent[HTMLElement] => Unit,
    inputType: text | input,
    prefixCls: String,
    addonAfter: TagMod[Any] = null,
    addonBefore: TagMod[Any] = null,
    allowClear: js.UndefOr[Boolean] = js.undefined,
    defaultValue: js.Any = null,
    prefix: TagMod[Any] = null,
    size: small | typingsSlinky.antd.antdStrings.default | large = null,
    style: js.Object = null,
    suffix: TagMod[Any] = null,
    value: js.Any = null,
    overrides: StringDictionary[js.Any] = null
  ): BuildingComponent[tag.type, default] = {
    val __obj = js.Dynamic.literal(element = element.asInstanceOf[js.Any], handleReset = js.Any.fromFunction1(handleReset), inputType = inputType.asInstanceOf[js.Any], prefixCls = prefixCls.asInstanceOf[js.Any])
    if (addonAfter != null) __obj.updateDynamic("addonAfter")(addonAfter.asInstanceOf[js.Any])
    if (addonBefore != null) __obj.updateDynamic("addonBefore")(addonBefore.asInstanceOf[js.Any])
    if (!js.isUndefined(allowClear)) __obj.updateDynamic("allowClear")(allowClear.asInstanceOf[js.Any])
    if (defaultValue != null) __obj.updateDynamic("defaultValue")(defaultValue.asInstanceOf[js.Any])
    if (prefix != null) __obj.updateDynamic("prefix")(prefix.asInstanceOf[js.Any])
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (suffix != null) __obj.updateDynamic("suffix")(suffix.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    if (overrides != null) js.Dynamic.global.Object.assign(__obj, overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  type Props = ClearableInputProps
}

