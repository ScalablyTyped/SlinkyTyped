package typingsSlinky.arcgisJsApi.esri

import typingsSlinky.std.Object
import typingsSlinky.std.PropertyKey
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ScaleDependentStops extends Object {
  
  /**
    * The only supported expression is `view.scale`.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-visualVariables-SizeVariable.html#ScaleDependentStops)
    */
  var expression: js.UndefOr[String] = js.native
  
  /**
    * An array of objects that define the size of the icon (or alternatively the width of the polygon outline) at the given scale `value`.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-visualVariables-SizeVariable.html#ScaleDependentStops)
    */
  var stops: js.Array[SizeStop] = js.native
  
  /**
    * This value must be `outline` when scaling polygon outline widths based on the view scale.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-visualVariables-SizeVariable.html#ScaleDependentStops)
    */
  var target: js.UndefOr[String] = js.native
  
  /**
    * Value must be `size`.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-visualVariables-SizeVariable.html#ScaleDependentStops)
    */
  var `type`: String = js.native
  
  /**
    * This value must be `$view.scale`.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-visualVariables-SizeVariable.html#ScaleDependentStops)
    */
  var valueExpression: String = js.native
}
object ScaleDependentStops {
  
  @scala.inline
  def apply(
    constructor: js.Function,
    hasOwnProperty: PropertyKey => Boolean,
    propertyIsEnumerable: PropertyKey => Boolean,
    stops: js.Array[SizeStop],
    `type`: String,
    valueExpression: String
  ): ScaleDependentStops = {
    val __obj = js.Dynamic.literal(constructor = constructor.asInstanceOf[js.Any], hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable), stops = stops.asInstanceOf[js.Any], valueExpression = valueExpression.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ScaleDependentStops]
  }
  
  @scala.inline
  implicit class ScaleDependentStopsMutableBuilder[Self <: ScaleDependentStops] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setExpression(value: String): Self = StObject.set(x, "expression", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExpressionUndefined: Self = StObject.set(x, "expression", js.undefined)
    
    @scala.inline
    def setStops(value: js.Array[SizeStop]): Self = StObject.set(x, "stops", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStopsVarargs(value: SizeStop*): Self = StObject.set(x, "stops", js.Array(value :_*))
    
    @scala.inline
    def setTarget(value: String): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTargetUndefined: Self = StObject.set(x, "target", js.undefined)
    
    @scala.inline
    def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValueExpression(value: String): Self = StObject.set(x, "valueExpression", value.asInstanceOf[js.Any])
  }
}
