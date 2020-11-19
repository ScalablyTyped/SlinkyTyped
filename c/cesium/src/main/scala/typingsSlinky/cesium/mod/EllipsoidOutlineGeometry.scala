package typingsSlinky.cesium.mod

import typingsSlinky.cesium.anon.MaximumClock
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("cesium", "EllipsoidOutlineGeometry")
@js.native
class EllipsoidOutlineGeometry () extends Packable {
  def this(options: MaximumClock) = this()
}
/* static members */
@JSImport("cesium", "EllipsoidOutlineGeometry")
@js.native
object EllipsoidOutlineGeometry extends js.Object {
  
  def createGeometry(ellipsoidGeometry: EllipsoidOutlineGeometry): Geometry = js.native
  
  def unpack(array: js.Array[Double]): EllipsoidOutlineGeometry = js.native
  def unpack(
    array: js.Array[Double],
    startingIndex: js.UndefOr[scala.Nothing],
    result: EllipsoidOutlineGeometry
  ): EllipsoidOutlineGeometry = js.native
  def unpack(array: js.Array[Double], startingIndex: Double): EllipsoidOutlineGeometry = js.native
  def unpack(array: js.Array[Double], startingIndex: Double, result: EllipsoidOutlineGeometry): EllipsoidOutlineGeometry = js.native
}
