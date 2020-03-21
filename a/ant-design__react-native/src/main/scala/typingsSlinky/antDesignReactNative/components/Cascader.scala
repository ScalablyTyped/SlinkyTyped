package typingsSlinky.antDesignReactNative.components

import org.scalablytyped.runtime.StringDictionary
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.web.html.`*`.tag
import typingsSlinky.antDesignReactNative.cascaderMod.default
import typingsSlinky.antDesignReactNative.cascaderTypesMod.CascaderDataItem
import typingsSlinky.antDesignReactNative.cascaderTypesMod.CascaderProps
import typingsSlinky.antDesignReactNative.cascaderTypesMod.CascaderValue
import typingsSlinky.reactNative.mod.StyleProp
import typingsSlinky.reactNative.mod.ViewStyle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Cascader
  extends ExternalComponentWithAttributesWithRefType[tag.type, default] {
  @JSImport("@ant-design/react-native/lib/picker/cascader", JSImport.Default)
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  /* The following DOM/SVG props were specified: cols, disabled */
  def apply(
    data: js.Array[CascaderDataItem],
    defaultValue: CascaderValue = null,
    indicatorStyle: StyleProp[ViewStyle] = null,
    onChange: /* value */ CascaderValue => Unit = null,
    onScrollChange: /* value */ CascaderValue => Unit = null,
    pickerItemStyle: StyleProp[ViewStyle] = null,
    rootNativeProps: js.Object = null,
    style: StyleProp[ViewStyle] = null,
    value: CascaderValue = null,
    _overrides: StringDictionary[js.Any] = null
  ): BuildingComponent[tag.type, default] = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any])
    if (defaultValue != null) __obj.updateDynamic("defaultValue")(defaultValue.asInstanceOf[js.Any])
    if (indicatorStyle != null) __obj.updateDynamic("indicatorStyle")(indicatorStyle.asInstanceOf[js.Any])
    if (onChange != null) __obj.updateDynamic("onChange")(js.Any.fromFunction1(onChange))
    if (onScrollChange != null) __obj.updateDynamic("onScrollChange")(js.Any.fromFunction1(onScrollChange))
    if (pickerItemStyle != null) __obj.updateDynamic("pickerItemStyle")(pickerItemStyle.asInstanceOf[js.Any])
    if (rootNativeProps != null) __obj.updateDynamic("rootNativeProps")(rootNativeProps.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  type Props = CascaderProps
}

