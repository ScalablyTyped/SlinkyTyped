package typingsSlinky.androiduix.android.view.animation

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Interpolator extends js.Object {
  def getInterpolation(input: Double): Double = js.native
}

object Interpolator {
  @scala.inline
  def apply(getInterpolation: Double => Double): Interpolator = {
    val __obj = js.Dynamic.literal(getInterpolation = js.Any.fromFunction1(getInterpolation))
    __obj.asInstanceOf[Interpolator]
  }
  @scala.inline
  implicit class InterpolatorOps[Self <: Interpolator] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withGetInterpolation(value: Double => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getInterpolation")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

