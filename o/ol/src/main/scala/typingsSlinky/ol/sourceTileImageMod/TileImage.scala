package typingsSlinky.ol.sourceTileImageMod

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.ol.projMod.ProjectionLike
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TileImage
  extends typingsSlinky.ol.sourceUrlTileMod.default {
  var crossOrigin: String = js.native
  var tileCacheForProjection: StringDictionary[typingsSlinky.ol.tileCacheMod.default] = js.native
  var tileClass: typingsSlinky.ol.imageTileMod.default = js.native
  var tileGridForProjection: StringDictionary[typingsSlinky.ol.tilegridTileGridMod.default] = js.native
  def getGutter(): Double = js.native
  /* protected */ def getTileInternal(
    z: Double,
    x: Double,
    y: Double,
    pixelRatio: Double,
    projection: typingsSlinky.ol.projProjectionMod.default
  ): typingsSlinky.ol.tileMod.default = js.native
  def setRenderReprojectionEdges(render: Boolean): Unit = js.native
  def setTileGridForProjection(projection: ProjectionLike, tilegrid: typingsSlinky.ol.tilegridTileGridMod.default): Unit = js.native
}

