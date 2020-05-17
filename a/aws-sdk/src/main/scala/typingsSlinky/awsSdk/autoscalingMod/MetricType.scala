package typingsSlinky.awsSdk.autoscalingMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.awsSdk.awsSdkStrings.ASGAverageCPUUtilization
  - typingsSlinky.awsSdk.awsSdkStrings.ASGAverageNetworkIn
  - typingsSlinky.awsSdk.awsSdkStrings.ASGAverageNetworkOut
  - typingsSlinky.awsSdk.awsSdkStrings.ALBRequestCountPerTarget
  - java.lang.String
*/
trait MetricType extends js.Object

object MetricType {
  @scala.inline
  def ASGAverageCPUUtilization: typingsSlinky.awsSdk.awsSdkStrings.ASGAverageCPUUtilization = "ASGAverageCPUUtilization".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.ASGAverageCPUUtilization]
  @scala.inline
  def ASGAverageNetworkIn: typingsSlinky.awsSdk.awsSdkStrings.ASGAverageNetworkIn = "ASGAverageNetworkIn".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.ASGAverageNetworkIn]
  @scala.inline
  def ASGAverageNetworkOut: typingsSlinky.awsSdk.awsSdkStrings.ASGAverageNetworkOut = "ASGAverageNetworkOut".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.ASGAverageNetworkOut]
  @scala.inline
  def ALBRequestCountPerTarget: typingsSlinky.awsSdk.awsSdkStrings.ALBRequestCountPerTarget = "ALBRequestCountPerTarget".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.ALBRequestCountPerTarget]
  @scala.inline
  implicit def apply(value: String): MetricType = value.asInstanceOf[MetricType]
}

