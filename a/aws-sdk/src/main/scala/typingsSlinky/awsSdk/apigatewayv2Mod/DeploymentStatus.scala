package typingsSlinky.awsSdk.apigatewayv2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.awsSdk.awsSdkStrings.PENDING
  - typingsSlinky.awsSdk.awsSdkStrings.FAILED
  - typingsSlinky.awsSdk.awsSdkStrings.DEPLOYED
  - java.lang.String
*/
trait DeploymentStatus extends js.Object

object DeploymentStatus {
  @scala.inline
  def PENDING: typingsSlinky.awsSdk.awsSdkStrings.PENDING = "PENDING".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.PENDING]
  @scala.inline
  def FAILED: typingsSlinky.awsSdk.awsSdkStrings.FAILED = "FAILED".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.FAILED]
  @scala.inline
  def DEPLOYED: typingsSlinky.awsSdk.awsSdkStrings.DEPLOYED = "DEPLOYED".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.DEPLOYED]
  @scala.inline
  implicit def apply(value: String): DeploymentStatus = value.asInstanceOf[DeploymentStatus]
}

