package typingsSlinky.materialUiCore

import org.scalablytyped.runtime.Shortcut
import slinky.core.ReactComponentClass
import typingsSlinky.materialUiCore.drawerDrawerMod.DrawerProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object drawerMod extends Shortcut {
  
  @JSImport("@material-ui/core/Drawer", JSImport.Default)
  @js.native
  val default: ReactComponentClass[DrawerProps] = js.native
  
  type _To = ReactComponentClass[DrawerProps]
  
  /* This means you don't have to write `default`, but can instead just say `drawerMod.foo` */
  override def _to: ReactComponentClass[DrawerProps] = default
}
