package typingsSlinky.arcgisJsApi.esri

import typingsSlinky.std.Object
import typingsSlinky.std.PropertyKey
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait StreamLayerElevationInfoFeatureExpressionInfo extends Object {
  
  /**
    * An [Arcade expression](https://developers.arcgis.com/javascript/latest/guide/arcade/index.html) evaluating to a number that determines the z-value of the feature.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-StreamLayer.html#elevationInfo)
    */
  var expression: js.UndefOr[String] = js.native
}
object StreamLayerElevationInfoFeatureExpressionInfo {
  
  @scala.inline
  def apply(
    constructor: js.Function,
    hasOwnProperty: PropertyKey => Boolean,
    propertyIsEnumerable: PropertyKey => Boolean
  ): StreamLayerElevationInfoFeatureExpressionInfo = {
    val __obj = js.Dynamic.literal(constructor = constructor.asInstanceOf[js.Any], hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable))
    __obj.asInstanceOf[StreamLayerElevationInfoFeatureExpressionInfo]
  }
  
  @scala.inline
  implicit class StreamLayerElevationInfoFeatureExpressionInfoMutableBuilder[Self <: StreamLayerElevationInfoFeatureExpressionInfo] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setExpression(value: String): Self = StObject.set(x, "expression", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExpressionUndefined: Self = StObject.set(x, "expression", js.undefined)
  }
}
