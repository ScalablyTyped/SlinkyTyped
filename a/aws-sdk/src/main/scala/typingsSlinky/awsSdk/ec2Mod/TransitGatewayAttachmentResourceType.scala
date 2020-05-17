package typingsSlinky.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.awsSdk.awsSdkStrings.vpc_
  - typingsSlinky.awsSdk.awsSdkStrings.vpn
  - typingsSlinky.awsSdk.awsSdkStrings.`direct-connect-gateway`
  - typingsSlinky.awsSdk.awsSdkStrings.`tgw-peering`
  - java.lang.String
*/
trait TransitGatewayAttachmentResourceType extends js.Object

object TransitGatewayAttachmentResourceType {
  @scala.inline
  def vpc_ : typingsSlinky.awsSdk.awsSdkStrings.vpc_ = "vpc".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.vpc_]
  @scala.inline
  def vpn: typingsSlinky.awsSdk.awsSdkStrings.vpn = "vpn".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.vpn]
  @scala.inline
  def `direct-connect-gateway`: typingsSlinky.awsSdk.awsSdkStrings.`direct-connect-gateway` = "direct-connect-gateway".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.`direct-connect-gateway`]
  @scala.inline
  def `tgw-peering`: typingsSlinky.awsSdk.awsSdkStrings.`tgw-peering` = "tgw-peering".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.`tgw-peering`]
  @scala.inline
  implicit def apply(value: java.lang.String): TransitGatewayAttachmentResourceType = value.asInstanceOf[TransitGatewayAttachmentResourceType]
}

