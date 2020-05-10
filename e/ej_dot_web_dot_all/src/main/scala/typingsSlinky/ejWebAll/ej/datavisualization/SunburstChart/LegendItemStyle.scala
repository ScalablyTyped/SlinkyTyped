package typingsSlinky.ejWebAll.ej.datavisualization.SunburstChart

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LegendItemStyle extends js.Object {
  /** Height of the shape in legend items.
    * @Default {10}
    */
  var height: js.UndefOr[Double] = js.native
  /** Width of the shape in legend items.
    * @Default {10}
    */
  var width: js.UndefOr[Double] = js.native
}

object LegendItemStyle {
  @scala.inline
  def apply(): LegendItemStyle = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LegendItemStyle]
  }
  @scala.inline
  implicit class LegendItemStyleOps[Self <: LegendItemStyle] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withHeight(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("height")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHeight: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("height")(js.undefined)
        ret
    }
    @scala.inline
    def withWidth(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("width")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWidth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("width")(js.undefined)
        ret
    }
  }
  
}

