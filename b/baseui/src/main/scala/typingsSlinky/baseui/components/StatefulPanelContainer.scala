package typingsSlinky.baseui.components

import org.scalablytyped.runtime.StringDictionary
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.core.TagMod
import slinky.web.html.`*`.tag
import typingsSlinky.baseui.AnonExpandedBoolean
import typingsSlinky.baseui.accordionMod.PanelState
import typingsSlinky.baseui.accordionMod.StatefulPanelContainerProps
import typingsSlinky.baseui.baseuiStrings.expand
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object StatefulPanelContainer
  extends ExternalComponentWithAttributesWithRefType[tag.type, typingsSlinky.baseui.accordionMod.StatefulPanelContainer] {
  @JSImport("baseui/accordion", "StatefulPanelContainer")
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  def apply(
    initialState: PanelState = null,
    onChange: /* args */ AnonExpandedBoolean => _ = null,
    stateReducer: (expand, PanelState, PanelState) => PanelState = null,
    _overrides: StringDictionary[js.Any] = null
  ): BuildingComponent[tag.type, typingsSlinky.baseui.accordionMod.StatefulPanelContainer] = {
    val __obj = js.Dynamic.literal()
    if (initialState != null) __obj.updateDynamic("initialState")(initialState.asInstanceOf[js.Any])
    if (onChange != null) __obj.updateDynamic("onChange")(js.Any.fromFunction1(onChange))
    if (stateReducer != null) __obj.updateDynamic("stateReducer")(js.Any.fromFunction3(stateReducer))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  def apply(mods: TagMod[tag.type]*): BuildingComponent[tag.type, typingsSlinky.baseui.accordionMod.StatefulPanelContainer] = new slinky.core.BuildingComponent[
  slinky.web.html.`*`.tag.type, 
  typingsSlinky.baseui.accordionMod.StatefulPanelContainer](js.Array(component.asInstanceOf[js.Any], js.Dictionary.empty)).apply(mods: _*)
  type Props = StatefulPanelContainerProps
}

