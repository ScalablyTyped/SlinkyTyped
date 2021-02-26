package typingsSlinky.materialUiCore

import org.scalablytyped.runtime.Shortcut
import slinky.core.ReactComponentClass
import typingsSlinky.materialUiCore.circularProgressCircularProgressMod.CircularProgressProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object circularProgressMod extends Shortcut {
  
  @JSImport("@material-ui/core/CircularProgress", JSImport.Default)
  @js.native
  val default: ReactComponentClass[CircularProgressProps] = js.native
  
  type _To = ReactComponentClass[CircularProgressProps]
  
  /* This means you don't have to write `default`, but can instead just say `circularProgressMod.foo` */
  override def _to: ReactComponentClass[CircularProgressProps] = default
}
