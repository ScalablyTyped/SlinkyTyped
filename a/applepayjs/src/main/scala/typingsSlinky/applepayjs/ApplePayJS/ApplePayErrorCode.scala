package typingsSlinky.applepayjs.ApplePayJS

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The error code that indicates whether an error on the payment sheet is for shipping or billing information, or for another kind of error.
  */
/* Rewritten from type alias, can be one of: 
  - typings.applepayjs.applepayjsStrings.shippingContactInvalid
  - typings.applepayjs.applepayjsStrings.billingContactInvalid
  - typings.applepayjs.applepayjsStrings.addressUnserviceable
  - typings.applepayjs.applepayjsStrings.unknown
*/
trait ApplePayErrorCode extends js.Object

object ApplePayErrorCode {
  @scala.inline
  def addressUnserviceable: typingsSlinky.applepayjs.applepayjsStrings.addressUnserviceable = this.cast("addressUnserviceable")
  @scala.inline
  def billingContactInvalid: typingsSlinky.applepayjs.applepayjsStrings.billingContactInvalid = this.cast("billingContactInvalid")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def shippingContactInvalid: typingsSlinky.applepayjs.applepayjsStrings.shippingContactInvalid = this.cast("shippingContactInvalid")
  @scala.inline
  def unknown: typingsSlinky.applepayjs.applepayjsStrings.unknown = this.cast("unknown")
}

