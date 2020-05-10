package typingsSlinky.backbonePaginator.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PageableSwitchModeOptions extends js.Object {
  var fetch: js.UndefOr[Boolean] = js.native
  var resetState: js.UndefOr[Boolean] = js.native
}

object PageableSwitchModeOptions {
  @scala.inline
  def apply(): PageableSwitchModeOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PageableSwitchModeOptions]
  }
  @scala.inline
  implicit class PageableSwitchModeOptionsOps[Self <: PageableSwitchModeOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFetch(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fetch")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFetch: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fetch")(js.undefined)
        ret
    }
    @scala.inline
    def withResetState(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resetState")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutResetState: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resetState")(js.undefined)
        ret
    }
  }
  
}

