package typingsSlinky.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.awsSdk.awsSdkStrings.VPC
  - typingsSlinky.awsSdk.awsSdkStrings.Subnet
  - typingsSlinky.awsSdk.awsSdkStrings.NetworkInterface
  - java.lang.String
*/
trait FlowLogsResourceType extends js.Object

object FlowLogsResourceType {
  @scala.inline
  def VPC: typingsSlinky.awsSdk.awsSdkStrings.VPC = "VPC".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.VPC]
  @scala.inline
  def Subnet: typingsSlinky.awsSdk.awsSdkStrings.Subnet = "Subnet".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.Subnet]
  @scala.inline
  def NetworkInterface: typingsSlinky.awsSdk.awsSdkStrings.NetworkInterface = "NetworkInterface".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.NetworkInterface]
  @scala.inline
  implicit def apply(value: java.lang.String): FlowLogsResourceType = value.asInstanceOf[FlowLogsResourceType]
}

