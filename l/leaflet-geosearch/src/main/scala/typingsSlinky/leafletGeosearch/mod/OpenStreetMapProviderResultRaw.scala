package typingsSlinky.leafletGeosearch.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * OpenStreetMap
  */
@js.native
trait OpenStreetMapProviderResultRaw extends StObject {
  
  var boundingbox: js.Tuple4[String, String, String, String] = js.native
  
  var `class`: String = js.native
  
  var display_name: String = js.native
  
  var icon: String = js.native
  
  var importance: Double = js.native
  
  var lat: String = js.native
  
  var licence: String = js.native
  
  var lon: String = js.native
  
  var osm_id: Double = js.native
  
  var osm_type: String = js.native
  
  var place_id: Double = js.native
  
  var `type`: String = js.native
}
object OpenStreetMapProviderResultRaw {
  
  @scala.inline
  def apply(
    boundingbox: js.Tuple4[String, String, String, String],
    `class`: String,
    display_name: String,
    icon: String,
    importance: Double,
    lat: String,
    licence: String,
    lon: String,
    osm_id: Double,
    osm_type: String,
    place_id: Double,
    `type`: String
  ): OpenStreetMapProviderResultRaw = {
    val __obj = js.Dynamic.literal(boundingbox = boundingbox.asInstanceOf[js.Any], display_name = display_name.asInstanceOf[js.Any], icon = icon.asInstanceOf[js.Any], importance = importance.asInstanceOf[js.Any], lat = lat.asInstanceOf[js.Any], licence = licence.asInstanceOf[js.Any], lon = lon.asInstanceOf[js.Any], osm_id = osm_id.asInstanceOf[js.Any], osm_type = osm_type.asInstanceOf[js.Any], place_id = place_id.asInstanceOf[js.Any])
    __obj.updateDynamic("class")(`class`.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[OpenStreetMapProviderResultRaw]
  }
  
  @scala.inline
  implicit class OpenStreetMapProviderResultRawMutableBuilder[Self <: OpenStreetMapProviderResultRaw] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBoundingbox(value: js.Tuple4[String, String, String, String]): Self = StObject.set(x, "boundingbox", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClass(value: String): Self = StObject.set(x, "class", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisplay_name(value: String): Self = StObject.set(x, "display_name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIcon(value: String): Self = StObject.set(x, "icon", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setImportance(value: Double): Self = StObject.set(x, "importance", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLat(value: String): Self = StObject.set(x, "lat", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLicence(value: String): Self = StObject.set(x, "licence", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLon(value: String): Self = StObject.set(x, "lon", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOsm_id(value: Double): Self = StObject.set(x, "osm_id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOsm_type(value: String): Self = StObject.set(x, "osm_type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPlace_id(value: Double): Self = StObject.set(x, "place_id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
