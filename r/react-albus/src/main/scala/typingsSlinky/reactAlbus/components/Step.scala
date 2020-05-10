package typingsSlinky.reactAlbus.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent.Default
import typingsSlinky.reactAlbus.mod.StepProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* The props of this component has an unsupported shape. You can use `set` manually to use it, but with no compiler support :/ . Support for combinations of intersection and union types not implemented */
object Step {
  @JSImport("react-albus", "Step")
  @js.native
  object component extends js.Object
  
  def apply(p: StepProps): Default[tag.type, typingsSlinky.reactAlbus.mod.Step] = new Default[tag.type, typingsSlinky.reactAlbus.mod.Step](js.Array(this.component, p.asInstanceOf[js.Any]))
  implicit def make(companion: Step.type): Default[tag.type, typingsSlinky.reactAlbus.mod.Step] = new Default[tag.type, typingsSlinky.reactAlbus.mod.Step](js.Array(this.component, js.Dictionary.empty))()
}

