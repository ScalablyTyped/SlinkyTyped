package typingsSlinky.awsSdk.codedeployMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.awsSdk.awsSdkStrings.DEPLOYMENT_FAILURE
  - typingsSlinky.awsSdk.awsSdkStrings.DEPLOYMENT_STOP_ON_ALARM
  - typingsSlinky.awsSdk.awsSdkStrings.DEPLOYMENT_STOP_ON_REQUEST
  - java.lang.String
*/
trait AutoRollbackEvent extends js.Object

object AutoRollbackEvent {
  @scala.inline
  def DEPLOYMENT_FAILURE: typingsSlinky.awsSdk.awsSdkStrings.DEPLOYMENT_FAILURE = "DEPLOYMENT_FAILURE".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.DEPLOYMENT_FAILURE]
  @scala.inline
  def DEPLOYMENT_STOP_ON_ALARM: typingsSlinky.awsSdk.awsSdkStrings.DEPLOYMENT_STOP_ON_ALARM = "DEPLOYMENT_STOP_ON_ALARM".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.DEPLOYMENT_STOP_ON_ALARM]
  @scala.inline
  def DEPLOYMENT_STOP_ON_REQUEST: typingsSlinky.awsSdk.awsSdkStrings.DEPLOYMENT_STOP_ON_REQUEST = "DEPLOYMENT_STOP_ON_REQUEST".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.DEPLOYMENT_STOP_ON_REQUEST]
  @scala.inline
  implicit def apply(value: String): AutoRollbackEvent = value.asInstanceOf[AutoRollbackEvent]
}

