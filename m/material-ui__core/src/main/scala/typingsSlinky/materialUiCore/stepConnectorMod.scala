package typingsSlinky.materialUiCore

import org.scalablytyped.runtime.Shortcut
import slinky.core.ReactComponentClass
import typingsSlinky.materialUiCore.stepConnectorStepConnectorMod.StepConnectorProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object stepConnectorMod extends Shortcut {
  
  @JSImport("@material-ui/core/StepConnector", JSImport.Default)
  @js.native
  val default: ReactComponentClass[StepConnectorProps] = js.native
  
  type _To = ReactComponentClass[StepConnectorProps]
  
  /* This means you don't have to write `default`, but can instead just say `stepConnectorMod.foo` */
  override def _to: ReactComponentClass[StepConnectorProps] = default
}
