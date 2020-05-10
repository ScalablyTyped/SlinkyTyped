package typingsSlinky.jqrangeslider

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait jQRangeSliderScale extends js.Object {
  var first: js.UndefOr[js.Function2[/* min */ Double, /* max */ Double, Double]] = js.native
   // 'true' to stop scale generating ticks from a given value
  var format: js.UndefOr[
    js.Function3[
      /* tickContainer */ js.Any, 
      /* tickStartValue */ js.Any, 
      /* tickEndValue */ js.Any, 
      Unit
    ]
  ] = js.native
   // compute the next value.
  var label: js.UndefOr[js.Function2[/* value */ js.Any, /* nextValue */ js.Any, String]] = js.native
   // compute displayed text for a given internal
  var stop: js.UndefOr[js.Function1[/* value */ js.Any, Boolean]] = js.native
   // compute the ruler first value.
  def next(value: js.Any): js.Any = js.native
}

object jQRangeSliderScale {
  @scala.inline
  def apply(next: js.Any => js.Any): jQRangeSliderScale = {
    val __obj = js.Dynamic.literal(next = js.Any.fromFunction1(next))
    __obj.asInstanceOf[jQRangeSliderScale]
  }
  @scala.inline
  implicit class jQRangeSliderScaleOps[Self <: jQRangeSliderScale] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withNext(value: js.Any => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("next")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withFirst(value: (/* min */ Double, /* max */ Double) => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("first")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutFirst: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("first")(js.undefined)
        ret
    }
    @scala.inline
    def withFormat(
      value: (/* tickContainer */ js.Any, /* tickStartValue */ js.Any, /* tickEndValue */ js.Any) => Unit
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("format")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withoutFormat: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("format")(js.undefined)
        ret
    }
    @scala.inline
    def withLabel(value: (/* value */ js.Any, /* nextValue */ js.Any) => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("label")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutLabel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("label")(js.undefined)
        ret
    }
    @scala.inline
    def withStop(value: /* value */ js.Any => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stop")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutStop: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stop")(js.undefined)
        ret
    }
  }
  
}

