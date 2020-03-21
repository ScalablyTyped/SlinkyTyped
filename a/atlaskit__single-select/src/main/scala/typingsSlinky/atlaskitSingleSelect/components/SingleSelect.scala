package typingsSlinky.atlaskitSingleSelect.components

import org.scalablytyped.runtime.StringDictionary
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.core.TagMod
import slinky.web.html.`*`.tag
import typingsSlinky.atlaskitSingleSelect.AnonEvent
import typingsSlinky.atlaskitSingleSelect.atlaskitSingleSelectStrings.subtle
import typingsSlinky.atlaskitSingleSelect.mod.GroupType
import typingsSlinky.atlaskitSingleSelect.mod.ItemType
import typingsSlinky.atlaskitSingleSelect.mod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object SingleSelect
  extends ExternalComponentWithAttributesWithRefType[tag.type, default] {
  @JSImport("@atlaskit/single-select", JSImport.Default)
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  /* The following DOM/SVG props were specified: id, label, name, placeholder */
  def apply(
    appearance: typingsSlinky.atlaskitSingleSelect.atlaskitSingleSelectStrings.default | subtle = null,
    defaultSelected: ItemType = null,
    droplistShouldFitContainer: js.UndefOr[Boolean] = js.undefined,
    hasAutocomplete: js.UndefOr[Boolean] = js.undefined,
    invalidMessage: TagMod[Any] = null,
    isDefaultOpen: js.UndefOr[Boolean] = js.undefined,
    isDisabled: js.UndefOr[Boolean] = js.undefined,
    isFirstChild: js.UndefOr[Boolean] = js.undefined,
    isInvalid: js.UndefOr[Boolean] = js.undefined,
    isRequired: js.UndefOr[Boolean] = js.undefined,
    items: js.Array[GroupType] = null,
    maxHeight: Int | Double = null,
    noMatchesFound: String = null,
    onFilterChange: /* filter */ String => Unit = null,
    onOpenChange: /* change */ AnonEvent => Unit = null,
    onSelected: /* item */ ItemType => Unit = null,
    position: String = null,
    shouldFitContainer: js.UndefOr[Boolean] = js.undefined,
    shouldFlip: js.UndefOr[Boolean] = js.undefined,
    shouldFocus: js.UndefOr[Boolean] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  ): BuildingComponent[tag.type, default] = {
    val __obj = js.Dynamic.literal()
    if (appearance != null) __obj.updateDynamic("appearance")(appearance.asInstanceOf[js.Any])
    if (defaultSelected != null) __obj.updateDynamic("defaultSelected")(defaultSelected.asInstanceOf[js.Any])
    if (!js.isUndefined(droplistShouldFitContainer)) __obj.updateDynamic("droplistShouldFitContainer")(droplistShouldFitContainer.asInstanceOf[js.Any])
    if (!js.isUndefined(hasAutocomplete)) __obj.updateDynamic("hasAutocomplete")(hasAutocomplete.asInstanceOf[js.Any])
    if (invalidMessage != null) __obj.updateDynamic("invalidMessage")(invalidMessage.asInstanceOf[js.Any])
    if (!js.isUndefined(isDefaultOpen)) __obj.updateDynamic("isDefaultOpen")(isDefaultOpen.asInstanceOf[js.Any])
    if (!js.isUndefined(isDisabled)) __obj.updateDynamic("isDisabled")(isDisabled.asInstanceOf[js.Any])
    if (!js.isUndefined(isFirstChild)) __obj.updateDynamic("isFirstChild")(isFirstChild.asInstanceOf[js.Any])
    if (!js.isUndefined(isInvalid)) __obj.updateDynamic("isInvalid")(isInvalid.asInstanceOf[js.Any])
    if (!js.isUndefined(isRequired)) __obj.updateDynamic("isRequired")(isRequired.asInstanceOf[js.Any])
    if (items != null) __obj.updateDynamic("items")(items.asInstanceOf[js.Any])
    if (maxHeight != null) __obj.updateDynamic("maxHeight")(maxHeight.asInstanceOf[js.Any])
    if (noMatchesFound != null) __obj.updateDynamic("noMatchesFound")(noMatchesFound.asInstanceOf[js.Any])
    if (onFilterChange != null) __obj.updateDynamic("onFilterChange")(js.Any.fromFunction1(onFilterChange))
    if (onOpenChange != null) __obj.updateDynamic("onOpenChange")(js.Any.fromFunction1(onOpenChange))
    if (onSelected != null) __obj.updateDynamic("onSelected")(js.Any.fromFunction1(onSelected))
    if (position != null) __obj.updateDynamic("position")(position.asInstanceOf[js.Any])
    if (!js.isUndefined(shouldFitContainer)) __obj.updateDynamic("shouldFitContainer")(shouldFitContainer.asInstanceOf[js.Any])
    if (!js.isUndefined(shouldFlip)) __obj.updateDynamic("shouldFlip")(shouldFlip.asInstanceOf[js.Any])
    if (!js.isUndefined(shouldFocus)) __obj.updateDynamic("shouldFocus")(shouldFocus.asInstanceOf[js.Any])
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  def apply(mods: TagMod[tag.type]*): BuildingComponent[tag.type, default] = new slinky.core.BuildingComponent[slinky.web.html.`*`.tag.type, typingsSlinky.atlaskitSingleSelect.mod.default](js.Array(component.asInstanceOf[js.Any], js.Dictionary.empty)).apply(mods: _*)
  type Props = typingsSlinky.atlaskitSingleSelect.mod.Props
}

