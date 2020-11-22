package typingsSlinky.ol.olTileMod

import typingsSlinky.ol.tileStateMod.TileState
import typingsSlinky.ol.tilecoordMod.TileCoord
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Tile
  extends typingsSlinky.ol.targetMod.default {
  
  /* protected */ def changed(): Unit = js.native
  
  /**
    * Mark a transition as complete.
    */
  def endTransition(id: String): Unit = js.native
  
  /**
    * Get the alpha value for rendering.
    */
  def getAlpha(id: String, time: Double): Double = js.native
  
  /**
    * Get the interim tile most suitable for rendering using the chain of interim
    * tiles. This corresponds to the  most recent tile that has been loaded, if no
    * such tile exists, the original tile is returned.
    */
  def getInterimTile(): Tile = js.native
  
  def getKey(): String = js.native
  
  def getState(): TileState = js.native
  
  /**
    * Get the tile coordinate for this tile.
    */
  def getTileCoord(): TileCoord = js.native
  
  /**
    * Determine if a tile is in an alpha transition.  A tile is considered in
    * transition if tile.getAlpha() has not yet been called or has been called
    * and returned 1.
    */
  def inTransition(id: String): Boolean = js.native
  
  /**
    * Load the image or retry if loading previously failed.
    * Loading is taken care of by the tile queue, and calling this method is
    * only needed for preloading or for reloading in case of an error.
    */
  def load(): Unit = js.native
  
  /**
    * Goes through the chain of interim tiles and discards sections of the chain
    * that are no longer relevant.
    */
  def refreshInterimChain(): Unit = js.native
  
  /**
    * Called by the tile cache when the tile is removed from the cache due to expiry
    */
  def release(): Unit = js.native
  
  /**
    * Sets the state of this tile. If you write your own {@link module:ol/Tile~LoadFunction tileLoadFunction} ,
    * it is important to set the state correctly to {@link module:ol/TileState~ERROR}
    * when the tile cannot be loaded. Otherwise the tile cannot be removed from
    * the tile queue and will block other requests.
    */
  def setState(state: TileState): Unit = js.native
  
  var state: TileState = js.native
}
