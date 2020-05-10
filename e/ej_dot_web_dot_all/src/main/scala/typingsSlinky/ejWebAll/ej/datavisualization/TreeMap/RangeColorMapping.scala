package typingsSlinky.ejWebAll.ej.datavisualization.TreeMap

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RangeColorMapping extends js.Object {
  /** Specifies the color value for rangeColorMapping.
    * @Default {null}
    */
  var color: js.UndefOr[String] = js.native
  /** Specifies the from value for rangeColorMapping.
    * @Default {-1}
    */
  var from: js.UndefOr[Double] = js.native
  /** specifies the gradient colors for th given range value
    * @Default {[]}
    */
  var gradientColors: js.UndefOr[js.Array[_]] = js.native
  /** Specifies the legend label value for rangeColorMapping.
    * @Default {null}
    */
  var legendLabel: js.UndefOr[String] = js.native
  /** Specifies the to value for rangeColorMapping.
    * @Default {-1}
    */
  var to: js.UndefOr[Double] = js.native
}

object RangeColorMapping {
  @scala.inline
  def apply(): RangeColorMapping = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RangeColorMapping]
  }
  @scala.inline
  implicit class RangeColorMappingOps[Self <: RangeColorMapping] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withColor(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("color")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutColor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("color")(js.undefined)
        ret
    }
    @scala.inline
    def withFrom(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("from")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFrom: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("from")(js.undefined)
        ret
    }
    @scala.inline
    def withGradientColors(value: js.Array[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gradientColors")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGradientColors: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gradientColors")(js.undefined)
        ret
    }
    @scala.inline
    def withLegendLabel(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("legendLabel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLegendLabel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("legendLabel")(js.undefined)
        ret
    }
    @scala.inline
    def withTo(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("to")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTo: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("to")(js.undefined)
        ret
    }
  }
  
}

