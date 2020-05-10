package typingsSlinky.later.mod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Recurrence
  extends /*
  * Custom Time Periods and Modifiers
  * For acces to custom time periods created as extension to the later static type
  * and modifiers created on the later modifier static type.
  */
/* timeperiodAndModifierName */ StringDictionary[js.UndefOr[js.Array[Double]]] {
  /** Day of the month. */
  var D: js.UndefOr[js.Array[Double]] = js.native
  /** After modifiers. */
  var D_a: js.UndefOr[js.Array[Double]] = js.native
  /** Before modifiers. */
  var D_b: js.UndefOr[js.Array[Double]] = js.native
  /** Month in year. */
  var M: js.UndefOr[js.Array[Double]] = js.native
  /** After modifiers. */
  var M_a: js.UndefOr[js.Array[Double]] = js.native
  /** Before modifiers. */
  var M_b: js.UndefOr[js.Array[Double]] = js.native
  /** Year. */
  var Y: js.UndefOr[js.Array[Double]] = js.native
  /** After modifiers. */
  var Y_a: js.UndefOr[js.Array[Double]] = js.native
  /** Before modifiers. */
  var Y_b: js.UndefOr[js.Array[Double]] = js.native
  /** Nth day of the week in month. */
  var dc: js.UndefOr[js.Array[Double]] = js.native
  /** After modifiers. */
  var dc_a: js.UndefOr[js.Array[Double]] = js.native
  /** Before modifiers. */
  var dc_b: js.UndefOr[js.Array[Double]] = js.native
  /** Day in week. */
  var dw: js.UndefOr[js.Array[Double]] = js.native
  /** After modifiers. */
  var dw_a: js.UndefOr[js.Array[Double]] = js.native
  /** Before modifiers. */
  var dw_b: js.UndefOr[js.Array[Double]] = js.native
  /** Day in year. */
  var dy: js.UndefOr[js.Array[Double]] = js.native
  /** After modifiers. */
  var dy_a: js.UndefOr[js.Array[Double]] = js.native
  /** Before modifiers. */
  var dy_b: js.UndefOr[js.Array[Double]] = js.native
  /** Hour in day. */
  var h: js.UndefOr[js.Array[Double]] = js.native
  /** After modifiers. */
  var h_a: js.UndefOr[js.Array[Double]] = js.native
  /** Before modifiers. */
  var h_b: js.UndefOr[js.Array[Double]] = js.native
  /** Minutes in hour. */
  var m: js.UndefOr[js.Array[Double]] = js.native
  /** After modifiers. */
  var m_a: js.UndefOr[js.Array[Double]] = js.native
  /** Before modifiers. */
  var m_b: js.UndefOr[js.Array[Double]] = js.native
  /** Seconds in minute. */
  var s: js.UndefOr[js.Array[Double]] = js.native
  /** After modifiers. */
  var s_a: js.UndefOr[js.Array[Double]] = js.native
  /** Before modifiers. */
  var s_b: js.UndefOr[js.Array[Double]] = js.native
  /** Time in seconds from midnight. */
  var t: js.UndefOr[js.Array[Double]] = js.native
  /** After modifiers. */
  var t_a: js.UndefOr[js.Array[Double]] = js.native
  /** Before modifiers. */
  var t_b: js.UndefOr[js.Array[Double]] = js.native
  /** Week in month. */
  var wm: js.UndefOr[js.Array[Double]] = js.native
  /** After modifiers. */
  var wm_a: js.UndefOr[js.Array[Double]] = js.native
  /** Before modifiers. */
  var wm_b: js.UndefOr[js.Array[Double]] = js.native
  /** ISO week in year. */
  var wy: js.UndefOr[js.Array[Double]] = js.native
  /** After modifiers. */
  var wy_a: js.UndefOr[js.Array[Double]] = js.native
  /** Before modifiers. */
  var wy_b: js.UndefOr[js.Array[Double]] = js.native
}

