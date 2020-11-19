package typingsSlinky.mapboxGl.mod

import typingsSlinky.mapboxGl.mapboxGlStrings.geojson
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GeoJSONSourceRaw
  extends Source
     with GeoJSONSourceOptions
     with AnySourceData {
  
  @JSName("type")
  var type_GeoJSONSourceRaw: geojson = js.native
}
object GeoJSONSourceRaw {
  
  @scala.inline
  def apply(`type`: geojson): GeoJSONSourceRaw = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[GeoJSONSourceRaw]
  }
  
  @scala.inline
  implicit class GeoJSONSourceRawOps[Self <: GeoJSONSourceRaw] (val x: Self) extends AnyVal {
    
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
    def setType(value: geojson): Self = this.set("type", value.asInstanceOf[js.Any])
  }
}
