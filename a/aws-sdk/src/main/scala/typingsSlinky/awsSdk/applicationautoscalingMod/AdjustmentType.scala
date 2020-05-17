package typingsSlinky.awsSdk.applicationautoscalingMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.awsSdk.awsSdkStrings.ChangeInCapacity
  - typingsSlinky.awsSdk.awsSdkStrings.PercentChangeInCapacity
  - typingsSlinky.awsSdk.awsSdkStrings.ExactCapacity
  - java.lang.String
*/
trait AdjustmentType extends js.Object

object AdjustmentType {
  @scala.inline
  def ChangeInCapacity: typingsSlinky.awsSdk.awsSdkStrings.ChangeInCapacity = "ChangeInCapacity".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.ChangeInCapacity]
  @scala.inline
  def PercentChangeInCapacity: typingsSlinky.awsSdk.awsSdkStrings.PercentChangeInCapacity = "PercentChangeInCapacity".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.PercentChangeInCapacity]
  @scala.inline
  def ExactCapacity: typingsSlinky.awsSdk.awsSdkStrings.ExactCapacity = "ExactCapacity".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.ExactCapacity]
  @scala.inline
  implicit def apply(value: String): AdjustmentType = value.asInstanceOf[AdjustmentType]
}

