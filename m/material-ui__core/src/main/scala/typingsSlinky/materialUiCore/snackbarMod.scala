package typingsSlinky.materialUiCore

import org.scalablytyped.runtime.Shortcut
import slinky.core.ReactComponentClass
import typingsSlinky.materialUiCore.snackbarSnackbarMod.SnackbarProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object snackbarMod extends Shortcut {
  
  @JSImport("@material-ui/core/Snackbar", JSImport.Default)
  @js.native
  val default: ReactComponentClass[SnackbarProps] = js.native
  
  type _To = ReactComponentClass[SnackbarProps]
  
  /* This means you don't have to write `default`, but can instead just say `snackbarMod.foo` */
  override def _to: ReactComponentClass[SnackbarProps] = default
}
