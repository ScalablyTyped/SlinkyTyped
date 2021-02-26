package typingsSlinky.arcgisJsApi

import org.scalablytyped.runtime.Shortcut
import typingsSlinky.arcgisJsApi.esri.ImageryTileLayer
import typingsSlinky.arcgisJsApi.esri.ImageryTileLayerConstructor
import typingsSlinky.arcgisJsApi.esri.ImageryTileLayerProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object imageryTileLayerMod extends Shortcut {
  
  @JSImport("esri/layers/ImageryTileLayer", JSImport.Namespace)
  @js.native
  val ^ : ImageryTileLayerConstructor = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("esri/layers/ImageryTileLayer", JSImport.Namespace)
  @js.native
  /**
    * ImageryTileLayer presents raster data from a tiled image service.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-ImageryTileLayer.html)
    */
  class Class () extends ImageryTileLayer {
    def this(properties: ImageryTileLayerProperties) = this()
  }
  
  type _To = ImageryTileLayerConstructor
  
  /* This means you don't have to write `^`, but can instead just say `imageryTileLayerMod.foo` */
  override def _to: ImageryTileLayerConstructor = ^
}
