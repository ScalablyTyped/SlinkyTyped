package typingsSlinky.arcgisJsApi.esri

import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.`wire-frame`
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.`x-ray`
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.solid
import typingsSlinky.std.Object
import typingsSlinky.std.PropertyKey
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BuildingFilterBlockFilterMode extends Object {
  
  /**
    * Defines the type of edges used to display a [BuildingSceneLayer](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-BuildingSceneLayer.html) filtered in `wire-frame` mode.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-BuildingFilter.html#BuildingFilterBlock)
    */
  var edges: js.UndefOr[SolidEdges3D | SketchEdges3D] = js.native
  
  /**
    * Defines how features are drawn while the filter is active.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-BuildingFilter.html#BuildingFilterBlock)
    */
  var `type`: js.UndefOr[solid | `wire-frame` | `x-ray`] = js.native
}
object BuildingFilterBlockFilterMode {
  
  @scala.inline
  def apply(
    constructor: js.Function,
    hasOwnProperty: PropertyKey => Boolean,
    propertyIsEnumerable: PropertyKey => Boolean
  ): BuildingFilterBlockFilterMode = {
    val __obj = js.Dynamic.literal(constructor = constructor.asInstanceOf[js.Any], hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable))
    __obj.asInstanceOf[BuildingFilterBlockFilterMode]
  }
  
  @scala.inline
  implicit class BuildingFilterBlockFilterModeMutableBuilder[Self <: BuildingFilterBlockFilterMode] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEdges(value: SolidEdges3D | SketchEdges3D): Self = StObject.set(x, "edges", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEdgesUndefined: Self = StObject.set(x, "edges", js.undefined)
    
    @scala.inline
    def setType(value: solid | `wire-frame` | `x-ray`): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
