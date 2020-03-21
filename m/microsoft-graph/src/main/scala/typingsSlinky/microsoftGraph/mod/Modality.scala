package typingsSlinky.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.microsoftGraph.microsoftGraphStrings.audio
  - typingsSlinky.microsoftGraph.microsoftGraphStrings.video
  - typingsSlinky.microsoftGraph.microsoftGraphStrings.videoBasedScreenSharing
  - typingsSlinky.microsoftGraph.microsoftGraphStrings.data
  - typingsSlinky.microsoftGraph.microsoftGraphStrings.unknownFutureValue
*/
trait Modality extends js.Object

object Modality {
  @scala.inline
  def audio: typingsSlinky.microsoftGraph.microsoftGraphStrings.audio = this.cast("audio")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def data: typingsSlinky.microsoftGraph.microsoftGraphStrings.data = this.cast("data")
  @scala.inline
  def unknownFutureValue: typingsSlinky.microsoftGraph.microsoftGraphStrings.unknownFutureValue = this.cast("unknownFutureValue")
  @scala.inline
  def video: typingsSlinky.microsoftGraph.microsoftGraphStrings.video = this.cast("video")
  @scala.inline
  def videoBasedScreenSharing: typingsSlinky.microsoftGraph.microsoftGraphStrings.videoBasedScreenSharing = this.cast("videoBasedScreenSharing")
}

