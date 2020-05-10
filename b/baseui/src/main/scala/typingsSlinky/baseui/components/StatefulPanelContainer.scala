package typingsSlinky.baseui.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.baseui.AnonExpandedBoolean
import typingsSlinky.baseui.accordionMod.PanelState
import typingsSlinky.baseui.accordionMod.StatefulPanelContainerProps
import typingsSlinky.baseui.baseuiStrings.expand
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object StatefulPanelContainer {
  @JSImport("baseui/accordion", "StatefulPanelContainer")
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, typingsSlinky.baseui.accordionMod.StatefulPanelContainer] {
    @scala.inline
    def initialState(value: PanelState): this.type = set("initialState", value.asInstanceOf[js.Any])
    @scala.inline
    def onChange(value: /* args */ AnonExpandedBoolean => _): this.type = set("onChange", js.Any.fromFunction1(value))
    @scala.inline
    def stateReducer(value: (expand, PanelState, PanelState) => PanelState): this.type = set("stateReducer", js.Any.fromFunction3(value))
  }
  
  def withProps(p: StatefulPanelContainerProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  implicit def make(companion: StatefulPanelContainer.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
}

