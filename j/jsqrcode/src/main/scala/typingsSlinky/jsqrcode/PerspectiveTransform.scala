package typingsSlinky.jsqrcode

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PerspectiveTransform extends js.Object {
  var a11: Double = js.native
  var a12: Double = js.native
  var a13: Double = js.native
  var a21: Double = js.native
  var a22: Double = js.native
  var a23: Double = js.native
  var a31: Double = js.native
  var a32: Double = js.native
  var a33: Double = js.native
  def buildAdjoint(): PerspectiveTransform = js.native
  def times(other: PerspectiveTransform): PerspectiveTransform = js.native
  def transformPoints1(points: js.Array[Double]): Unit = js.native
  def transformPoints2(xValues: js.Array[Double], yValues: js.Array[Double]): Unit = js.native
}

object PerspectiveTransform {
  @scala.inline
  def apply(
    a11: Double,
    a12: Double,
    a13: Double,
    a21: Double,
    a22: Double,
    a23: Double,
    a31: Double,
    a32: Double,
    a33: Double,
    buildAdjoint: () => PerspectiveTransform,
    times: PerspectiveTransform => PerspectiveTransform,
    transformPoints1: js.Array[Double] => Unit,
    transformPoints2: (js.Array[Double], js.Array[Double]) => Unit
  ): PerspectiveTransform = {
    val __obj = js.Dynamic.literal(a11 = a11.asInstanceOf[js.Any], a12 = a12.asInstanceOf[js.Any], a13 = a13.asInstanceOf[js.Any], a21 = a21.asInstanceOf[js.Any], a22 = a22.asInstanceOf[js.Any], a23 = a23.asInstanceOf[js.Any], a31 = a31.asInstanceOf[js.Any], a32 = a32.asInstanceOf[js.Any], a33 = a33.asInstanceOf[js.Any], buildAdjoint = js.Any.fromFunction0(buildAdjoint), times = js.Any.fromFunction1(times), transformPoints1 = js.Any.fromFunction1(transformPoints1), transformPoints2 = js.Any.fromFunction2(transformPoints2))
    __obj.asInstanceOf[PerspectiveTransform]
  }
  @scala.inline
  implicit class PerspectiveTransformOps[Self <: PerspectiveTransform] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withA11(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("a11")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withA12(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("a12")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withA13(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("a13")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withA21(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("a21")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withA22(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("a22")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withA23(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("a23")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withA31(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("a31")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withA32(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("a32")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withA33(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("a33")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBuildAdjoint(value: () => PerspectiveTransform): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("buildAdjoint")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withTimes(value: PerspectiveTransform => PerspectiveTransform): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("times")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withTransformPoints1(value: js.Array[Double] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transformPoints1")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withTransformPoints2(value: (js.Array[Double], js.Array[Double]) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transformPoints2")(js.Any.fromFunction2(value))
        ret
    }
  }
  
}

