package typingsSlinky.mangopay2NodejsSdk.mod.address

import typingsSlinky.mangopay2NodejsSdk.mod.models.Address
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - java.lang.String
  - typingsSlinky.mangopay2NodejsSdk.mod.address.AddressData
  - typingsSlinky.mangopay2NodejsSdk.mod.models.Address
*/
trait AddressType extends js.Object

object AddressType {
  @scala.inline
  implicit def apply(value: Address): AddressType = value.asInstanceOf[AddressType]
  @scala.inline
  implicit def apply(value: AddressData): AddressType = value.asInstanceOf[AddressType]
  @scala.inline
  implicit def apply(value: String): AddressType = value.asInstanceOf[AddressType]
}

