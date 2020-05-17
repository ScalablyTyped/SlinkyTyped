package typingsSlinky.awsSdk.autoscalingplansMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.awsSdk.awsSdkStrings.KeepExternalPolicies
  - typingsSlinky.awsSdk.awsSdkStrings.ReplaceExternalPolicies
  - java.lang.String
*/
trait ScalingPolicyUpdateBehavior extends js.Object

object ScalingPolicyUpdateBehavior {
  @scala.inline
  def KeepExternalPolicies: typingsSlinky.awsSdk.awsSdkStrings.KeepExternalPolicies = "KeepExternalPolicies".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.KeepExternalPolicies]
  @scala.inline
  def ReplaceExternalPolicies: typingsSlinky.awsSdk.awsSdkStrings.ReplaceExternalPolicies = "ReplaceExternalPolicies".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.ReplaceExternalPolicies]
  @scala.inline
  implicit def apply(value: String): ScalingPolicyUpdateBehavior = value.asInstanceOf[ScalingPolicyUpdateBehavior]
}

