package typingsSlinky.materialUiCore

import org.scalablytyped.runtime.Shortcut
import slinky.core.ReactComponentClass
import typingsSlinky.materialUiCore.menuMenuMod.MenuProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object menuMod extends Shortcut {
  
  @JSImport("@material-ui/core/Menu", JSImport.Default)
  @js.native
  val default: ReactComponentClass[MenuProps] = js.native
  
  type _To = ReactComponentClass[MenuProps]
  
  /* This means you don't have to write `default`, but can instead just say `menuMod.foo` */
  override def _to: ReactComponentClass[MenuProps] = default
}
