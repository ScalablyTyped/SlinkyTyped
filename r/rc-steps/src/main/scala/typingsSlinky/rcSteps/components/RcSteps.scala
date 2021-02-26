package typingsSlinky.rcSteps.components

import typingsSlinky.rcSteps.mod.default
import typingsSlinky.rcSteps.stepsMod.StepsProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object RcSteps {
  
  @JSImport("rc-steps", JSImport.Default)
  @js.native
  val component: js.Object = js.native
  
  implicit def make(companion: RcSteps.type): SharedBuilder_StepsProps_455906600[default] = new SharedBuilder_StepsProps_455906600[default](js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: StepsProps): SharedBuilder_StepsProps_455906600[default] = new SharedBuilder_StepsProps_455906600[default](js.Array(this.component, p.asInstanceOf[js.Any]))
}
