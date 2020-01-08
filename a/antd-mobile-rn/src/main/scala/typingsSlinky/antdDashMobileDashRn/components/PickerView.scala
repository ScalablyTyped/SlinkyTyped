package typingsSlinky.antdDashMobileDashRn.components

import org.scalablytyped.runtime.StringDictionary
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.core.TagMod
import slinky.web.html.`*`.tag
import typingsSlinky.antdDashMobileDashRn.libPickerDashViewPickerViewMod.IPickerView
import typingsSlinky.antdDashMobileDashRn.libPickerDashViewPickerViewMod.default
import typingsSlinky.antdDashMobileDashRn.libPickerPropsTypeMod.PickerData
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object PickerView
  extends ExternalComponentWithAttributesWithRefType[tag.type, default] {
  @JSImport("antd-mobile-rn/lib/picker-view/PickerView", JSImport.Default)
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  /* The following DOM/SVG props were specified: cols, onChange */
  def apply(
    cascade: js.UndefOr[Boolean] = js.undefined,
    data: js.Array[js.Array[PickerData] | PickerData] = null,
    indicatorStyle: js.Any = null,
    itemStyle: js.Any = null,
    onScrollChange: /* value */ js.UndefOr[js.Any] => Unit = null,
    pickerPrefixCls: String = null,
    prefixCls: String = null,
    styles: js.Any = null,
    value: js.Array[_] = null,
    _overrides: StringDictionary[js.Any] = null
  ): BuildingComponent[tag.type, default] = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(cascade)) __obj.updateDynamic("cascade")(cascade.asInstanceOf[js.Any])
    if (data != null) __obj.updateDynamic("data")(data.asInstanceOf[js.Any])
    if (indicatorStyle != null) __obj.updateDynamic("indicatorStyle")(indicatorStyle.asInstanceOf[js.Any])
    if (itemStyle != null) __obj.updateDynamic("itemStyle")(itemStyle.asInstanceOf[js.Any])
    if (onScrollChange != null) __obj.updateDynamic("onScrollChange")(js.Any.fromFunction1(onScrollChange))
    if (pickerPrefixCls != null) __obj.updateDynamic("pickerPrefixCls")(pickerPrefixCls.asInstanceOf[js.Any])
    if (prefixCls != null) __obj.updateDynamic("prefixCls")(prefixCls.asInstanceOf[js.Any])
    if (styles != null) __obj.updateDynamic("styles")(styles.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  def apply(mods: TagMod[tag.type]*): BuildingComponent[tag.type, default] = new slinky.core.BuildingComponent[
  slinky.web.html.`*`.tag.type, 
  typingsSlinky.antdDashMobileDashRn.libPickerDashViewPickerViewMod.default](js.Array(component.asInstanceOf[js.Any], js.Dictionary.empty)).apply(mods: _*)
  type Props = IPickerView
}

