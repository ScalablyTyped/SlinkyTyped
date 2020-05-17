package typingsSlinky.awsSdk.devicefarmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.awsSdk.awsSdkStrings.IN_USE
  - typingsSlinky.awsSdk.awsSdkStrings.PREPARING
  - typingsSlinky.awsSdk.awsSdkStrings.AVAILABLE
  - typingsSlinky.awsSdk.awsSdkStrings.NOT_AVAILABLE
  - java.lang.String
*/
trait InstanceStatus extends js.Object

object InstanceStatus {
  @scala.inline
  def IN_USE: typingsSlinky.awsSdk.awsSdkStrings.IN_USE = "IN_USE".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.IN_USE]
  @scala.inline
  def PREPARING: typingsSlinky.awsSdk.awsSdkStrings.PREPARING = "PREPARING".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.PREPARING]
  @scala.inline
  def AVAILABLE: typingsSlinky.awsSdk.awsSdkStrings.AVAILABLE = "AVAILABLE".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.AVAILABLE]
  @scala.inline
  def NOT_AVAILABLE: typingsSlinky.awsSdk.awsSdkStrings.NOT_AVAILABLE = "NOT_AVAILABLE".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.NOT_AVAILABLE]
  @scala.inline
  implicit def apply(value: java.lang.String): InstanceStatus = value.asInstanceOf[InstanceStatus]
}

