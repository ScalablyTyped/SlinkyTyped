package typingsSlinky.arcgisDashJsDashApi.__esri

import org.scalablytyped.runtime.TopLevel
import typingsSlinky.arcgisDashJsDashApi.arcgisDashJsDashApiStrings.`polygon-3d`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PolygonSymbol3D
  extends Symbol3D
     with typingsSlinky.arcgisDashJsDashApi.__esri.symbols.Symbol2D3D
     with Symbol2D3D
     with typingsSlinky.arcgisDashJsDashApi.__esri.symbols.Symbol3D
     with symbolsSymbol3D {
  /**
    * The symbol type.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-PolygonSymbol3D.html#type)
    */
  @JSName("type")
  val type_PolygonSymbol3D: `polygon-3d` = js.native
}

@JSGlobal("__esri.PolygonSymbol3D")
@js.native
object PolygonSymbol3D extends TopLevel[PolygonSymbol3DConstructor]

