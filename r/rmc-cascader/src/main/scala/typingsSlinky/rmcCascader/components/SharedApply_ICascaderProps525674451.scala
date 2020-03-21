package typingsSlinky.rmcCascader.components

import org.scalablytyped.runtime.StringDictionary
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.core.ExternalPropsWriterProvider
import slinky.web.html.`*`.tag
import typingsSlinky.rmcCascader.cascaderTypesMod.CascaderValue
import typingsSlinky.rmcCascader.cascaderTypesMod.ICascaderDataItem
import typingsSlinky.rmcCascader.cascaderTypesMod.ICascaderProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

abstract class SharedApply_ICascaderProps525674451[ComponentRef <: js.Object] (implicit pw: ExternalPropsWriterProvider)
  extends ExternalComponentWithAttributesWithRefType[tag.type, ComponentRef] {
  /* The following DOM/SVG props were specified: className, cols, disabled */
  def apply(
    data: js.Array[ICascaderDataItem],
    defaultValue: CascaderValue = null,
    indicatorStyle: js.Object = null,
    onChange: /* value */ CascaderValue => Unit = null,
    onScrollChange: /* value */ CascaderValue => Unit = null,
    pickerItemStyle: js.Object = null,
    pickerPrefixCls: String = null,
    prefixCls: String = null,
    rootNativeProps: js.Object = null,
    style: js.Any = null,
    value: CascaderValue = null,
    _overrides: StringDictionary[js.Any] = null
  ): BuildingComponent[tag.type, ComponentRef] = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any])
    if (defaultValue != null) __obj.updateDynamic("defaultValue")(defaultValue.asInstanceOf[js.Any])
    if (indicatorStyle != null) __obj.updateDynamic("indicatorStyle")(indicatorStyle.asInstanceOf[js.Any])
    if (onChange != null) __obj.updateDynamic("onChange")(js.Any.fromFunction1(onChange))
    if (onScrollChange != null) __obj.updateDynamic("onScrollChange")(js.Any.fromFunction1(onScrollChange))
    if (pickerItemStyle != null) __obj.updateDynamic("pickerItemStyle")(pickerItemStyle.asInstanceOf[js.Any])
    if (pickerPrefixCls != null) __obj.updateDynamic("pickerPrefixCls")(pickerPrefixCls.asInstanceOf[js.Any])
    if (prefixCls != null) __obj.updateDynamic("prefixCls")(prefixCls.asInstanceOf[js.Any])
    if (rootNativeProps != null) __obj.updateDynamic("rootNativeProps")(rootNativeProps.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  type Props = ICascaderProps
}

