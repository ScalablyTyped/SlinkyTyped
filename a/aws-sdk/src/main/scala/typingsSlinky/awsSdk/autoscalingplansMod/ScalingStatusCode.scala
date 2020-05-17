package typingsSlinky.awsSdk.autoscalingplansMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.awsSdk.awsSdkStrings.Inactive_
  - typingsSlinky.awsSdk.awsSdkStrings.PartiallyActive
  - typingsSlinky.awsSdk.awsSdkStrings.Active_
  - java.lang.String
*/
trait ScalingStatusCode extends js.Object

object ScalingStatusCode {
  @scala.inline
  def Inactive_ : typingsSlinky.awsSdk.awsSdkStrings.Inactive_ = "Inactive".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.Inactive_]
  @scala.inline
  def PartiallyActive: typingsSlinky.awsSdk.awsSdkStrings.PartiallyActive = "PartiallyActive".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.PartiallyActive]
  @scala.inline
  def Active_ : typingsSlinky.awsSdk.awsSdkStrings.Active_ = "Active".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.Active_]
  @scala.inline
  implicit def apply(value: String): ScalingStatusCode = value.asInstanceOf[ScalingStatusCode]
}

