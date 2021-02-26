package typingsSlinky.materialUiCore

import org.scalablytyped.runtime.Shortcut
import slinky.core.ReactComponentClass
import typingsSlinky.materialUiCore.buttonButtonMod.ButtonProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buttonMod extends Shortcut {
  
  @JSImport("@material-ui/core/Button", JSImport.Default)
  @js.native
  val default: ReactComponentClass[ButtonProps] = js.native
  
  type _To = ReactComponentClass[ButtonProps]
  
  /* This means you don't have to write `default`, but can instead just say `buttonMod.foo` */
  override def _to: ReactComponentClass[ButtonProps] = default
}
