package typingsSlinky.awsSdk.apigatewayv2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.awsSdk.awsSdkStrings.INTERNET
  - typingsSlinky.awsSdk.awsSdkStrings.VPC_LINK
  - java.lang.String
*/
trait ConnectionType extends js.Object

object ConnectionType {
  @scala.inline
  def INTERNET: typingsSlinky.awsSdk.awsSdkStrings.INTERNET = "INTERNET".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.INTERNET]
  @scala.inline
  def VPC_LINK: typingsSlinky.awsSdk.awsSdkStrings.VPC_LINK = "VPC_LINK".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.VPC_LINK]
  @scala.inline
  implicit def apply(value: String): ConnectionType = value.asInstanceOf[ConnectionType]
}

