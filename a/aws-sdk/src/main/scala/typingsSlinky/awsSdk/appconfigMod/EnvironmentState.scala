package typingsSlinky.awsSdk.appconfigMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.awsSdk.awsSdkStrings.READY_FOR_DEPLOYMENT
  - typingsSlinky.awsSdk.awsSdkStrings.DEPLOYING
  - typingsSlinky.awsSdk.awsSdkStrings.ROLLING_BACK
  - typingsSlinky.awsSdk.awsSdkStrings.ROLLED_BACK
  - java.lang.String
*/
trait EnvironmentState extends js.Object

object EnvironmentState {
  @scala.inline
  def READY_FOR_DEPLOYMENT: typingsSlinky.awsSdk.awsSdkStrings.READY_FOR_DEPLOYMENT = "READY_FOR_DEPLOYMENT".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.READY_FOR_DEPLOYMENT]
  @scala.inline
  def DEPLOYING: typingsSlinky.awsSdk.awsSdkStrings.DEPLOYING = "DEPLOYING".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.DEPLOYING]
  @scala.inline
  def ROLLING_BACK: typingsSlinky.awsSdk.awsSdkStrings.ROLLING_BACK = "ROLLING_BACK".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.ROLLING_BACK]
  @scala.inline
  def ROLLED_BACK: typingsSlinky.awsSdk.awsSdkStrings.ROLLED_BACK = "ROLLED_BACK".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.ROLLED_BACK]
  @scala.inline
  implicit def apply(value: java.lang.String): EnvironmentState = value.asInstanceOf[EnvironmentState]
}

