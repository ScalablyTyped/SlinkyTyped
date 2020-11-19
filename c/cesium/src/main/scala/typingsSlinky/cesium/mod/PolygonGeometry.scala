package typingsSlinky.cesium.mod

import typingsSlinky.cesium.anon.CloseBottom
import typingsSlinky.cesium.anon.PerPositionHeight
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("cesium", "PolygonGeometry")
@js.native
class PolygonGeometry protected () extends Packable {
  def this(options: PerPositionHeight) = this()
}
/* static members */
@JSImport("cesium", "PolygonGeometry")
@js.native
object PolygonGeometry extends js.Object {
  
  def createGeometry(polygonGeometry: PolygonGeometry): Geometry = js.native
  
  def fromPositions(): PolygonGeometry = js.native
  def fromPositions(options: CloseBottom): PolygonGeometry = js.native
  
  def unpack(array: js.Array[Double]): PolygonGeometry = js.native
  def unpack(array: js.Array[Double], startingIndex: js.UndefOr[scala.Nothing], result: PolygonGeometry): PolygonGeometry = js.native
  def unpack(array: js.Array[Double], startingIndex: Double): PolygonGeometry = js.native
  def unpack(array: js.Array[Double], startingIndex: Double, result: PolygonGeometry): PolygonGeometry = js.native
}
