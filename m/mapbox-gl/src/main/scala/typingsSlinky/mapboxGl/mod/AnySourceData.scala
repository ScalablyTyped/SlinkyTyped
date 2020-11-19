package typingsSlinky.mapboxGl.mod

import org.scalajs.dom.raw.HTMLCanvasElement
import typingsSlinky.mapboxGl.mapboxGlStrings.`raster-dem`
import typingsSlinky.mapboxGl.mapboxGlStrings.canvas
import typingsSlinky.mapboxGl.mapboxGlStrings.geojson
import typingsSlinky.mapboxGl.mapboxGlStrings.image_
import typingsSlinky.mapboxGl.mapboxGlStrings.raster
import typingsSlinky.mapboxGl.mapboxGlStrings.vector
import typingsSlinky.mapboxGl.mapboxGlStrings.video
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
trait AnySourceData extends js.Object
object AnySourceData {
  
  @scala.inline
  def RasterDemSource(`type`: `raster-dem`): AnySourceData = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnySourceData]
  }
  
  @scala.inline
  def VectorSource(`type`: vector): AnySourceData = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnySourceData]
  }
  
  @scala.inline
  def RasterSource(`type`: raster): AnySourceData = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnySourceData]
  }
  
  @scala.inline
  def GeoJSONSourceRaw(`type`: geojson): AnySourceData = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnySourceData]
  }
  
  @scala.inline
  def VideoSourceRaw(`type`: video): AnySourceData = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnySourceData]
  }
  
  @scala.inline
  def CanvasSourceRaw(canvas: String | HTMLCanvasElement, coordinates: js.Array[js.Array[Double]], `type`: canvas): AnySourceData = {
    val __obj = js.Dynamic.literal(canvas = canvas.asInstanceOf[js.Any], coordinates = coordinates.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnySourceData]
  }
  
  @scala.inline
  def ImageSourceRaw(`type`: image_): AnySourceData = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnySourceData]
  }
}
