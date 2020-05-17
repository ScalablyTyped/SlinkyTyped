package typingsSlinky.awsSdk.firehoseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.awsSdk.awsSdkStrings.AWS_OWNED_CMK
  - typingsSlinky.awsSdk.awsSdkStrings.CUSTOMER_MANAGED_CMK
  - java.lang.String
*/
trait KeyType extends js.Object

object KeyType {
  @scala.inline
  def AWS_OWNED_CMK: typingsSlinky.awsSdk.awsSdkStrings.AWS_OWNED_CMK = "AWS_OWNED_CMK".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.AWS_OWNED_CMK]
  @scala.inline
  def CUSTOMER_MANAGED_CMK: typingsSlinky.awsSdk.awsSdkStrings.CUSTOMER_MANAGED_CMK = "CUSTOMER_MANAGED_CMK".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.CUSTOMER_MANAGED_CMK]
  @scala.inline
  implicit def apply(value: String): KeyType = value.asInstanceOf[KeyType]
}

