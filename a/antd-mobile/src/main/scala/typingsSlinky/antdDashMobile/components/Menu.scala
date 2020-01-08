package typingsSlinky.antdDashMobile.components

import org.scalablytyped.runtime.StringDictionary
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.core.TagMod
import slinky.web.html.`*`.tag
import typingsSlinky.antdDashMobile.antdDashMobileNumbers.`1`
import typingsSlinky.antdDashMobile.antdDashMobileNumbers.`2`
import typingsSlinky.antdDashMobile.libMenuMod.default
import typingsSlinky.antdDashMobile.libMenuPropsTypeMod.DataItem
import typingsSlinky.antdDashMobile.libMenuPropsTypeMod.MenuProps
import typingsSlinky.antdDashMobile.libMenuPropsTypeMod.ValueType
import typingsSlinky.react.reactMod.CSSProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Menu
  extends ExternalComponentWithAttributesWithRefType[tag.type, default] {
  @JSImport("antd-mobile/lib/menu", JSImport.Default)
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  /* The following DOM/SVG props were specified: className, onChange */
  def apply(
    MenuSelectContanerPrefixCls: String = null,
    data: js.Array[DataItem] = null,
    defaultValue: ValueType = null,
    height: Int | Double = null,
    level: `1` | `2` = null,
    multiSelect: js.UndefOr[Boolean] = js.undefined,
    multiSelectMenuBtnsCls: String = null,
    onCancel: () => Unit = null,
    onOk: /* value */ js.UndefOr[ValueType] => Unit = null,
    prefixCls: String = null,
    radioPrefixCls: String = null,
    style: CSSProperties = null,
    subMenuPrefixCls: String = null,
    value: ValueType = null,
    _overrides: StringDictionary[js.Any] = null
  ): BuildingComponent[tag.type, default] = {
    val __obj = js.Dynamic.literal()
    if (MenuSelectContanerPrefixCls != null) __obj.updateDynamic("MenuSelectContanerPrefixCls")(MenuSelectContanerPrefixCls.asInstanceOf[js.Any])
    if (data != null) __obj.updateDynamic("data")(data.asInstanceOf[js.Any])
    if (defaultValue != null) __obj.updateDynamic("defaultValue")(defaultValue.asInstanceOf[js.Any])
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (level != null) __obj.updateDynamic("level")(level.asInstanceOf[js.Any])
    if (!js.isUndefined(multiSelect)) __obj.updateDynamic("multiSelect")(multiSelect.asInstanceOf[js.Any])
    if (multiSelectMenuBtnsCls != null) __obj.updateDynamic("multiSelectMenuBtnsCls")(multiSelectMenuBtnsCls.asInstanceOf[js.Any])
    if (onCancel != null) __obj.updateDynamic("onCancel")(js.Any.fromFunction0(onCancel))
    if (onOk != null) __obj.updateDynamic("onOk")(js.Any.fromFunction1(onOk))
    if (prefixCls != null) __obj.updateDynamic("prefixCls")(prefixCls.asInstanceOf[js.Any])
    if (radioPrefixCls != null) __obj.updateDynamic("radioPrefixCls")(radioPrefixCls.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (subMenuPrefixCls != null) __obj.updateDynamic("subMenuPrefixCls")(subMenuPrefixCls.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  def apply(mods: TagMod[tag.type]*): BuildingComponent[tag.type, default] = new slinky.core.BuildingComponent[slinky.web.html.`*`.tag.type, typingsSlinky.antdDashMobile.libMenuMod.default](js.Array(component.asInstanceOf[js.Any], js.Dictionary.empty)).apply(mods: _*)
  type Props = MenuProps
}

