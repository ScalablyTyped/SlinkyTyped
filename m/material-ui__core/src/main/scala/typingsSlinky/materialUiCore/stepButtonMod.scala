package typingsSlinky.materialUiCore

import org.scalablytyped.runtime.Shortcut
import slinky.core.ReactComponentClass
import typingsSlinky.materialUiCore.stepButtonStepButtonMod.StepButtonProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object stepButtonMod extends Shortcut {
  
  @JSImport("@material-ui/core/StepButton", JSImport.Default)
  @js.native
  val default: ReactComponentClass[StepButtonProps] = js.native
  
  type _To = ReactComponentClass[StepButtonProps]
  
  /* This means you don't have to write `default`, but can instead just say `stepButtonMod.foo` */
  override def _to: ReactComponentClass[StepButtonProps] = default
}
