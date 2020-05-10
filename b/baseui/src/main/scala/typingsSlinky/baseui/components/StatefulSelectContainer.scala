package typingsSlinky.baseui.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.baseui.selectMod.OnChangeParams
import typingsSlinky.baseui.selectMod.SelectOverrides
import typingsSlinky.baseui.selectMod.State
import typingsSlinky.baseui.selectMod.StatefulContainerProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object StatefulSelectContainer {
  @JSImport("baseui/select", "StatefulSelectContainer")
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, typingsSlinky.baseui.selectMod.StatefulSelectContainer] {
    @scala.inline
    def initialState(value: State): this.type = set("initialState", value.asInstanceOf[js.Any])
    @scala.inline
    def onChange(value: /* params */ OnChangeParams => _): this.type = set("onChange", js.Any.fromFunction1(value))
    @scala.inline
    def overrides(value: SelectOverrides): this.type = set("overrides", value.asInstanceOf[js.Any])
    @scala.inline
    def stateReducer(value: (/* stateType */ String, /* nextState */ State, /* currentState */ State) => State): this.type = set("stateReducer", js.Any.fromFunction3(value))
  }
  
  def withProps(p: StatefulContainerProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  implicit def make(companion: StatefulSelectContainer.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
}

