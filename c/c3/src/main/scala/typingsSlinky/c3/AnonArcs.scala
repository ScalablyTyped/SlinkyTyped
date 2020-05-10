package typingsSlinky.c3

import typingsSlinky.c3.mod.ExpandOptions
import typingsSlinky.c3.mod.LabelOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonArcs extends js.Object {
  var arcs: js.UndefOr[AnonMinWidth] = js.native
  /**
    * Enable or disable expanding gauge.
    */
  var expand: js.UndefOr[ExpandOptions] = js.native
  /**
    * Whether this should be displayed
    * as a full circle instead of a
    * half circle.
    * Defaults to `false`.
    */
  var fullCircle: js.UndefOr[Boolean] = js.native
  var label: js.UndefOr[LabelOptions] = js.native
  var labelLine: js.UndefOr[AnonShow] = js.native
  /**
    * Set max value of the gauge.
    * Defaults to `100`.
    */
  var max: js.UndefOr[Double] = js.native
  /**
    * Set min value of the gauge.
    * Defaults to `0`.
    */
  var min: js.UndefOr[Double] = js.native
  /**
    * Set units of the gauge.
    */
  var units: js.UndefOr[String] = js.native
  /**
    * Set width of gauge chart.
    */
  var width: js.UndefOr[Double] = js.native
}

object AnonArcs {
  @scala.inline
  def apply(): AnonArcs = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnonArcs]
  }
  @scala.inline
  implicit class AnonArcsOps[Self <: AnonArcs] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withArcs(value: AnonMinWidth): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("arcs")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutArcs: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("arcs")(js.undefined)
        ret
    }
    @scala.inline
    def withExpand(value: ExpandOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("expand")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExpand: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("expand")(js.undefined)
        ret
    }
    @scala.inline
    def withFullCircle(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fullCircle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFullCircle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fullCircle")(js.undefined)
        ret
    }
    @scala.inline
    def withLabel(value: LabelOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("label")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLabel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("label")(js.undefined)
        ret
    }
    @scala.inline
    def withLabelLine(value: AnonShow): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("labelLine")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLabelLine: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("labelLine")(js.undefined)
        ret
    }
    @scala.inline
    def withMax(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("max")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMax: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("max")(js.undefined)
        ret
    }
    @scala.inline
    def withMin(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("min")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMin: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("min")(js.undefined)
        ret
    }
    @scala.inline
    def withUnits(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("units")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUnits: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("units")(js.undefined)
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

