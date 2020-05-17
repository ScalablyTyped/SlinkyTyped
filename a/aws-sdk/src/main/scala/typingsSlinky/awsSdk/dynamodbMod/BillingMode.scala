package typingsSlinky.awsSdk.dynamodbMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.awsSdk.awsSdkStrings.PROVISIONED
  - typingsSlinky.awsSdk.awsSdkStrings.PAY_PER_REQUEST
  - java.lang.String
*/
trait BillingMode extends js.Object

object BillingMode {
  @scala.inline
  def PROVISIONED: typingsSlinky.awsSdk.awsSdkStrings.PROVISIONED = "PROVISIONED".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.PROVISIONED]
  @scala.inline
  def PAY_PER_REQUEST: typingsSlinky.awsSdk.awsSdkStrings.PAY_PER_REQUEST = "PAY_PER_REQUEST".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.PAY_PER_REQUEST]
  @scala.inline
  implicit def apply(value: java.lang.String): BillingMode = value.asInstanceOf[BillingMode]
}

