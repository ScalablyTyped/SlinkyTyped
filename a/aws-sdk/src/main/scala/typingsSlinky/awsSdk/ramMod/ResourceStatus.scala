package typingsSlinky.awsSdk.ramMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.awsSdk.awsSdkStrings.AVAILABLE
  - typingsSlinky.awsSdk.awsSdkStrings.ZONAL_RESOURCE_INACCESSIBLE
  - typingsSlinky.awsSdk.awsSdkStrings.LIMIT_EXCEEDED
  - typingsSlinky.awsSdk.awsSdkStrings.UNAVAILABLE
  - typingsSlinky.awsSdk.awsSdkStrings.PENDING
  - java.lang.String
*/
trait ResourceStatus extends js.Object

object ResourceStatus {
  @scala.inline
  def AVAILABLE: typingsSlinky.awsSdk.awsSdkStrings.AVAILABLE = "AVAILABLE".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.AVAILABLE]
  @scala.inline
  def ZONAL_RESOURCE_INACCESSIBLE: typingsSlinky.awsSdk.awsSdkStrings.ZONAL_RESOURCE_INACCESSIBLE = "ZONAL_RESOURCE_INACCESSIBLE".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.ZONAL_RESOURCE_INACCESSIBLE]
  @scala.inline
  def LIMIT_EXCEEDED: typingsSlinky.awsSdk.awsSdkStrings.LIMIT_EXCEEDED = "LIMIT_EXCEEDED".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.LIMIT_EXCEEDED]
  @scala.inline
  def UNAVAILABLE: typingsSlinky.awsSdk.awsSdkStrings.UNAVAILABLE = "UNAVAILABLE".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.UNAVAILABLE]
  @scala.inline
  def PENDING: typingsSlinky.awsSdk.awsSdkStrings.PENDING = "PENDING".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.PENDING]
  @scala.inline
  implicit def apply(value: java.lang.String): ResourceStatus = value.asInstanceOf[ResourceStatus]
}

