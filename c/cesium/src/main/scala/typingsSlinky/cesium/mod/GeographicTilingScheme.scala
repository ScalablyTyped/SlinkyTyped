package typingsSlinky.cesium.mod

import typingsSlinky.cesium.anon.NumberOfLevelZeroTilesX
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("cesium", "GeographicTilingScheme")
@js.native
class GeographicTilingScheme () extends js.Object {
  def this(options: NumberOfLevelZeroTilesX) = this()
  
  var ellipsoid: Ellipsoid = js.native
  
  def getNumberOfXTilesAtLevel(level: Double): Double = js.native
  
  def getNumberOfYTilesAtLevel(level: Double): Double = js.native
  
  def positionToTileXY(position: Cartographic, level: Double): Cartesian2 = js.native
  def positionToTileXY(position: Cartographic, level: Double, result: Cartesian2): Cartesian2 = js.native
  
  var projection: MapProjection = js.native
  
  var rectangle: Rectangle = js.native
  
  def rectangleToNativeRectangle(rectangle: Rectangle): Rectangle = js.native
  def rectangleToNativeRectangle(rectangle: Rectangle, result: Rectangle): Rectangle = js.native
  
  def tileXYToNativeRectangle(x: Double, y: Double, level: Double): Rectangle = js.native
  def tileXYToNativeRectangle(x: Double, y: Double, level: Double, result: js.Any): Rectangle = js.native
  
  def tileXYToRectangle(x: Double, y: Double, level: Double): Rectangle = js.native
  def tileXYToRectangle(x: Double, y: Double, level: Double, result: js.Any): Rectangle = js.native
}
