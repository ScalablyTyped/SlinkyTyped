package typingsSlinky.awsSdk.cloudwatchlogsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.awsSdk.awsSdkStrings.LogStreamName
  - typingsSlinky.awsSdk.awsSdkStrings.LastEventTime
  - java.lang.String
*/
trait OrderBy extends js.Object

object OrderBy {
  @scala.inline
  def LogStreamName: typingsSlinky.awsSdk.awsSdkStrings.LogStreamName = "LogStreamName".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.LogStreamName]
  @scala.inline
  def LastEventTime: typingsSlinky.awsSdk.awsSdkStrings.LastEventTime = "LastEventTime".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.LastEventTime]
  @scala.inline
  implicit def apply(value: String): OrderBy = value.asInstanceOf[OrderBy]
}

