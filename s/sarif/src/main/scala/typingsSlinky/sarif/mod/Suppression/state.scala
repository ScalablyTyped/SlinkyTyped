package typingsSlinky.sarif.mod.Suppression

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.sarif.sarifStrings.accepted
  - typingsSlinky.sarif.sarifStrings.underReview
  - typingsSlinky.sarif.sarifStrings.rejected
*/
trait state extends js.Object

object state {
  @scala.inline
  def accepted: typingsSlinky.sarif.sarifStrings.accepted = this.cast("accepted")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def rejected: typingsSlinky.sarif.sarifStrings.rejected = this.cast("rejected")
  @scala.inline
  def underReview: typingsSlinky.sarif.sarifStrings.underReview = this.cast("underReview")
}

