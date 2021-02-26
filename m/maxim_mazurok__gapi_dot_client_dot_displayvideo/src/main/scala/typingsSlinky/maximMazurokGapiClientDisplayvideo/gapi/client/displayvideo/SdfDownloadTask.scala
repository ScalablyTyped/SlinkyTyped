package typingsSlinky.maximMazurokGapiClientDisplayvideo.gapi.client.displayvideo

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SdfDownloadTask extends StObject {
  
  /**
    * A resource name to be used in media.download to Download the prepared files. Resource names have the format `download/sdfdownloadtasks/media/{media_id}`. `media_id` will be made
    * available by the long running operation service once the task status is done.
    */
  var resourceName: js.UndefOr[String] = js.native
}
object SdfDownloadTask {
  
  @scala.inline
  def apply(): SdfDownloadTask = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SdfDownloadTask]
  }
  
  @scala.inline
  implicit class SdfDownloadTaskMutableBuilder[Self <: SdfDownloadTask] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setResourceName(value: String): Self = StObject.set(x, "resourceName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResourceNameUndefined: Self = StObject.set(x, "resourceName", js.undefined)
  }
}
