package typingsSlinky.phosphorDatagrid.datamodelMod.DataModel

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A type alias for the data model cell regions.
  */
/* Rewritten from type alias, can be one of: 
  - typingsSlinky.phosphorDatagrid.phosphorDatagridStrings.body
  - typingsSlinky.phosphorDatagrid.phosphorDatagridStrings.`row-header`
  - typingsSlinky.phosphorDatagrid.phosphorDatagridStrings.`column-header`
  - typingsSlinky.phosphorDatagrid.phosphorDatagridStrings.`corner-header`
*/
trait CellRegion extends js.Object

object CellRegion {
  @scala.inline
  def body: typingsSlinky.phosphorDatagrid.phosphorDatagridStrings.body = this.cast("body")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def `column-header`: typingsSlinky.phosphorDatagrid.phosphorDatagridStrings.`column-header` = this.cast("column-header")
  @scala.inline
  def `corner-header`: typingsSlinky.phosphorDatagrid.phosphorDatagridStrings.`corner-header` = this.cast("corner-header")
  @scala.inline
  def `row-header`: typingsSlinky.phosphorDatagrid.phosphorDatagridStrings.`row-header` = this.cast("row-header")
}

