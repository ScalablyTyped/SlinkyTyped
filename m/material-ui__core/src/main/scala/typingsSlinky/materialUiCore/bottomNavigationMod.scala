package typingsSlinky.materialUiCore

import org.scalablytyped.runtime.Shortcut
import slinky.core.ReactComponentClass
import typingsSlinky.materialUiCore.bottomNavigationBottomNavigationMod.BottomNavigationProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object bottomNavigationMod extends Shortcut {
  
  @JSImport("@material-ui/core/BottomNavigation", JSImport.Default)
  @js.native
  val default: ReactComponentClass[BottomNavigationProps] = js.native
  
  type _To = ReactComponentClass[BottomNavigationProps]
  
  /* This means you don't have to write `default`, but can instead just say `bottomNavigationMod.foo` */
  override def _to: ReactComponentClass[BottomNavigationProps] = default
}
