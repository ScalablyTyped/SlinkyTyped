package typingsSlinky.materialUiCore

import org.scalablytyped.runtime.Shortcut
import slinky.core.ReactComponentClass
import typingsSlinky.materialUiCore.tableHeadTableHeadMod.TableHeadProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object tableHeadMod extends Shortcut {
  
  @JSImport("@material-ui/core/TableHead", JSImport.Default)
  @js.native
  val default: ReactComponentClass[TableHeadProps] = js.native
  
  type _To = ReactComponentClass[TableHeadProps]
  
  /* This means you don't have to write `default`, but can instead just say `tableHeadMod.foo` */
  override def _to: ReactComponentClass[TableHeadProps] = default
}
