package typingsSlinky.cannon.CANNON

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait JacobianElement extends js.Object {
  var rotational: Vec3 = js.native
  var spatial: Vec3 = js.native
  def multiplyElement(element: JacobianElement): Double = js.native
  def multiplyVectors(spacial: Vec3, rotational: Vec3): Double = js.native
}

object JacobianElement {
  @scala.inline
  def apply(
    multiplyElement: JacobianElement => Double,
    multiplyVectors: (Vec3, Vec3) => Double,
    rotational: Vec3,
    spatial: Vec3
  ): JacobianElement = {
    val __obj = js.Dynamic.literal(multiplyElement = js.Any.fromFunction1(multiplyElement), multiplyVectors = js.Any.fromFunction2(multiplyVectors), rotational = rotational.asInstanceOf[js.Any], spatial = spatial.asInstanceOf[js.Any])
    __obj.asInstanceOf[JacobianElement]
  }
  @scala.inline
  implicit class JacobianElementOps[Self <: JacobianElement] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withMultiplyElement(value: JacobianElement => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("multiplyElement")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withMultiplyVectors(value: (Vec3, Vec3) => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("multiplyVectors")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withRotational(value: Vec3): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rotational")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSpatial(value: Vec3): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("spatial")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

