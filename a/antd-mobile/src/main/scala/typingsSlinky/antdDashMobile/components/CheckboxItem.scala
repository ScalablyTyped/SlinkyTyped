package typingsSlinky.antdDashMobile.components

import org.scalablytyped.runtime.StringDictionary
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.core.TagMod
import slinky.web.html.`*`.tag
import typingsSlinky.antdDashMobile.libCheckboxCheckboxItemMod.CheckboxItemProps
import typingsSlinky.antdDashMobile.libCheckboxCheckboxItemMod.default
import typingsSlinky.antdDashMobile.libCheckboxCheckboxMod.CheckboxProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object CheckboxItem
  extends ExternalComponentWithAttributesWithRefType[tag.type, default] {
  @JSImport("antd-mobile/lib/checkbox/CheckboxItem", JSImport.Default)
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  /* The following DOM/SVG props were specified: checked, className, defaultChecked, disabled, name, onChange, onClick */
  def apply(
    checkboxProps: CheckboxProps = null,
    extra: TagMod[Any] = null,
    listPrefixCls: String = null,
    prefixCls: String = null,
    wrapLabel: js.UndefOr[Boolean] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  ): BuildingComponent[tag.type, default] = {
    val __obj = js.Dynamic.literal()
    if (checkboxProps != null) __obj.updateDynamic("checkboxProps")(checkboxProps.asInstanceOf[js.Any])
    if (extra != null) __obj.updateDynamic("extra")(extra.asInstanceOf[js.Any])
    if (listPrefixCls != null) __obj.updateDynamic("listPrefixCls")(listPrefixCls.asInstanceOf[js.Any])
    if (prefixCls != null) __obj.updateDynamic("prefixCls")(prefixCls.asInstanceOf[js.Any])
    if (!js.isUndefined(wrapLabel)) __obj.updateDynamic("wrapLabel")(wrapLabel.asInstanceOf[js.Any])
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  def apply(mods: TagMod[tag.type]*): BuildingComponent[tag.type, default] = new slinky.core.BuildingComponent[
  slinky.web.html.`*`.tag.type, 
  typingsSlinky.antdDashMobile.libCheckboxCheckboxItemMod.default](js.Array(component.asInstanceOf[js.Any], js.Dictionary.empty)).apply(mods: _*)
  type Props = CheckboxItemProps
}

