package typingsSlinky.i18next.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Interpolator extends js.Object {
  def init(options: InterpolationOptions, reset: Boolean): js.UndefOr[scala.Nothing] = js.native
  def interpolate(str: String, data: js.Object, lng: String, options: InterpolationOptions): String = js.native
  def nest(str: String, fc: js.Function1[/* repeated */ js.Any, _], options: InterpolationOptions): String = js.native
  def reset(): js.UndefOr[scala.Nothing] = js.native
  def resetRegExp(): js.UndefOr[scala.Nothing] = js.native
}

object Interpolator {
  @scala.inline
  def apply(
    init: (InterpolationOptions, Boolean) => js.UndefOr[scala.Nothing],
    interpolate: (String, js.Object, String, InterpolationOptions) => String,
    nest: (String, js.Function1[/* repeated */ js.Any, _], InterpolationOptions) => String,
    reset: () => js.UndefOr[scala.Nothing],
    resetRegExp: () => js.UndefOr[scala.Nothing]
  ): Interpolator = {
    val __obj = js.Dynamic.literal(init = js.Any.fromFunction2(init), interpolate = js.Any.fromFunction4(interpolate), nest = js.Any.fromFunction3(nest), reset = js.Any.fromFunction0(reset), resetRegExp = js.Any.fromFunction0(resetRegExp))
    __obj.asInstanceOf[Interpolator]
  }
  @scala.inline
  implicit class InterpolatorOps[Self <: Interpolator] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withInit(value: (InterpolationOptions, Boolean) => js.UndefOr[scala.Nothing]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("init")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withInterpolate(value: (String, js.Object, String, InterpolationOptions) => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("interpolate")(js.Any.fromFunction4(value))
        ret
    }
    @scala.inline
    def withNest(value: (String, js.Function1[/* repeated */ js.Any, _], InterpolationOptions) => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nest")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withReset(value: () => js.UndefOr[scala.Nothing]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reset")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withResetRegExp(value: () => js.UndefOr[scala.Nothing]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resetRegExp")(js.Any.fromFunction0(value))
        ret
    }
  }
  
}

