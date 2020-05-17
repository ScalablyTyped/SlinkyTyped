package typingsSlinky.awsSdk.iotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.awsSdk.awsSdkStrings.ENDPOINT
  - typingsSlinky.awsSdk.awsSdkStrings.AWS_MANAGED
  - typingsSlinky.awsSdk.awsSdkStrings.CUSTOMER_MANAGED
  - java.lang.String
*/
trait DomainType extends js.Object

object DomainType {
  @scala.inline
  def ENDPOINT: typingsSlinky.awsSdk.awsSdkStrings.ENDPOINT = "ENDPOINT".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.ENDPOINT]
  @scala.inline
  def AWS_MANAGED: typingsSlinky.awsSdk.awsSdkStrings.AWS_MANAGED = "AWS_MANAGED".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.AWS_MANAGED]
  @scala.inline
  def CUSTOMER_MANAGED: typingsSlinky.awsSdk.awsSdkStrings.CUSTOMER_MANAGED = "CUSTOMER_MANAGED".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.CUSTOMER_MANAGED]
  @scala.inline
  implicit def apply(value: java.lang.String): DomainType = value.asInstanceOf[DomainType]
}

