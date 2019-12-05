package typingsSlinky.ejDotWebDotAll.ej.TreeGrid

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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
  
  /* 2 */ val Above: typingsSlinky.ejDotWebDotAll.ej.TreeGrid.RowPosition.Above with Double = js.native
  /* 3 */ val Below: typingsSlinky.ejDotWebDotAll.ej.TreeGrid.RowPosition.Below with Double = js.native
  /* 1 */ val Bottom: typingsSlinky.ejDotWebDotAll.ej.TreeGrid.RowPosition.Bottom with Double = js.native
  /* 4 */ val Child: typingsSlinky.ejDotWebDotAll.ej.TreeGrid.RowPosition.Child with Double = js.native
  /* 0 */ val Top: typingsSlinky.ejDotWebDotAll.ej.TreeGrid.RowPosition.Top with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[RowPosition with Double] = js.native
}

