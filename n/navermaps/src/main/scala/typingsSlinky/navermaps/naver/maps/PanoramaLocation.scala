package typingsSlinky.navermaps.naver.maps

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PanoramaLocation extends StObject {
  
  var address: String = js.native
  
  var coord: LatLng = js.native
  
  var panoId: String = js.native
  
  var photodate: String = js.native
  
  var title: String = js.native
}
object PanoramaLocation {
  
  @scala.inline
  def apply(address: String, coord: LatLng, panoId: String, photodate: String, title: String): PanoramaLocation = {
    val __obj = js.Dynamic.literal(address = address.asInstanceOf[js.Any], coord = coord.asInstanceOf[js.Any], panoId = panoId.asInstanceOf[js.Any], photodate = photodate.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
    __obj.asInstanceOf[PanoramaLocation]
  }
  
  @scala.inline
  implicit class PanoramaLocationMutableBuilder[Self <: PanoramaLocation] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAddress(value: String): Self = StObject.set(x, "address", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCoord(value: LatLng): Self = StObject.set(x, "coord", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPanoId(value: String): Self = StObject.set(x, "panoId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPhotodate(value: String): Self = StObject.set(x, "photodate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
  }
}
