package typingsSlinky.reactTransitionGroup.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.reactTransitionGroup.reactTransitionGroupStrings.`in-out`
import typingsSlinky.reactTransitionGroup.reactTransitionGroupStrings.`out-in`
import typingsSlinky.reactTransitionGroup.switchTransitionMod.SwitchTransitionProps
import typingsSlinky.reactTransitionGroup.switchTransitionMod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object SwitchTransition {
  @JSImport("react-transition-group/SwitchTransition", JSImport.Default)
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, default] {
    @scala.inline
    def mode(value: `out-in` | `in-out`): this.type = set("mode", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: SwitchTransitionProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  implicit def make(companion: SwitchTransition.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
}

