package typingsSlinky.arcgisJsApi.esri

import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.loading
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.ready
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BasemapGalleryItem extends Accessor {
  
  /**
    * The item's associated basemap.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-BasemapGallery-support-BasemapGalleryItem.html#basemap)
    */
  var basemap: Basemap = js.native
  
  /**
    * The Error object returned if an error occurred.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-BasemapGallery-support-BasemapGalleryItem.html#error)
    */
  val error: Error = js.native
  
  /**
    * The item's state.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-BasemapGallery-support-BasemapGalleryItem.html#state)
    *
    * @default loading
    */
  val state: loading | ready | typingsSlinky.arcgisJsApi.arcgisJsApiStrings.error = js.native
  
  /**
    * The view associated with this item.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-BasemapGallery-support-BasemapGalleryItem.html#view)
    */
  var view: MapView | SceneView = js.native
}
