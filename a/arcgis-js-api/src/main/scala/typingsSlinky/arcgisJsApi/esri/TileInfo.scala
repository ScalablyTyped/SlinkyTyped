package typingsSlinky.arcgisJsApi.esri

import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.dib
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.emf
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.gif
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.jpg
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.lerc
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.mixed
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.pdf
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.png
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.png24
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.png32
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.ps
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.svg
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.svgz
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.tiff
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TileInfo
  extends Accessor
     with JSONSupport {
  
  /**
    * The dots per inch (DPI) of the tiling scheme.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-TileInfo.html#dpi)
    */
  var dpi: Double = js.native
  
  /**
    * Image format of the cached tiles.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-TileInfo.html#format)
    */
  var format: png | png24 | png32 | jpg | dib | tiff | emf | ps | pdf | gif | svg | svgz | mixed | lerc = js.native
  
  /**
    * Indicates if the tiling scheme supports wrap around.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-TileInfo.html#isWrappable)
    */
  var isWrappable: Boolean = js.native
  
  /**
    * An array of levels of detail that define the tiling scheme.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-TileInfo.html#lods)
    */
  var lods: js.Array[LOD] = js.native
  
  /**
    * The tiling scheme origin.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-TileInfo.html#origin)
    */
  var origin: Point = js.native
  
  /**
    * Utility method used to convert a scale value to its corresponding zoom value.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-TileInfo.html#scaleToZoom)
    *
    * @param scale The scale value to convert.
    *
    */
  def scaleToZoom(scale: Double): Double = js.native
  
  /**
    * Size of tiles in pixels.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-TileInfo.html#size)
    */
  var size: js.Array[Double] = js.native
  
  /**
    * The spatial reference of the tiling schema.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-TileInfo.html#spatialReference)
    */
  var spatialReference: SpatialReference = js.native
  
  /**
    * Utility method used to convert a zoom value to its corresponding scale value.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-TileInfo.html#zoomToScale)
    *
    * @param zoom The zoom value to convert.
    *
    */
  def zoomToScale(zoom: Double): Double = js.native
}
