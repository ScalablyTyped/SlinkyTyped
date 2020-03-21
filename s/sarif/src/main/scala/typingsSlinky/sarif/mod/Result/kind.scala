package typingsSlinky.sarif.mod.Result

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.sarif.sarifStrings.notApplicable
  - typingsSlinky.sarif.sarifStrings.pass
  - typingsSlinky.sarif.sarifStrings.fail
  - typingsSlinky.sarif.sarifStrings.review
  - typingsSlinky.sarif.sarifStrings.open
  - typingsSlinky.sarif.sarifStrings.informational
*/
trait kind extends js.Object

object kind {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def fail: typingsSlinky.sarif.sarifStrings.fail = this.cast("fail")
  @scala.inline
  def informational: typingsSlinky.sarif.sarifStrings.informational = this.cast("informational")
  @scala.inline
  def notApplicable: typingsSlinky.sarif.sarifStrings.notApplicable = this.cast("notApplicable")
  @scala.inline
  def open: typingsSlinky.sarif.sarifStrings.open = this.cast("open")
  @scala.inline
  def pass: typingsSlinky.sarif.sarifStrings.pass = this.cast("pass")
  @scala.inline
  def review: typingsSlinky.sarif.sarifStrings.review = this.cast("review")
}

