package typingsSlinky.fundamentalReact.components

import org.scalablytyped.runtime.StringDictionary
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.core.TagMod
import slinky.web.html.`*`.tag
import typingsSlinky.fundamentalReact.AnonClear
import typingsSlinky.fundamentalReact.inputGroupMod.InputGroupAddonPosition
import typingsSlinky.fundamentalReact.inputGroupMod.InputGroupProps
import typingsSlinky.fundamentalReact.inputGroupMod.InputGroupTypes
import typingsSlinky.fundamentalReact.inputGroupMod.default
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
    disableStyles: js.UndefOr[Boolean] = js.undefined,
    glyph: String = null,
    inputClassName: String = null,
    inputId: String = null,
    inputName: String = null,
    inputPlaceholder: String = null,
    inputType: InputGroupTypes = null,
    inputValue: js.Any = null,
    localizedText: AnonClear = null,
    _overrides: StringDictionary[js.Any] = null
  ): BuildingComponent[tag.type, default] = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(actions)) __obj.updateDynamic("actions")(actions.asInstanceOf[js.Any])
    if (addon != null) __obj.updateDynamic("addon")(addon.asInstanceOf[js.Any])
    if (addonPos != null) __obj.updateDynamic("addonPos")(addonPos.asInstanceOf[js.Any])
    if (!js.isUndefined(compact)) __obj.updateDynamic("compact")(compact.asInstanceOf[js.Any])
    if (!js.isUndefined(disableStyles)) __obj.updateDynamic("disableStyles")(disableStyles.asInstanceOf[js.Any])
    if (glyph != null) __obj.updateDynamic("glyph")(glyph.asInstanceOf[js.Any])
    if (inputClassName != null) __obj.updateDynamic("inputClassName")(inputClassName.asInstanceOf[js.Any])
    if (inputId != null) __obj.updateDynamic("inputId")(inputId.asInstanceOf[js.Any])
    if (inputName != null) __obj.updateDynamic("inputName")(inputName.asInstanceOf[js.Any])
    if (inputPlaceholder != null) __obj.updateDynamic("inputPlaceholder")(inputPlaceholder.asInstanceOf[js.Any])
    if (inputType != null) __obj.updateDynamic("inputType")(inputType.asInstanceOf[js.Any])
    if (inputValue != null) __obj.updateDynamic("inputValue")(inputValue.asInstanceOf[js.Any])
    if (localizedText != null) __obj.updateDynamic("localizedText")(localizedText.asInstanceOf[js.Any])
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  def apply(mods: TagMod[tag.type]*): BuildingComponent[tag.type, default] = new slinky.core.BuildingComponent[slinky.web.html.`*`.tag.type, typingsSlinky.fundamentalReact.inputGroupMod.default](js.Array(component.asInstanceOf[js.Any], js.Dictionary.empty)).apply(mods: _*)
  type Props = InputGroupProps
}

