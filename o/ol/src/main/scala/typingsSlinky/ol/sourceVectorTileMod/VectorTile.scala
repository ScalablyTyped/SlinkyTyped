package typingsSlinky.ol.sourceVectorTileMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait VectorTile
  extends typingsSlinky.ol.urlTileMod.default {
  var tileClass: typingsSlinky.ol.olVectorTileMod.default = js.native
  def addSourceTiles(
    tile: typingsSlinky.ol.vectorRenderTileMod.default,
    sourceTiles: js.Array[typingsSlinky.ol.olVectorTileMod.default]
  ): Unit = js.native
  def getOverlaps(): Boolean = js.native
  def getSourceTiles(
    pixelRatio: Double,
    projection: typingsSlinky.ol.projectionMod.default,
    tile: typingsSlinky.ol.vectorRenderTileMod.default
  ): js.Array[typingsSlinky.ol.olVectorTileMod.default] = js.native
  def removeSourceTiles(tile: typingsSlinky.ol.vectorRenderTileMod.default): Unit = js.native
}

