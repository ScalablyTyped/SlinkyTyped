package typingsSlinky.cesium.anon

import typingsSlinky.cesium.mod.Cartesian3
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait NumberOfVerticalLines extends StObject {
  
  var center: Cartesian3 = js.native
  
  var ellipsoid: js.UndefOr[typingsSlinky.cesium.mod.Ellipsoid] = js.native
  
  var extrudedHeight: js.UndefOr[Double] = js.native
  
  var granularity: js.UndefOr[Double] = js.native
  
  var height: js.UndefOr[Double] = js.native
  
  var numberOfVerticalLines: js.UndefOr[Double] = js.native
  
  var rotation: js.UndefOr[Double] = js.native
  
  var semiMajorAxis: Double = js.native
  
  var semiMinorAxis: Double = js.native
}
object NumberOfVerticalLines {
  
  @scala.inline
  def apply(center: Cartesian3, semiMajorAxis: Double, semiMinorAxis: Double): NumberOfVerticalLines = {
    val __obj = js.Dynamic.literal(center = center.asInstanceOf[js.Any], semiMajorAxis = semiMajorAxis.asInstanceOf[js.Any], semiMinorAxis = semiMinorAxis.asInstanceOf[js.Any])
    __obj.asInstanceOf[NumberOfVerticalLines]
  }
  
  @scala.inline
  implicit class NumberOfVerticalLinesMutableBuilder[Self <: NumberOfVerticalLines] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCenter(value: Cartesian3): Self = StObject.set(x, "center", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEllipsoid(value: typingsSlinky.cesium.mod.Ellipsoid): Self = StObject.set(x, "ellipsoid", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEllipsoidUndefined: Self = StObject.set(x, "ellipsoid", js.undefined)
    
    @scala.inline
    def setExtrudedHeight(value: Double): Self = StObject.set(x, "extrudedHeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExtrudedHeightUndefined: Self = StObject.set(x, "extrudedHeight", js.undefined)
    
    @scala.inline
    def setGranularity(value: Double): Self = StObject.set(x, "granularity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGranularityUndefined: Self = StObject.set(x, "granularity", js.undefined)
    
    @scala.inline
    def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
    
    @scala.inline
    def setNumberOfVerticalLines(value: Double): Self = StObject.set(x, "numberOfVerticalLines", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNumberOfVerticalLinesUndefined: Self = StObject.set(x, "numberOfVerticalLines", js.undefined)
    
    @scala.inline
    def setRotation(value: Double): Self = StObject.set(x, "rotation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRotationUndefined: Self = StObject.set(x, "rotation", js.undefined)
    
    @scala.inline
    def setSemiMajorAxis(value: Double): Self = StObject.set(x, "semiMajorAxis", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSemiMinorAxis(value: Double): Self = StObject.set(x, "semiMinorAxis", value.asInstanceOf[js.Any])
  }
}
