package typingsSlinky.nodemailer.addressparserMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.nodemailer.addressparserMod.Address
  - typingsSlinky.nodemailer.addressparserMod.Group
*/
trait AddressOrGroup extends js.Object

object AddressOrGroup {
  @scala.inline
  implicit def apply(value: Address): AddressOrGroup = value.asInstanceOf[AddressOrGroup]
  @scala.inline
  implicit def apply(value: Group): AddressOrGroup = value.asInstanceOf[AddressOrGroup]
}

