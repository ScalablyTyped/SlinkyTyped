package typingsSlinky.cesium.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("cesium", "TileAvailability")
@js.native
class TileAvailability protected () extends StObject {
  def this(tilingScheme: TilingScheme, maximumLevel: Double) = this()
  
  def addAvailableTileRange(level: Double, startX: Double, startY: Double, endX: Double, endY: Double): Unit = js.native
  
  def computeBestAvailableLevelOverRectangle(rectangle: Rectangle): Double = js.native
  
  def computeChildMaskForTile(level: Double, x: Double, y: Double): Double = js.native
  
  def computeMaximumLevelAtPosition(position: Cartographic): Double = js.native
  
  def isTileAvailable(level: Double, x: Double, y: Double): Boolean = js.native
}
