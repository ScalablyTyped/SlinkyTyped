package typingsSlinky.awsSdk.appconfigMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.awsSdk.awsSdkStrings.BAKING
  - typingsSlinky.awsSdk.awsSdkStrings.VALIDATING
  - typingsSlinky.awsSdk.awsSdkStrings.DEPLOYING
  - typingsSlinky.awsSdk.awsSdkStrings.COMPLETE
  - typingsSlinky.awsSdk.awsSdkStrings.ROLLING_BACK
  - typingsSlinky.awsSdk.awsSdkStrings.ROLLED_BACK
  - java.lang.String
*/
trait DeploymentState extends js.Object

object DeploymentState {
  @scala.inline
  def BAKING: typingsSlinky.awsSdk.awsSdkStrings.BAKING = "BAKING".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.BAKING]
  @scala.inline
  def VALIDATING: typingsSlinky.awsSdk.awsSdkStrings.VALIDATING = "VALIDATING".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.VALIDATING]
  @scala.inline
  def DEPLOYING: typingsSlinky.awsSdk.awsSdkStrings.DEPLOYING = "DEPLOYING".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.DEPLOYING]
  @scala.inline
  def COMPLETE: typingsSlinky.awsSdk.awsSdkStrings.COMPLETE = "COMPLETE".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.COMPLETE]
  @scala.inline
  def ROLLING_BACK: typingsSlinky.awsSdk.awsSdkStrings.ROLLING_BACK = "ROLLING_BACK".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.ROLLING_BACK]
  @scala.inline
  def ROLLED_BACK: typingsSlinky.awsSdk.awsSdkStrings.ROLLED_BACK = "ROLLED_BACK".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.ROLLED_BACK]
  @scala.inline
  implicit def apply(value: java.lang.String): DeploymentState = value.asInstanceOf[DeploymentState]
}

