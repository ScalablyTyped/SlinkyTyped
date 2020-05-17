package typingsSlinky.androiduix.android.text.Layout

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TabStops extends js.Object {
  var mIncrement: js.Any = js.native
  var mNumStops: js.Any = js.native
  var mStops: js.Any = js.native
  def nextTab(h: Double): Double = js.native
  def reset(increment: Double, spans: js.Array[_]): Unit = js.native
}

object TabStops {
  @scala.inline
  def apply(
    mIncrement: js.Any,
    mNumStops: js.Any,
    mStops: js.Any,
    nextTab: Double => Double,
    reset: (Double, js.Array[_]) => Unit
  ): TabStops = {
    val __obj = js.Dynamic.literal(mIncrement = mIncrement.asInstanceOf[js.Any], mNumStops = mNumStops.asInstanceOf[js.Any], mStops = mStops.asInstanceOf[js.Any], nextTab = js.Any.fromFunction1(nextTab), reset = js.Any.fromFunction2(reset))
    __obj.asInstanceOf[TabStops]
  }
  @scala.inline
  implicit class TabStopsOps[Self <: TabStops] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withMIncrement(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mIncrement")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMNumStops(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mNumStops")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMStops(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mStops")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNextTab(value: Double => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nextTab")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withReset(value: (Double, js.Array[_]) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reset")(js.Any.fromFunction2(value))
        ret
    }
  }
  
}

