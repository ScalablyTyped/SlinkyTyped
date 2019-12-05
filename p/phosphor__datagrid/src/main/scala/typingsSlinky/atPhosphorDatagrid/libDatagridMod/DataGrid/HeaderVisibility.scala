package typingsSlinky.atPhosphorDatagrid.libDatagridMod.DataGrid

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A type alias for the supported header visibility modes.
  */
/* Rewritten from type alias, can be one of: 
  - typings.atPhosphorDatagrid.atPhosphorDatagridStrings.all
  - typings.atPhosphorDatagrid.atPhosphorDatagridStrings.row
  - typings.atPhosphorDatagrid.atPhosphorDatagridStrings.column
  - typings.atPhosphorDatagrid.atPhosphorDatagridStrings.none
*/
trait HeaderVisibility extends js.Object

object HeaderVisibility {
  @scala.inline
  def all: typingsSlinky.atPhosphorDatagrid.atPhosphorDatagridStrings.all = this.cast("all")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def column: typingsSlinky.atPhosphorDatagrid.atPhosphorDatagridStrings.column = this.cast("column")
  @scala.inline
  def none: typingsSlinky.atPhosphorDatagrid.atPhosphorDatagridStrings.none = this.cast("none")
  @scala.inline
  def row: typingsSlinky.atPhosphorDatagrid.atPhosphorDatagridStrings.row = this.cast("row")
}

