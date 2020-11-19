package typingsSlinky.bingmaps.Microsoft.Maps

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait DataBinType extends js.Object
@JSGlobal("Microsoft.Maps.DataBinType")
@js.native
object DataBinType extends js.Object {
  
  /* Renders data bins as circles in a square grid. */
  @js.native
  sealed trait circle extends DataBinType
  
  /* Renders data bins as circles in a hexagonal grid. */
  @js.native
  sealed trait hexCircle extends DataBinType
  
  /* Renders data bins as hexagons with a flat top edge. */
  @js.native
  sealed trait hexagon extends DataBinType
  
  /* Renders data bins as hexagons with a pointy top corner. */
  @js.native
  sealed trait pointyHexagon extends DataBinType
  
  /* Renders data bins as a square grid. */
  @js.native
  sealed trait square extends DataBinType
}
