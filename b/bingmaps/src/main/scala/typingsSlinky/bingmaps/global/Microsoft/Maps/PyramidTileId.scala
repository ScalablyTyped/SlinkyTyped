package typingsSlinky.bingmaps.global.Microsoft.Maps

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("Microsoft.Maps.PyramidTileId")
@js.native
class PyramidTileId protected ()
  extends typingsSlinky.bingmaps.Microsoft.Maps.PyramidTileId {
  /**
    * @constructor
    * @param x The integer x position of the tile within the tile layer at the specified zoom level.
    * @param y The integer y position of the tile within the tile layer at the specified zoom level.
    * @param zoom The zoom level of the tile.
    * @param width The tile's width in pixels. Default value: 256
    * @param height The tile's height in pixels. Default value: 256
    */
  def this(x: Double, y: Double, zoom: Double) = this()
  def this(x: Double, y: Double, zoom: Double, width: Double) = this()
  def this(x: Double, y: Double, zoom: Double, width: js.UndefOr[scala.Nothing], height: Double) = this()
  def this(x: Double, y: Double, zoom: Double, width: Double, height: Double) = this()
}
/* static members */
object PyramidTileId {
  
  /**
    * Compares two PyramidTileId objects and returns a boolean indicating if the two PyramidTileId are equal.
    * @param tileId1 The first PyramidTileId to compare to the second.
    * @param tileId2 The second PyramidTileId to compare to the first.
    * @returns A boolean indicating if the two PyramidTileId are equal.
    */
  @JSGlobal("Microsoft.Maps.PyramidTileId.areEqual")
  @js.native
  def areEqual(
    tileId1: typingsSlinky.bingmaps.Microsoft.Maps.PyramidTileId,
    tileId2: typingsSlinky.bingmaps.Microsoft.Maps.PyramidTileId
  ): Boolean = js.native
  
  /**
    * Generates a PyramidTileId from a quadkey tile id string. 
    * @param quadkey The quadkey tile id string to convert into a PyramidTileId object.
    * @param width The tile's width in pixels. Default value: 256
    * @param height The tile's height in pixels. Default value: 256
    */
  @JSGlobal("Microsoft.Maps.PyramidTileId.fromQuadKey")
  @js.native
  def fromQuadKey(quadkey: String): typingsSlinky.bingmaps.Microsoft.Maps.PyramidTileId = js.native
  @JSGlobal("Microsoft.Maps.PyramidTileId.fromQuadKey")
  @js.native
  def fromQuadKey(quadkey: String, width: js.UndefOr[scala.Nothing], height: Double): typingsSlinky.bingmaps.Microsoft.Maps.PyramidTileId = js.native
  @JSGlobal("Microsoft.Maps.PyramidTileId.fromQuadKey")
  @js.native
  def fromQuadKey(quadkey: String, width: Double): typingsSlinky.bingmaps.Microsoft.Maps.PyramidTileId = js.native
  @JSGlobal("Microsoft.Maps.PyramidTileId.fromQuadKey")
  @js.native
  def fromQuadKey(quadkey: String, width: Double, height: Double): typingsSlinky.bingmaps.Microsoft.Maps.PyramidTileId = js.native
}
