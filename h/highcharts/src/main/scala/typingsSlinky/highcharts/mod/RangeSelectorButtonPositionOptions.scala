package typingsSlinky.highcharts.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RangeSelectorButtonPositionOptions extends js.Object {
  /**
    * (Highstock, Gantt) The alignment of the input box. Allowed properties are
    * `left`, `center`, `right`.
    */
  var align: js.UndefOr[AlignValue] = js.native
  /**
    * (Highstock, Gantt) X offset of the button row.
    */
  var x: js.UndefOr[Double] = js.native
  /**
    * (Highstock, Gantt) Y offset of the button row.
    */
  var y: js.UndefOr[Double] = js.native
}

object RangeSelectorButtonPositionOptions {
  @scala.inline
  def apply(): RangeSelectorButtonPositionOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RangeSelectorButtonPositionOptions]
  }
  @scala.inline
  implicit class RangeSelectorButtonPositionOptionsOps[Self <: RangeSelectorButtonPositionOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAlign(value: AlignValue): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("align")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAlign: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("align")(js.undefined)
        ret
    }
    @scala.inline
    def withX(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("x")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutX: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("x")(js.undefined)
        ret
    }
    @scala.inline
    def withY(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("y")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutY: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("y")(js.undefined)
        ret
    }
  }
  
}

