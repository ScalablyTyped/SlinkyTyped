package typingsSlinky.applepayjs.ApplePayJS

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A type that indicates how purchased items are to be shipped.
  */
/* Rewritten from type alias, can be one of: 
  - typings.applepayjs.applepayjsStrings.shipping
  - typings.applepayjs.applepayjsStrings.delivery
  - typings.applepayjs.applepayjsStrings.storePickup
  - typings.applepayjs.applepayjsStrings.servicePickup
*/
trait ApplePayShippingType extends js.Object

object ApplePayShippingType {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def delivery: typingsSlinky.applepayjs.applepayjsStrings.delivery = this.cast("delivery")
  @scala.inline
  def servicePickup: typingsSlinky.applepayjs.applepayjsStrings.servicePickup = this.cast("servicePickup")
  @scala.inline
  def shipping: typingsSlinky.applepayjs.applepayjsStrings.shipping = this.cast("shipping")
  @scala.inline
  def storePickup: typingsSlinky.applepayjs.applepayjsStrings.storePickup = this.cast("storePickup")
}

