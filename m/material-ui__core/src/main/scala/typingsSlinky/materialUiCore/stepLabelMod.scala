package typingsSlinky.materialUiCore

import org.scalablytyped.runtime.Shortcut
import slinky.core.ReactComponentClass
import typingsSlinky.materialUiCore.stepLabelStepLabelMod.StepLabelProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object stepLabelMod extends Shortcut {
  
  @JSImport("@material-ui/core/StepLabel", JSImport.Default)
  @js.native
  val default: ReactComponentClass[StepLabelProps] = js.native
  
  type _To = ReactComponentClass[StepLabelProps]
  
  /* This means you don't have to write `default`, but can instead just say `stepLabelMod.foo` */
  override def _to: ReactComponentClass[StepLabelProps] = default
}
