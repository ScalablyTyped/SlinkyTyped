package typingsSlinky.awsSdk.appmeshMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.awsSdk.awsSdkStrings.cancelled__
  - typingsSlinky.awsSdk.awsSdkStrings.`deadline-exceeded`
  - typingsSlinky.awsSdk.awsSdkStrings.internal
  - typingsSlinky.awsSdk.awsSdkStrings.`resource-exhausted`
  - typingsSlinky.awsSdk.awsSdkStrings.unavailable__
  - java.lang.String
*/
trait GrpcRetryPolicyEvent extends js.Object

object GrpcRetryPolicyEvent {
  @scala.inline
  def cancelled__ : typingsSlinky.awsSdk.awsSdkStrings.cancelled__ = "cancelled".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.cancelled__]
  @scala.inline
  def `deadline-exceeded`: typingsSlinky.awsSdk.awsSdkStrings.`deadline-exceeded` = "deadline-exceeded".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.`deadline-exceeded`]
  @scala.inline
  def internal: typingsSlinky.awsSdk.awsSdkStrings.internal = "internal".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.internal]
  @scala.inline
  def `resource-exhausted`: typingsSlinky.awsSdk.awsSdkStrings.`resource-exhausted` = "resource-exhausted".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.`resource-exhausted`]
  @scala.inline
  def unavailable__ : typingsSlinky.awsSdk.awsSdkStrings.unavailable__ = "unavailable".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.unavailable__]
  @scala.inline
  implicit def apply(value: java.lang.String): GrpcRetryPolicyEvent = value.asInstanceOf[GrpcRetryPolicyEvent]
}

