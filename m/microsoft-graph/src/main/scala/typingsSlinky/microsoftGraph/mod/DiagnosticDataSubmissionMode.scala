package typingsSlinky.microsoftGraph.mod

import typingsSlinky.microsoftGraph.microsoftGraphStrings.none_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.microsoftGraph.microsoftGraphStrings.userDefined
  - typingsSlinky.microsoftGraph.microsoftGraphStrings.none_
  - typingsSlinky.microsoftGraph.microsoftGraphStrings.basic
  - typingsSlinky.microsoftGraph.microsoftGraphStrings.enhanced
  - typingsSlinky.microsoftGraph.microsoftGraphStrings.full
*/
trait DiagnosticDataSubmissionMode extends js.Object

object DiagnosticDataSubmissionMode {
  @scala.inline
  def basic: typingsSlinky.microsoftGraph.microsoftGraphStrings.basic = this.cast("basic")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def enhanced: typingsSlinky.microsoftGraph.microsoftGraphStrings.enhanced = this.cast("enhanced")
  @scala.inline
  def full: typingsSlinky.microsoftGraph.microsoftGraphStrings.full = this.cast("full")
  @scala.inline
  def none: none_ = this.cast("none")
  @scala.inline
  def userDefined: typingsSlinky.microsoftGraph.microsoftGraphStrings.userDefined = this.cast("userDefined")
}

