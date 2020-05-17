package typingsSlinky.androiduix.android.view.animation

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DecelerateInterpolator extends Interpolator {
  var mFactor: js.Any = js.native
}

object DecelerateInterpolator {
  @scala.inline
  def apply(getInterpolation: Double => Double, mFactor: js.Any): DecelerateInterpolator = {
    val __obj = js.Dynamic.literal(getInterpolation = js.Any.fromFunction1(getInterpolation), mFactor = mFactor.asInstanceOf[js.Any])
    __obj.asInstanceOf[DecelerateInterpolator]
  }
  @scala.inline
  implicit class DecelerateInterpolatorOps[Self <: DecelerateInterpolator] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withMFactor(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mFactor")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

