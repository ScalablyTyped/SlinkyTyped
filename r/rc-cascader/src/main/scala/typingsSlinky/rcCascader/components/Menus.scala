package typingsSlinky.rcCascader.components

import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.raw.HTMLElement
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.core.TagMod
import slinky.web.SyntheticKeyboardEvent
import slinky.web.SyntheticMouseEvent
import slinky.web.html.`*`.tag
import typingsSlinky.rcCascader.cascaderMod.CascaderFieldNames
import typingsSlinky.rcCascader.cascaderMod.CascaderOption
import typingsSlinky.rcCascader.menusMod.MenusProps
import typingsSlinky.rcCascader.menusMod.default
import typingsSlinky.react.mod.CSSProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Menus
  extends ExternalComponentWithAttributesWithRefType[tag.type, default] {
  @JSImport("rc-cascader/lib/Menus", JSImport.Default)
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  def apply(
    activeValue: js.Array[String] = null,
    defaultFieldNames: CascaderFieldNames = null,
    dropdownMenuColumnStyle: CSSProperties = null,
    expandIcon: TagMod[Any] = null,
    expandTrigger: String = null,
    fieldNames: CascaderFieldNames = null,
    loadingIcon: TagMod[Any] = null,
    onItemDoubleClick: (/* targetOption */ js.Array[String], /* index */ Double, /* e */ SyntheticMouseEvent[HTMLElement]) => Unit = null,
    onSelect: (/* targetOption */ js.Array[String], /* index */ Double, /* e */ SyntheticKeyboardEvent[HTMLElement]) => Unit = null,
    options: js.Array[CascaderOption] = null,
    prefixCls: String = null,
    value: js.Array[String] = null,
    visible: js.UndefOr[Boolean] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  ): BuildingComponent[tag.type, default] = {
    val __obj = js.Dynamic.literal()
    if (activeValue != null) __obj.updateDynamic("activeValue")(activeValue.asInstanceOf[js.Any])
    if (defaultFieldNames != null) __obj.updateDynamic("defaultFieldNames")(defaultFieldNames.asInstanceOf[js.Any])
    if (dropdownMenuColumnStyle != null) __obj.updateDynamic("dropdownMenuColumnStyle")(dropdownMenuColumnStyle.asInstanceOf[js.Any])
    if (expandIcon != null) __obj.updateDynamic("expandIcon")(expandIcon.asInstanceOf[js.Any])
    if (expandTrigger != null) __obj.updateDynamic("expandTrigger")(expandTrigger.asInstanceOf[js.Any])
    if (fieldNames != null) __obj.updateDynamic("fieldNames")(fieldNames.asInstanceOf[js.Any])
    if (loadingIcon != null) __obj.updateDynamic("loadingIcon")(loadingIcon.asInstanceOf[js.Any])
    if (onItemDoubleClick != null) __obj.updateDynamic("onItemDoubleClick")(js.Any.fromFunction3(onItemDoubleClick))
    if (onSelect != null) __obj.updateDynamic("onSelect")(js.Any.fromFunction3(onSelect))
    if (options != null) __obj.updateDynamic("options")(options.asInstanceOf[js.Any])
    if (prefixCls != null) __obj.updateDynamic("prefixCls")(prefixCls.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    if (!js.isUndefined(visible)) __obj.updateDynamic("visible")(visible.asInstanceOf[js.Any])
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  def apply(mods: TagMod[tag.type]*): BuildingComponent[tag.type, default] = new slinky.core.BuildingComponent[slinky.web.html.`*`.tag.type, typingsSlinky.rcCascader.menusMod.default](js.Array(component.asInstanceOf[js.Any], js.Dictionary.empty)).apply(mods: _*)
  type Props = MenusProps
}

