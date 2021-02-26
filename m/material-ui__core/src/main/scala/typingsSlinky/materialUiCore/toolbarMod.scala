package typingsSlinky.materialUiCore

import org.scalablytyped.runtime.Shortcut
import slinky.core.ReactComponentClass
import typingsSlinky.materialUiCore.toolbarToolbarMod.ToolbarProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object toolbarMod extends Shortcut {
  
  @JSImport("@material-ui/core/Toolbar", JSImport.Default)
  @js.native
  val default: ReactComponentClass[ToolbarProps] = js.native
  
  type _To = ReactComponentClass[ToolbarProps]
  
  /* This means you don't have to write `default`, but can instead just say `toolbarMod.foo` */
  override def _to: ReactComponentClass[ToolbarProps] = default
}
