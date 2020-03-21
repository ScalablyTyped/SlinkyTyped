package typingsSlinky.sarif.mod.Result

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.sarif.sarifStrings.`new`
  - typingsSlinky.sarif.sarifStrings.unchanged
  - typingsSlinky.sarif.sarifStrings.updated
  - typingsSlinky.sarif.sarifStrings.absent
*/
trait baselineState extends js.Object

object baselineState {
  @scala.inline
  def absent: typingsSlinky.sarif.sarifStrings.absent = this.cast("absent")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def `new`: typingsSlinky.sarif.sarifStrings.`new` = this.cast("new")
  @scala.inline
  def unchanged: typingsSlinky.sarif.sarifStrings.unchanged = this.cast("unchanged")
  @scala.inline
  def updated: typingsSlinky.sarif.sarifStrings.updated = this.cast("updated")
}

