package typingsSlinky.ol.utfgridMod

import typingsSlinky.ol.coordinateMod.Coordinate
import typingsSlinky.ol.tileJSONMod.Config
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UTFGrid
  extends typingsSlinky.ol.sourceTileMod.default {
  
  def forDataAtCoordinateAndResolution(coordinate: Coordinate, resolution: Double, callback: js.Function1[/* p0 */ js.Any, Unit]): Unit = js.native
  def forDataAtCoordinateAndResolution(
    coordinate: Coordinate,
    resolution: Double,
    callback: js.Function1[/* p0 */ js.Any, Unit],
    opt_request: Boolean
  ): Unit = js.native
  
  def getTemplate(): String = js.native
  
  /* protected */ def handleTileJSONError(): Unit = js.native
  
  /* protected */ def handleTileJSONResponse(tileJSON: Config): Unit = js.native
}
