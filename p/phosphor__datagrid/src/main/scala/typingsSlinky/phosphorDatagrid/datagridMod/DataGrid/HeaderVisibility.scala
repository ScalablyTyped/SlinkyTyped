package typingsSlinky.phosphorDatagrid.datagridMod.DataGrid

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A type alias for the supported header visibility modes.
  */
/* Rewritten from type alias, can be one of: 
  - typingsSlinky.phosphorDatagrid.phosphorDatagridStrings.all
  - typingsSlinky.phosphorDatagrid.phosphorDatagridStrings.row
  - typingsSlinky.phosphorDatagrid.phosphorDatagridStrings.column
  - typingsSlinky.phosphorDatagrid.phosphorDatagridStrings.none
*/
trait HeaderVisibility extends js.Object

object HeaderVisibility {
  @scala.inline
  def all: typingsSlinky.phosphorDatagrid.phosphorDatagridStrings.all = this.cast("all")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def column: typingsSlinky.phosphorDatagrid.phosphorDatagridStrings.column = this.cast("column")
  @scala.inline
  def none: typingsSlinky.phosphorDatagrid.phosphorDatagridStrings.none = this.cast("none")
  @scala.inline
  def row: typingsSlinky.phosphorDatagrid.phosphorDatagridStrings.row = this.cast("row")
}

