package typingsSlinky.materialUiCore

import org.scalablytyped.runtime.Shortcut
import slinky.core.ReactComponentClass
import typingsSlinky.materialUiCore.swipeableDrawerSwipeableDrawerMod.SwipeableDrawerProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object swipeableDrawerMod extends Shortcut {
  
  @JSImport("@material-ui/core/SwipeableDrawer", JSImport.Default)
  @js.native
  val default: ReactComponentClass[SwipeableDrawerProps] = js.native
  
  type _To = ReactComponentClass[SwipeableDrawerProps]
  
  /* This means you don't have to write `default`, but can instead just say `swipeableDrawerMod.foo` */
  override def _to: ReactComponentClass[SwipeableDrawerProps] = default
}
