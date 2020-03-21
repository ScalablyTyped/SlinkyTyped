package typingsSlinky.microsoftGraph.mod

import typingsSlinky.microsoftGraph.microsoftGraphStrings.failed_
import typingsSlinky.microsoftGraph.microsoftGraphStrings.none_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.microsoftGraph.microsoftGraphStrings.none_
  - typingsSlinky.microsoftGraph.microsoftGraphStrings.pending
  - typingsSlinky.microsoftGraph.microsoftGraphStrings.canceled
  - typingsSlinky.microsoftGraph.microsoftGraphStrings.active
  - typingsSlinky.microsoftGraph.microsoftGraphStrings.done
  - typingsSlinky.microsoftGraph.microsoftGraphStrings.failed_
  - typingsSlinky.microsoftGraph.microsoftGraphStrings.notSupported
*/
trait ActionState extends js.Object

object ActionState {
  @scala.inline
  def active: typingsSlinky.microsoftGraph.microsoftGraphStrings.active = this.cast("active")
  @scala.inline
  def canceled: typingsSlinky.microsoftGraph.microsoftGraphStrings.canceled = this.cast("canceled")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def done: typingsSlinky.microsoftGraph.microsoftGraphStrings.done = this.cast("done")
  @scala.inline
  def failed: failed_ = this.cast("failed")
  @scala.inline
  def none: none_ = this.cast("none")
  @scala.inline
  def notSupported: typingsSlinky.microsoftGraph.microsoftGraphStrings.notSupported = this.cast("notSupported")
  @scala.inline
  def pending: typingsSlinky.microsoftGraph.microsoftGraphStrings.pending = this.cast("pending")
}

