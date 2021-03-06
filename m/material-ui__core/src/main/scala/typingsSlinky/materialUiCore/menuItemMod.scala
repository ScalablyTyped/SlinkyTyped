package typingsSlinky.materialUiCore

import org.scalablytyped.runtime.Shortcut
import slinky.core.ReactComponentClass
import typingsSlinky.materialUiCore.menuItemMenuItemMod.MenuItemProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object menuItemMod extends Shortcut {
  
  @JSImport("@material-ui/core/MenuItem", JSImport.Default)
  @js.native
  val default: ReactComponentClass[MenuItemProps] = js.native
  
  type _To = ReactComponentClass[MenuItemProps]
  
  /* This means you don't have to write `default`, but can instead just say `menuItemMod.foo` */
  override def _to: ReactComponentClass[MenuItemProps] = default
}
