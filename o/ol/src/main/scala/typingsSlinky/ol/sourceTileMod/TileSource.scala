package typingsSlinky.ol.sourceTileMod

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.ol.sizeMod.Size
import typingsSlinky.ol.tilecoordMod.TileCoord
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TileSource
  extends typingsSlinky.ol.sourceSourceMod.default {
  var tileCache: typingsSlinky.ol.tileCacheMod.default = js.native
  var tileGrid: typingsSlinky.ol.tilegridTileGridMod.default = js.native
  var tileOptions: typingsSlinky.ol.tileMod.Options = js.native
  var tmpSize: Size = js.native
  def canExpireCache(): Boolean = js.native
  def expireCache(
    projection: typingsSlinky.ol.projProjectionMod.default,
    usedTiles: StringDictionary[typingsSlinky.ol.tileRangeMod.default]
  ): Unit = js.native
  def forEachLoadedTile(
    projection: typingsSlinky.ol.projProjectionMod.default,
    z: Double,
    tileRange: typingsSlinky.ol.tileRangeMod.default,
    callback: js.Function1[/* p0 */ typingsSlinky.ol.tileMod.default, Boolean]
  ): Boolean = js.native
  def getGutterForProjection(projection: typingsSlinky.ol.projProjectionMod.default): Double = js.native
  /* protected */ def getKey(): String = js.native
  def getOpaque(projection: typingsSlinky.ol.projProjectionMod.default): Boolean = js.native
  def getTile(
    z: Double,
    x: Double,
    y: Double,
    pixelRatio: Double,
    projection: typingsSlinky.ol.projProjectionMod.default
  ): typingsSlinky.ol.tileMod.default = js.native
  /* protected */ def getTileCacheForProjection(projection: typingsSlinky.ol.projProjectionMod.default): typingsSlinky.ol.tileCacheMod.default = js.native
  def getTileCoordForTileUrlFunction(tileCoord: TileCoord): TileCoord = js.native
  def getTileCoordForTileUrlFunction(tileCoord: TileCoord, opt_projection: typingsSlinky.ol.projProjectionMod.default): TileCoord = js.native
  def getTileGrid(): typingsSlinky.ol.tilegridTileGridMod.default = js.native
  def getTileGridForProjection(projection: typingsSlinky.ol.projProjectionMod.default): typingsSlinky.ol.tilegridTileGridMod.default = js.native
  def getTilePixelRatio(pixelRatio: Double): Double = js.native
  def getTilePixelSize(z: Double, pixelRatio: Double, projection: typingsSlinky.ol.projProjectionMod.default): Size = js.native
  /* protected */ def setKey(key: String): Unit = js.native
  def useTile(z: Double, x: Double, y: Double, projection: typingsSlinky.ol.projProjectionMod.default): Unit = js.native
}

