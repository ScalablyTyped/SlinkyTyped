package typingsSlinky.awsSdk.mqMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.awsSdk.awsSdkStrings.SINGLE_INSTANCE
  - typingsSlinky.awsSdk.awsSdkStrings.ACTIVE_STANDBY_MULTI_AZ
  - java.lang.String
*/
trait DeploymentMode extends js.Object

object DeploymentMode {
  @scala.inline
  def SINGLE_INSTANCE: typingsSlinky.awsSdk.awsSdkStrings.SINGLE_INSTANCE = "SINGLE_INSTANCE".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.SINGLE_INSTANCE]
  @scala.inline
  def ACTIVE_STANDBY_MULTI_AZ: typingsSlinky.awsSdk.awsSdkStrings.ACTIVE_STANDBY_MULTI_AZ = "ACTIVE_STANDBY_MULTI_AZ".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.ACTIVE_STANDBY_MULTI_AZ]
  @scala.inline
  implicit def apply(value: String): DeploymentMode = value.asInstanceOf[DeploymentMode]
}

