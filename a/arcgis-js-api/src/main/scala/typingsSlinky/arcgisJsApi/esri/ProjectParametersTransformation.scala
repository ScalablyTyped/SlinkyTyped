package typingsSlinky.arcgisJsApi.esri

import typingsSlinky.std.Object
import typingsSlinky.std.PropertyKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ProjectParametersTransformation extends Object {
  
  /**
    * The well-known ID of the datum transformation to apply to the projection.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-ProjectParameters.html#transformation)
    */
  var wkid: js.UndefOr[Double] = js.native
  
  /**
    * The well-known text that defines a spatial reference.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-ProjectParameters.html#transformation)
    */
  var wkt: js.UndefOr[String] = js.native
}
object ProjectParametersTransformation {
  
  @scala.inline
  def apply(
    constructor: js.Function,
    hasOwnProperty: PropertyKey => Boolean,
    propertyIsEnumerable: PropertyKey => Boolean
  ): ProjectParametersTransformation = {
    val __obj = js.Dynamic.literal(constructor = constructor.asInstanceOf[js.Any], hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable))
    __obj.asInstanceOf[ProjectParametersTransformation]
  }
  
  @scala.inline
  implicit class ProjectParametersTransformationOps[Self <: ProjectParametersTransformation] (val x: Self) extends AnyVal {
    
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
    def setWkid(value: Double): Self = this.set("wkid", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWkid: Self = this.set("wkid", js.undefined)
    
    @scala.inline
    def setWkt(value: String): Self = this.set("wkt", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWkt: Self = this.set("wkt", js.undefined)
  }
}
