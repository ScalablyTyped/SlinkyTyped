package typingsSlinky.awsSdk.emrMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.awsSdk.awsSdkStrings.AWAITING_FULFILLMENT
  - typingsSlinky.awsSdk.awsSdkStrings.PROVISIONING
  - typingsSlinky.awsSdk.awsSdkStrings.BOOTSTRAPPING
  - typingsSlinky.awsSdk.awsSdkStrings.RUNNING
  - typingsSlinky.awsSdk.awsSdkStrings.TERMINATED
  - java.lang.String
*/
trait InstanceState extends js.Object

object InstanceState {
  @scala.inline
  def AWAITING_FULFILLMENT: typingsSlinky.awsSdk.awsSdkStrings.AWAITING_FULFILLMENT = "AWAITING_FULFILLMENT".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.AWAITING_FULFILLMENT]
  @scala.inline
  def PROVISIONING: typingsSlinky.awsSdk.awsSdkStrings.PROVISIONING = "PROVISIONING".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.PROVISIONING]
  @scala.inline
  def BOOTSTRAPPING: typingsSlinky.awsSdk.awsSdkStrings.BOOTSTRAPPING = "BOOTSTRAPPING".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.BOOTSTRAPPING]
  @scala.inline
  def RUNNING: typingsSlinky.awsSdk.awsSdkStrings.RUNNING = "RUNNING".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.RUNNING]
  @scala.inline
  def TERMINATED: typingsSlinky.awsSdk.awsSdkStrings.TERMINATED = "TERMINATED".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.TERMINATED]
  @scala.inline
  implicit def apply(value: java.lang.String): InstanceState = value.asInstanceOf[InstanceState]
}

