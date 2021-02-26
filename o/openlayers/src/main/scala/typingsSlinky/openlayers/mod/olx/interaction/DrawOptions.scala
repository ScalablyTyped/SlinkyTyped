package typingsSlinky.openlayers.mod.olx.interaction

import typingsSlinky.openlayers.mod.Collection
import typingsSlinky.openlayers.mod.Coordinate_
import typingsSlinky.openlayers.mod.DrawGeometryFunctionType
import typingsSlinky.openlayers.mod.EventsConditionType
import typingsSlinky.openlayers.mod.Feature
import typingsSlinky.openlayers.mod.MapBrowserEvent
import typingsSlinky.openlayers.mod.StyleFunction
import typingsSlinky.openlayers.mod.geom.GeometryType
import typingsSlinky.openlayers.mod.geom.SimpleGeometry
import typingsSlinky.openlayers.mod.source.Vector
import typingsSlinky.openlayers.mod.style.Style
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DrawOptions extends StObject {
  
  var clickTolerance: js.UndefOr[Double] = js.native
  
  var condition: js.UndefOr[EventsConditionType] = js.native
  
  var features: js.UndefOr[Collection[Feature]] = js.native
  
  var finishCondition: js.UndefOr[EventsConditionType] = js.native
  
  var freehand: js.UndefOr[Boolean] = js.native
  
  var freehandCondition: js.UndefOr[EventsConditionType] = js.native
  
  var geometryFunction: js.UndefOr[DrawGeometryFunctionType] = js.native
  
  var geometryName: js.UndefOr[String] = js.native
  
  var maxPoints: js.UndefOr[Double] = js.native
  
  var minPoints: js.UndefOr[Double] = js.native
  
  var snapTolerance: js.UndefOr[Double] = js.native
  
  var source: js.UndefOr[Vector] = js.native
  
  var stopClick: js.UndefOr[Boolean] = js.native
  
  var style: js.UndefOr[Style | js.Array[Style] | StyleFunction] = js.native
  
  var `type`: GeometryType = js.native
  
  var wrapX: js.UndefOr[Boolean] = js.native
}
object DrawOptions {
  
  @scala.inline
  def apply(`type`: GeometryType): DrawOptions = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[DrawOptions]
  }
  
  @scala.inline
  implicit class DrawOptionsMutableBuilder[Self <: DrawOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setClickTolerance(value: Double): Self = StObject.set(x, "clickTolerance", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClickToleranceUndefined: Self = StObject.set(x, "clickTolerance", js.undefined)
    
    @scala.inline
    def setCondition(value: /* event */ MapBrowserEvent => Boolean): Self = StObject.set(x, "condition", js.Any.fromFunction1(value))
    
    @scala.inline
    def setConditionUndefined: Self = StObject.set(x, "condition", js.undefined)
    
    @scala.inline
    def setFeatures(value: Collection[Feature]): Self = StObject.set(x, "features", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFeaturesUndefined: Self = StObject.set(x, "features", js.undefined)
    
    @scala.inline
    def setFinishCondition(value: /* event */ MapBrowserEvent => Boolean): Self = StObject.set(x, "finishCondition", js.Any.fromFunction1(value))
    
    @scala.inline
    def setFinishConditionUndefined: Self = StObject.set(x, "finishCondition", js.undefined)
    
    @scala.inline
    def setFreehand(value: Boolean): Self = StObject.set(x, "freehand", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFreehandCondition(value: /* event */ MapBrowserEvent => Boolean): Self = StObject.set(x, "freehandCondition", js.Any.fromFunction1(value))
    
    @scala.inline
    def setFreehandConditionUndefined: Self = StObject.set(x, "freehandCondition", js.undefined)
    
    @scala.inline
    def setFreehandUndefined: Self = StObject.set(x, "freehand", js.undefined)
    
    @scala.inline
    def setGeometryFunction(
      value: (/* coords */ Coordinate_ | (js.Array[js.Array[Coordinate_] | Coordinate_]), /* geo */ js.UndefOr[SimpleGeometry]) => SimpleGeometry
    ): Self = StObject.set(x, "geometryFunction", js.Any.fromFunction2(value))
    
    @scala.inline
    def setGeometryFunctionUndefined: Self = StObject.set(x, "geometryFunction", js.undefined)
    
    @scala.inline
    def setGeometryName(value: String): Self = StObject.set(x, "geometryName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGeometryNameUndefined: Self = StObject.set(x, "geometryName", js.undefined)
    
    @scala.inline
    def setMaxPoints(value: Double): Self = StObject.set(x, "maxPoints", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxPointsUndefined: Self = StObject.set(x, "maxPoints", js.undefined)
    
    @scala.inline
    def setMinPoints(value: Double): Self = StObject.set(x, "minPoints", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinPointsUndefined: Self = StObject.set(x, "minPoints", js.undefined)
    
    @scala.inline
    def setSnapTolerance(value: Double): Self = StObject.set(x, "snapTolerance", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSnapToleranceUndefined: Self = StObject.set(x, "snapTolerance", js.undefined)
    
    @scala.inline
    def setSource(value: Vector): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSourceUndefined: Self = StObject.set(x, "source", js.undefined)
    
    @scala.inline
    def setStopClick(value: Boolean): Self = StObject.set(x, "stopClick", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStopClickUndefined: Self = StObject.set(x, "stopClick", js.undefined)
    
    @scala.inline
    def setStyle(value: Style | js.Array[Style] | StyleFunction): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStyleFunction2(
      value: (/* feature */ Feature | typingsSlinky.openlayers.mod.render.Feature, /* resolution */ Double) => Style | js.Array[Style] | Null
    ): Self = StObject.set(x, "style", js.Any.fromFunction2(value))
    
    @scala.inline
    def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
    
    @scala.inline
    def setStyleVarargs(value: Style*): Self = StObject.set(x, "style", js.Array(value :_*))
    
    @scala.inline
    def setType(value: GeometryType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWrapX(value: Boolean): Self = StObject.set(x, "wrapX", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWrapXUndefined: Self = StObject.set(x, "wrapX", js.undefined)
  }
}
