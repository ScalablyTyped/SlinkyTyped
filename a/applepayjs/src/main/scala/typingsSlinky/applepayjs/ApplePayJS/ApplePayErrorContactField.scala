package typingsSlinky.applepayjs.ApplePayJS

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Names of the fields in the shipping or billing contact information, used to locate errors in the payment sheet.
  */
/* Rewritten from type alias, can be one of: 
  - typingsSlinky.applepayjs.applepayjsStrings.phoneNumber
  - typingsSlinky.applepayjs.applepayjsStrings.emailAddress
  - typingsSlinky.applepayjs.applepayjsStrings.name
  - typingsSlinky.applepayjs.applepayjsStrings.phoneticName
  - typingsSlinky.applepayjs.applepayjsStrings.postalAddress
  - typingsSlinky.applepayjs.applepayjsStrings.addressLines
  - typingsSlinky.applepayjs.applepayjsStrings.locality
  - typingsSlinky.applepayjs.applepayjsStrings.subLocality
  - typingsSlinky.applepayjs.applepayjsStrings.postalCode
  - typingsSlinky.applepayjs.applepayjsStrings.administrativeArea
  - typingsSlinky.applepayjs.applepayjsStrings.subAdministrativeArea
  - typingsSlinky.applepayjs.applepayjsStrings.country
  - typingsSlinky.applepayjs.applepayjsStrings.countryCode
*/
trait ApplePayErrorContactField extends js.Object

object ApplePayErrorContactField {
  @scala.inline
  def addressLines: typingsSlinky.applepayjs.applepayjsStrings.addressLines = this.cast("addressLines")
  @scala.inline
  def administrativeArea: typingsSlinky.applepayjs.applepayjsStrings.administrativeArea = this.cast("administrativeArea")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def country: typingsSlinky.applepayjs.applepayjsStrings.country = this.cast("country")
  @scala.inline
  def countryCode: typingsSlinky.applepayjs.applepayjsStrings.countryCode = this.cast("countryCode")
  @scala.inline
  def emailAddress: typingsSlinky.applepayjs.applepayjsStrings.emailAddress = this.cast("emailAddress")
  @scala.inline
  def locality: typingsSlinky.applepayjs.applepayjsStrings.locality = this.cast("locality")
  @scala.inline
  def name: typingsSlinky.applepayjs.applepayjsStrings.name = this.cast("name")
  @scala.inline
  def phoneNumber: typingsSlinky.applepayjs.applepayjsStrings.phoneNumber = this.cast("phoneNumber")
  @scala.inline
  def phoneticName: typingsSlinky.applepayjs.applepayjsStrings.phoneticName = this.cast("phoneticName")
  @scala.inline
  def postalAddress: typingsSlinky.applepayjs.applepayjsStrings.postalAddress = this.cast("postalAddress")
  @scala.inline
  def postalCode: typingsSlinky.applepayjs.applepayjsStrings.postalCode = this.cast("postalCode")
  @scala.inline
  def subAdministrativeArea: typingsSlinky.applepayjs.applepayjsStrings.subAdministrativeArea = this.cast("subAdministrativeArea")
  @scala.inline
  def subLocality: typingsSlinky.applepayjs.applepayjsStrings.subLocality = this.cast("subLocality")
}

