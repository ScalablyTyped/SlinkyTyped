package typingsSlinky.materialUiCore

import org.scalablytyped.runtime.Shortcut
import slinky.core.ReactComponentClass
import typingsSlinky.materialUiCore.textFieldTextFieldMod.TextFieldProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object textFieldMod extends Shortcut {
  
  @JSImport("@material-ui/core/TextField", JSImport.Default)
  @js.native
  val default: ReactComponentClass[TextFieldProps] = js.native
  
  type _To = ReactComponentClass[TextFieldProps]
  
  /* This means you don't have to write `default`, but can instead just say `textFieldMod.foo` */
  override def _to: ReactComponentClass[TextFieldProps] = default
}
