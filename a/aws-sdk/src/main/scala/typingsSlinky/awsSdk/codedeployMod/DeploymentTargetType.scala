package typingsSlinky.awsSdk.codedeployMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.awsSdk.awsSdkStrings.InstanceTarget
  - typingsSlinky.awsSdk.awsSdkStrings.LambdaTarget
  - typingsSlinky.awsSdk.awsSdkStrings.ECSTarget
  - java.lang.String
*/
trait DeploymentTargetType extends js.Object

object DeploymentTargetType {
  @scala.inline
  def InstanceTarget: typingsSlinky.awsSdk.awsSdkStrings.InstanceTarget = "InstanceTarget".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.InstanceTarget]
  @scala.inline
  def LambdaTarget: typingsSlinky.awsSdk.awsSdkStrings.LambdaTarget = "LambdaTarget".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.LambdaTarget]
  @scala.inline
  def ECSTarget: typingsSlinky.awsSdk.awsSdkStrings.ECSTarget = "ECSTarget".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.ECSTarget]
  @scala.inline
  implicit def apply(value: String): DeploymentTargetType = value.asInstanceOf[DeploymentTargetType]
}

