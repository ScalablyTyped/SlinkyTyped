package typingsSlinky.actionsOnGoogle.v2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.actionsOnGoogle.actionsOnGoogleStrings.UNSPECIFIED_TOKENIZATION_TYPE
  - typingsSlinky.actionsOnGoogle.actionsOnGoogleStrings.PAYMENT_GATEWAY
  - typingsSlinky.actionsOnGoogle.actionsOnGoogleStrings.DIRECT
*/
trait GoogleActionsV2OrdersPaymentMethodTokenizationParametersTokenizationType extends js.Object

object GoogleActionsV2OrdersPaymentMethodTokenizationParametersTokenizationType {
  @scala.inline
  def DIRECT: typingsSlinky.actionsOnGoogle.actionsOnGoogleStrings.DIRECT = this.cast("DIRECT")
  @scala.inline
  def PAYMENT_GATEWAY: typingsSlinky.actionsOnGoogle.actionsOnGoogleStrings.PAYMENT_GATEWAY = this.cast("PAYMENT_GATEWAY")
  @scala.inline
  def UNSPECIFIED_TOKENIZATION_TYPE: typingsSlinky.actionsOnGoogle.actionsOnGoogleStrings.UNSPECIFIED_TOKENIZATION_TYPE = this.cast("UNSPECIFIED_TOKENIZATION_TYPE")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

