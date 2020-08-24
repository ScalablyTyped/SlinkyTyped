package typingsSlinky.rcSteps.components

import typingsSlinky.rcSteps.mod.default
import typingsSlinky.rcSteps.stepsMod.StepsProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object RcSteps {
  @JSImport("rc-steps", JSImport.Default)
  @js.native
  object component extends js.Object
  
  def withProps(p: StepsProps): SharedBuilder_StepsProps_455906600[default] = new SharedBuilder_StepsProps_455906600[default](js.Array(this.component, p.asInstanceOf[js.Any]))
  implicit def make(companion: RcSteps.type): SharedBuilder_StepsProps_455906600[default] = new SharedBuilder_StepsProps_455906600[default](js.Array(this.component, js.Dictionary.empty))()
}

