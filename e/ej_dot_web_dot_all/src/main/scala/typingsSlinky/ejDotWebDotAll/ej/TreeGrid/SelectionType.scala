package typingsSlinky.ejDotWebDotAll.ej.TreeGrid

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait SelectionType extends js.Object

@JSGlobal("ej.TreeGrid.SelectionType")
@js.native
object SelectionType extends js.Object {
  ///you can select rows using checkbox.
  @js.native
  sealed trait Checkbox extends SelectionType
  
  ///you can select a multiple row.
  @js.native
  sealed trait Multiple extends SelectionType
  
  ///you can select a single row.
  @js.native
  sealed trait Single extends SelectionType
  
  /* 2 */ val Checkbox: typingsSlinky.ejDotWebDotAll.ej.TreeGrid.SelectionType.Checkbox with Double = js.native
  /* 1 */ val Multiple: typingsSlinky.ejDotWebDotAll.ej.TreeGrid.SelectionType.Multiple with Double = js.native
  /* 0 */ val Single: typingsSlinky.ejDotWebDotAll.ej.TreeGrid.SelectionType.Single with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[SelectionType with Double] = js.native
}

