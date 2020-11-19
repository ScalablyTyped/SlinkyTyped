package typingsSlinky.rmcSteps.components

import typingsSlinky.rmcSteps.mod.default
import typingsSlinky.rmcSteps.stepsMod.IStepsProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Lib {
  
  @JSImport("rmc-steps/lib", JSImport.Default)
  @js.native
  object component extends js.Object
  
  def withProps(p: IStepsProps): SharedBuilder_IStepsProps1494684341[default] = new SharedBuilder_IStepsProps1494684341[default](js.Array(this.component, p.asInstanceOf[js.Any]))
  
  implicit def make(companion: Lib.type): SharedBuilder_IStepsProps1494684341[default] = new SharedBuilder_IStepsProps1494684341[default](js.Array(this.component, js.Dictionary.empty))()
}
