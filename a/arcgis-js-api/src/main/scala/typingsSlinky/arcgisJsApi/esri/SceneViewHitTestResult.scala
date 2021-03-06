package typingsSlinky.arcgisJsApi.esri

import org.scalajs.dom.raw.MouseEvent
import typingsSlinky.std.Object
import typingsSlinky.std.PropertyKey
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SceneViewHitTestResult extends Object {
  
  /**
    * Ground intersection result.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-SceneView.html#HitTestResult)
    */
  var ground: HitTestResultGround = js.native
  
  /**
    * An array of result objects returned from the [hitTest()](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-SceneView.html#hitTest).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-SceneView.html#HitTestResult)
    */
  var results: js.Array[SceneViewHitTestResultResults] = js.native
  
  /**
    * The screen coordinates (or native mouse event) of the click on the view.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-SceneView.html#HitTestResult)
    */
  var screenPoint: SceneViewScreenPoint | MouseEvent = js.native
}
object SceneViewHitTestResult {
  
  @scala.inline
  def apply(
    constructor: js.Function,
    ground: HitTestResultGround,
    hasOwnProperty: PropertyKey => Boolean,
    propertyIsEnumerable: PropertyKey => Boolean,
    results: js.Array[SceneViewHitTestResultResults],
    screenPoint: SceneViewScreenPoint | MouseEvent
  ): SceneViewHitTestResult = {
    val __obj = js.Dynamic.literal(constructor = constructor.asInstanceOf[js.Any], ground = ground.asInstanceOf[js.Any], hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable), results = results.asInstanceOf[js.Any], screenPoint = screenPoint.asInstanceOf[js.Any])
    __obj.asInstanceOf[SceneViewHitTestResult]
  }
  
  @scala.inline
  implicit class SceneViewHitTestResultMutableBuilder[Self <: SceneViewHitTestResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGround(value: HitTestResultGround): Self = StObject.set(x, "ground", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResults(value: js.Array[SceneViewHitTestResultResults]): Self = StObject.set(x, "results", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResultsVarargs(value: SceneViewHitTestResultResults*): Self = StObject.set(x, "results", js.Array(value :_*))
    
    @scala.inline
    def setScreenPoint(value: SceneViewScreenPoint | MouseEvent): Self = StObject.set(x, "screenPoint", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScreenPointMouseEvent(value: MouseEvent): Self = StObject.set(x, "screenPoint", value.asInstanceOf[js.Any])
  }
}
