package typingsSlinky.jupyterlabCells.celldragutilsMod.CellDragUtils

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.jupyterlabCells.jupyterlabCellsStrings.input
  - typingsSlinky.jupyterlabCells.jupyterlabCellsStrings.prompt
  - typingsSlinky.jupyterlabCells.jupyterlabCellsStrings.cell
  - typingsSlinky.jupyterlabCells.jupyterlabCellsStrings.unknown
*/
trait ICellTargetArea extends js.Object

object ICellTargetArea {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def cell: typingsSlinky.jupyterlabCells.jupyterlabCellsStrings.cell = this.cast("cell")
  @scala.inline
  def input: typingsSlinky.jupyterlabCells.jupyterlabCellsStrings.input = this.cast("input")
  @scala.inline
  def prompt: typingsSlinky.jupyterlabCells.jupyterlabCellsStrings.prompt = this.cast("prompt")
  @scala.inline
  def unknown: typingsSlinky.jupyterlabCells.jupyterlabCellsStrings.unknown = this.cast("unknown")
}

