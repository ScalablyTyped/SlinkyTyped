package typingsSlinky.awsSdk.route53Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.awsSdk.awsSdkStrings.Healthy_
  - typingsSlinky.awsSdk.awsSdkStrings.Unhealthy_
  - typingsSlinky.awsSdk.awsSdkStrings.LastKnownStatus
  - java.lang.String
*/
trait InsufficientDataHealthStatus extends js.Object

object InsufficientDataHealthStatus {
  @scala.inline
  def Healthy_ : typingsSlinky.awsSdk.awsSdkStrings.Healthy_ = "Healthy".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.Healthy_]
  @scala.inline
  def Unhealthy_ : typingsSlinky.awsSdk.awsSdkStrings.Unhealthy_ = "Unhealthy".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.Unhealthy_]
  @scala.inline
  def LastKnownStatus: typingsSlinky.awsSdk.awsSdkStrings.LastKnownStatus = "LastKnownStatus".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.LastKnownStatus]
  @scala.inline
  implicit def apply(value: String): InsufficientDataHealthStatus = value.asInstanceOf[InsufficientDataHealthStatus]
}

