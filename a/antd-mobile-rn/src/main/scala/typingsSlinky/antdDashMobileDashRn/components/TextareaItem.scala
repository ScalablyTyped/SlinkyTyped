package typingsSlinky.antdDashMobileDashRn.components

import org.scalablytyped.runtime.StringDictionary
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.core.TagMod
import slinky.web.html.`*`.tag
import typingsSlinky.antdDashMobileDashRn.libTextareaDashItemIndexDotNativeMod.TextareaItemNativeProps
import typingsSlinky.antdDashMobileDashRn.libTextareaDashItemStyleIndexDotNativeMod.ITextareaItemStyle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object TextareaItem
  extends ExternalComponentWithAttributesWithRefType[tag.type, typingsSlinky.antdDashMobileDashRn.antdDashMobileDashRnMod.TextareaItem] {
  @JSImport("antd-mobile-rn", "TextareaItem")
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  /* The following DOM/SVG props were specified: disabled, name, onBlur, onChange, onFocus, placeholder, rows */
  def apply(
    autoHeight: js.UndefOr[Boolean] = js.undefined,
    clear: js.UndefOr[Boolean] = js.undefined,
    count: Int | Double = null,
    defaultValue: String = null,
    editable: js.UndefOr[Boolean] = js.undefined,
    error: js.UndefOr[Boolean] = js.undefined,
    labelNumber: Int | Double = null,
    last: js.UndefOr[Boolean] = js.undefined,
    maxLength: Int | Double = null,
    onContentSizeChange: /* e */ js.Any => Unit = null,
    onErrorClick: () => Unit = null,
    styles: ITextareaItemStyle = null,
    title: TagMod[Any] = null,
    value: String = null,
    _overrides: StringDictionary[js.Any] = null
  ): BuildingComponent[tag.type, typingsSlinky.antdDashMobileDashRn.antdDashMobileDashRnMod.TextareaItem] = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(autoHeight)) __obj.updateDynamic("autoHeight")(autoHeight.asInstanceOf[js.Any])
    if (!js.isUndefined(clear)) __obj.updateDynamic("clear")(clear.asInstanceOf[js.Any])
    if (count != null) __obj.updateDynamic("count")(count.asInstanceOf[js.Any])
    if (defaultValue != null) __obj.updateDynamic("defaultValue")(defaultValue.asInstanceOf[js.Any])
    if (!js.isUndefined(editable)) __obj.updateDynamic("editable")(editable.asInstanceOf[js.Any])
    if (!js.isUndefined(error)) __obj.updateDynamic("error")(error.asInstanceOf[js.Any])
    if (labelNumber != null) __obj.updateDynamic("labelNumber")(labelNumber.asInstanceOf[js.Any])
    if (!js.isUndefined(last)) __obj.updateDynamic("last")(last.asInstanceOf[js.Any])
    if (maxLength != null) __obj.updateDynamic("maxLength")(maxLength.asInstanceOf[js.Any])
    if (onContentSizeChange != null) __obj.updateDynamic("onContentSizeChange")(js.Any.fromFunction1(onContentSizeChange))
    if (onErrorClick != null) __obj.updateDynamic("onErrorClick")(js.Any.fromFunction0(onErrorClick))
    if (styles != null) __obj.updateDynamic("styles")(styles.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  def apply(mods: TagMod[tag.type]*): BuildingComponent[tag.type, typingsSlinky.antdDashMobileDashRn.antdDashMobileDashRnMod.TextareaItem] = new slinky.core.BuildingComponent[
  slinky.web.html.`*`.tag.type, 
  typingsSlinky.antdDashMobileDashRn.antdDashMobileDashRnMod.TextareaItem](js.Array(component.asInstanceOf[js.Any], js.Dictionary.empty)).apply(mods: _*)
  type Props = TextareaItemNativeProps
}

