package typingsSlinky.jquerymobile

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SearchInputOptions extends js.Object {
  var clearSearchButtonText: js.UndefOr[String] = js.native
  var disabled: js.UndefOr[Boolean] = js.native
  var initSelector: js.UndefOr[String] = js.native
  var mini: js.UndefOr[Boolean] = js.native
  var theme: js.UndefOr[String] = js.native
}

object SearchInputOptions {
  @scala.inline
  def apply(): SearchInputOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SearchInputOptions]
  }
  @scala.inline
  implicit class SearchInputOptionsOps[Self <: SearchInputOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withClearSearchButtonText(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clearSearchButtonText")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutClearSearchButtonText: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clearSearchButtonText")(js.undefined)
        ret
    }
    @scala.inline
    def withDisabled(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDisabled: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disabled")(js.undefined)
        ret
    }
    @scala.inline
    def withInitSelector(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("initSelector")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInitSelector: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("initSelector")(js.undefined)
        ret
    }
    @scala.inline
    def withMini(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mini")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMini: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mini")(js.undefined)
        ret
    }
    @scala.inline
    def withTheme(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("theme")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTheme: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("theme")(js.undefined)
        ret
    }
  }
  
}

