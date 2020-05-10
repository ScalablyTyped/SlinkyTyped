package typingsSlinky.heremaps.H.map.layer

import typingsSlinky.heremaps.H.geo.Rect
import typingsSlinky.heremaps.H.map.layer.ITileLayer.Response
import typingsSlinky.heremaps.H.map.provider.Tile
import typingsSlinky.heremaps.H.math.Point
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * This interface describes a layer which provides data partitioned in quad-tree tiles in an x, y, z fashion (where z describes the level within the tree and x and y describe the absolute
  * column and row indeces whithin the level).
  */
@js.native
trait ITileLayer_ extends js.Object {
  /**
    * This method cancels a previously requested tile.
    * @param x {number} - tile row position
    * @param y {number} - tile column position
    * @param z {number} - zoom level
    */
  def cancelTile(x: Double, y: Double, z: Double): Unit = js.native
  /**
    * This method requests a single tile according to tile coordinates. It returns either a Tile object if it is already loaded or undefined and starts loading the tile
    * @param x {number} - tile row position
    * @param y {number} - tile column position
    * @param z {number} - The zoom level for which the tile is requested
    * @param cacheOnly {boolean} - indicates whether only cached tiles are to be considered
    * @returns {(H.map.provider.Tile | undefined)} - tile object corresponding to requested coordinates
    */
  def requestTile(x: Double, y: Double, z: Double, cacheOnly: Boolean): Tile | Unit = js.native
  /**
    * This method requests tiles for the current bounding rectangle at the given zoom level (z-value).
    * @param boundingRect {H.geo.Rect} - the bounding rectangle for which tiles are to be returned
    * @param zoomLevel {number} - The zoom level for which the tiles are requested
    * @param cacheOnly {boolean} - Indicates whether only cached tiles are to be considered
    * @param prioCenter {H.math.Point} - The priority center as an offset in screen pixel relative to the center
    * @returns {H.map.layer.ITileLayer.Response} - a response object containing the total number of tiles requested and the tile objects that could be immediately returned
    */
  def requestTiles(boundingRect: Rect, zoomLevel: Double, cacheOnly: Boolean, prioCenter: Point): Response = js.native
}

object ITileLayer_ {
  @scala.inline
  def apply(
    cancelTile: (Double, Double, Double) => Unit,
    requestTile: (Double, Double, Double, Boolean) => Tile | Unit,
    requestTiles: (Rect, Double, Boolean, Point) => Response
  ): ITileLayer_ = {
    val __obj = js.Dynamic.literal(cancelTile = js.Any.fromFunction3(cancelTile), requestTile = js.Any.fromFunction4(requestTile), requestTiles = js.Any.fromFunction4(requestTiles))
    __obj.asInstanceOf[ITileLayer_]
  }
  @scala.inline
  implicit class ITileLayer_Ops[Self <: ITileLayer_] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCancelTile(value: (Double, Double, Double) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cancelTile")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withRequestTile(value: (Double, Double, Double, Boolean) => Tile | Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("requestTile")(js.Any.fromFunction4(value))
        ret
    }
    @scala.inline
    def withRequestTiles(value: (Rect, Double, Boolean, Point) => Response): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("requestTiles")(js.Any.fromFunction4(value))
        ret
    }
  }
  
}

