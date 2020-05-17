package typingsSlinky.inAppPurchase.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.inAppPurchase.mod.UnityReceipt
  - typingsSlinky.inAppPurchase.mod.AppleReceipt
  - typingsSlinky.inAppPurchase.mod.GoogleReceipt
  - typingsSlinky.inAppPurchase.mod.WindowsReceipt
  - typingsSlinky.inAppPurchase.mod.AmazonReceipt
  - typingsSlinky.inAppPurchase.mod.FacebookReceipt
  - typingsSlinky.inAppPurchase.mod.RokuReceipt
*/
trait Receipt extends js.Object

object Receipt {
  @scala.inline
  implicit def apply(value: AppleReceipt | FacebookReceipt | RokuReceipt | WindowsReceipt): Receipt = value.asInstanceOf[Receipt]
  @scala.inline
  implicit def apply(value: AmazonReceipt): Receipt = value.asInstanceOf[Receipt]
  @scala.inline
  implicit def apply(value: GoogleReceipt): Receipt = value.asInstanceOf[Receipt]
  @scala.inline
  implicit def apply(value: UnityReceipt): Receipt = value.asInstanceOf[Receipt]
}

