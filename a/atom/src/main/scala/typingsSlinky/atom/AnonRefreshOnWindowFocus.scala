package typingsSlinky.atom

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonRefreshOnWindowFocus extends js.Object {
  var refreshOnWindowFocus: js.UndefOr[Boolean] = js.native
}

object AnonRefreshOnWindowFocus {
  @scala.inline
  def apply(): AnonRefreshOnWindowFocus = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnonRefreshOnWindowFocus]
  }
  @scala.inline
  implicit class AnonRefreshOnWindowFocusOps[Self <: AnonRefreshOnWindowFocus] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withRefreshOnWindowFocus(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("refreshOnWindowFocus")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRefreshOnWindowFocus: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("refreshOnWindowFocus")(js.undefined)
        ret
    }
  }
  
}

