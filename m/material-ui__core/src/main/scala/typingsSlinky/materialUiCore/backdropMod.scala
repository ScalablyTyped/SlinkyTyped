package typingsSlinky.materialUiCore

import org.scalablytyped.runtime.Shortcut
import slinky.core.ReactComponentClass
import typingsSlinky.materialUiCore.backdropBackdropMod.BackdropProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object backdropMod extends Shortcut {
  
  @JSImport("@material-ui/core/Backdrop", JSImport.Default)
  @js.native
  val default: ReactComponentClass[BackdropProps] = js.native
  
  type _To = ReactComponentClass[BackdropProps]
  
  /* This means you don't have to write `default`, but can instead just say `backdropMod.foo` */
  override def _to: ReactComponentClass[BackdropProps] = default
}
