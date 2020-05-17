package typingsSlinky.awsSdk.cloudwatchMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.awsSdk.awsSdkStrings.PENDING_TRAINING
  - typingsSlinky.awsSdk.awsSdkStrings.TRAINED_INSUFFICIENT_DATA
  - typingsSlinky.awsSdk.awsSdkStrings.TRAINED
  - java.lang.String
*/
trait AnomalyDetectorStateValue extends js.Object

object AnomalyDetectorStateValue {
  @scala.inline
  def PENDING_TRAINING: typingsSlinky.awsSdk.awsSdkStrings.PENDING_TRAINING = "PENDING_TRAINING".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.PENDING_TRAINING]
  @scala.inline
  def TRAINED_INSUFFICIENT_DATA: typingsSlinky.awsSdk.awsSdkStrings.TRAINED_INSUFFICIENT_DATA = "TRAINED_INSUFFICIENT_DATA".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.TRAINED_INSUFFICIENT_DATA]
  @scala.inline
  def TRAINED: typingsSlinky.awsSdk.awsSdkStrings.TRAINED = "TRAINED".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.TRAINED]
  @scala.inline
  implicit def apply(value: String): AnomalyDetectorStateValue = value.asInstanceOf[AnomalyDetectorStateValue]
}

