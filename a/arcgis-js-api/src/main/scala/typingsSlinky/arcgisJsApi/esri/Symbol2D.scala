package typingsSlinky.arcgisJsApi.esri

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.arcgisJsApi.esri.PictureFillSymbol
  - typingsSlinky.arcgisJsApi.esri.PictureMarkerSymbol
  - typingsSlinky.arcgisJsApi.esri.SimpleFillSymbol
  - typingsSlinky.arcgisJsApi.esri.SimpleLineSymbol
  - typingsSlinky.arcgisJsApi.esri.SimpleMarkerSymbol
  - typingsSlinky.arcgisJsApi.esri.TextSymbol
*/
trait Symbol2D
  extends typingsSlinky.arcgisJsApi.esri.symbols.Symbol
     with typingsSlinky.arcgisJsApi.esri.symbols.Symbol2D3D
     with Symbol2D3D
     with symbolsSymbol

object Symbol2D {
  @scala.inline
  implicit def apply(value: PictureFillSymbol): Symbol2D = value.asInstanceOf[Symbol2D]
  @scala.inline
  implicit def apply(value: PictureMarkerSymbol): Symbol2D = value.asInstanceOf[Symbol2D]
  @scala.inline
  implicit def apply(value: SimpleFillSymbol): Symbol2D = value.asInstanceOf[Symbol2D]
  @scala.inline
  implicit def apply(value: SimpleLineSymbol): Symbol2D = value.asInstanceOf[Symbol2D]
  @scala.inline
  implicit def apply(value: SimpleMarkerSymbol): Symbol2D = value.asInstanceOf[Symbol2D]
  @scala.inline
  implicit def apply(value: TextSymbol): Symbol2D = value.asInstanceOf[Symbol2D]
}

