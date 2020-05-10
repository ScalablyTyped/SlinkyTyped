package typingsSlinky.foundation.Foundation

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TopbarOptions extends js.Object {
  var back_text: js.UndefOr[String] = js.native
  var custom_back_text: js.UndefOr[Boolean] = js.native
  var index: js.UndefOr[Double] = js.native
  var is_hover: js.UndefOr[Boolean] = js.native
  var mobile_show_parent_link: js.UndefOr[Boolean] = js.native
  var scrolltop: js.UndefOr[Boolean] = js.native
  var sticky_class: js.UndefOr[String] = js.native
  var sticky_on: js.UndefOr[String] = js.native
}

object TopbarOptions {
  @scala.inline
  def apply(): TopbarOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TopbarOptions]
  }
  @scala.inline
  implicit class TopbarOptionsOps[Self <: TopbarOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBack_text(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("back_text")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBack_text: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("back_text")(js.undefined)
        ret
    }
    @scala.inline
    def withCustom_back_text(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("custom_back_text")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCustom_back_text: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("custom_back_text")(js.undefined)
        ret
    }
    @scala.inline
    def withIndex(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("index")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIndex: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("index")(js.undefined)
        ret
    }
    @scala.inline
    def withIs_hover(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("is_hover")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIs_hover: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("is_hover")(js.undefined)
        ret
    }
    @scala.inline
    def withMobile_show_parent_link(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mobile_show_parent_link")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMobile_show_parent_link: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mobile_show_parent_link")(js.undefined)
        ret
    }
    @scala.inline
    def withScrolltop(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scrolltop")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutScrolltop: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scrolltop")(js.undefined)
        ret
    }
    @scala.inline
    def withSticky_class(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sticky_class")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSticky_class: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sticky_class")(js.undefined)
        ret
    }
    @scala.inline
    def withSticky_on(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sticky_on")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSticky_on: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sticky_on")(js.undefined)
        ret
    }
  }
  
}

