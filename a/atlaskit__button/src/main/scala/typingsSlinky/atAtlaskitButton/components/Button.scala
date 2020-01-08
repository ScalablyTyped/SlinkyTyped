package typingsSlinky.atAtlaskitButton.components

import org.scalablytyped.runtime.StringDictionary
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.core.ReactComponentClass
import slinky.core.TagMod
import slinky.core.facade.ReactElement
import slinky.web.html.button.tag
import typingsSlinky.atAtlaskitButton.atAtlaskitButtonMod.ButtonAppearances
import typingsSlinky.atAtlaskitButton.atAtlaskitButtonMod.ButtonProps
import typingsSlinky.atAtlaskitButton.atAtlaskitButtonMod.ButtonSpacing
import typingsSlinky.atAtlaskitButton.atAtlaskitButtonMod.ButtonType
import typingsSlinky.atAtlaskitButton.atAtlaskitButtonMod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Button
  extends ExternalComponentWithAttributesWithRefType[tag.type, default] {
  @JSImport("@atlaskit/button", JSImport.Default)
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  /* The following DOM/SVG props were specified: className, href, id, onClick, tabIndex, target */
  def apply(
    appearance: ButtonAppearances = null,
    ariaControls: String = null,
    ariaExpanded: js.UndefOr[Boolean] = js.undefined,
    ariaHaspopup: js.UndefOr[Boolean] = js.undefined,
    component: ReactComponentClass[_] = null,
    form: String = null,
    iconAfter: ReactElement = null,
    iconBefore: ReactElement = null,
    innerRef: /* instance */ js.Any => Unit = null,
    isDisabled: js.UndefOr[Boolean] = js.undefined,
    isSelected: js.UndefOr[Boolean] = js.undefined,
    shouldFitContainer: js.UndefOr[Boolean] = js.undefined,
    spacing: ButtonSpacing = null,
    `type`: ButtonType = null,
    _overrides: StringDictionary[js.Any] = null
  ): BuildingComponent[tag.type, default] = {
    val __obj = js.Dynamic.literal()
    if (appearance != null) __obj.updateDynamic("appearance")(appearance.asInstanceOf[js.Any])
    if (ariaControls != null) __obj.updateDynamic("ariaControls")(ariaControls.asInstanceOf[js.Any])
    if (!js.isUndefined(ariaExpanded)) __obj.updateDynamic("ariaExpanded")(ariaExpanded.asInstanceOf[js.Any])
    if (!js.isUndefined(ariaHaspopup)) __obj.updateDynamic("ariaHaspopup")(ariaHaspopup.asInstanceOf[js.Any])
    if (component != null) __obj.updateDynamic("component")(component.asInstanceOf[js.Any])
    if (form != null) __obj.updateDynamic("form")(form.asInstanceOf[js.Any])
    if (iconAfter != null) __obj.updateDynamic("iconAfter")(iconAfter.asInstanceOf[js.Any])
    if (iconBefore != null) __obj.updateDynamic("iconBefore")(iconBefore.asInstanceOf[js.Any])
    if (innerRef != null) __obj.updateDynamic("innerRef")(js.Any.fromFunction1(innerRef))
    if (!js.isUndefined(isDisabled)) __obj.updateDynamic("isDisabled")(isDisabled.asInstanceOf[js.Any])
    if (!js.isUndefined(isSelected)) __obj.updateDynamic("isSelected")(isSelected.asInstanceOf[js.Any])
    if (!js.isUndefined(shouldFitContainer)) __obj.updateDynamic("shouldFitContainer")(shouldFitContainer.asInstanceOf[js.Any])
    if (spacing != null) __obj.updateDynamic("spacing")(spacing.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  def apply(mods: TagMod[tag.type]*): BuildingComponent[tag.type, default] = new slinky.core.BuildingComponent[
  slinky.web.html.button.tag.type, 
  typingsSlinky.atAtlaskitButton.atAtlaskitButtonMod.default](js.Array(component.asInstanceOf[js.Any], js.Dictionary.empty)).apply(mods: _*)
  type Props = ButtonProps
}

