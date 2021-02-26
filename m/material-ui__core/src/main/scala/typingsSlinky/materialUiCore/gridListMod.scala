package typingsSlinky.materialUiCore

import org.scalablytyped.runtime.Shortcut
import slinky.core.ReactComponentClass
import typingsSlinky.materialUiCore.gridListGridListMod.GridListProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object gridListMod extends Shortcut {
  
  @JSImport("@material-ui/core/GridList", JSImport.Default)
  @js.native
  val default: ReactComponentClass[GridListProps] = js.native
  
  type _To = ReactComponentClass[GridListProps]
  
  /* This means you don't have to write `default`, but can instead just say `gridListMod.foo` */
  override def _to: ReactComponentClass[GridListProps] = default
}
