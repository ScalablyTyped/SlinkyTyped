package typingsSlinky.awsSdk.cloudwatchMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.awsSdk.awsSdkStrings.OK
  - typingsSlinky.awsSdk.awsSdkStrings.ALARM
  - typingsSlinky.awsSdk.awsSdkStrings.INSUFFICIENT_DATA
  - java.lang.String
*/
trait StateValue extends js.Object

object StateValue {
  @scala.inline
  def OK: typingsSlinky.awsSdk.awsSdkStrings.OK = "OK".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.OK]
  @scala.inline
  def ALARM: typingsSlinky.awsSdk.awsSdkStrings.ALARM = "ALARM".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.ALARM]
  @scala.inline
  def INSUFFICIENT_DATA: typingsSlinky.awsSdk.awsSdkStrings.INSUFFICIENT_DATA = "INSUFFICIENT_DATA".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.INSUFFICIENT_DATA]
  @scala.inline
  implicit def apply(value: String): StateValue = value.asInstanceOf[StateValue]
}

