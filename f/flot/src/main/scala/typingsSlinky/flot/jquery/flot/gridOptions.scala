package typingsSlinky.flot.jquery.flot

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait gridOptions extends js.Object {
  var aboveData: js.UndefOr[Boolean] = js.native
  var autoHighlight: js.UndefOr[Boolean] = js.native
  var axisMargin: js.UndefOr[Double] = js.native
                  // color
  var backgroundColor: js.UndefOr[js.Any] = js.native
            // number or width object
  var borderColor: js.UndefOr[js.Any] = js.native
               //array of markings or (fn: axes -> array of markings)
  var borderWidth: js.UndefOr[js.Any] = js.native
         // or null
  var clickable: js.UndefOr[Boolean] = js.native
  var color: js.UndefOr[js.Any] = js.native
  var hoverable: js.UndefOr[Boolean] = js.native
                  // number or margin object
  var labelMargin: js.UndefOr[Double] = js.native
        //color/gradient or null
  var margin: js.UndefOr[js.Any] = js.native
  var markings: js.UndefOr[js.Any] = js.native
  var markingsColor: js.UndefOr[js.Any] = js.native
  var markingsLineWidth: js.UndefOr[Double] = js.native
            // color or null
  var minBorderMargin: js.UndefOr[Double] = js.native
  var mouseActiveRadius: js.UndefOr[Double] = js.native
  var show: js.UndefOr[Boolean] = js.native
  var tickColor: js.UndefOr[js.Any] = js.native
}

object gridOptions {
  @scala.inline
  def apply(): gridOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[gridOptions]
  }
  @scala.inline
  implicit class gridOptionsOps[Self <: gridOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAboveData(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("aboveData")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAboveData: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("aboveData")(js.undefined)
        ret
    }
    @scala.inline
    def withAutoHighlight(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoHighlight")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAutoHighlight: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoHighlight")(js.undefined)
        ret
    }
    @scala.inline
    def withAxisMargin(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("axisMargin")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAxisMargin: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("axisMargin")(js.undefined)
        ret
    }
    @scala.inline
    def withBackgroundColor(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("backgroundColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBackgroundColor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("backgroundColor")(js.undefined)
        ret
    }
    @scala.inline
    def withBorderColor(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("borderColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBorderColor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("borderColor")(js.undefined)
        ret
    }
    @scala.inline
    def withBorderWidth(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("borderWidth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBorderWidth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("borderWidth")(js.undefined)
        ret
    }
    @scala.inline
    def withClickable(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clickable")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutClickable: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clickable")(js.undefined)
        ret
    }
    @scala.inline
    def withColor(value: js.Any): Self = {
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
    def withHoverable(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hoverable")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHoverable: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hoverable")(js.undefined)
        ret
    }
    @scala.inline
    def withLabelMargin(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("labelMargin")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLabelMargin: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("labelMargin")(js.undefined)
        ret
    }
    @scala.inline
    def withMargin(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("margin")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMargin: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("margin")(js.undefined)
        ret
    }
    @scala.inline
    def withMarkings(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("markings")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMarkings: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("markings")(js.undefined)
        ret
    }
    @scala.inline
    def withMarkingsColor(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("markingsColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMarkingsColor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("markingsColor")(js.undefined)
        ret
    }
    @scala.inline
    def withMarkingsLineWidth(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("markingsLineWidth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMarkingsLineWidth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("markingsLineWidth")(js.undefined)
        ret
    }
    @scala.inline
    def withMinBorderMargin(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minBorderMargin")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMinBorderMargin: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minBorderMargin")(js.undefined)
        ret
    }
    @scala.inline
    def withMouseActiveRadius(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mouseActiveRadius")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMouseActiveRadius: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mouseActiveRadius")(js.undefined)
        ret
    }
    @scala.inline
    def withShow(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("show")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShow: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("show")(js.undefined)
        ret
    }
    @scala.inline
    def withTickColor(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tickColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTickColor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tickColor")(js.undefined)
        ret
    }
  }
  
}

