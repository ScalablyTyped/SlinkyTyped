package typingsSlinky.cesium.mod

import typingsSlinky.cesium.anon.Rotation
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("cesium", "RectangleOutlineGeometry")
@js.native
class RectangleOutlineGeometry protected () extends Packable {
  def this(options: Rotation) = this()
}
/* static members */
@JSImport("cesium", "RectangleOutlineGeometry")
@js.native
object RectangleOutlineGeometry extends js.Object {
  
  def createGeometry(rectangleGeometry: RectangleOutlineGeometry): Geometry = js.native
  
  def pack(value: BoundingSphere, array: js.Array[Double]): js.Array[Double] = js.native
  def pack(value: BoundingSphere, array: js.Array[Double], startingIndex: Double): js.Array[Double] = js.native
  
  def unpack(array: js.Array[Double]): RectangleOutlineGeometry = js.native
  def unpack(array: js.Array[Double], startingIndex: js.UndefOr[scala.Nothing], result: RectangleGeometry): RectangleOutlineGeometry = js.native
  def unpack(array: js.Array[Double], startingIndex: Double): RectangleOutlineGeometry = js.native
  def unpack(array: js.Array[Double], startingIndex: Double, result: RectangleGeometry): RectangleOutlineGeometry = js.native
}
