package typingsSlinky.arcgisJsApi.esri

import typingsSlinky.std.Object
import typingsSlinky.std.PropertyKey
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait HitTestResult extends Object {
  
  /**
    * An array of result objects returned from the [hitTest()](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-MapView.html#hitTest).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-MapView.html#HitTestResult)
    */
  var results: js.Array[HitTestResultResults] = js.native
}
object HitTestResult {
  
  @scala.inline
  def apply(
    constructor: js.Function,
    hasOwnProperty: PropertyKey => Boolean,
    propertyIsEnumerable: PropertyKey => Boolean,
    results: js.Array[HitTestResultResults]
  ): HitTestResult = {
    val __obj = js.Dynamic.literal(constructor = constructor.asInstanceOf[js.Any], hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable), results = results.asInstanceOf[js.Any])
    __obj.asInstanceOf[HitTestResult]
  }
  
  @scala.inline
  implicit class HitTestResultMutableBuilder[Self <: HitTestResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setResults(value: js.Array[HitTestResultResults]): Self = StObject.set(x, "results", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResultsVarargs(value: HitTestResultResults*): Self = StObject.set(x, "results", js.Array(value :_*))
  }
}
