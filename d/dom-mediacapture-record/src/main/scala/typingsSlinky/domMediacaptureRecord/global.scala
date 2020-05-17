package typingsSlinky.domMediacaptureRecord

import org.scalajs.dom.experimental.mediastream.MediaStream
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobalScope
@js.native
object global extends js.Object {
  @js.native
  class BlobEvent protected ()
    extends typingsSlinky.domMediacaptureRecord.BlobEvent {
    def this(`type`: String, eventInitDict: BlobEventInit) = this()
  }
  
  @js.native
  class MediaRecorder protected ()
    extends typingsSlinky.domMediacaptureRecord.MediaRecorder {
    def this(stream: MediaStream) = this()
    def this(stream: MediaStream, options: MediaRecorderOptions) = this()
  }
  
  @js.native
  class MediaRecorderErrorEvent protected ()
    extends typingsSlinky.domMediacaptureRecord.MediaRecorderErrorEvent {
    def this(`type`: String, eventInitDict: MediaRecorderErrorEventInit) = this()
  }
  
  /* static members */
  @js.native
  object MediaRecorder extends js.Object {
    def isTypeSupported(`type`: String): Boolean = js.native
  }
  
}

