package typingsSlinky.googlepay.google.payments.api

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.googlepay.googlepayStrings.BUYER_ACCOUNT_ERROR
  - typingsSlinky.googlepay.googlepayStrings.CANCELED
  - typingsSlinky.googlepay.googlepayStrings.DEVELOPER_ERROR
  - typingsSlinky.googlepay.googlepayStrings.INTERNAL_ERROR
*/
trait ErrorStatusCode extends js.Object

object ErrorStatusCode {
  @scala.inline
  def BUYER_ACCOUNT_ERROR: typingsSlinky.googlepay.googlepayStrings.BUYER_ACCOUNT_ERROR = this.cast("BUYER_ACCOUNT_ERROR")
  @scala.inline
  def CANCELED: typingsSlinky.googlepay.googlepayStrings.CANCELED = this.cast("CANCELED")
  @scala.inline
  def DEVELOPER_ERROR: typingsSlinky.googlepay.googlepayStrings.DEVELOPER_ERROR = this.cast("DEVELOPER_ERROR")
  @scala.inline
  def INTERNAL_ERROR: typingsSlinky.googlepay.googlepayStrings.INTERNAL_ERROR = this.cast("INTERNAL_ERROR")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

