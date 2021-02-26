package typingsSlinky.angularCommon.httpHttpMod

import typingsSlinky.angularCommon.httpHttpMod.HttpEventType.DownloadProgress
import typingsSlinky.angularCommon.httpHttpMod.HttpEventType.UploadProgress
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait HttpProgressEvent
  extends HttpEvent[js.Any] {
  
  /**
    * Number of bytes uploaded or downloaded.
    */
  var loaded: Double = js.native
  
  /**
    * Total number of bytes to upload or download. Depending on the request or
    * response, this may not be computable and thus may not be present.
    */
  var total: js.UndefOr[Double] = js.native
  
  /**
    * Progress event type is either upload or download.
    */
  var `type`: DownloadProgress | UploadProgress = js.native
}
object HttpProgressEvent {
  
  @scala.inline
  def apply(loaded: Double, `type`: DownloadProgress | UploadProgress): HttpProgressEvent = {
    val __obj = js.Dynamic.literal(loaded = loaded.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[HttpProgressEvent]
  }
  
  @scala.inline
  implicit class HttpProgressEventMutableBuilder[Self <: HttpProgressEvent] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLoaded(value: Double): Self = StObject.set(x, "loaded", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTotal(value: Double): Self = StObject.set(x, "total", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTotalUndefined: Self = StObject.set(x, "total", js.undefined)
    
    @scala.inline
    def setType(value: DownloadProgress | UploadProgress): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
