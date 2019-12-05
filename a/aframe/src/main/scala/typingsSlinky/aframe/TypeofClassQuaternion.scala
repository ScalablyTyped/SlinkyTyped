package typingsSlinky.aframe

import org.scalablytyped.runtime.Instantiable0
import typingsSlinky.three.threeMod.Quaternion
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TypeofClassQuaternion extends Instantiable0[Quaternion] {
  /**
  	 * Adapted from http://www.euclideanspace.com/maths/algebra/realNormedAlgebra/quaternions/slerp/.
  	 */
  def slerp(
    qa: typingsSlinky.three.srcMathQuaternionMod.Quaternion,
    qb: typingsSlinky.three.srcMathQuaternionMod.Quaternion,
    qm: typingsSlinky.three.srcMathQuaternionMod.Quaternion,
    t: Double
  ): typingsSlinky.three.srcMathQuaternionMod.Quaternion = js.native
  def slerpFlat(
    dst: js.Array[Double],
    dstOffset: Double,
    src0: js.Array[Double],
    srcOffset: Double,
    src1: js.Array[Double],
    stcOffset1: Double,
    t: Double
  ): typingsSlinky.three.srcMathQuaternionMod.Quaternion = js.native
}

