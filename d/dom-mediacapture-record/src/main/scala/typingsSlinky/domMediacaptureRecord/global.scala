package typingsSlinky.domMediacaptureRecord

import org.scalajs.dom.experimental.mediastream.MediaStream
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  @JSGlobal("BlobEvent")
  @js.native
  class BlobEvent protected ()
    extends typingsSlinky.domMediacaptureRecord.BlobEvent {
    def this(`type`: String, eventInitDict: BlobEventInit) = this()
  }
  
  @JSGlobal("MediaRecorder")
  @js.native
  class MediaRecorder protected ()
    extends typingsSlinky.domMediacaptureRecord.MediaRecorder {
    def this(stream: MediaStream) = this()
    def this(stream: MediaStream, options: MediaRecorderOptions) = this()
  }
  object MediaRecorder {
    
    /* static member */
    @JSGlobal("MediaRecorder.isTypeSupported")
    @js.native
    def isTypeSupported(`type`: String): Boolean = js.native
  }
  
  @JSGlobal("MediaRecorderErrorEvent")
  @js.native
  class MediaRecorderErrorEvent protected ()
    extends typingsSlinky.domMediacaptureRecord.MediaRecorderErrorEvent {
    def this(`type`: String, eventInitDict: MediaRecorderErrorEventInit) = this()
  }
}
