package typingsSlinky.arcgisJsApi.esri.symbols

import typingsSlinky.arcgisJsApi.esri.symbolsSymbol3D
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.arcgisJsApi.esri.Symbol2D
  - typingsSlinky.arcgisJsApi.esri.symbolsSymbol3D
  - typingsSlinky.arcgisJsApi.esri.WebStyleSymbol
*/
trait Symbol extends js.Object

object Symbol {
  @scala.inline
  implicit def apply(value: typingsSlinky.arcgisJsApi.esri.Symbol2D): Symbol = value.asInstanceOf[Symbol]
  @scala.inline
  implicit def apply(value: typingsSlinky.arcgisJsApi.esri.WebStyleSymbol): Symbol = value.asInstanceOf[Symbol]
  @scala.inline
  implicit def apply(value: symbolsSymbol3D): Symbol = value.asInstanceOf[Symbol]
}

