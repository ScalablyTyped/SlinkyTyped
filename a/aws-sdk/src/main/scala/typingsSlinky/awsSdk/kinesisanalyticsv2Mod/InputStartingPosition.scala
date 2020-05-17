package typingsSlinky.awsSdk.kinesisanalyticsv2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.awsSdk.awsSdkStrings.NOW
  - typingsSlinky.awsSdk.awsSdkStrings.TRIM_HORIZON
  - typingsSlinky.awsSdk.awsSdkStrings.LAST_STOPPED_POINT
  - java.lang.String
*/
trait InputStartingPosition extends js.Object

object InputStartingPosition {
  @scala.inline
  def NOW: typingsSlinky.awsSdk.awsSdkStrings.NOW = "NOW".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.NOW]
  @scala.inline
  def TRIM_HORIZON: typingsSlinky.awsSdk.awsSdkStrings.TRIM_HORIZON = "TRIM_HORIZON".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.TRIM_HORIZON]
  @scala.inline
  def LAST_STOPPED_POINT: typingsSlinky.awsSdk.awsSdkStrings.LAST_STOPPED_POINT = "LAST_STOPPED_POINT".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.LAST_STOPPED_POINT]
  @scala.inline
  implicit def apply(value: String): InputStartingPosition = value.asInstanceOf[InputStartingPosition]
}

