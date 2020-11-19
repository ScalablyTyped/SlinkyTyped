package typingsSlinky.cesium.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("cesium", "CorridorGeometry")
@js.native
class CorridorGeometry protected () extends Packable {
  def this(options: typingsSlinky.cesium.anon.CornerType) = this()
}
/* static members */
@JSImport("cesium", "CorridorGeometry")
@js.native
object CorridorGeometry extends js.Object {
  
  def createGeometry(corridorGeometry: CorridorGeometry): Geometry = js.native
  
  def unpack(array: js.Array[Double]): CorridorGeometry = js.native
  def unpack(array: js.Array[Double], startingIndex: js.UndefOr[scala.Nothing], result: CorridorGeometry): CorridorGeometry = js.native
  def unpack(array: js.Array[Double], startingIndex: Double): CorridorGeometry = js.native
  def unpack(array: js.Array[Double], startingIndex: Double, result: CorridorGeometry): CorridorGeometry = js.native
}
