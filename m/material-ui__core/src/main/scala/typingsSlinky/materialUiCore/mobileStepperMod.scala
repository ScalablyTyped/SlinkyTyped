package typingsSlinky.materialUiCore

import org.scalablytyped.runtime.Shortcut
import slinky.core.ReactComponentClass
import typingsSlinky.materialUiCore.mobileStepperMobileStepperMod.MobileStepperProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mobileStepperMod extends Shortcut {
  
  @JSImport("@material-ui/core/MobileStepper", JSImport.Default)
  @js.native
  val default: ReactComponentClass[MobileStepperProps] = js.native
  
  type _To = ReactComponentClass[MobileStepperProps]
  
  /* This means you don't have to write `default`, but can instead just say `mobileStepperMod.foo` */
  override def _to: ReactComponentClass[MobileStepperProps] = default
}
