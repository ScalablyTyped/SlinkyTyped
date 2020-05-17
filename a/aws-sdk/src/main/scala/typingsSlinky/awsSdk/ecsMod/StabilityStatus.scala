package typingsSlinky.awsSdk.ecsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.awsSdk.awsSdkStrings.STEADY_STATE
  - typingsSlinky.awsSdk.awsSdkStrings.STABILIZING
  - java.lang.String
*/
trait StabilityStatus extends js.Object

object StabilityStatus {
  @scala.inline
  def STEADY_STATE: typingsSlinky.awsSdk.awsSdkStrings.STEADY_STATE = "STEADY_STATE".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.STEADY_STATE]
  @scala.inline
  def STABILIZING: typingsSlinky.awsSdk.awsSdkStrings.STABILIZING = "STABILIZING".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.STABILIZING]
  @scala.inline
  implicit def apply(value: java.lang.String): StabilityStatus = value.asInstanceOf[StabilityStatus]
}

