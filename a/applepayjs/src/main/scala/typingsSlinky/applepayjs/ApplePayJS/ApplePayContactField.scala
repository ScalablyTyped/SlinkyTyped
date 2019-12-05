package typingsSlinky.applepayjs.ApplePayJS

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Field names used for requesting contact information in a payment request.
  */
/* Rewritten from type alias, can be one of: 
  - typings.applepayjs.applepayjsStrings.email
  - typings.applepayjs.applepayjsStrings.name
  - typings.applepayjs.applepayjsStrings.phone
  - typings.applepayjs.applepayjsStrings.postalAddress
  - typings.applepayjs.applepayjsStrings.phoneticName
*/
trait ApplePayContactField extends js.Object

object ApplePayContactField {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def email: typingsSlinky.applepayjs.applepayjsStrings.email = this.cast("email")
  @scala.inline
  def name: typingsSlinky.applepayjs.applepayjsStrings.name = this.cast("name")
  @scala.inline
  def phone: typingsSlinky.applepayjs.applepayjsStrings.phone = this.cast("phone")
  @scala.inline
  def phoneticName: typingsSlinky.applepayjs.applepayjsStrings.phoneticName = this.cast("phoneticName")
  @scala.inline
  def postalAddress: typingsSlinky.applepayjs.applepayjsStrings.postalAddress = this.cast("postalAddress")
}

