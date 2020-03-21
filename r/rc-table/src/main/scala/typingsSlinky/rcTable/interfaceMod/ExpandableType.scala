package typingsSlinky.rcTable.interfaceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.rcTable.rcTableBooleans.`false`
  - typingsSlinky.rcTable.rcTableStrings.row
  - typingsSlinky.rcTable.rcTableStrings.nest
*/
trait ExpandableType extends js.Object

object ExpandableType {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def `false`: typingsSlinky.rcTable.rcTableBooleans.`false` = this.cast(false)
  @scala.inline
  def nest: typingsSlinky.rcTable.rcTableStrings.nest = this.cast("nest")
  @scala.inline
  def row: typingsSlinky.rcTable.rcTableStrings.row = this.cast("row")
}

