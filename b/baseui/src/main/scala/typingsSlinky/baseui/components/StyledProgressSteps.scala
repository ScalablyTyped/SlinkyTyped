package typingsSlinky.baseui.components

import typingsSlinky.baseui.progressStepsMod.StyleProps
import typingsSlinky.react.mod.PropsWithChildren
import typingsSlinky.styletronReact.mod.StyletronComponentInjectedProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object StyledProgressSteps {
  
  @JSImport("baseui/progress-steps", "StyledProgressSteps")
  @js.native
  val component: js.Object = js.native
  
  implicit def make(companion: StyledProgressSteps.type): SharedBuilder_PropsWithChildren_6741298 = new SharedBuilder_PropsWithChildren_6741298(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: PropsWithChildren[StyleProps with StyletronComponentInjectedProps[StyleProps]]): SharedBuilder_PropsWithChildren_6741298 = new SharedBuilder_PropsWithChildren_6741298(js.Array(this.component, p.asInstanceOf[js.Any]))
}
