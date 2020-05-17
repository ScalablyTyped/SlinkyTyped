package typingsSlinky.griddleReact.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FilterPlaceholder extends js.Object {
  var filterPlaceholder: js.UndefOr[String] = js.native
  var next: js.UndefOr[String] = js.native
  var previous: js.UndefOr[String] = js.native
  var settingsToggle: js.UndefOr[String] = js.native
}

object FilterPlaceholder {
  @scala.inline
  def apply(): FilterPlaceholder = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FilterPlaceholder]
  }
  @scala.inline
  implicit class FilterPlaceholderOps[Self <: FilterPlaceholder] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFilterPlaceholder(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filterPlaceholder")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFilterPlaceholder: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filterPlaceholder")(js.undefined)
        ret
    }
    @scala.inline
    def withNext(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("next")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNext: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("next")(js.undefined)
        ret
    }
    @scala.inline
    def withPrevious(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("previous")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPrevious: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("previous")(js.undefined)
        ret
    }
    @scala.inline
    def withSettingsToggle(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("settingsToggle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSettingsToggle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("settingsToggle")(js.undefined)
        ret
    }
  }
  
}

