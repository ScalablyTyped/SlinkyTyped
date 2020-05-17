package typingsSlinky.devextreme.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait HeaderHeight extends js.Object {
  var border: js.UndefOr[ColorWidth] = js.native
  var color: js.UndefOr[String] = js.native
  var headerHeight: js.UndefOr[Double] = js.native
  var hoverEnabled: js.UndefOr[Boolean] = js.native
  var hoverStyle: js.UndefOr[BorderColorWidth] = js.native
  var label: js.UndefOr[TextOverflow] = js.native
  var selectionStyle: js.UndefOr[BorderColorWidth] = js.native
}

object HeaderHeight {
  @scala.inline
  def apply(): HeaderHeight = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[HeaderHeight]
  }
  @scala.inline
  implicit class HeaderHeightOps[Self <: HeaderHeight] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBorder(value: ColorWidth): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("border")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBorder: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("border")(js.undefined)
        ret
    }
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
    def withHeaderHeight(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("headerHeight")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHeaderHeight: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("headerHeight")(js.undefined)
        ret
    }
    @scala.inline
    def withHoverEnabled(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hoverEnabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHoverEnabled: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hoverEnabled")(js.undefined)
        ret
    }
    @scala.inline
    def withHoverStyle(value: BorderColorWidth): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hoverStyle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHoverStyle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hoverStyle")(js.undefined)
        ret
    }
    @scala.inline
    def withLabel(value: TextOverflow): Self = {
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
    def withSelectionStyle(value: BorderColorWidth): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectionStyle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSelectionStyle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectionStyle")(js.undefined)
        ret
    }
  }
  
}

