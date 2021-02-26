package typingsSlinky.materialUiCore

import org.scalablytyped.runtime.Shortcut
import slinky.core.ReactComponentClass
import typingsSlinky.materialUiCore.stepperStepperMod.StepperProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object stepperMod extends Shortcut {
  
  @JSImport("@material-ui/core/Stepper", JSImport.Default)
  @js.native
  val default: ReactComponentClass[StepperProps] = js.native
  
  type _To = ReactComponentClass[StepperProps]
  
  /* This means you don't have to write `default`, but can instead just say `stepperMod.foo` */
  override def _to: ReactComponentClass[StepperProps] = default
}
