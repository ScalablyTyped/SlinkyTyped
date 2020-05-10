package typingsSlinky.reactDndHtml5Backend.monotonicInterpolantMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MonotonicInterpolant extends js.Object {
  var c1s: js.Any = js.native
  var c2s: js.Any = js.native
  var c3s: js.Any = js.native
  var xs: js.Any = js.native
  var ys: js.Any = js.native
  def interpolate(x: Double): js.Any = js.native
}

object MonotonicInterpolant {
  @scala.inline
  def apply(c1s: js.Any, c2s: js.Any, c3s: js.Any, interpolate: Double => js.Any, xs: js.Any, ys: js.Any): MonotonicInterpolant = {
    val __obj = js.Dynamic.literal(c1s = c1s.asInstanceOf[js.Any], c2s = c2s.asInstanceOf[js.Any], c3s = c3s.asInstanceOf[js.Any], interpolate = js.Any.fromFunction1(interpolate), xs = xs.asInstanceOf[js.Any], ys = ys.asInstanceOf[js.Any])
    __obj.asInstanceOf[MonotonicInterpolant]
  }
  @scala.inline
  implicit class MonotonicInterpolantOps[Self <: MonotonicInterpolant] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withC1s(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("c1s")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withC2s(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("c2s")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withC3s(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("c3s")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withInterpolate(value: Double => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("interpolate")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withXs(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("xs")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withYs(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ys")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

