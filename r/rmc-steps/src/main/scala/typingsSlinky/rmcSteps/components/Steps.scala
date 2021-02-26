package typingsSlinky.rmcSteps.components

import typingsSlinky.rmcSteps.stepsMod.IStepsProps
import typingsSlinky.rmcSteps.stepsMod.default
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Steps {
  
  @JSImport("rmc-steps/lib/Steps", JSImport.Default)
  @js.native
  val component: js.Object = js.native
  
  implicit def make(companion: Steps.type): SharedBuilder_IStepsProps1494684341[default] = new SharedBuilder_IStepsProps1494684341[default](js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: IStepsProps): SharedBuilder_IStepsProps1494684341[default] = new SharedBuilder_IStepsProps1494684341[default](js.Array(this.component, p.asInstanceOf[js.Any]))
}