object Recurrence {
  @scala.inline
  def apply(): Recurrence = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Recurrence]
  }
  @scala.inline
  implicit class RecurrenceOps[Self <: Recurrence] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withD(value: js.Array[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("D")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutD: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("D")(js.undefined)
        ret
    }
    @scala.inline
    def withD_a(value: js.Array[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("D_a")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutD_a: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("D_a")(js.undefined)
        ret
    }
    @scala.inline
    def withD_b(value: js.Array[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("D_b")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutD_b: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("D_b")(js.undefined)
        ret
    }
    @scala.inline
    def withM(value: js.Array[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("M")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutM: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("M")(js.undefined)
        ret
    }
    @scala.inline
    def withM_a(value: js.Array[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("M_a")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutM_a: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("M_a")(js.undefined)
        ret
    }
    @scala.inline
    def withM_b(value: js.Array[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("M_b")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutM_b: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("M_b")(js.undefined)
        ret
    }
    @scala.inline
    def withY(value: js.Array[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Y")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutY: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Y")(js.undefined)
        ret
    }
    @scala.inline
    def withY_a(value: js.Array[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Y_a")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutY_a: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Y_a")(js.undefined)
        ret
    }
    @scala.inline
    def withY_b(value: js.Array[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Y_b")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutY_b: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Y_b")(js.undefined)
        ret
    }
    @scala.inline
    def withDc(value: js.Array[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dc")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDc: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dc")(js.undefined)
        ret
    }
    @scala.inline
    def withDc_a(value: js.Array[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dc_a")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDc_a: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dc_a")(js.undefined)
        ret
    }
    @scala.inline
    def withDc_b(value: js.Array[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dc_b")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDc_b: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dc_b")(js.undefined)
        ret
    }
    @scala.inline
    def withDw(value: js.Array[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dw")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDw: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dw")(js.undefined)
        ret
    }
    @scala.inline
    def withDw_a(value: js.Array[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dw_a")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDw_a: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dw_a")(js.undefined)
        ret
    }
    @scala.inline
    def withDw_b(value: js.Array[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dw_b")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDw_b: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dw_b")(js.undefined)
        ret
    }
    @scala.inline
    def withDy(value: js.Array[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dy")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDy: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dy")(js.undefined)
        ret
    }
    @scala.inline
    def withDy_a(value: js.Array[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dy_a")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDy_a: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dy_a")(js.undefined)
        ret
    }
    @scala.inline
    def withDy_b(value: js.Array[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dy_b")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDy_b: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dy_b")(js.undefined)
        ret
    }
    @scala.inline
    def withH(value: js.Array[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("h")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutH: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("h")(js.undefined)
        ret
    }
    @scala.inline
    def withH_a(value: js.Array[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("h_a")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutH_a: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("h_a")(js.undefined)
        ret
    }
    @scala.inline
    def withH_b(value: js.Array[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("h_b")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutH_b: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("h_b")(js.undefined)
        ret
    }
    @scala.inline
    def withS(value: js.Array[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("s")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutS: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("s")(js.undefined)
        ret
    }
    @scala.inline
    def withS_a(value: js.Array[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("s_a")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutS_a: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("s_a")(js.undefined)
        ret
    }
    @scala.inline
    def withS_b(value: js.Array[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("s_b")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutS_b: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("s_b")(js.undefined)
        ret
    }
    @scala.inline
    def withT(value: js.Array[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("t")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutT: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("t")(js.undefined)
        ret
    }
    @scala.inline
    def withT_a(value: js.Array[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("t_a")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutT_a: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("t_a")(js.undefined)
        ret
    }
    @scala.inline
    def withT_b(value: js.Array[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("t_b")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutT_b: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("t_b")(js.undefined)
        ret
    }
    @scala.inline
    def withWm(value: js.Array[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("wm")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWm: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("wm")(js.undefined)
        ret
    }
    @scala.inline
    def withWm_a(value: js.Array[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("wm_a")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWm_a: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("wm_a")(js.undefined)
        ret
    }
    @scala.inline
    def withWm_b(value: js.Array[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("wm_b")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWm_b: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("wm_b")(js.undefined)
        ret
    }
    @scala.inline
    def withWy(value: js.Array[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("wy")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWy: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("wy")(js.undefined)
        ret
    }
    @scala.inline
    def withWy_a(value: js.Array[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("wy_a")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWy_a: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("wy_a")(js.undefined)
        ret
    }
    @scala.inline
    def withWy_b(value: js.Array[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("wy_b")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWy_b: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("wy_b")(js.undefined)
        ret
    }
  }
  
}

