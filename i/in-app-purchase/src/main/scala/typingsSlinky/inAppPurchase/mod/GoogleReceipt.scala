package typingsSlinky.inAppPurchase.mod

import typingsSlinky.inAppPurchase.anon.Data
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.inAppPurchase.anon.Data
  - java.lang.String
*/
trait GoogleReceipt extends Receipt

object GoogleReceipt {
  @scala.inline
  implicit def apply(value: Data): GoogleReceipt = value.asInstanceOf[GoogleReceipt]
  @scala.inline
  implicit def apply(value: String): GoogleReceipt = value.asInstanceOf[GoogleReceipt]
}

