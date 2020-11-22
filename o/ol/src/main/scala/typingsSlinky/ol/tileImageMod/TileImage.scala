package typingsSlinky.ol.tileImageMod

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.ol.projMod.ProjectionLike
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TileImage
  extends typingsSlinky.ol.urlTileMod.default {
  
  var crossOrigin: String = js.native
  
  def getGutter(): Double = js.native
  
  /* protected */ def getTileInternal(
    z: Double,
    x: Double,
    y: Double,
    pixelRatio: Double,
    projection: typingsSlinky.ol.projectionMod.default
  ): typingsSlinky.ol.olTileMod.default = js.native
  
  /**
    * Sets whether to render reprojection edges or not (usually for debugging).
    */
  def setRenderReprojectionEdges(render: Boolean): Unit = js.native
  
  /**
    * Sets the tile grid to use when reprojecting the tiles to the given
    * projection instead of the default tile grid for the projection.
    * This can be useful when the default tile grid cannot be created
    * (e.g. projection has no extent defined) or
    * for optimization reasons (custom tile size, resolutions, ...).
    */
  def setTileGridForProjection(projection: ProjectionLike, tilegrid: typingsSlinky.ol.tilegridTileGridMod.default): Unit = js.native
  
  var tileCacheForProjection: StringDictionary[typingsSlinky.ol.tileCacheMod.default] = js.native
  
  var tileClass: typingsSlinky.ol.imageTileMod.default = js.native
  
  var tileGridForProjection: StringDictionary[typingsSlinky.ol.tilegridTileGridMod.default] = js.native
}
