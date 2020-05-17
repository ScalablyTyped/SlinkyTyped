package typingsSlinky.awsSdk.autoscalingplansMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.awsSdk.awsSdkStrings.ForecastAndScale
  - typingsSlinky.awsSdk.awsSdkStrings.ForecastOnly
  - java.lang.String
*/
trait PredictiveScalingMode extends js.Object

object PredictiveScalingMode {
  @scala.inline
  def ForecastAndScale: typingsSlinky.awsSdk.awsSdkStrings.ForecastAndScale = "ForecastAndScale".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.ForecastAndScale]
  @scala.inline
  def ForecastOnly: typingsSlinky.awsSdk.awsSdkStrings.ForecastOnly = "ForecastOnly".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.ForecastOnly]
  @scala.inline
  implicit def apply(value: String): PredictiveScalingMode = value.asInstanceOf[PredictiveScalingMode]
}

