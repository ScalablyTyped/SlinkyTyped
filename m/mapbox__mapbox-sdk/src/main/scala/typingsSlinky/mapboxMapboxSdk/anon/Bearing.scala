package typingsSlinky.mapboxMapboxSdk.anon

import typingsSlinky.mapboxGl.mod.LngLatLike
import typingsSlinky.mapboxMapboxSdk.mapboxMapboxSdkStrings.auto
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Bearing extends StObject {
  
  var bearing: js.UndefOr[Double] = js.native
  
  var coordinates: LngLatLike | auto = js.native
  
  var pitch: js.UndefOr[Double] = js.native
  
  var zoom: Double = js.native
}
object Bearing {
  
  @scala.inline
  def apply(coordinates: LngLatLike | auto, zoom: Double): Bearing = {
    val __obj = js.Dynamic.literal(coordinates = coordinates.asInstanceOf[js.Any], zoom = zoom.asInstanceOf[js.Any])
    __obj.asInstanceOf[Bearing]
  }
  
  @scala.inline
  implicit class BearingMutableBuilder[Self <: Bearing] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBearing(value: Double): Self = StObject.set(x, "bearing", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBearingUndefined: Self = StObject.set(x, "bearing", js.undefined)
    
    @scala.inline
    def setCoordinates(value: LngLatLike | auto): Self = StObject.set(x, "coordinates", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPitch(value: Double): Self = StObject.set(x, "pitch", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPitchUndefined: Self = StObject.set(x, "pitch", js.undefined)
    
    @scala.inline
    def setZoom(value: Double): Self = StObject.set(x, "zoom", value.asInstanceOf[js.Any])
  }
}
