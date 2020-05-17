package typingsSlinky.arcgisJsApi.esri

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.arcgisJsApi.esri.LabelSymbol3D
  - typingsSlinky.arcgisJsApi.esri.LineSymbol3D
  - typingsSlinky.arcgisJsApi.esri.MeshSymbol3D
  - typingsSlinky.arcgisJsApi.esri.PointSymbol3D
  - typingsSlinky.arcgisJsApi.esri.PolygonSymbol3D
*/
trait symbolsSymbol3D
  extends typingsSlinky.arcgisJsApi.esri.symbols.Symbol
     with symbolsSymbol

object symbolsSymbol3D {
  @scala.inline
  implicit def apply(value: LabelSymbol3D): symbolsSymbol3D = value.asInstanceOf[symbolsSymbol3D]
  @scala.inline
  implicit def apply(value: LineSymbol3D): symbolsSymbol3D = value.asInstanceOf[symbolsSymbol3D]
  @scala.inline
  implicit def apply(value: MeshSymbol3D): symbolsSymbol3D = value.asInstanceOf[symbolsSymbol3D]
  @scala.inline
  implicit def apply(value: PointSymbol3D): symbolsSymbol3D = value.asInstanceOf[symbolsSymbol3D]
  @scala.inline
  implicit def apply(value: PolygonSymbol3D): symbolsSymbol3D = value.asInstanceOf[symbolsSymbol3D]
}

