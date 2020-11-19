package typingsSlinky.arcgisJsApi.esri

import typingsSlinky.std.Object
import typingsSlinky.std.PropertyKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait NearestPointResult extends Object {
  
  /**
    * A vertex within the specified distance of the search.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-geometryEngine.html#NearestPointResult)
    */
  var coordinate: Point = js.native
  
  /**
    * The distance from the `inputPoint` in the units of the view's spatial reference.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-geometryEngine.html#NearestPointResult)
    */
  var distance: Double = js.native
  
  /**
    * Indicates if it is an empty geometry.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-geometryEngine.html#NearestPointResult)
    */
  var isEmpty: Boolean = js.native
  
  /**
    * The index of the vertex within the geometry's rings or paths.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-geometryEngine.html#NearestPointResult)
    */
  var vertexIndex: Double = js.native
}
object NearestPointResult {
  
  @scala.inline
  def apply(
    constructor: js.Function,
    coordinate: Point,
    distance: Double,
    hasOwnProperty: PropertyKey => Boolean,
    isEmpty: Boolean,
    propertyIsEnumerable: PropertyKey => Boolean,
    vertexIndex: Double
  ): NearestPointResult = {
    val __obj = js.Dynamic.literal(constructor = constructor.asInstanceOf[js.Any], coordinate = coordinate.asInstanceOf[js.Any], distance = distance.asInstanceOf[js.Any], hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), isEmpty = isEmpty.asInstanceOf[js.Any], propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable), vertexIndex = vertexIndex.asInstanceOf[js.Any])
    __obj.asInstanceOf[NearestPointResult]
  }
  
  @scala.inline
  implicit class NearestPointResultOps[Self <: NearestPointResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setCoordinate(value: Point): Self = this.set("coordinate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDistance(value: Double): Self = this.set("distance", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsEmpty(value: Boolean): Self = this.set("isEmpty", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVertexIndex(value: Double): Self = this.set("vertexIndex", value.asInstanceOf[js.Any])
  }
}
