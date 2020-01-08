package typingsSlinky.reactDashFlagsDashSelect.components

import org.scalablytyped.runtime.StringDictionary
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.core.TagMod
import slinky.web.html.`*`.tag
import typingsSlinky.reactDashFlagsDashSelect.reactDashFlagsDashSelectMod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object ReactDashFlagsDashSelect
  extends ExternalComponentWithAttributesWithRefType[tag.type, default] {
  @JSImport("react-flags-select", JSImport.Default)
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  /* The following DOM/SVG props were specified: className, disabled, onSelect, placeholder */
  def apply(
    alignOptions: String = null,
    blackList: js.UndefOr[Boolean] = js.undefined,
    countries: js.Array[String] = null,
    customLabels: StringDictionary[String] = null,
    defaultCountry: String = null,
    optionsSize: Int | Double = null,
    searchable: js.UndefOr[Boolean] = js.undefined,
    selectedSize: Int | Double = null,
    showOptionLabel: js.UndefOr[Boolean] = js.undefined,
    showSelectedLabel: js.UndefOr[Boolean] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  ): BuildingComponent[tag.type, default] = {
    val __obj = js.Dynamic.literal()
    if (alignOptions != null) __obj.updateDynamic("alignOptions")(alignOptions.asInstanceOf[js.Any])
    if (!js.isUndefined(blackList)) __obj.updateDynamic("blackList")(blackList.asInstanceOf[js.Any])
    if (countries != null) __obj.updateDynamic("countries")(countries.asInstanceOf[js.Any])
    if (customLabels != null) __obj.updateDynamic("customLabels")(customLabels.asInstanceOf[js.Any])
    if (defaultCountry != null) __obj.updateDynamic("defaultCountry")(defaultCountry.asInstanceOf[js.Any])
    if (optionsSize != null) __obj.updateDynamic("optionsSize")(optionsSize.asInstanceOf[js.Any])
    if (!js.isUndefined(searchable)) __obj.updateDynamic("searchable")(searchable.asInstanceOf[js.Any])
    if (selectedSize != null) __obj.updateDynamic("selectedSize")(selectedSize.asInstanceOf[js.Any])
    if (!js.isUndefined(showOptionLabel)) __obj.updateDynamic("showOptionLabel")(showOptionLabel.asInstanceOf[js.Any])
    if (!js.isUndefined(showSelectedLabel)) __obj.updateDynamic("showSelectedLabel")(showSelectedLabel.asInstanceOf[js.Any])
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  def apply(mods: TagMod[tag.type]*): BuildingComponent[tag.type, default] = new slinky.core.BuildingComponent[
  slinky.web.html.`*`.tag.type, 
  typingsSlinky.reactDashFlagsDashSelect.reactDashFlagsDashSelectMod.default](js.Array(component.asInstanceOf[js.Any], js.Dictionary.empty)).apply(mods: _*)
  type Props = typingsSlinky.reactDashFlagsDashSelect.reactDashFlagsDashSelectMod.Props
}

