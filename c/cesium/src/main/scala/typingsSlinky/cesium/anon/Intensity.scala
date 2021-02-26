package typingsSlinky.cesium.anon

import typingsSlinky.cesium.mod.Cartesian3
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Intensity extends StObject {
  
  var color: js.UndefOr[typingsSlinky.cesium.mod.Color] = js.native
  
  var direction: Cartesian3 = js.native
  
  var intensity: js.UndefOr[Double] = js.native
}
object Intensity {
  
  @scala.inline
  def apply(direction: Cartesian3): Intensity = {
    val __obj = js.Dynamic.literal(direction = direction.asInstanceOf[js.Any])
    __obj.asInstanceOf[Intensity]
  }
  
  @scala.inline
  implicit class IntensityMutableBuilder[Self <: Intensity] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setColor(value: typingsSlinky.cesium.mod.Color): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
    
    @scala.inline
    def setDirection(value: Cartesian3): Self = StObject.set(x, "direction", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIntensity(value: Double): Self = StObject.set(x, "intensity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIntensityUndefined: Self = StObject.set(x, "intensity", js.undefined)
  }
}
