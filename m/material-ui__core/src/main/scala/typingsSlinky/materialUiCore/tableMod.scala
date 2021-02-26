package typingsSlinky.materialUiCore

import org.scalablytyped.runtime.Shortcut
import slinky.core.ReactComponentClass
import typingsSlinky.materialUiCore.tableTableMod.TableProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object tableMod extends Shortcut {
  
  @JSImport("@material-ui/core/Table", JSImport.Default)
  @js.native
  val default: ReactComponentClass[TableProps] = js.native
  
  type _To = ReactComponentClass[TableProps]
  
  /* This means you don't have to write `default`, but can instead just say `tableMod.foo` */
  override def _to: ReactComponentClass[TableProps] = default
}
