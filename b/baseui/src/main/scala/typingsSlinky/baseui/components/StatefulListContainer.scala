package typingsSlinky.baseui.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.baseui.anon.NewIndex
import typingsSlinky.baseui.baseuiStrings.change_
import typingsSlinky.baseui.dndListMod.ListOverrides
import typingsSlinky.baseui.dndListMod.State
import typingsSlinky.baseui.dndListMod.StatefulComponentContainerProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object StatefulListContainer {
  @JSImport("baseui/dnd-list", "StatefulListContainer")
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, typingsSlinky.baseui.dndListMod.StatefulListContainer] {
    @scala.inline
    def initialState(value: State): this.type = set("initialState", value.asInstanceOf[js.Any])
    @scala.inline
    def onChange(value: /* params */ NewIndex => _): this.type = set("onChange", js.Any.fromFunction1(value))
    @scala.inline
    def overrides(value: ListOverrides): this.type = set("overrides", value.asInstanceOf[js.Any])
    @scala.inline
    def removable(value: Boolean): this.type = set("removable", value.asInstanceOf[js.Any])
    @scala.inline
    def removableByMove(value: Boolean): this.type = set("removableByMove", value.asInstanceOf[js.Any])
    @scala.inline
    def stateReducer(value: (change_, /* nextState */ State, /* currentState */ State) => State): this.type = set("stateReducer", js.Any.fromFunction3(value))
  }
  
  def withProps(p: StatefulComponentContainerProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  implicit def make(companion: StatefulListContainer.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
}

