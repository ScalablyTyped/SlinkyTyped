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
  var tileOptions: typingsSlinky.ol.olTileMod.Options = js.native
  var tmpSize: Size = js.native
  def canExpireCache(): Boolean = js.native
  def clear(): Unit = js.native
  def expireCache(
    projection: typingsSlinky.ol.projectionMod.default,
    usedTiles: StringDictionary[typingsSlinky.ol.tileRangeMod.default]
  ): Unit = js.native
  def forEachLoadedTile(
    projection: typingsSlinky.ol.projectionMod.default,
    z: Double,
    tileRange: typingsSlinky.ol.tileRangeMod.default,
    callback: js.Function1[/* p0 */ typingsSlinky.ol.olTileMod.default, Boolean]
  ): Boolean = js.native
  def getGutterForProjection(projection: typingsSlinky.ol.projectionMod.default): Double = js.native
  /* protected */ def getKey(): String = js.native
  def getOpaque(projection: typingsSlinky.ol.projectionMod.default): Boolean = js.native
  def getTile(
    z: Double,
    x: Double,
    y: Double,
    pixelRatio: Double,
    projection: typingsSlinky.ol.projectionMod.default
  ): typingsSlinky.ol.olTileMod.default = js.native
  /* protected */ def getTileCacheForProjection(projection: typingsSlinky.ol.projectionMod.default): typingsSlinky.ol.tileCacheMod.default = js.native
  def getTileCoordForTileUrlFunction(tileCoord: TileCoord): TileCoord = js.native
  def getTileCoordForTileUrlFunction(tileCoord: TileCoord, opt_projection: typingsSlinky.ol.projectionMod.default): TileCoord = js.native
  def getTileGrid(): typingsSlinky.ol.tilegridTileGridMod.default = js.native
  def getTileGridForProjection(projection: typingsSlinky.ol.projectionMod.default): typingsSlinky.ol.tilegridTileGridMod.default = js.native
  def getTilePixelRatio(pixelRatio: Double): Double = js.native
  def getTilePixelSize(z: Double, pixelRatio: Double, projection: typingsSlinky.ol.projectionMod.default): Size = js.native
  /* protected */ def setKey(key: String): Unit = js.native
  def useTile(z: Double, x: Double, y: Double, projection: typingsSlinky.ol.projectionMod.default): Unit = js.native
}

