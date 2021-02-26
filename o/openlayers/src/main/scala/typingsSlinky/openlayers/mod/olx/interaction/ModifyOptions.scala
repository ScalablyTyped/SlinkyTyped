package typingsSlinky.openlayers.mod.olx.interaction

import typingsSlinky.openlayers.mod.Collection
import typingsSlinky.openlayers.mod.EventsConditionType
import typingsSlinky.openlayers.mod.Feature
import typingsSlinky.openlayers.mod.MapBrowserEvent
import typingsSlinky.openlayers.mod.StyleFunction
import typingsSlinky.openlayers.mod.source.Vector
import typingsSlinky.openlayers.mod.style.Style
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ModifyOptions extends StObject {
  
  var condition: js.UndefOr[EventsConditionType] = js.native
  
  var deleteCondition: js.UndefOr[EventsConditionType] = js.native
  
  var features: js.UndefOr[Collection[Feature]] = js.native
  
  var insertVertexCondition: js.UndefOr[EventsConditionType] = js.native
  
  var pixelTolerance: js.UndefOr[Double] = js.native
  
  var source: js.UndefOr[Vector] = js.native
  
  var style: js.UndefOr[Style | js.Array[Style] | StyleFunction] = js.native
  
  var wrapX: js.UndefOr[Boolean] = js.native
}
object ModifyOptions {
  
  @scala.inline
  def apply(): ModifyOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ModifyOptions]
  }
  
  @scala.inline
  implicit class ModifyOptionsMutableBuilder[Self <: ModifyOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCondition(value: /* event */ MapBrowserEvent => Boolean): Self = StObject.set(x, "condition", js.Any.fromFunction1(value))
    
    @scala.inline
    def setConditionUndefined: Self = StObject.set(x, "condition", js.undefined)
    
    @scala.inline
    def setDeleteCondition(value: /* event */ MapBrowserEvent => Boolean): Self = StObject.set(x, "deleteCondition", js.Any.fromFunction1(value))
    
    @scala.inline
    def setDeleteConditionUndefined: Self = StObject.set(x, "deleteCondition", js.undefined)
    
    @scala.inline
    def setFeatures(value: Collection[Feature]): Self = StObject.set(x, "features", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFeaturesUndefined: Self = StObject.set(x, "features", js.undefined)
    
    @scala.inline
    def setInsertVertexCondition(value: /* event */ MapBrowserEvent => Boolean): Self = StObject.set(x, "insertVertexCondition", js.Any.fromFunction1(value))
    
    @scala.inline
    def setInsertVertexConditionUndefined: Self = StObject.set(x, "insertVertexCondition", js.undefined)
    
    @scala.inline
    def setPixelTolerance(value: Double): Self = StObject.set(x, "pixelTolerance", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPixelToleranceUndefined: Self = StObject.set(x, "pixelTolerance", js.undefined)
    
    @scala.inline
    def setSource(value: Vector): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSourceUndefined: Self = StObject.set(x, "source", js.undefined)
    
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
    def setWrapX(value: Boolean): Self = StObject.set(x, "wrapX", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWrapXUndefined: Self = StObject.set(x, "wrapX", js.undefined)
  }
}
