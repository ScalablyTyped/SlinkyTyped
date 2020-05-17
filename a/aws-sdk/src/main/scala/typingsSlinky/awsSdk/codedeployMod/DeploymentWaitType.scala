package typingsSlinky.awsSdk.codedeployMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.awsSdk.awsSdkStrings.READY_WAIT
  - typingsSlinky.awsSdk.awsSdkStrings.TERMINATION_WAIT
  - java.lang.String
*/
trait DeploymentWaitType extends js.Object

object DeploymentWaitType {
  @scala.inline
  def READY_WAIT: typingsSlinky.awsSdk.awsSdkStrings.READY_WAIT = "READY_WAIT".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.READY_WAIT]
  @scala.inline
  def TERMINATION_WAIT: typingsSlinky.awsSdk.awsSdkStrings.TERMINATION_WAIT = "TERMINATION_WAIT".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.TERMINATION_WAIT]
  @scala.inline
  implicit def apply(value: String): DeploymentWaitType = value.asInstanceOf[DeploymentWaitType]
}

