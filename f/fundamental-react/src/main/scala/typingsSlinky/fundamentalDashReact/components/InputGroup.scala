package typingsSlinky.fundamentalDashReact.components

import org.scalablytyped.runtime.StringDictionary
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.core.TagMod
import slinky.web.html.`*`.tag
import typingsSlinky.fundamentalDashReact.Anon_Clear
import typingsSlinky.fundamentalDashReact.libInputGroupInputGroupMod.InputGroupAddonPosition
import typingsSlinky.fundamentalDashReact.libInputGroupInputGroupMod.InputGroupProps
import typingsSlinky.fundamentalDashReact.libInputGroupInputGroupMod.InputGroupTypes
import typingsSlinky.fundamentalDashReact.libInputGroupInputGroupMod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object InputGroup
  extends ExternalComponentWithAttributesWithRefType[tag.type, default] {
  @JSImport("fundamental-react/lib/InputGroup/InputGroup", JSImport.Default)
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  /* The following DOM/SVG props were specified: className */
  def apply(
    actions: js.UndefOr[Boolean] = js.undefined,
    addon: String = null,
    addonPos: InputGroupAddonPosition = null,
    compact: js.UndefOr[Boolean] = js.undefined,
    customStyles: StringDictionary[js.Any] = null,
    disableStyles: js.UndefOr[Boolean] = js.undefined,
    glyph: String = null,
    inputClassName: String = null,
    inputId: String = null,
    inputName: String = null,
    inputPlaceholder: String = null,
    inputProps: StringDictionary[js.Any] = null,
    inputType: InputGroupTypes = null,
    inputValue: js.Any = null,
    localizedText: Anon_Clear = null,
    numberDownButtonProps: StringDictionary[js.Any] = null,
    numberUpButtonProps: StringDictionary[js.Any] = null,
    searchButtonProps: StringDictionary[js.Any] = null,
    _overrides: StringDictionary[js.Any] = null
  ): BuildingComponent[tag.type, default] = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(actions)) __obj.updateDynamic("actions")(actions.asInstanceOf[js.Any])
    if (addon != null) __obj.updateDynamic("addon")(addon.asInstanceOf[js.Any])
    if (addonPos != null) __obj.updateDynamic("addonPos")(addonPos.asInstanceOf[js.Any])
    if (!js.isUndefined(compact)) __obj.updateDynamic("compact")(compact.asInstanceOf[js.Any])
    if (customStyles != null) __obj.updateDynamic("customStyles")(customStyles.asInstanceOf[js.Any])
    if (!js.isUndefined(disableStyles)) __obj.updateDynamic("disableStyles")(disableStyles.asInstanceOf[js.Any])
    if (glyph != null) __obj.updateDynamic("glyph")(glyph.asInstanceOf[js.Any])
    if (inputClassName != null) __obj.updateDynamic("inputClassName")(inputClassName.asInstanceOf[js.Any])
    if (inputId != null) __obj.updateDynamic("inputId")(inputId.asInstanceOf[js.Any])
    if (inputName != null) __obj.updateDynamic("inputName")(inputName.asInstanceOf[js.Any])
    if (inputPlaceholder != null) __obj.updateDynamic("inputPlaceholder")(inputPlaceholder.asInstanceOf[js.Any])
    if (inputProps != null) __obj.updateDynamic("inputProps")(inputProps.asInstanceOf[js.Any])
    if (inputType != null) __obj.updateDynamic("inputType")(inputType.asInstanceOf[js.Any])
    if (inputValue != null) __obj.updateDynamic("inputValue")(inputValue.asInstanceOf[js.Any])
    if (localizedText != null) __obj.updateDynamic("localizedText")(localizedText.asInstanceOf[js.Any])
    if (numberDownButtonProps != null) __obj.updateDynamic("numberDownButtonProps")(numberDownButtonProps.asInstanceOf[js.Any])
    if (numberUpButtonProps != null) __obj.updateDynamic("numberUpButtonProps")(numberUpButtonProps.asInstanceOf[js.Any])
    if (searchButtonProps != null) __obj.updateDynamic("searchButtonProps")(searchButtonProps.asInstanceOf[js.Any])
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  def apply(mods: TagMod[tag.type]*): BuildingComponent[tag.type, default] = new slinky.core.BuildingComponent[
  slinky.web.html.`*`.tag.type, 
  typingsSlinky.fundamentalDashReact.libInputGroupInputGroupMod.default](js.Array(component.asInstanceOf[js.Any], js.Dictionary.empty)).apply(mods: _*)
  type Props = InputGroupProps
}

