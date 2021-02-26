package typingsSlinky.ariClient.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RecordingFinished extends Event {
  
  /**
    * Recording control object.
    */
  var recording: LiveRecording = js.native
}
object RecordingFinished {
  
  @scala.inline
  def apply(application: String, recording: LiveRecording, timestamp: js.Date, `type`: String): RecordingFinished = {
    val __obj = js.Dynamic.literal(application = application.asInstanceOf[js.Any], recording = recording.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[RecordingFinished]
  }
  
  @scala.inline
  implicit class RecordingFinishedMutableBuilder[Self <: RecordingFinished] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setRecording(value: LiveRecording): Self = StObject.set(x, "recording", value.asInstanceOf[js.Any])
  }
}
