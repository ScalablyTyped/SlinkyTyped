package typingsSlinky.applepayjs.ApplePayJS

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The payment capabilities supported by the merchant.
  */
/* Rewritten from type alias, can be one of: 
  - typingsSlinky.applepayjs.applepayjsStrings.supports3DS
  - typingsSlinky.applepayjs.applepayjsStrings.supportsEMV
  - typingsSlinky.applepayjs.applepayjsStrings.supportsCredit
  - typingsSlinky.applepayjs.applepayjsStrings.supportsDebit
*/
trait ApplePayMerchantCapability extends js.Object

object ApplePayMerchantCapability {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def supports3DS: typingsSlinky.applepayjs.applepayjsStrings.supports3DS = this.cast("supports3DS")
  @scala.inline
  def supportsCredit: typingsSlinky.applepayjs.applepayjsStrings.supportsCredit = this.cast("supportsCredit")
  @scala.inline
  def supportsDebit: typingsSlinky.applepayjs.applepayjsStrings.supportsDebit = this.cast("supportsDebit")
  @scala.inline
  def supportsEMV: typingsSlinky.applepayjs.applepayjsStrings.supportsEMV = this.cast("supportsEMV")
}

