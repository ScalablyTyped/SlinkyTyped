package typingsSlinky.awsSdk.codedeployMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.awsSdk.awsSdkStrings.WITH_TRAFFIC_CONTROL
  - typingsSlinky.awsSdk.awsSdkStrings.WITHOUT_TRAFFIC_CONTROL
  - java.lang.String
*/
trait DeploymentOption extends js.Object

object DeploymentOption {
  @scala.inline
  def WITH_TRAFFIC_CONTROL: typingsSlinky.awsSdk.awsSdkStrings.WITH_TRAFFIC_CONTROL = "WITH_TRAFFIC_CONTROL".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.WITH_TRAFFIC_CONTROL]
  @scala.inline
  def WITHOUT_TRAFFIC_CONTROL: typingsSlinky.awsSdk.awsSdkStrings.WITHOUT_TRAFFIC_CONTROL = "WITHOUT_TRAFFIC_CONTROL".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.WITHOUT_TRAFFIC_CONTROL]
  @scala.inline
  implicit def apply(value: String): DeploymentOption = value.asInstanceOf[DeploymentOption]
}

