package typingsSlinky.antDesignReactNative.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Current extends js.Object {
  var current: Double = js.native
  var indicatorStyle: Null = js.native
  var mode: String = js.native
  var simple: Boolean = js.native
  var total: Double = js.native
  def onChange(): Unit = js.native
}

object Current {
  @scala.inline
  def apply(
    current: Double,
    indicatorStyle: Null,
    mode: String,
    onChange: () => Unit,
    simple: Boolean,
    total: Double
  ): Current = {
    val __obj = js.Dynamic.literal(current = current.asInstanceOf[js.Any], indicatorStyle = indicatorStyle.asInstanceOf[js.Any], mode = mode.asInstanceOf[js.Any], onChange = js.Any.fromFunction0(onChange), simple = simple.asInstanceOf[js.Any], total = total.asInstanceOf[js.Any])
    __obj.asInstanceOf[Current]
  }
  @scala.inline
  implicit class CurrentOps[Self <: Current] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCurrent(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("current")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIndicatorStyle(value: Null): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("indicatorStyle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMode(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOnChange(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onChange")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withSimple(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("simple")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTotal(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("total")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

