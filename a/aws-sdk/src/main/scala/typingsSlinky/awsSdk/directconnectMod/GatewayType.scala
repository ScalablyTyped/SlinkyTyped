package typingsSlinky.awsSdk.directconnectMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.awsSdk.awsSdkStrings.virtualPrivateGateway
  - typingsSlinky.awsSdk.awsSdkStrings.transitGateway
  - java.lang.String
*/
trait GatewayType extends js.Object

object GatewayType {
  @scala.inline
  def virtualPrivateGateway: typingsSlinky.awsSdk.awsSdkStrings.virtualPrivateGateway = "virtualPrivateGateway".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.virtualPrivateGateway]
  @scala.inline
  def transitGateway: typingsSlinky.awsSdk.awsSdkStrings.transitGateway = "transitGateway".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.transitGateway]
  @scala.inline
  implicit def apply(value: String): GatewayType = value.asInstanceOf[GatewayType]
}

