package typingsSlinky.materialUiCore

import org.scalablytyped.runtime.Shortcut
import slinky.core.ReactComponentClass
import typingsSlinky.materialUiCore.formControlFormControlMod.FormControlProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object formControlMod extends Shortcut {
  
  @JSImport("@material-ui/core/FormControl", JSImport.Default)
  @js.native
  val default: ReactComponentClass[FormControlProps] = js.native
  
  type _To = ReactComponentClass[FormControlProps]
  
  /* This means you don't have to write `default`, but can instead just say `formControlMod.foo` */
  override def _to: ReactComponentClass[FormControlProps] = default
}
