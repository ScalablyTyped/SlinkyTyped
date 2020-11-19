package typingsSlinky.ejWebAll.ej.TreeGrid

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait RowPosition extends js.Object
@JSGlobal("ej.TreeGrid.RowPosition")
@js.native
object RowPosition extends js.Object {
  
  ///you can add a new row to above selected row.
  @js.native
  sealed trait Above extends RowPosition
  
  ///you can add a new row to below selected row.
  @js.native
  sealed trait Below extends RowPosition
  
  ///you can add a new row at bottom.
  @js.native
  sealed trait Bottom extends RowPosition
  
  ///you can add a new row as a child for selected row.
  @js.native
  sealed trait Child extends RowPosition
  
  ///you can add a new row at top.
  @js.native
  sealed trait Top extends RowPosition
}
