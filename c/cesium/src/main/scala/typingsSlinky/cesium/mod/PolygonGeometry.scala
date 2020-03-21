package typingsSlinky.cesium.mod

import typingsSlinky.cesium.AnonCloseBottom
import typingsSlinky.cesium.AnonPerPositionHeight
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("cesium", "PolygonGeometry")
@js.native
class PolygonGeometry protected () extends Packable {
  def this(options: AnonPerPositionHeight) = this()
}

/* static members */
@JSImport("cesium", "PolygonGeometry")
@js.native
object PolygonGeometry extends js.Object {
  def createGeometry(polygonGeometry: PolygonGeometry): Geometry = js.native
  def fromPositions(): PolygonGeometry = js.native
  def fromPositions(options: AnonCloseBottom): PolygonGeometry = js.native
  def unpack(array: js.Array[Double]): PolygonGeometry = js.native
  def unpack(array: js.Array[Double], startingIndex: Double): PolygonGeometry = js.native
  def unpack(array: js.Array[Double], startingIndex: Double, result: PolygonGeometry): PolygonGeometry = js.native
}

