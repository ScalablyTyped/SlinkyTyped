package typingsSlinky.ol.utfgridMod

import typingsSlinky.ol.coordinateMod.Coordinate
import typingsSlinky.ol.tileJSONMod.Config
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UTFGrid
  extends typingsSlinky.ol.sourceTileMod.default {
  
  /**
    * Calls the callback (synchronously by default) with the available data
    * for given coordinate and resolution (or null if not yet loaded or
    * in case of an error).
    */
  def forDataAtCoordinateAndResolution(coordinate: Coordinate, resolution: Double, callback: js.Function1[/* p0 */ js.Any, Unit]): Unit = js.native
  def forDataAtCoordinateAndResolution(
    coordinate: Coordinate,
    resolution: Double,
    callback: js.Function1[/* p0 */ js.Any, Unit],
    opt_request: Boolean
  ): Unit = js.native
  
  /**
    * Return the template from TileJSON.
    */
  def getTemplate(): js.UndefOr[String] = js.native
  
  /* protected */ def handleTileJSONError(): Unit = js.native
  
  /**
    * TODO: very similar to ol/source/TileJSON#handleTileJSONResponse
    */
  /* protected */ def handleTileJSONResponse(tileJSON: Config): Unit = js.native
  
  /**
    * Marks a tile coord as being used, without triggering a load.
    */
  def useTile(z: Double, x: Double, y: Double): Unit = js.native
}
