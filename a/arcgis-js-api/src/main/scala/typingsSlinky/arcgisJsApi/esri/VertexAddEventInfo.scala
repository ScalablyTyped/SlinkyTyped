package typingsSlinky.arcgisJsApi.esri

import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.`vertex-add`
import typingsSlinky.std.Object
import typingsSlinky.std.PropertyKey
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait VertexAddEventInfo
  extends Object
     with CreateToolEventInfo
     with UpdateToolEventInfo {
  
  /**
    * An array of [graphics](https://developers.arcgis.com/javascript/latest/api-reference/esri-Graphic.html) with [point](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-Point.html) geometries representing the vertices that were added.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Sketch.html#VertexAddEventInfo)
    */
  var added: js.Array[Graphic] = js.native
  
  /**
    * Type is always `vertex-add`.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Sketch.html#VertexAddEventInfo)
    */
  var `type`: `vertex-add` = js.native
  
  /**
    * Contains the details of the added vertices to track changes in topology of the geometry.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Sketch.html#VertexAddEventInfo)
    */
  var vertices: js.Array[VertexAddEventInfoVertices] = js.native
}
object VertexAddEventInfo {
  
  @scala.inline
  def apply(
    added: js.Array[Graphic],
    constructor: js.Function,
    hasOwnProperty: PropertyKey => Boolean,
    propertyIsEnumerable: PropertyKey => Boolean,
    `type`: `vertex-add`,
    vertices: js.Array[VertexAddEventInfoVertices]
  ): VertexAddEventInfo = {
    val __obj = js.Dynamic.literal(added = added.asInstanceOf[js.Any], constructor = constructor.asInstanceOf[js.Any], hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable), vertices = vertices.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[VertexAddEventInfo]
  }
  
  @scala.inline
  implicit class VertexAddEventInfoMutableBuilder[Self <: VertexAddEventInfo] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAdded(value: js.Array[Graphic]): Self = StObject.set(x, "added", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAddedVarargs(value: Graphic*): Self = StObject.set(x, "added", js.Array(value :_*))
    
    @scala.inline
    def setType(value: `vertex-add`): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVertices(value: js.Array[VertexAddEventInfoVertices]): Self = StObject.set(x, "vertices", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVerticesVarargs(value: VertexAddEventInfoVertices*): Self = StObject.set(x, "vertices", js.Array(value :_*))
  }
}
