package typingsSlinky.antDesignReactNative.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Max extends js.Object {
  var max: Double = js.native
  var min: Double = js.native
  var onBlur: js.Function0[Unit] = js.native
  var onChange: js.Function0[Unit] = js.native
  var onFocus: js.Function0[Unit] = js.native
  var parser: js.Function1[/* input */ String, String] = js.native
  var step: Double = js.native
}

object Max {
  @scala.inline
  def apply(
    max: Double,
    min: Double,
    onBlur: () => Unit,
    onChange: () => Unit,
    onFocus: () => Unit,
    parser: /* input */ String => String,
    step: Double
  ): Max = {
    val __obj = js.Dynamic.literal(max = max.asInstanceOf[js.Any], min = min.asInstanceOf[js.Any], onBlur = js.Any.fromFunction0(onBlur), onChange = js.Any.fromFunction0(onChange), onFocus = js.Any.fromFunction0(onFocus), parser = js.Any.fromFunction1(parser), step = step.asInstanceOf[js.Any])
    __obj.asInstanceOf[Max]
  }
  @scala.inline
  implicit class MaxOps[Self <: Max] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withMax(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("max")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMin(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("min")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOnBlur(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onBlur")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withOnChange(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onChange")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withOnFocus(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onFocus")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withParser(value: /* input */ String => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parser")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withStep(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("step")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

