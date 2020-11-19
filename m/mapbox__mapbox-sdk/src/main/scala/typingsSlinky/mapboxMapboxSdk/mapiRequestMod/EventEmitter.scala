package typingsSlinky.mapboxMapboxSdk.mapiRequestMod

import org.scalajs.dom.raw.ProgressEvent
import typingsSlinky.mapboxMapboxSdk.mapiErrorMod.MapiError
import typingsSlinky.mapboxMapboxSdk.mapiResponseMod.MapiResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EventEmitter extends js.Object {
  
  var downloadProgress: ProgressEvent = js.native
  
  var error: MapiError = js.native
  
  var response: MapiResponse = js.native
  
  var uploadProgress: ProgressEvent = js.native
}
object EventEmitter {
  
  @scala.inline
  def apply(
    downloadProgress: ProgressEvent,
    error: MapiError,
    response: MapiResponse,
    uploadProgress: ProgressEvent
  ): EventEmitter = {
    val __obj = js.Dynamic.literal(downloadProgress = downloadProgress.asInstanceOf[js.Any], error = error.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any], uploadProgress = uploadProgress.asInstanceOf[js.Any])
    __obj.asInstanceOf[EventEmitter]
  }
  
  @scala.inline
  implicit class EventEmitterOps[Self <: EventEmitter] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setDownloadProgress(value: ProgressEvent): Self = this.set("downloadProgress", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setError(value: MapiError): Self = this.set("error", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: MapiResponse): Self = this.set("response", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUploadProgress(value: ProgressEvent): Self = this.set("uploadProgress", value.asInstanceOf[js.Any])
  }
}
