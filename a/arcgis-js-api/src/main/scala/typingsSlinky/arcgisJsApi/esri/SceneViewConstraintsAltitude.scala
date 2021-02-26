package typingsSlinky.arcgisJsApi.esri

import typingsSlinky.arcgisJsApi.HashMap
import typingsSlinky.std.PropertyKey
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SceneViewConstraintsAltitude extends AnonymousAccessor {
  
  /**
    * The maximum allowed camera altitude (in meters).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-SceneView.html#constraints)
    */
  var max: js.UndefOr[Double] = js.native
  
  /**
    * The minimum allowed camera altitude (in meters).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-SceneView.html#constraints)
    */
  var min: js.UndefOr[Double] = js.native
}
object SceneViewConstraintsAltitude {
  
  @scala.inline
  def apply(
    constructor: js.Function,
    hasOwnProperty: PropertyKey => Boolean,
    propertyIsEnumerable: PropertyKey => Boolean,
    set: (js.UndefOr[
      js.Function2[/* propertyName */ String, /* value */ js.Any, SceneViewConstraintsAltitude]
    ]) with (js.UndefOr[js.Function1[/* props */ HashMap[_], SceneViewConstraintsAltitude]])
  ): SceneViewConstraintsAltitude = {
    val __obj = js.Dynamic.literal(constructor = constructor.asInstanceOf[js.Any], hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable), set = set.asInstanceOf[js.Any])
    __obj.asInstanceOf[SceneViewConstraintsAltitude]
  }
  
  @scala.inline
  implicit class SceneViewConstraintsAltitudeMutableBuilder[Self <: SceneViewConstraintsAltitude] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMax(value: Double): Self = StObject.set(x, "max", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxUndefined: Self = StObject.set(x, "max", js.undefined)
    
    @scala.inline
    def setMin(value: Double): Self = StObject.set(x, "min", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinUndefined: Self = StObject.set(x, "min", js.undefined)
  }
}
