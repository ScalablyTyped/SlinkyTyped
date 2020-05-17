package typingsSlinky.awsSdk.transferMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.awsSdk.awsSdkStrings.PUBLIC
  - typingsSlinky.awsSdk.awsSdkStrings.VPC
  - typingsSlinky.awsSdk.awsSdkStrings.VPC_ENDPOINT
  - java.lang.String
*/
trait EndpointType extends js.Object

object EndpointType {
  @scala.inline
  def PUBLIC: typingsSlinky.awsSdk.awsSdkStrings.PUBLIC = "PUBLIC".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.PUBLIC]
  @scala.inline
  def VPC: typingsSlinky.awsSdk.awsSdkStrings.VPC = "VPC".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.VPC]
  @scala.inline
  def VPC_ENDPOINT: typingsSlinky.awsSdk.awsSdkStrings.VPC_ENDPOINT = "VPC_ENDPOINT".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.VPC_ENDPOINT]
  @scala.inline
  implicit def apply(value: String): EndpointType = value.asInstanceOf[EndpointType]
}

