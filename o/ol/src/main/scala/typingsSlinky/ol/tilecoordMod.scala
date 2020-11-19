package typingsSlinky.ol

import typingsSlinky.ol.tilegridTileGridMod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("ol/tilecoord", JSImport.Namespace)
@js.native
object tilecoordMod extends js.Object {
  
  def createOrUpdate(z: Double, x: Double, y: Double): TileCoord = js.native
  def createOrUpdate(z: Double, x: Double, y: Double, opt_tileCoord: TileCoord): TileCoord = js.native
  
  def fromKey(key: String): TileCoord = js.native
  
  def getKey(tileCoord: TileCoord): String = js.native
  
  def getKeyZXY(z: Double, x: Double, y: Double): String = js.native
  
  def hash(tileCoord: TileCoord): Double = js.native
  
  def withinExtentAndZ(tileCoord: TileCoord, tileGrid: default): Boolean = js.native
  
  type TileCoord = js.Array[Double]
}
