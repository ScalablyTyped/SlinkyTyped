package typingsSlinky.alexaSdk.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.alexaSdk.alexaSdkStrings.NONE
  - typingsSlinky.alexaSdk.alexaSdkStrings.DENIED
  - typingsSlinky.alexaSdk.alexaSdkStrings.CONFIRMED
*/
trait ConfirmationStatuses extends js.Object

object ConfirmationStatuses {
  @scala.inline
  def CONFIRMED: typingsSlinky.alexaSdk.alexaSdkStrings.CONFIRMED = this.cast("CONFIRMED")
  @scala.inline
  def DENIED: typingsSlinky.alexaSdk.alexaSdkStrings.DENIED = this.cast("DENIED")
  @scala.inline
  def NONE: typingsSlinky.alexaSdk.alexaSdkStrings.NONE = this.cast("NONE")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

