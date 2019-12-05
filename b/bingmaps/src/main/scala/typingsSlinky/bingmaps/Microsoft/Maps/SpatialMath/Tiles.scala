package typingsSlinky.bingmaps.Microsoft.Maps.SpatialMath

import typingsSlinky.bingmaps.Microsoft.Maps.Location
import typingsSlinky.bingmaps.Microsoft.Maps.LocationRect
import typingsSlinky.bingmaps.Microsoft.Maps.Point
import typingsSlinky.bingmaps.Microsoft.Maps.PyramidTileId
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

//////////////////////////////////////////////
/// Tile Calculations
//////////////////////////////////////////////
/**
* A colleciton of mathematical algorithms based on the tile pyramid used by Bign Maps.
* @requires The Microsoft.Maps.SpatialMath module.
*/
@JSGlobal("Microsoft.Maps.SpatialMath.Tiles")
@js.native
object Tiles extends js.Object {
  def getTilesInBounds(bounds: LocationRect, zoom: Double): js.Array[PyramidTileId] = js.native
  def globalPixelToLocation(point: Point, zoom: Double): Location = js.native
  def globalPixelToTile(pixel: Point, zoom: Double): PyramidTileId = js.native
  def groundResolution(latitude: Double, zoom: Double): Double = js.native
  def groundResolution(latitude: Double, zoom: Double, units: DistanceUnits): Double = js.native
  def locationToGlobalPixel(loc: Location, zoom: Double): Point = js.native
  def locationToTile(loc: Location, zoom: Double): PyramidTileId = js.native
  def mapSize(zoom: Double): Double = js.native
  def tileToGlobalPixel(tile: PyramidTileId): Point = js.native
  def tileToLocationRect(tile: PyramidTileId): LocationRect = js.native
}

