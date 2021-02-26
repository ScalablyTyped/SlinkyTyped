package typingsSlinky.openlayers.mod.olx

import typingsSlinky.openlayers.mod.Coordinate_
import typingsSlinky.openlayers.mod.Extent_
import typingsSlinky.openlayers.mod.proj.Units
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Object literal with config options for the projection.
  */
@js.native
trait ProjectionOptions extends StObject {
  
  var axisOrientation: js.UndefOr[String] = js.native
  
  var code: String = js.native
  
  var extent: js.UndefOr[Extent_] = js.native
  
  var getPointResolution: js.UndefOr[js.Function2[/* resolution */ Double, /* coords */ Coordinate_, Double]] = js.native
  
  var global: js.UndefOr[Boolean] = js.native
  
  var metersPerUnit: js.UndefOr[Double] = js.native
  
  var units: js.UndefOr[Units | String] = js.native
  
  var worldExtent: js.UndefOr[Extent_] = js.native
}
object ProjectionOptions {
  
  @scala.inline
  def apply(code: String): ProjectionOptions = {
    val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProjectionOptions]
  }
  
  @scala.inline
  implicit class ProjectionOptionsMutableBuilder[Self <: ProjectionOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAxisOrientation(value: String): Self = StObject.set(x, "axisOrientation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAxisOrientationUndefined: Self = StObject.set(x, "axisOrientation", js.undefined)
    
    @scala.inline
    def setCode(value: String): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExtent(value: Extent_): Self = StObject.set(x, "extent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExtentUndefined: Self = StObject.set(x, "extent", js.undefined)
    
    @scala.inline
    def setGetPointResolution(value: (/* resolution */ Double, /* coords */ Coordinate_) => Double): Self = StObject.set(x, "getPointResolution", js.Any.fromFunction2(value))
    
    @scala.inline
    def setGetPointResolutionUndefined: Self = StObject.set(x, "getPointResolution", js.undefined)
    
    @scala.inline
    def setGlobal(value: Boolean): Self = StObject.set(x, "global", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGlobalUndefined: Self = StObject.set(x, "global", js.undefined)
    
    @scala.inline
    def setMetersPerUnit(value: Double): Self = StObject.set(x, "metersPerUnit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMetersPerUnitUndefined: Self = StObject.set(x, "metersPerUnit", js.undefined)
    
    @scala.inline
    def setUnits(value: Units | String): Self = StObject.set(x, "units", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUnitsUndefined: Self = StObject.set(x, "units", js.undefined)
    
    @scala.inline
    def setWorldExtent(value: Extent_): Self = StObject.set(x, "worldExtent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWorldExtentUndefined: Self = StObject.set(x, "worldExtent", js.undefined)
  }
}
