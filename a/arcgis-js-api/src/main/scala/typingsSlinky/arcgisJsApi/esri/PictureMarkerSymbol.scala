package typingsSlinky.arcgisJsApi.esri

import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.`picture-marker`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typingsSlinky.arcgisJsApi.esri.Symbol2D3D because Already inherited
- typingsSlinky.arcgisJsApi.esri.symbols.Symbol2D3D because Already inherited */ @js.native
trait PictureMarkerSymbol
  extends Symbol2D
     with MarkerSymbol
     with typingsSlinky.arcgisJsApi.esri.symbols.MarkerSymbol
     with typingsSlinky.arcgisJsApi.esri.symbols.Symbol2D
     with symbolsMarkerSymbol {
  
  /**
    * The height of the image in points.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-PictureMarkerSymbol.html#height)
    */
  var height: Double = js.native
  
  /**
    * The symbol type.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-PictureMarkerSymbol.html#type)
    */
  @JSName("type")
  val type_PictureMarkerSymbol: `picture-marker` = js.native
  
  /**
    * The URL to an image or SVG document.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-PictureMarkerSymbol.html#url)
    */
  var url: String = js.native
  
  /**
    * The width of the image in points.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-PictureMarkerSymbol.html#width)
    */
  var width: Double = js.native
}
