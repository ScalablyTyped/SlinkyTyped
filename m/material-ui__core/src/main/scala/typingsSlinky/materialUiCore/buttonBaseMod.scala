package typingsSlinky.materialUiCore

import org.scalablytyped.runtime.Shortcut
import slinky.core.ReactComponentClass
import typingsSlinky.materialUiCore.buttonBaseButtonBaseMod.ButtonBaseProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buttonBaseMod extends Shortcut {
  
  @JSImport("@material-ui/core/ButtonBase", JSImport.Default)
  @js.native
  val default: ReactComponentClass[ButtonBaseProps] = js.native
  
  type _To = ReactComponentClass[ButtonBaseProps]
  
  /* This means you don't have to write `default`, but can instead just say `buttonBaseMod.foo` */
  override def _to: ReactComponentClass[ButtonBaseProps] = default
}
