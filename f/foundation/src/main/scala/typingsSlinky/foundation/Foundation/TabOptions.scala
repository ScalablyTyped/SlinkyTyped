package typingsSlinky.foundation.Foundation

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// http://foundation.zurb.com/docs/components/tabs.html
@js.native
trait TabOptions extends js.Object {
  var active_class: js.UndefOr[String] = js.native
  var callback: js.UndefOr[js.Function0[_]] = js.native
  var deep_linking: js.UndefOr[Boolean] = js.native
  var is_hover: js.UndefOr[Boolean] = js.native
  var scroll_to_content: js.UndefOr[Boolean] = js.native
}

object TabOptions {
  @scala.inline
  def apply(): TabOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TabOptions]
  }
  @scala.inline
  implicit class TabOptionsOps[Self <: TabOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withActive_class(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("active_class")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutActive_class: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("active_class")(js.undefined)
        ret
    }
    @scala.inline
    def withCallback(value: () => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("callback")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutCallback: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("callback")(js.undefined)
        ret
    }
    @scala.inline
    def withDeep_linking(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deep_linking")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDeep_linking: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deep_linking")(js.undefined)
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
    def withScroll_to_content(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scroll_to_content")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutScroll_to_content: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scroll_to_content")(js.undefined)
        ret
    }
  }
  
}

