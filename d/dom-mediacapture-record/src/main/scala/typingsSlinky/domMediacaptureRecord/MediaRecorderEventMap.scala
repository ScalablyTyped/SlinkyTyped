package typingsSlinky.domMediacaptureRecord

import org.scalajs.dom.raw.Event
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MediaRecorderEventMap extends StObject {
  
  var dataavailable: BlobEvent = js.native
  
  var error: MediaRecorderErrorEvent = js.native
  
  var pause: Event = js.native
  
  var resume: Event = js.native
  
  var start: Event = js.native
  
  var stop: Event = js.native
}
object MediaRecorderEventMap {
  
  @scala.inline
  def apply(
    dataavailable: BlobEvent,
    error: MediaRecorderErrorEvent,
    pause: Event,
    resume: Event,
    start: Event,
    stop: Event
  ): MediaRecorderEventMap = {
    val __obj = js.Dynamic.literal(dataavailable = dataavailable.asInstanceOf[js.Any], error = error.asInstanceOf[js.Any], pause = pause.asInstanceOf[js.Any], resume = resume.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any], stop = stop.asInstanceOf[js.Any])
    __obj.asInstanceOf[MediaRecorderEventMap]
  }
  
  @scala.inline
  implicit class MediaRecorderEventMapMutableBuilder[Self <: MediaRecorderEventMap] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDataavailable(value: BlobEvent): Self = StObject.set(x, "dataavailable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setError(value: MediaRecorderErrorEvent): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPause(value: Event): Self = StObject.set(x, "pause", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResume(value: Event): Self = StObject.set(x, "resume", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStart(value: Event): Self = StObject.set(x, "start", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStop(value: Event): Self = StObject.set(x, "stop", value.asInstanceOf[js.Any])
  }
}
