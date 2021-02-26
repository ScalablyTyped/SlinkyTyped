package typingsSlinky.materialUiCore

import org.scalablytyped.runtime.Shortcut
import slinky.core.ReactComponentClass
import typingsSlinky.materialUiCore.filledInputFilledInputMod.FilledInputProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object filledInputMod extends Shortcut {
  
  @JSImport("@material-ui/core/FilledInput", JSImport.Default)
  @js.native
  val default: ReactComponentClass[FilledInputProps] = js.native
  
  type _To = ReactComponentClass[FilledInputProps]
  
  /* This means you don't have to write `default`, but can instead just say `filledInputMod.foo` */
  override def _to: ReactComponentClass[FilledInputProps] = default
}
