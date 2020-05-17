package typingsSlinky.calHeatmap.mod.global.CalHeatMap

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Position and alignment of the domain label. */
@js.native
trait Label extends js.Object {
  /**
  			 * Horizontal align of the domain. Default: "center"
  			 * Valid values: {"left", "center", "right"}
  			 */
  var align: js.UndefOr[String] = js.native
  /**
  			 * Height of the domain label in pixels.
  			 * By leaving it to null, the label will be set to 2 times the height of the subDomain cell.
  			 * If you want to remove the label, set domainLabelFormat to "" (empty string), instead
  			 * of setting the label height to 0. Default: null
  			 * Valid values: any integer
  			 */
  var height: js.UndefOr[Double] = js.native
  /**
  			 * More control about label positioning, if the default value does not fit your need,
  			 * especially when label is rotated, or when using a big font-size. Default: {x:0, y:0}
  			 */
  var offset: js.UndefOr[LabelOffset] = js.native
  /**
  			 * Position of the label, relative to the domain. Default: "bottom"
  			 * Valid values: {"top", "right", "bottom", "left"}
  			 */
  var position: js.UndefOr[String] = js.native
  /**
  			 * Rotation for a vertical label. Default: null
  			 * Valid values: {null, "left", "right"}
  			 */
  var rotate: js.UndefOr[String] = js.native
  /**
  			 * Only used when label is rotated, defines the width of the label. Default: 100
  			 * Valid values: any intger
  			 */
  var width: js.UndefOr[Double] = js.native
}

object Label {
  @scala.inline
  def apply(): Label = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Label]
  }
  @scala.inline
  implicit class LabelOps[Self <: Label] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAlign(value: String): Self = {
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
    def withOffset(value: LabelOffset): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("offset")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOffset: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("offset")(js.undefined)
        ret
    }
    @scala.inline
    def withPosition(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("position")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPosition: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("position")(js.undefined)
        ret
    }
    @scala.inline
    def withRotate(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rotate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRotate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rotate")(js.undefined)
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

