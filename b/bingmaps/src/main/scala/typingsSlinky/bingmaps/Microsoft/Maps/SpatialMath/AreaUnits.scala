package typingsSlinky.bingmaps.Microsoft.Maps.SpatialMath

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait AreaUnits extends js.Object

@JSGlobal("Microsoft.Maps.SpatialMath.AreaUnits")
@js.native
object AreaUnits extends js.Object {
  /** Area in Acres */
  @js.native
  sealed trait Acres extends AreaUnits
  
  /** Area in Hectares */
  @js.native
  sealed trait Hectares extends AreaUnits
  
  /** Area in square Feet */
  @js.native
  sealed trait SquareFeet extends AreaUnits
  
  /** Area in square kilometers */
  @js.native
  sealed trait SquareKilometers extends AreaUnits
  
  /** Area in square meters */
  @js.native
  sealed trait SquareMeters extends AreaUnits
  
  /** Area in square miles */
  @js.native
  sealed trait SquareMiles extends AreaUnits
  
  /** Area in square Yards */
  @js.native
  sealed trait SquareYards extends AreaUnits
  
  /* 5 */ val Acres: typingsSlinky.bingmaps.Microsoft.Maps.SpatialMath.AreaUnits.Acres with Double = js.native
  /* 6 */ val Hectares: typingsSlinky.bingmaps.Microsoft.Maps.SpatialMath.AreaUnits.Hectares with Double = js.native
  /* 3 */ val SquareFeet: typingsSlinky.bingmaps.Microsoft.Maps.SpatialMath.AreaUnits.SquareFeet with Double = js.native
  /* 1 */ val SquareKilometers: typingsSlinky.bingmaps.Microsoft.Maps.SpatialMath.AreaUnits.SquareKilometers with Double = js.native
  /* 0 */ val SquareMeters: typingsSlinky.bingmaps.Microsoft.Maps.SpatialMath.AreaUnits.SquareMeters with Double = js.native
  /* 2 */ val SquareMiles: typingsSlinky.bingmaps.Microsoft.Maps.SpatialMath.AreaUnits.SquareMiles with Double = js.native
  /* 4 */ val SquareYards: typingsSlinky.bingmaps.Microsoft.Maps.SpatialMath.AreaUnits.SquareYards with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[AreaUnits with Double] = js.native
}

