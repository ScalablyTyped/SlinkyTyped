package typingsSlinky.evernote.anon

import typingsSlinky.evernote.mod.Types.LazyMap
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ApplicationData extends StObject {
  
  var altitude: js.UndefOr[Double] = js.native
  
  var applicationData: js.UndefOr[LazyMap] = js.native
  
  var attachment: js.UndefOr[Boolean] = js.native
  
  var cameraMake: js.UndefOr[String] = js.native
  
  var cameraModel: js.UndefOr[String] = js.native
  
  var clientWillIndex: js.UndefOr[Boolean] = js.native
  
  var fileName: js.UndefOr[String] = js.native
  
  var latitude: js.UndefOr[Double] = js.native
  
  var longitude: js.UndefOr[Double] = js.native
  
  var recoType: js.UndefOr[String] = js.native
  
  var sourceURL: js.UndefOr[String] = js.native
  
  var timestamp: js.UndefOr[Double] = js.native
}
object ApplicationData {
  
  @scala.inline
  def apply(): ApplicationData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ApplicationData]
  }
  
  @scala.inline
  implicit class ApplicationDataMutableBuilder[Self <: ApplicationData] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAltitude(value: Double): Self = StObject.set(x, "altitude", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAltitudeUndefined: Self = StObject.set(x, "altitude", js.undefined)
    
    @scala.inline
    def setApplicationData(value: LazyMap): Self = StObject.set(x, "applicationData", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setApplicationDataUndefined: Self = StObject.set(x, "applicationData", js.undefined)
    
    @scala.inline
    def setAttachment(value: Boolean): Self = StObject.set(x, "attachment", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAttachmentUndefined: Self = StObject.set(x, "attachment", js.undefined)
    
    @scala.inline
    def setCameraMake(value: String): Self = StObject.set(x, "cameraMake", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCameraMakeUndefined: Self = StObject.set(x, "cameraMake", js.undefined)
    
    @scala.inline
    def setCameraModel(value: String): Self = StObject.set(x, "cameraModel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCameraModelUndefined: Self = StObject.set(x, "cameraModel", js.undefined)
    
    @scala.inline
    def setClientWillIndex(value: Boolean): Self = StObject.set(x, "clientWillIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClientWillIndexUndefined: Self = StObject.set(x, "clientWillIndex", js.undefined)
    
    @scala.inline
    def setFileName(value: String): Self = StObject.set(x, "fileName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFileNameUndefined: Self = StObject.set(x, "fileName", js.undefined)
    
    @scala.inline
    def setLatitude(value: Double): Self = StObject.set(x, "latitude", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLatitudeUndefined: Self = StObject.set(x, "latitude", js.undefined)
    
    @scala.inline
    def setLongitude(value: Double): Self = StObject.set(x, "longitude", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLongitudeUndefined: Self = StObject.set(x, "longitude", js.undefined)
    
    @scala.inline
    def setRecoType(value: String): Self = StObject.set(x, "recoType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRecoTypeUndefined: Self = StObject.set(x, "recoType", js.undefined)
    
    @scala.inline
    def setSourceURL(value: String): Self = StObject.set(x, "sourceURL", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSourceURLUndefined: Self = StObject.set(x, "sourceURL", js.undefined)
    
    @scala.inline
    def setTimestamp(value: Double): Self = StObject.set(x, "timestamp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimestampUndefined: Self = StObject.set(x, "timestamp", js.undefined)
  }
}
