package typingsSlinky.highcharts.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StackItemObject extends js.Object {
  /**
    * Alignment settings
    */
  var alignOptions: AlignObject = js.native
  /**
    * Related axis
    */
  var axis: Axis = js.native
  /**
    * Cumulative value of the stacked data points
    */
  var cumulative: Double = js.native
  /**
    * True if on the negative side
    */
  var isNegative: Boolean = js.native
  /**
    * Related SVG element
    */
  var label: SVGElement = js.native
  /**
    * Related stack options
    */
  var options: YAxisStackLabelsOptions = js.native
  /**
    * Total value of the stacked data points
    */
  var total: Double = js.native
  /**
    * Shared x value of the stack
    */
  var x: Double = js.native
}

object StackItemObject {
  @scala.inline
  def apply(
    alignOptions: AlignObject,
    axis: Axis,
    cumulative: Double,
    isNegative: Boolean,
    label: SVGElement,
    options: YAxisStackLabelsOptions,
    total: Double,
    x: Double
  ): StackItemObject = {
    val __obj = js.Dynamic.literal(alignOptions = alignOptions.asInstanceOf[js.Any], axis = axis.asInstanceOf[js.Any], cumulative = cumulative.asInstanceOf[js.Any], isNegative = isNegative.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any], options = options.asInstanceOf[js.Any], total = total.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any])
    __obj.asInstanceOf[StackItemObject]
  }
  @scala.inline
  implicit class StackItemObjectOps[Self <: StackItemObject] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAlignOptions(value: AlignObject): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("alignOptions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAxis(value: Axis): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("axis")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCumulative(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cumulative")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsNegative(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isNegative")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLabel(value: SVGElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("label")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOptions(value: YAxisStackLabelsOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("options")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTotal(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("total")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withX(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("x")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

