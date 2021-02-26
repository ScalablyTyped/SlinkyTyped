package typingsSlinky.materialUiCore

import org.scalablytyped.runtime.Shortcut
import slinky.core.ReactComponentClass
import typingsSlinky.materialUiCore.inputInputMod.InputProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object inputMod extends Shortcut {
  
  @JSImport("@material-ui/core/Input", JSImport.Default)
  @js.native
  val default: ReactComponentClass[InputProps] = js.native
  
  type _To = ReactComponentClass[InputProps]
  
  /* This means you don't have to write `default`, but can instead just say `inputMod.foo` */
  override def _to: ReactComponentClass[InputProps] = default
}
