package typingsSlinky.inAppPurchase.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - js.Object
  - java.lang.String
*/
trait AmazonReceipt extends Receipt

object AmazonReceipt {
  @scala.inline
  implicit def apply(value: js.Object): AmazonReceipt = value.asInstanceOf[AmazonReceipt]
  @scala.inline
  implicit def apply(value: String): AmazonReceipt = value.asInstanceOf[AmazonReceipt]
}

