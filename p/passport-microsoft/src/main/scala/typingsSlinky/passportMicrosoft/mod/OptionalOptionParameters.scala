package typingsSlinky.passportMicrosoft.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// The passport-microsoft library provides defaults for these fields, so they become optional
// when calling the constructor. (No need to export this).
/* Rewritten from type alias, can be one of: 
  - typingsSlinky.passportMicrosoft.passportMicrosoftStrings.authorizationURL
  - typingsSlinky.passportMicrosoft.passportMicrosoftStrings.tokenURL
  - typingsSlinky.passportMicrosoft.passportMicrosoftStrings.scopeSeparator
  - typingsSlinky.passportMicrosoft.passportMicrosoftStrings.customHeaders
*/
trait OptionalOptionParameters extends js.Object

object OptionalOptionParameters {
  @scala.inline
  def authorizationURL: typingsSlinky.passportMicrosoft.passportMicrosoftStrings.authorizationURL = this.cast("authorizationURL")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def customHeaders: typingsSlinky.passportMicrosoft.passportMicrosoftStrings.customHeaders = this.cast("customHeaders")
  @scala.inline
  def scopeSeparator: typingsSlinky.passportMicrosoft.passportMicrosoftStrings.scopeSeparator = this.cast("scopeSeparator")
  @scala.inline
  def tokenURL: typingsSlinky.passportMicrosoft.passportMicrosoftStrings.tokenURL = this.cast("tokenURL")
}

