package typingsSlinky.arcgisJsApi.esri

import typingsSlinky.std.Object
import typingsSlinky.std.PropertyKey
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SceneViewToMapOptions extends Object {
  
  /**
    * A list of layers and graphics to include for intersection testing.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-SceneView.html#toMap)
    */
  var exclude: js.UndefOr[
    (js.Array[IntersectItem | Collection[IntersectItem] | js.Array[IntersectItem] | Ground]) | Collection[IntersectItem] | IntersectItem
  ] = js.native
  
  /**
    * A list of layers and graphics to include for intersection testing.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-SceneView.html#toMap)
    */
  var include: js.UndefOr[
    (js.Array[IntersectItem | Collection[IntersectItem] | js.Array[IntersectItem] | Ground]) | Collection[IntersectItem] | IntersectItem
  ] = js.native
}
object SceneViewToMapOptions {
  
  @scala.inline
  def apply(
    constructor: js.Function,
    hasOwnProperty: PropertyKey => Boolean,
    propertyIsEnumerable: PropertyKey => Boolean
  ): SceneViewToMapOptions = {
    val __obj = js.Dynamic.literal(constructor = constructor.asInstanceOf[js.Any], hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable))
    __obj.asInstanceOf[SceneViewToMapOptions]
  }
  
  @scala.inline
  implicit class SceneViewToMapOptionsMutableBuilder[Self <: SceneViewToMapOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setExclude(
      value: (js.Array[IntersectItem | Collection[IntersectItem] | js.Array[IntersectItem] | Ground]) | Collection[IntersectItem] | IntersectItem
    ): Self = StObject.set(x, "exclude", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExcludeUndefined: Self = StObject.set(x, "exclude", js.undefined)
    
    @scala.inline
    def setExcludeVarargs(value: (IntersectItem | Collection[IntersectItem] | js.Array[IntersectItem] | Ground)*): Self = StObject.set(x, "exclude", js.Array(value :_*))
    
    @scala.inline
    def setInclude(
      value: (js.Array[IntersectItem | Collection[IntersectItem] | js.Array[IntersectItem] | Ground]) | Collection[IntersectItem] | IntersectItem
    ): Self = StObject.set(x, "include", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIncludeUndefined: Self = StObject.set(x, "include", js.undefined)
    
    @scala.inline
    def setIncludeVarargs(value: (IntersectItem | Collection[IntersectItem] | js.Array[IntersectItem] | Ground)*): Self = StObject.set(x, "include", js.Array(value :_*))
  }
}
