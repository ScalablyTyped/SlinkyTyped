package typingsSlinky.arcgisJsApi.esri

import org.scalajs.dom.experimental.AbortSignal
import typingsSlinky.std.Object
import typingsSlinky.std.PropertyKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BaseTileLayerFetchTileOptions extends Object {
  
  /**
    * An [AbortSignal](https://developer.mozilla.org/en-US/docs/Web/API/AbortSignal) to abort the request. When overriding fetchTile, `signal` should be handled, for example by passing it on to [request](https://developers.arcgis.com/javascript/latest/api-reference/esri-request.html) or by aborting pending operations. An aborted call to fetchTile should reject its returned promise with an instance of [Error](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-Error.html).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-BaseTileLayer.html#fetchTile)
    */
  var signal: js.UndefOr[AbortSignal] = js.native
  
  /**
    * Number to append to the tile request to prevent fetching the tile from the browser cache.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-BaseTileLayer.html#fetchTile)
    */
  var timestamp: js.UndefOr[Boolean] = js.native
}
object BaseTileLayerFetchTileOptions {
  
  @scala.inline
  def apply(
    constructor: js.Function,
    hasOwnProperty: PropertyKey => Boolean,
    propertyIsEnumerable: PropertyKey => Boolean
  ): BaseTileLayerFetchTileOptions = {
    val __obj = js.Dynamic.literal(constructor = constructor.asInstanceOf[js.Any], hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable))
    __obj.asInstanceOf[BaseTileLayerFetchTileOptions]
  }
  
  @scala.inline
  implicit class BaseTileLayerFetchTileOptionsOps[Self <: BaseTileLayerFetchTileOptions] (val x: Self) extends AnyVal {
    
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
    def setSignal(value: AbortSignal): Self = this.set("signal", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSignal: Self = this.set("signal", js.undefined)
    
    @scala.inline
    def setTimestamp(value: Boolean): Self = this.set("timestamp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTimestamp: Self = this.set("timestamp", js.undefined)
  }
}
