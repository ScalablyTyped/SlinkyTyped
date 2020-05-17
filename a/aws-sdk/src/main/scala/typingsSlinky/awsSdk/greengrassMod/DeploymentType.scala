package typingsSlinky.awsSdk.greengrassMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.awsSdk.awsSdkStrings.NewDeployment
  - typingsSlinky.awsSdk.awsSdkStrings.Redeployment
  - typingsSlinky.awsSdk.awsSdkStrings.ResetDeployment
  - typingsSlinky.awsSdk.awsSdkStrings.ForceResetDeployment
  - java.lang.String
*/
trait DeploymentType extends js.Object

object DeploymentType {
  @scala.inline
  def NewDeployment: typingsSlinky.awsSdk.awsSdkStrings.NewDeployment = "NewDeployment".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.NewDeployment]
  @scala.inline
  def Redeployment: typingsSlinky.awsSdk.awsSdkStrings.Redeployment = "Redeployment".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.Redeployment]
  @scala.inline
  def ResetDeployment: typingsSlinky.awsSdk.awsSdkStrings.ResetDeployment = "ResetDeployment".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.ResetDeployment]
  @scala.inline
  def ForceResetDeployment: typingsSlinky.awsSdk.awsSdkStrings.ForceResetDeployment = "ForceResetDeployment".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.ForceResetDeployment]
  @scala.inline
  implicit def apply(value: String): DeploymentType = value.asInstanceOf[DeploymentType]
}

