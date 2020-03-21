package typingsSlinky.rcMenu.interfaceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.rcMenu.rcMenuStrings.horizontal
  - typingsSlinky.rcMenu.rcMenuStrings.vertical
  - typingsSlinky.rcMenu.rcMenuStrings.`vertical-left`
  - typingsSlinky.rcMenu.rcMenuStrings.`vertical-right`
  - typingsSlinky.rcMenu.rcMenuStrings.`inline`
*/
trait MenuMode extends js.Object

object MenuMode {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def horizontal: typingsSlinky.rcMenu.rcMenuStrings.horizontal = this.cast("horizontal")
  @scala.inline
  def `inline`: typingsSlinky.rcMenu.rcMenuStrings.`inline` = this.cast("inline")
  @scala.inline
  def vertical: typingsSlinky.rcMenu.rcMenuStrings.vertical = this.cast("vertical")
  @scala.inline
  def `vertical-left`: typingsSlinky.rcMenu.rcMenuStrings.`vertical-left` = this.cast("vertical-left")
  @scala.inline
  def `vertical-right`: typingsSlinky.rcMenu.rcMenuStrings.`vertical-right` = this.cast("vertical-right")
}

