package typingsSlinky.mangopay2NodejsSdk.mod.bankAccount

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.mangopay2NodejsSdk.mod.bankAccount.OtherDetails
  - typingsSlinky.mangopay2NodejsSdk.mod.bankAccount.CADetails
  - typingsSlinky.mangopay2NodejsSdk.mod.bankAccount.GBDetails
  - typingsSlinky.mangopay2NodejsSdk.mod.bankAccount.IBANDetails
  - typingsSlinky.mangopay2NodejsSdk.mod.bankAccount.USDetails
*/
trait CreationDetails extends js.Object

object CreationDetails {
  @scala.inline
  implicit def apply(value: CADetails): CreationDetails = value.asInstanceOf[CreationDetails]
  @scala.inline
  implicit def apply(value: GBDetails): CreationDetails = value.asInstanceOf[CreationDetails]
  @scala.inline
  implicit def apply(value: IBANDetails): CreationDetails = value.asInstanceOf[CreationDetails]
  @scala.inline
  implicit def apply(value: OtherDetails): CreationDetails = value.asInstanceOf[CreationDetails]
  @scala.inline
  implicit def apply(value: USDetails): CreationDetails = value.asInstanceOf[CreationDetails]
}

