package typingsSlinky.baseui.components

import org.scalablytyped.runtime.StringDictionary
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.core.TagMod
import slinky.web.html.`*`.tag
import typingsSlinky.baseui.selectMod.SelectOverrides
import typingsSlinky.baseui.selectMod.State
import typingsSlinky.baseui.selectMod.StatefulContainerProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object StatefulSelectContainer
  extends ExternalComponentWithAttributesWithRefType[tag.type, typingsSlinky.baseui.selectMod.StatefulSelectContainer] {
  @JSImport("baseui/select", "StatefulSelectContainer")
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  /* The following DOM/SVG props were specified: onChange */
  def apply(
    initialState: State = null,
    overrides: SelectOverrides = null,
    stateReducer: (/* stateType */ String, /* nextState */ State, /* currentState */ State) => State = null,
    _overrides: StringDictionary[js.Any] = null
  ): BuildingComponent[tag.type, typingsSlinky.baseui.selectMod.StatefulSelectContainer] = {
    val __obj = js.Dynamic.literal()
    if (initialState != null) __obj.updateDynamic("initialState")(initialState.asInstanceOf[js.Any])
    if (overrides != null) __obj.updateDynamic("overrides")(overrides.asInstanceOf[js.Any])
    if (stateReducer != null) __obj.updateDynamic("stateReducer")(js.Any.fromFunction3(stateReducer))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  def apply(mods: TagMod[tag.type]*): BuildingComponent[tag.type, typingsSlinky.baseui.selectMod.StatefulSelectContainer] = new slinky.core.BuildingComponent[
  slinky.web.html.`*`.tag.type, 
  typingsSlinky.baseui.selectMod.StatefulSelectContainer](js.Array(component.asInstanceOf[js.Any], js.Dictionary.empty)).apply(mods: _*)
  type Props = StatefulContainerProps
}

