package typingsSlinky.cesium.mod

import typingsSlinky.cesium.anon.Granularity
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("cesium", "CorridorOutlineGeometry")
@js.native
class CorridorOutlineGeometry protected () extends Packable {
  def this(options: Granularity) = this()
}
/* static members */
@JSImport("cesium", "CorridorOutlineGeometry")
@js.native
object CorridorOutlineGeometry extends js.Object {
  
  def createGeometry(corridorOutlineGeometry: CorridorOutlineGeometry): Geometry = js.native
  
  def unpack(array: js.Array[Double]): CorridorOutlineGeometry = js.native
  def unpack(array: js.Array[Double], startingIndex: js.UndefOr[scala.Nothing], result: CorridorOutlineGeometry): CorridorOutlineGeometry = js.native
  def unpack(array: js.Array[Double], startingIndex: Double): CorridorOutlineGeometry = js.native
  def unpack(array: js.Array[Double], startingIndex: Double, result: CorridorOutlineGeometry): CorridorOutlineGeometry = js.native
}
