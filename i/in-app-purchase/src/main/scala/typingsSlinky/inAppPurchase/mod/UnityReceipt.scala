package typingsSlinky.inAppPurchase.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - js.Object
  - java.lang.String
*/
trait UnityReceipt extends Receipt

object UnityReceipt {
  @scala.inline
  implicit def apply(value: js.Object): UnityReceipt = value.asInstanceOf[UnityReceipt]
  @scala.inline
  implicit def apply(value: String): UnityReceipt = value.asInstanceOf[UnityReceipt]
}

