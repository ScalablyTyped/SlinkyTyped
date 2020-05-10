package typingsSlinky.foundationSites.FoundationSites

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IDropdownOptions extends js.Object {
  var autoFocus: js.UndefOr[Boolean] = js.native
  var closeOnClick: js.UndefOr[Boolean] = js.native
  var hOffset: js.UndefOr[Double] = js.native
  var hover: js.UndefOr[Boolean] = js.native
  var hoverDelay: js.UndefOr[Double] = js.native
  var hoverPane: js.UndefOr[Boolean] = js.native
  var positionClass: js.UndefOr[String] = js.native
  var trapFocus: js.UndefOr[Boolean] = js.native
  var vOffset: js.UndefOr[Double] = js.native
}

object IDropdownOptions {
  @scala.inline
  def apply(): IDropdownOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IDropdownOptions]
  }
  @scala.inline
  implicit class IDropdownOptionsOps[Self <: IDropdownOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAutoFocus(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoFocus")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAutoFocus: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoFocus")(js.undefined)
        ret
    }
    @scala.inline
    def withCloseOnClick(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("closeOnClick")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCloseOnClick: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("closeOnClick")(js.undefined)
        ret
    }
    @scala.inline
    def withHOffset(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hOffset")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHOffset: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hOffset")(js.undefined)
        ret
    }
    @scala.inline
    def withHover(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hover")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHover: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hover")(js.undefined)
        ret
    }
    @scala.inline
    def withHoverDelay(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hoverDelay")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHoverDelay: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hoverDelay")(js.undefined)
        ret
    }
    @scala.inline
    def withHoverPane(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hoverPane")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHoverPane: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hoverPane")(js.undefined)
        ret
    }
    @scala.inline
    def withPositionClass(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("positionClass")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPositionClass: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("positionClass")(js.undefined)
        ret
    }
    @scala.inline
    def withTrapFocus(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("trapFocus")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTrapFocus: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("trapFocus")(js.undefined)
        ret
    }
    @scala.inline
    def withVOffset(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("vOffset")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVOffset: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("vOffset")(js.undefined)
        ret
    }
  }
  
}

