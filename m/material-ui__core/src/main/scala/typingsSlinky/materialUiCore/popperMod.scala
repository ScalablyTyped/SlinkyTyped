package typingsSlinky.materialUiCore

import org.scalablytyped.runtime.Shortcut
import slinky.core.ReactComponentClass
import typingsSlinky.materialUiCore.popperPopperMod.PopperProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object popperMod extends Shortcut {
  
  @JSImport("@material-ui/core/Popper", JSImport.Default)
  @js.native
  val default: ReactComponentClass[PopperProps] = js.native
  
  type _To = ReactComponentClass[PopperProps]
  
  /* This means you don't have to write `default`, but can instead just say `popperMod.foo` */
  override def _to: ReactComponentClass[PopperProps] = default
}
