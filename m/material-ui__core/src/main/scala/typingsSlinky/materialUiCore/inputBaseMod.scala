package typingsSlinky.materialUiCore

import org.scalablytyped.runtime.Shortcut
import slinky.core.ReactComponentClass
import typingsSlinky.materialUiCore.inputBaseInputBaseMod.InputBaseProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object inputBaseMod extends Shortcut {
  
  @JSImport("@material-ui/core/InputBase", JSImport.Default)
  @js.native
  val default: ReactComponentClass[InputBaseProps] = js.native
  
  type _To = ReactComponentClass[InputBaseProps]
  
  /* This means you don't have to write `default`, but can instead just say `inputBaseMod.foo` */
  override def _to: ReactComponentClass[InputBaseProps] = default
}
