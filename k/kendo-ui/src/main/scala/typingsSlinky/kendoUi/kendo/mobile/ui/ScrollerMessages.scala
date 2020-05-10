package typingsSlinky.kendoUi.kendo.mobile.ui

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ScrollerMessages extends js.Object {
  var pullTemplate: js.UndefOr[String] = js.native
  var refreshTemplate: js.UndefOr[String] = js.native
  var releaseTemplate: js.UndefOr[String] = js.native
}

object ScrollerMessages {
  @scala.inline
  def apply(): ScrollerMessages = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ScrollerMessages]
  }
  @scala.inline
  implicit class ScrollerMessagesOps[Self <: ScrollerMessages] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withPullTemplate(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pullTemplate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPullTemplate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pullTemplate")(js.undefined)
        ret
    }
    @scala.inline
    def withRefreshTemplate(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("refreshTemplate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRefreshTemplate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("refreshTemplate")(js.undefined)
        ret
    }
    @scala.inline
    def withReleaseTemplate(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("releaseTemplate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReleaseTemplate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("releaseTemplate")(js.undefined)
        ret
    }
  }
  
}

