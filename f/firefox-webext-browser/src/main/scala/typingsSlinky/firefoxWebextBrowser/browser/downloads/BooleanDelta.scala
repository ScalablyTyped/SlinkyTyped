package typingsSlinky.firefoxWebextBrowser.browser.downloads

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BooleanDelta extends js.Object {
  var current: js.UndefOr[Boolean] = js.native
  var previous: js.UndefOr[Boolean] = js.native
}

object BooleanDelta {
  @scala.inline
  def apply(): BooleanDelta = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BooleanDelta]
  }
  @scala.inline
  implicit class BooleanDeltaOps[Self <: BooleanDelta] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCurrent(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("current")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCurrent: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("current")(js.undefined)
        ret
    }
    @scala.inline
    def withPrevious(value: Boolean): Self = {
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
  }
  
}

