package typingsSlinky.arcgisJsApi.esri

import typingsSlinky.arcgisJsApi.HashMap
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.auto
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.manual
import typingsSlinky.std.PropertyKey
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SceneViewConstraintsClipDistance extends AnonymousAccessor {
  
  /**
    * The far clip distance.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-SceneView.html#constraints)
    */
  var far: js.UndefOr[Double] = js.native
  
  /**
    * Specifies the mode of the constraint which is either `auto` or `manual`.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-SceneView.html#constraints)
    */
  var mode: js.UndefOr[auto | manual] = js.native
  
  /**
    * The near clip distance.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-SceneView.html#constraints)
    */
  var near: js.UndefOr[Double] = js.native
}
object SceneViewConstraintsClipDistance {
  
  @scala.inline
  def apply(
    constructor: js.Function,
    hasOwnProperty: PropertyKey => Boolean,
    propertyIsEnumerable: PropertyKey => Boolean,
    set: (js.UndefOr[
      js.Function2[/* propertyName */ String, /* value */ js.Any, SceneViewConstraintsClipDistance]
    ]) with (js.UndefOr[js.Function1[/* props */ HashMap[_], SceneViewConstraintsClipDistance]])
  ): SceneViewConstraintsClipDistance = {
    val __obj = js.Dynamic.literal(constructor = constructor.asInstanceOf[js.Any], hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable), set = set.asInstanceOf[js.Any])
    __obj.asInstanceOf[SceneViewConstraintsClipDistance]
  }
  
  @scala.inline
  implicit class SceneViewConstraintsClipDistanceMutableBuilder[Self <: SceneViewConstraintsClipDistance] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFar(value: Double): Self = StObject.set(x, "far", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFarUndefined: Self = StObject.set(x, "far", js.undefined)
    
    @scala.inline
    def setMode(value: auto | manual): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setModeUndefined: Self = StObject.set(x, "mode", js.undefined)
    
    @scala.inline
    def setNear(value: Double): Self = StObject.set(x, "near", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNearUndefined: Self = StObject.set(x, "near", js.undefined)
  }
}
