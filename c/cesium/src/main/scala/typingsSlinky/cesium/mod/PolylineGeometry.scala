package typingsSlinky.cesium.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("cesium", "PolylineGeometry")
@js.native
class PolylineGeometry protected () extends Packable {
  def this(options: typingsSlinky.cesium.anon.ArcType) = this()
}
/* static members */
@JSImport("cesium", "PolylineGeometry")
@js.native
object PolylineGeometry extends js.Object {
  
  def createGeometry(polylineGeometry: PolylineGeometry): Geometry = js.native
  
  def unpack(array: js.Array[Double]): PolylineGeometry = js.native
  def unpack(array: js.Array[Double], startingIndex: js.UndefOr[scala.Nothing], result: PolylineGeometry): PolylineGeometry = js.native
  def unpack(array: js.Array[Double], startingIndex: Double): PolylineGeometry = js.native
  def unpack(array: js.Array[Double], startingIndex: Double, result: PolylineGeometry): PolylineGeometry = js.native
}
