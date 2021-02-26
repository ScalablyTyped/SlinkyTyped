package typingsSlinky.materialUiCore

import org.scalablytyped.runtime.Shortcut
import slinky.core.ReactComponentClass
import typingsSlinky.materialUiCore.appBarAppBarMod.AppBarProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object appBarMod extends Shortcut {
  
  @JSImport("@material-ui/core/AppBar", JSImport.Default)
  @js.native
  val default: ReactComponentClass[AppBarProps] = js.native
  
  type _To = ReactComponentClass[AppBarProps]
  
  /* This means you don't have to write `default`, but can instead just say `appBarMod.foo` */
  override def _to: ReactComponentClass[AppBarProps] = default
}
