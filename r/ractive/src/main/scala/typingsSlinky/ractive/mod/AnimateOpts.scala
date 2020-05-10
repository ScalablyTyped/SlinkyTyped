package typingsSlinky.ractive.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnimateOpts extends js.Object {
  /** This is called when the animation is complete.
  	 * @param value the final value of the animation
  	 */
  var complete: js.UndefOr[js.Function1[/* value */ js.Any, Unit]] = js.native
  /** The duration for the transition in milliseconds. */
  var duration: js.UndefOr[Double] = js.native
  /** An easing name e.g. 'ease' or an easing function. */
  var easing: js.UndefOr[String | Easing] = js.native
  /** An interpolator name or function. */
  var interpolator: js.UndefOr[String | Interpolator] = js.native
  /** This is called when an animation frame is applied.
  	 * @param time the current time code as a number between 0 and 1
  	 * @param value the value computed for the current time code
  	 */
  var step: js.UndefOr[js.Function2[/* time */ Double, /* value */ js.Any, Unit]] = js.native
}

object AnimateOpts {
  @scala.inline
  def apply(): AnimateOpts = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnimateOpts]
  }
  @scala.inline
  implicit class AnimateOptsOps[Self <: AnimateOpts] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withComplete(value: /* value */ js.Any => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("complete")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutComplete: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("complete")(js.undefined)
        ret
    }
    @scala.inline
    def withDuration(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("duration")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDuration: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("duration")(js.undefined)
        ret
    }
    @scala.inline
    def withEasingFunction1(value: /* time */ Double => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("easing")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withEasing(value: String | Easing): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("easing")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEasing: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("easing")(js.undefined)
        ret
    }
    @scala.inline
    def withInterpolatorFunction2(value: (/* from */ js.Any, /* to */ js.Any) => js.Function1[/* t */ Double, js.Any]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("interpolator")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withInterpolator(value: String | Interpolator): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("interpolator")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInterpolator: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("interpolator")(js.undefined)
        ret
    }
    @scala.inline
    def withStep(value: (/* time */ Double, /* value */ js.Any) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("step")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutStep: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("step")(js.undefined)
        ret
    }
  }
  
}

