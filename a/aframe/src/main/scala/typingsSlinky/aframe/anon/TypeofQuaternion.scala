package typingsSlinky.aframe.anon

import org.scalablytyped.runtime.Instantiable0
import typingsSlinky.three.mod.Quaternion
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TypeofQuaternion extends Instantiable0[Quaternion] {
  def multiplyQuaternionsFlat(
    dst: js.Array[Double],
    dstOffset: Double,
    src0: js.Array[Double],
    srcOffset: Double,
    src1: js.Array[Double],
    stcOffset1: Double
  ): js.Array[Double] = js.native
  /**
  	 * Adapted from http://www.euclideanspace.com/maths/algebra/realNormedAlgebra/quaternions/slerp/.
  	 */
  def slerp(
    qa: typingsSlinky.three.quaternionMod.Quaternion,
    qb: typingsSlinky.three.quaternionMod.Quaternion,
    qm: typingsSlinky.three.quaternionMod.Quaternion,
    t: Double
  ): typingsSlinky.three.quaternionMod.Quaternion = js.native
  def slerpFlat(
    dst: js.Array[Double],
    dstOffset: Double,
    src0: js.Array[Double],
    srcOffset: Double,
    src1: js.Array[Double],
    stcOffset1: Double,
    t: Double
  ): typingsSlinky.three.quaternionMod.Quaternion = js.native
}

