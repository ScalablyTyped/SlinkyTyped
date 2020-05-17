package typingsSlinky.mangopay2NodejsSdk.mod.bankAccount

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.mangopay2NodejsSdk.mod.bankAccount.OtherData
  - typingsSlinky.mangopay2NodejsSdk.mod.bankAccount.CAData
  - typingsSlinky.mangopay2NodejsSdk.mod.bankAccount.GBData
  - typingsSlinky.mangopay2NodejsSdk.mod.bankAccount.IBANData
  - typingsSlinky.mangopay2NodejsSdk.mod.bankAccount.USData
*/
trait Data extends js.Object

object Data {
  @scala.inline
  implicit def apply(value: CAData | GBData | IBANData | OtherData | USData): Data = value.asInstanceOf[Data]
}

