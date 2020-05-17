package typingsSlinky.awsSdk.devicefarmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.awsSdk.awsSdkStrings.METERED
  - typingsSlinky.awsSdk.awsSdkStrings.UNMETERED
  - java.lang.String
*/
trait BillingMethod extends js.Object

object BillingMethod {
  @scala.inline
  def METERED: typingsSlinky.awsSdk.awsSdkStrings.METERED = "METERED".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.METERED]
  @scala.inline
  def UNMETERED: typingsSlinky.awsSdk.awsSdkStrings.UNMETERED = "UNMETERED".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.UNMETERED]
  @scala.inline
  implicit def apply(value: java.lang.String): BillingMethod = value.asInstanceOf[BillingMethod]
}

