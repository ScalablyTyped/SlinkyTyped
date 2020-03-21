package typingsSlinky.mapboxMapboxSdk.mapiRequestMod

import org.scalajs.dom.raw.ProgressEvent
import typingsSlinky.mapboxMapboxSdk.mapiErrorMod.MapiError
import typingsSlinky.mapboxMapboxSdk.mapiResponseMod.MapiResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EventEmitter extends js.Object {
  var downloadProgress: ProgressEvent
  var error: MapiError
  var response: MapiResponse
  var uploadProgress: ProgressEvent
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
}

