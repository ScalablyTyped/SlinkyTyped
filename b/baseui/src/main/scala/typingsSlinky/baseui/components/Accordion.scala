package typingsSlinky.baseui.components

import org.scalablytyped.runtime.StringDictionary
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.core.TagMod
import slinky.web.html.`*`.tag
import typingsSlinky.baseui.accordionMod.AccordionOverrides
import typingsSlinky.baseui.accordionMod.AccordionProps
import typingsSlinky.baseui.accordionMod.AccordionState
import typingsSlinky.baseui.accordionMod.SharedProps
import typingsSlinky.baseui.baseuiStrings.expand
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Accordion
  extends ExternalComponentWithAttributesWithRefType[tag.type, typingsSlinky.baseui.accordionMod.Accordion] {
  @JSImport("baseui/accordion", "Accordion")
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  /* The following DOM/SVG props were specified: disabled, onChange */
  def apply(
    accordion: js.UndefOr[Boolean] = js.undefined,
    initialState: AccordionState = null,
    overrides: AccordionOverrides[SharedProps with js.Object] = null,
    renderAll: js.UndefOr[Boolean] = js.undefined,
    renderPanelContent: js.UndefOr[Boolean] = js.undefined,
    stateReducer: (expand, AccordionState, AccordionState) => AccordionState = null,
    _overrides: StringDictionary[js.Any] = null
  ): BuildingComponent[tag.type, typingsSlinky.baseui.accordionMod.Accordion] = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(accordion)) __obj.updateDynamic("accordion")(accordion.asInstanceOf[js.Any])
    if (initialState != null) __obj.updateDynamic("initialState")(initialState.asInstanceOf[js.Any])
    if (overrides != null) __obj.updateDynamic("overrides")(overrides.asInstanceOf[js.Any])
    if (!js.isUndefined(renderAll)) __obj.updateDynamic("renderAll")(renderAll.asInstanceOf[js.Any])
    if (!js.isUndefined(renderPanelContent)) __obj.updateDynamic("renderPanelContent")(renderPanelContent.asInstanceOf[js.Any])
    if (stateReducer != null) __obj.updateDynamic("stateReducer")(js.Any.fromFunction3(stateReducer))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  def apply(mods: TagMod[tag.type]*): BuildingComponent[tag.type, typingsSlinky.baseui.accordionMod.Accordion] = new slinky.core.BuildingComponent[slinky.web.html.`*`.tag.type, typingsSlinky.baseui.accordionMod.Accordion](js.Array(component.asInstanceOf[js.Any], js.Dictionary.empty)).apply(mods: _*)
  type Props = AccordionProps
}

