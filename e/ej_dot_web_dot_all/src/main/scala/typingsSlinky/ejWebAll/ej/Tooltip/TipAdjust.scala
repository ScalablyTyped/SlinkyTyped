package typingsSlinky.ejWebAll.ej.Tooltip

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TipAdjust extends js.Object {
  /** Sets horizontal gap between Tooltip and target element.
    * @Default {0}
    */
  var xValue: js.UndefOr[Double] = js.native
  /** Sets vertical gap between Tooltip and target element.
    * @Default {0}
    */
  var yValue: js.UndefOr[Double] = js.native
}

object TipAdjust {
  @scala.inline
  def apply(): TipAdjust = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TipAdjust]
  }
  @scala.inline
  implicit class TipAdjustOps[Self <: TipAdjust] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withXValue(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("xValue")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutXValue: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("xValue")(js.undefined)
        ret
    }
    @scala.inline
    def withYValue(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("yValue")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutYValue: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("yValue")(js.undefined)
        ret
    }
  }
  
}

