package typingsSlinky.awsSdk.machinelearningMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.awsSdk.awsSdkStrings.NONE
  - typingsSlinky.awsSdk.awsSdkStrings.READY
  - typingsSlinky.awsSdk.awsSdkStrings.UPDATING
  - typingsSlinky.awsSdk.awsSdkStrings.FAILED
  - java.lang.String
*/
trait RealtimeEndpointStatus extends js.Object

object RealtimeEndpointStatus {
  @scala.inline
  def NONE: typingsSlinky.awsSdk.awsSdkStrings.NONE = "NONE".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.NONE]
  @scala.inline
  def READY: typingsSlinky.awsSdk.awsSdkStrings.READY = "READY".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.READY]
  @scala.inline
  def UPDATING: typingsSlinky.awsSdk.awsSdkStrings.UPDATING = "UPDATING".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.UPDATING]
  @scala.inline
  def FAILED: typingsSlinky.awsSdk.awsSdkStrings.FAILED = "FAILED".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.FAILED]
  @scala.inline
  implicit def apply(value: String): RealtimeEndpointStatus = value.asInstanceOf[RealtimeEndpointStatus]
}

