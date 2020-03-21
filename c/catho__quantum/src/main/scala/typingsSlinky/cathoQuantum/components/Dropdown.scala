package typingsSlinky.cathoQuantum.components

import org.scalablytyped.runtime.StringDictionary
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.core.TagMod
import slinky.core.facade.ReactElement
import slinky.web.html.`*`.tag
import typingsSlinky.cathoQuantum.AnonBaseFontSize
import typingsSlinky.cathoQuantum.dropdownMod.DropdownProps
import typingsSlinky.cathoQuantum.dropdownMod.ItemPropType
import typingsSlinky.cathoQuantum.dropdownMod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Dropdown
  extends ExternalComponentWithAttributesWithRefType[tag.type, default] {
  @JSImport("@catho/quantum/Dropdown", JSImport.Default)
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  /* The following DOM/SVG props were specified: disabled, id, label, placeholder, required */
  def apply(
    autocomplete: js.UndefOr[Boolean] = js.undefined,
    error: String = null,
    helperText: String = null,
    ignoreSpecialChars: js.UndefOr[Boolean] = js.undefined,
    items: js.Array[ItemPropType] = null,
    onChange: (/* selectedItem */ js.UndefOr[ReactElement | Null], /* stateAndHelpers */ js.UndefOr[js.Any]) => Unit = null,
    selectedItem: ItemPropType = null,
    theme: AnonBaseFontSize = null,
    _overrides: StringDictionary[js.Any] = null
  ): BuildingComponent[tag.type, default] = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(autocomplete)) __obj.updateDynamic("autocomplete")(autocomplete.asInstanceOf[js.Any])
    if (error != null) __obj.updateDynamic("error")(error.asInstanceOf[js.Any])
    if (helperText != null) __obj.updateDynamic("helperText")(helperText.asInstanceOf[js.Any])
    if (!js.isUndefined(ignoreSpecialChars)) __obj.updateDynamic("ignoreSpecialChars")(ignoreSpecialChars.asInstanceOf[js.Any])
    if (items != null) __obj.updateDynamic("items")(items.asInstanceOf[js.Any])
    if (onChange != null) __obj.updateDynamic("onChange")(js.Any.fromFunction2(onChange))
    if (selectedItem != null) __obj.updateDynamic("selectedItem")(selectedItem.asInstanceOf[js.Any])
    if (theme != null) __obj.updateDynamic("theme")(theme.asInstanceOf[js.Any])
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  def apply(mods: TagMod[tag.type]*): BuildingComponent[tag.type, default] = new slinky.core.BuildingComponent[slinky.web.html.`*`.tag.type, typingsSlinky.cathoQuantum.dropdownMod.default](js.Array(component.asInstanceOf[js.Any], js.Dictionary.empty)).apply(mods: _*)
  type Props = DropdownProps
}

