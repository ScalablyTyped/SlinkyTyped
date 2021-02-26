package typingsSlinky.materialUiCore

import org.scalablytyped.runtime.Shortcut
import slinky.core.ReactComponentClass
import typingsSlinky.materialUiCore.tableCellTableCellMod.TableCellProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object tableCellMod extends Shortcut {
  
  @JSImport("@material-ui/core/TableCell", JSImport.Default)
  @js.native
  val default: ReactComponentClass[TableCellProps] = js.native
  
  type _To = ReactComponentClass[TableCellProps]
  
  /* This means you don't have to write `default`, but can instead just say `tableCellMod.foo` */
  override def _to: ReactComponentClass[TableCellProps] = default
}
