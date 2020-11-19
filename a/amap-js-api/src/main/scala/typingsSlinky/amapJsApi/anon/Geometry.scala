package typingsSlinky.amapJsApi.anon

import typingsSlinky.amapJsApi.AMap.GeoJSON.GeoJSONObject
import typingsSlinky.amapJsApi.amapJsApiStrings.Feature
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Geometry extends GeoJSONObject {
  
  var geometry: typingsSlinky.amapJsApi.AMap.GeoJSON.Geometry = js.native
  
  var properties: js.Any = js.native
  
  var `type`: Feature = js.native
}
object Geometry {
  
  @scala.inline
  def apply(geometry: typingsSlinky.amapJsApi.AMap.GeoJSON.Geometry, properties: js.Any, `type`: Feature): Geometry = {
    val __obj = js.Dynamic.literal(geometry = geometry.asInstanceOf[js.Any], properties = properties.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Geometry]
  }
  
  @scala.inline
  implicit class GeometryOps[Self <: Geometry] (val x: Self) extends AnyVal {
    
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
    def setGeometry(value: typingsSlinky.amapJsApi.AMap.GeoJSON.Geometry): Self = this.set("geometry", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProperties(value: js.Any): Self = this.set("properties", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: Feature): Self = this.set("type", value.asInstanceOf[js.Any])
  }
}
