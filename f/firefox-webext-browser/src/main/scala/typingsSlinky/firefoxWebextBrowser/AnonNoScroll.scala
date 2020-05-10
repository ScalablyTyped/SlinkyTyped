package typingsSlinky.firefoxWebextBrowser

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonNoScroll extends js.Object {
  /** Don't scroll to highlighted item. */
  var noScroll: js.UndefOr[Boolean] = js.native
  /** Found range to be highlighted. Default highlights all ranges. */
  var rangeIndex: js.UndefOr[Double] = js.native
  /** Tab to highlight. Defaults to the active tab. */
  var tabId: js.UndefOr[Double] = js.native
}

object AnonNoScroll {
  @scala.inline
  def apply(): AnonNoScroll = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnonNoScroll]
  }
  @scala.inline
  implicit class AnonNoScrollOps[Self <: AnonNoScroll] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withNoScroll(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("noScroll")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNoScroll: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("noScroll")(js.undefined)
        ret
    }
    @scala.inline
    def withRangeIndex(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rangeIndex")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRangeIndex: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rangeIndex")(js.undefined)
        ret
    }
    @scala.inline
    def withTabId(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tabId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTabId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tabId")(js.undefined)
        ret
    }
  }
  
}

