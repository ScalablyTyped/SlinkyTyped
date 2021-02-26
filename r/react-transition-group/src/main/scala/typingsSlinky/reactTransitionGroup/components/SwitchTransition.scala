package typingsSlinky.reactTransitionGroup.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.reactTransitionGroup.reactTransitionGroupStrings.`in-out`
import typingsSlinky.reactTransitionGroup.reactTransitionGroupStrings.`out-in`
import typingsSlinky.reactTransitionGroup.switchTransitionMod.SwitchTransitionProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object SwitchTransition {
  
  @JSImport("react-transition-group", "SwitchTransition")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, typingsSlinky.reactTransitionGroup.mod.SwitchTransition] {
    
    @scala.inline
    def mode(value: `out-in` | `in-out`): this.type = set("mode", value.asInstanceOf[js.Any])
  }
  
  implicit def make(companion: SwitchTransition.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: SwitchTransitionProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
