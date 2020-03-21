package typingsSlinky.baseui.components

import org.scalablytyped.runtime.StringDictionary
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.core.TagMod
import slinky.web.html.`*`.tag
import typingsSlinky.baseui.AnonNewIndex
import typingsSlinky.baseui.baseuiStrings.change_
import typingsSlinky.baseui.dndListMod.ListOverrides
import typingsSlinky.baseui.dndListMod.State
import typingsSlinky.baseui.dndListMod.StatefulComponentContainerProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object StatefulListContainer
  extends ExternalComponentWithAttributesWithRefType[tag.type, typingsSlinky.baseui.dndListMod.StatefulListContainer] {
  @JSImport("baseui/dnd-list", "StatefulListContainer")
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  def apply(
    initialState: State = null,
    onChange: /* params */ AnonNewIndex => _ = null,
    overrides: ListOverrides = null,
    removable: js.UndefOr[Boolean] = js.undefined,
    removableByMove: js.UndefOr[Boolean] = js.undefined,
    stateReducer: (change_, /* nextState */ State, /* currentState */ State) => State = null,
    _overrides: StringDictionary[js.Any] = null
  ): BuildingComponent[tag.type, typingsSlinky.baseui.dndListMod.StatefulListContainer] = {
    val __obj = js.Dynamic.literal()
    if (initialState != null) __obj.updateDynamic("initialState")(initialState.asInstanceOf[js.Any])
    if (onChange != null) __obj.updateDynamic("onChange")(js.Any.fromFunction1(onChange))
    if (overrides != null) __obj.updateDynamic("overrides")(overrides.asInstanceOf[js.Any])
    if (!js.isUndefined(removable)) __obj.updateDynamic("removable")(removable.asInstanceOf[js.Any])
    if (!js.isUndefined(removableByMove)) __obj.updateDynamic("removableByMove")(removableByMove.asInstanceOf[js.Any])
    if (stateReducer != null) __obj.updateDynamic("stateReducer")(js.Any.fromFunction3(stateReducer))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  def apply(mods: TagMod[tag.type]*): BuildingComponent[tag.type, typingsSlinky.baseui.dndListMod.StatefulListContainer] = new slinky.core.BuildingComponent[
  slinky.web.html.`*`.tag.type, 
  typingsSlinky.baseui.dndListMod.StatefulListContainer](js.Array(component.asInstanceOf[js.Any], js.Dictionary.empty)).apply(mods: _*)
  type Props = StatefulComponentContainerProps
}

