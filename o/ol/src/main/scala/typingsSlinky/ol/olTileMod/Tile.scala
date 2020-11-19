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
  
  def endTransition(id: String): Unit = js.native
  
  def getAlpha(id: String, time: Double): Double = js.native
  
  def getInterimTile(): Tile = js.native
  
  def getKey(): String = js.native
  
  def getState(): TileState = js.native
  
  def getTileCoord(): TileCoord = js.native
  
  def inTransition(id: String): Boolean = js.native
  
  def load(): Unit = js.native
  
  def refreshInterimChain(): Unit = js.native
  
  def release(): Unit = js.native
  
  def setState(state: TileState): Unit = js.native
  
  var state: TileState = js.native
}
