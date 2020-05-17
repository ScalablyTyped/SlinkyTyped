package typingsSlinky.arcgisJsApi.esri

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.arcgisJsApi.esri.Symbol2D
  - typingsSlinky.arcgisJsApi.esri.symbolsSymbol3D
  - typingsSlinky.arcgisJsApi.esri.WebStyleSymbol
*/
trait symbolsSymbol extends js.Object

object symbolsSymbol {
  @scala.inline
  implicit def apply(value: Symbol2D): symbolsSymbol = value.asInstanceOf[symbolsSymbol]
  @scala.inline
  implicit def apply(value: WebStyleSymbol): symbolsSymbol = value.asInstanceOf[symbolsSymbol]
  @scala.inline
  implicit def apply(value: symbolsSymbol3D): symbolsSymbol = value.asInstanceOf[symbolsSymbol]
}

