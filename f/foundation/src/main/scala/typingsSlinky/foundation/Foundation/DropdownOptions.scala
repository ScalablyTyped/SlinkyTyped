package typingsSlinky.foundation.Foundation

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// http://foundation.zurb.com/docs/components/dropdown.html#optional-javascript-configuration
@js.native
trait DropdownOptions extends js.Object {
  var active_class: js.UndefOr[String] = js.native
  var align: js.UndefOr[String] = js.native
  var closed: js.UndefOr[js.Function0[_]] = js.native
  var disabled_class: js.UndefOr[String] = js.native
  var hover_timeout: js.UndefOr[Double] = js.native
  var is_hover: js.UndefOr[Boolean] = js.native
  var mega_class: js.UndefOr[String] = js.native
  var opened: js.UndefOr[js.Function0[_]] = js.native
}

object DropdownOptions {
  @scala.inline
  def apply(): DropdownOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DropdownOptions]
  }
  @scala.inline
  implicit class DropdownOptionsOps[Self <: DropdownOptions] (val x: Self) extends AnyVal {
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
    def withClosed(value: () => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("closed")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutClosed: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("closed")(js.undefined)
        ret
    }
    @scala.inline
    def withDisabled_class(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disabled_class")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDisabled_class: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disabled_class")(js.undefined)
        ret
    }
    @scala.inline
    def withHover_timeout(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hover_timeout")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHover_timeout: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hover_timeout")(js.undefined)
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
    def withMega_class(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mega_class")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMega_class: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mega_class")(js.undefined)
        ret
    }
    @scala.inline
    def withOpened(value: () => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("opened")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutOpened: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("opened")(js.undefined)
        ret
    }
  }
  
}

