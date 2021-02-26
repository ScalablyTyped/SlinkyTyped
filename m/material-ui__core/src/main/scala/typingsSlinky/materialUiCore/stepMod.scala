package typingsSlinky.materialUiCore

import org.scalablytyped.runtime.Shortcut
import slinky.core.ReactComponentClass
import typingsSlinky.materialUiCore.stepStepMod.StepProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object stepMod extends Shortcut {
  
  @JSImport("@material-ui/core/Step", JSImport.Default)
  @js.native
  val default: ReactComponentClass[StepProps] = js.native
  
  type _To = ReactComponentClass[StepProps]
  
  /* This means you don't have to write `default`, but can instead just say `stepMod.foo` */
  override def _to: ReactComponentClass[StepProps] = default
}
