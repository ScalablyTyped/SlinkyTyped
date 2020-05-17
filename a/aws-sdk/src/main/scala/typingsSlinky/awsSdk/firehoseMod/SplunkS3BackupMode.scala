package typingsSlinky.awsSdk.firehoseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.awsSdk.awsSdkStrings.FailedEventsOnly
  - typingsSlinky.awsSdk.awsSdkStrings.AllEvents
  - java.lang.String
*/
trait SplunkS3BackupMode extends js.Object

object SplunkS3BackupMode {
  @scala.inline
  def FailedEventsOnly: typingsSlinky.awsSdk.awsSdkStrings.FailedEventsOnly = "FailedEventsOnly".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.FailedEventsOnly]
  @scala.inline
  def AllEvents: typingsSlinky.awsSdk.awsSdkStrings.AllEvents = "AllEvents".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.AllEvents]
  @scala.inline
  implicit def apply(value: String): SplunkS3BackupMode = value.asInstanceOf[SplunkS3BackupMode]
}

