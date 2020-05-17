package typingsSlinky.awsSdk.codedeployMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.awsSdk.awsSdkStrings.CONTINUE_DEPLOYMENT
  - typingsSlinky.awsSdk.awsSdkStrings.STOP_DEPLOYMENT
  - java.lang.String
*/
trait DeploymentReadyAction extends js.Object

object DeploymentReadyAction {
  @scala.inline
  def CONTINUE_DEPLOYMENT: typingsSlinky.awsSdk.awsSdkStrings.CONTINUE_DEPLOYMENT = "CONTINUE_DEPLOYMENT".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.CONTINUE_DEPLOYMENT]
  @scala.inline
  def STOP_DEPLOYMENT: typingsSlinky.awsSdk.awsSdkStrings.STOP_DEPLOYMENT = "STOP_DEPLOYMENT".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.STOP_DEPLOYMENT]
  @scala.inline
  implicit def apply(value: String): DeploymentReadyAction = value.asInstanceOf[DeploymentReadyAction]
}

