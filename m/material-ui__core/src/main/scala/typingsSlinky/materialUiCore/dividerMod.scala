package typingsSlinky.materialUiCore

import org.scalablytyped.runtime.Shortcut
import slinky.core.ReactComponentClass
import typingsSlinky.materialUiCore.dividerDividerMod.DividerProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object dividerMod extends Shortcut {
  
  @JSImport("@material-ui/core/Divider", JSImport.Default)
  @js.native
  val default: ReactComponentClass[DividerProps] = js.native
  
  type _To = ReactComponentClass[DividerProps]
  
  /* This means you don't have to write `default`, but can instead just say `dividerMod.foo` */
  override def _to: ReactComponentClass[DividerProps] = default
}
