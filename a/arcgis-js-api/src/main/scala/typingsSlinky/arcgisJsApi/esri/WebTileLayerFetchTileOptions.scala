package typingsSlinky.arcgisJsApi.esri

import org.scalajs.dom.experimental.AbortSignal
import typingsSlinky.std.Object
import typingsSlinky.std.PropertyKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait WebTileLayerFetchTileOptions extends Object {
  
  /**
    * [AbortSignal](https://developer.mozilla.org/en-US/docs/Web/API/AbortSignal) allows for cancelable requests.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-WebTileLayer.html#fetchTile)
    */
  var signal: js.UndefOr[AbortSignal] = js.native
  
  /**
    * A timestamp to append to the tile url to avoid loading a cached version of the tile.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-WebTileLayer.html#fetchTile)
    */
  var timestamp: js.UndefOr[Boolean] = js.native
}
object WebTileLayerFetchTileOptions {
  
  @scala.inline
  def apply(
    constructor: js.Function,
    hasOwnProperty: PropertyKey => Boolean,
    propertyIsEnumerable: PropertyKey => Boolean
  ): WebTileLayerFetchTileOptions = {
    val __obj = js.Dynamic.literal(constructor = constructor.asInstanceOf[js.Any], hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable))
    __obj.asInstanceOf[WebTileLayerFetchTileOptions]
  }
  
  @scala.inline
  implicit class WebTileLayerFetchTileOptionsOps[Self <: WebTileLayerFetchTileOptions] (val x: Self) extends AnyVal {
    
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
