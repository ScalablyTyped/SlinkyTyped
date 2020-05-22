package typingsSlinky.cannon.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("cannon", "ArrayCollisionMatrix")
@js.native
class ArrayCollisionMatrix ()
  extends typingsSlinky.cannon.CANNON.ArrayCollisionMatrix {
  /* CompleteClass */
  override var matrix: js.Array[typingsSlinky.cannon.CANNON.Mat3] = js.native
  /* CompleteClass */
  override def get(i: Double, j: Double): Double = js.native
  /* CompleteClass */
  override def reset(): Unit = js.native
  /* CompleteClass */
  override def set(i: Double, j: Double, value: Double): Unit = js.native
  /* CompleteClass */
  override def setNumObjects(n: Double): Unit = js.native
}

