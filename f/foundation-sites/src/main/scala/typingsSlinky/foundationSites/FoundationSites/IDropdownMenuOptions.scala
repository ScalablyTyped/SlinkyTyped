package typingsSlinky.foundationSites.FoundationSites

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IDropdownMenuOptions extends js.Object {
  var alignment: js.UndefOr[String] = js.native
  var autoclose: js.UndefOr[Boolean] = js.native
  var clickOpen: js.UndefOr[Boolean] = js.native
  var closeOnClick: js.UndefOr[Boolean] = js.native
  var closingTime: js.UndefOr[Double] = js.native
  var disableHover: js.UndefOr[Boolean] = js.native
  var forceFollow: js.UndefOr[Boolean] = js.native
  var hoverDelay: js.UndefOr[Double] = js.native
  var rightClass: js.UndefOr[String] = js.native
  var verticalClass: js.UndefOr[String] = js.native
}

object IDropdownMenuOptions {
  @scala.inline
  def apply(): IDropdownMenuOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IDropdownMenuOptions]
  }
  @scala.inline
  implicit class IDropdownMenuOptionsOps[Self <: IDropdownMenuOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAlignment(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("alignment")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAlignment: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("alignment")(js.undefined)
        ret
    }
    @scala.inline
    def withAutoclose(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoclose")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAutoclose: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoclose")(js.undefined)
        ret
    }
    @scala.inline
    def withClickOpen(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clickOpen")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutClickOpen: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clickOpen")(js.undefined)
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
    def withClosingTime(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("closingTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutClosingTime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("closingTime")(js.undefined)
        ret
    }
    @scala.inline
    def withDisableHover(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disableHover")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDisableHover: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disableHover")(js.undefined)
        ret
    }
    @scala.inline
    def withForceFollow(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("forceFollow")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutForceFollow: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("forceFollow")(js.undefined)
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
    def withRightClass(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rightClass")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRightClass: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rightClass")(js.undefined)
        ret
    }
    @scala.inline
    def withVerticalClass(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("verticalClass")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVerticalClass: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("verticalClass")(js.undefined)
        ret
    }
  }
  
}

