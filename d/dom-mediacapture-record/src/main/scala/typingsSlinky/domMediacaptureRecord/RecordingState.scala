package typingsSlinky.domMediacaptureRecord

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.domMediacaptureRecord.domMediacaptureRecordStrings.inactive
  - typingsSlinky.domMediacaptureRecord.domMediacaptureRecordStrings.recording
  - typingsSlinky.domMediacaptureRecord.domMediacaptureRecordStrings.paused
*/
trait RecordingState extends js.Object

object RecordingState {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def inactive: typingsSlinky.domMediacaptureRecord.domMediacaptureRecordStrings.inactive = this.cast("inactive")
  @scala.inline
  def paused: typingsSlinky.domMediacaptureRecord.domMediacaptureRecordStrings.paused = this.cast("paused")
  @scala.inline
  def recording: typingsSlinky.domMediacaptureRecord.domMediacaptureRecordStrings.recording = this.cast("recording")
}

