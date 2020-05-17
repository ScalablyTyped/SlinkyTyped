package typingsSlinky.androiduix.android.view.animation

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AccelerateInterpolator extends Interpolator {
  var mDoubleFactor: js.Any = js.native
  var mFactor: js.Any = js.native
}

object AccelerateInterpolator {
  @scala.inline
  def apply(getInterpolation: Double => Double, mDoubleFactor: js.Any, mFactor: js.Any): AccelerateInterpolator = {
    val __obj = js.Dynamic.literal(getInterpolation = js.Any.fromFunction1(getInterpolation), mDoubleFactor = mDoubleFactor.asInstanceOf[js.Any], mFactor = mFactor.asInstanceOf[js.Any])
    __obj.asInstanceOf[AccelerateInterpolator]
  }
  @scala.inline
  implicit class AccelerateInterpolatorOps[Self <: AccelerateInterpolator] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withMDoubleFactor(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mDoubleFactor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMFactor(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mFactor")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

