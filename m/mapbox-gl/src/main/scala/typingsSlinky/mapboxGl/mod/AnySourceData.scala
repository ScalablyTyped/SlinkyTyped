package typingsSlinky.mapboxGl.mod

import org.scalajs.dom.raw.HTMLCanvasElement
import typingsSlinky.mapboxGl.mapboxGlStrings.`raster-dem`
import typingsSlinky.mapboxGl.mapboxGlStrings.canvas
import typingsSlinky.mapboxGl.mapboxGlStrings.geojson
import typingsSlinky.mapboxGl.mapboxGlStrings.image_
import typingsSlinky.mapboxGl.mapboxGlStrings.raster
import typingsSlinky.mapboxGl.mapboxGlStrings.vector
import typingsSlinky.mapboxGl.mapboxGlStrings.video
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.mapboxGl.mod.GeoJSONSourceRaw
  - typingsSlinky.mapboxGl.mod.VideoSourceRaw
  - typingsSlinky.mapboxGl.mod.ImageSourceRaw
  - typingsSlinky.mapboxGl.mod.CanvasSourceRaw
  - typingsSlinky.mapboxGl.mod.VectorSource
  - typingsSlinky.mapboxGl.mod.RasterSource
  - typingsSlinky.mapboxGl.mod.RasterDemSource
*/
trait AnySourceData extends StObject
object AnySourceData {
  
  @scala.inline
  def CanvasSourceRaw(canvas: String | HTMLCanvasElement, coordinates: js.Array[js.Array[Double]], `type`: canvas): typingsSlinky.mapboxGl.mod.CanvasSourceRaw = {
    val __obj = js.Dynamic.literal(canvas = canvas.asInstanceOf[js.Any], coordinates = coordinates.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.mapboxGl.mod.CanvasSourceRaw]
  }
  
  @scala.inline
  def GeoJSONSourceRaw(`type`: geojson): typingsSlinky.mapboxGl.mod.GeoJSONSourceRaw = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.mapboxGl.mod.GeoJSONSourceRaw]
  }
  
  @scala.inline
  def ImageSourceRaw(`type`: image_): typingsSlinky.mapboxGl.mod.ImageSourceRaw = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.mapboxGl.mod.ImageSourceRaw]
  }
  
  @scala.inline
  def RasterDemSource(`type`: `raster-dem`): typingsSlinky.mapboxGl.mod.RasterDemSource = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.mapboxGl.mod.RasterDemSource]
  }
  
  @scala.inline
  def RasterSource(`type`: raster): typingsSlinky.mapboxGl.mod.RasterSource = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.mapboxGl.mod.RasterSource]
  }
  
  @scala.inline
  def VectorSource(`type`: vector): typingsSlinky.mapboxGl.mod.VectorSource = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.mapboxGl.mod.VectorSource]
  }
  
  @scala.inline
  def VideoSourceRaw(`type`: video): typingsSlinky.mapboxGl.mod.VideoSourceRaw = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.mapboxGl.mod.VideoSourceRaw]
  }
}
