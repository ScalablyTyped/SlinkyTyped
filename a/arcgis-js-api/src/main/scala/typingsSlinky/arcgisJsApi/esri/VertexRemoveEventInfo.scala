package typingsSlinky.arcgisJsApi.esri

import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.`vertex-remove`
import typingsSlinky.std.Object
import typingsSlinky.std.PropertyKey
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait VertexRemoveEventInfo
  extends Object
     with UpdateToolEventInfo {
  
  /**
    * An array of [graphics](https://developers.arcgis.com/javascript/latest/api-reference/esri-Graphic.html) with [point](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-Point.html) geometries representing the vertices that were removed.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Sketch.html#VertexRemoveEventInfo)
    */
  var removed: js.Array[Graphic] = js.native
  
  /**
    * Type is always `vertex-remove`.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Sketch.html#VertexRemoveEventInfo)
    */
  var `type`: `vertex-remove` = js.native
  
  /**
    * Contains the details of the removed vertices to track changes in topology of the geometry.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Sketch.html#VertexRemoveEventInfo)
    */
  var vertices: js.Array[VertexRemoveEventInfoVertices] = js.native
}
object VertexRemoveEventInfo {
  
  @scala.inline
  def apply(
    constructor: js.Function,
    hasOwnProperty: PropertyKey => Boolean,
    propertyIsEnumerable: PropertyKey => Boolean,
    removed: js.Array[Graphic],
    `type`: `vertex-remove`,
    vertices: js.Array[VertexRemoveEventInfoVertices]
  ): VertexRemoveEventInfo = {
    val __obj = js.Dynamic.literal(constructor = constructor.asInstanceOf[js.Any], hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable), removed = removed.asInstanceOf[js.Any], vertices = vertices.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[VertexRemoveEventInfo]
  }
  
  @scala.inline
  implicit class VertexRemoveEventInfoMutableBuilder[Self <: VertexRemoveEventInfo] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setRemoved(value: js.Array[Graphic]): Self = StObject.set(x, "removed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRemovedVarargs(value: Graphic*): Self = StObject.set(x, "removed", js.Array(value :_*))
    
    @scala.inline
    def setType(value: `vertex-remove`): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVertices(value: js.Array[VertexRemoveEventInfoVertices]): Self = StObject.set(x, "vertices", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVerticesVarargs(value: VertexRemoveEventInfoVertices*): Self = StObject.set(x, "vertices", js.Array(value :_*))
  }
}
