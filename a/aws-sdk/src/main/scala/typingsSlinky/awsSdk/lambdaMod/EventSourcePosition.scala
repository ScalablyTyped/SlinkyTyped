package typingsSlinky.awsSdk.lambdaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.awsSdk.awsSdkStrings.TRIM_HORIZON
  - typingsSlinky.awsSdk.awsSdkStrings.LATEST
  - typingsSlinky.awsSdk.awsSdkStrings.AT_TIMESTAMP
  - java.lang.String
*/
trait EventSourcePosition extends js.Object

object EventSourcePosition {
  @scala.inline
  def TRIM_HORIZON: typingsSlinky.awsSdk.awsSdkStrings.TRIM_HORIZON = "TRIM_HORIZON".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.TRIM_HORIZON]
  @scala.inline
  def LATEST: typingsSlinky.awsSdk.awsSdkStrings.LATEST = "LATEST".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.LATEST]
  @scala.inline
  def AT_TIMESTAMP: typingsSlinky.awsSdk.awsSdkStrings.AT_TIMESTAMP = "AT_TIMESTAMP".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.AT_TIMESTAMP]
  @scala.inline
  implicit def apply(value: java.lang.String): EventSourcePosition = value.asInstanceOf[EventSourcePosition]
}

