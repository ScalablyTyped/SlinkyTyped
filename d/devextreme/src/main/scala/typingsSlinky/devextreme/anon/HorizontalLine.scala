package typingsSlinky.devextreme.anon

import typingsSlinky.devextreme.devextremeStrings.dash
import typingsSlinky.devextreme.devextremeStrings.dot
import typingsSlinky.devextreme.devextremeStrings.longDash
import typingsSlinky.devextreme.devextremeStrings.solid
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait HorizontalLine extends js.Object {
  var color: js.UndefOr[String] = js.native
  var dashStyle: js.UndefOr[dash | dot | longDash | solid] = js.native
  var enabled: js.UndefOr[Boolean] = js.native
  var horizontalLine: js.UndefOr[DashStyle | Boolean] = js.native
  var label: js.UndefOr[BackgroundColorCustomizeText] = js.native
  var opacity: js.UndefOr[Double] = js.native
  var verticalLine: js.UndefOr[DashStyle | Boolean] = js.native
  var width: js.UndefOr[Double] = js.native
}

object HorizontalLine {
  @scala.inline
  def apply(): HorizontalLine = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[HorizontalLine]
  }
  @scala.inline
  implicit class HorizontalLineOps[Self <: HorizontalLine] (val x: Self) extends AnyVal {
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
    def withDashStyle(value: dash | dot | longDash | solid): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dashStyle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDashStyle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dashStyle")(js.undefined)
        ret
    }
    @scala.inline
    def withEnabled(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnabled: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enabled")(js.undefined)
        ret
    }
    @scala.inline
    def withHorizontalLine(value: DashStyle | Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("horizontalLine")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHorizontalLine: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("horizontalLine")(js.undefined)
        ret
    }
    @scala.inline
    def withLabel(value: BackgroundColorCustomizeText): Self = {
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
    def withOpacity(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("opacity")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOpacity: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("opacity")(js.undefined)
        ret
    }
    @scala.inline
    def withVerticalLine(value: DashStyle | Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("verticalLine")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVerticalLine: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("verticalLine")(js.undefined)
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

