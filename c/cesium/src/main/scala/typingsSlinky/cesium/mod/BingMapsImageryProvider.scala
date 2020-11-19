package typingsSlinky.cesium.mod

import typingsSlinky.cesium.anon.Culture
import typingsSlinky.cesium.anon.Level
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("cesium", "BingMapsImageryProvider")
@js.native
class BingMapsImageryProvider protected () extends ImageryProvider {
  def this(options: Culture) = this()
  
  val culture: String = js.native
  
  val key: String = js.native
  
  val mapStyle: BingMapsStyle = js.native
  
  val url: String = js.native
}
/* static members */
@JSImport("cesium", "BingMapsImageryProvider")
@js.native
object BingMapsImageryProvider extends js.Object {
  
  def quadKeyToTileXY(quadkey: String): Level = js.native
  
  def tileXYToQuadKey(x: Double, y: Double, level: Double): String = js.native
}
