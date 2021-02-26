package typingsSlinky.arcgisJsApi.esri

import typingsSlinky.std.Object
import typingsSlinky.std.PropertyKey
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait VertexAttributes extends Object {
  
  /**
    * The normal buffer.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-support-meshUtils.html#VertexAttributes)
    */
  var normal: js.UndefOr[js.typedarray.Float32Array] = js.native
  
  /**
    * The position buffer.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-support-meshUtils.html#VertexAttributes)
    */
  var position: js.typedarray.Float64Array = js.native
  
  /**
    * The tangent buffer.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-support-meshUtils.html#VertexAttributes)
    */
  var tangent: js.UndefOr[js.typedarray.Float32Array] = js.native
}
object VertexAttributes {
  
  @scala.inline
  def apply(
    constructor: js.Function,
    hasOwnProperty: PropertyKey => Boolean,
    position: js.typedarray.Float64Array,
    propertyIsEnumerable: PropertyKey => Boolean
  ): VertexAttributes = {
    val __obj = js.Dynamic.literal(constructor = constructor.asInstanceOf[js.Any], hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), position = position.asInstanceOf[js.Any], propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable))
    __obj.asInstanceOf[VertexAttributes]
  }
  
  @scala.inline
  implicit class VertexAttributesMutableBuilder[Self <: VertexAttributes] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNormal(value: js.typedarray.Float32Array): Self = StObject.set(x, "normal", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNormalUndefined: Self = StObject.set(x, "normal", js.undefined)
    
    @scala.inline
    def setPosition(value: js.typedarray.Float64Array): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTangent(value: js.typedarray.Float32Array): Self = StObject.set(x, "tangent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTangentUndefined: Self = StObject.set(x, "tangent", js.undefined)
  }
}
