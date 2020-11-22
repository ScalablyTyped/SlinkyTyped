package typingsSlinky.arcgisJsApi.esri

import org.scalajs.dom.experimental.AbortSignal
import typingsSlinky.std.Object
import typingsSlinky.std.PropertyKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RasterIdentifyOptions extends Object {
  
  /**
    * A dimensional definition that will be used for the `identify` operation.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-ImageryTileLayer.html#RasterIdentifyOptions)
    */
  var multidimensionalDefinition: js.UndefOr[js.Array[DimensionalDefinition]] = js.native
  
  /**
    * [AbortSignal](https://developer.mozilla.org/en-US/docs/Web/API/AbortSignal) allows for cancelable requests.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-ImageryTileLayer.html#RasterIdentifyOptions)
    */
  var signal: js.UndefOr[AbortSignal] = js.native
}
object RasterIdentifyOptions {
  
  @scala.inline
  def apply(
    constructor: js.Function,
    hasOwnProperty: PropertyKey => Boolean,
    propertyIsEnumerable: PropertyKey => Boolean
  ): RasterIdentifyOptions = {
    val __obj = js.Dynamic.literal(constructor = constructor.asInstanceOf[js.Any], hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable))
    __obj.asInstanceOf[RasterIdentifyOptions]
  }
  
  @scala.inline
  implicit class RasterIdentifyOptionsOps[Self <: RasterIdentifyOptions] (val x: Self) extends AnyVal {
    
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
    def setMultidimensionalDefinitionVarargs(value: DimensionalDefinition*): Self = this.set("multidimensionalDefinition", js.Array(value :_*))
    
    @scala.inline
    def setMultidimensionalDefinition(value: js.Array[DimensionalDefinition]): Self = this.set("multidimensionalDefinition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMultidimensionalDefinition: Self = this.set("multidimensionalDefinition", js.undefined)
    
    @scala.inline
    def setSignal(value: AbortSignal): Self = this.set("signal", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSignal: Self = this.set("signal", js.undefined)
  }
}
