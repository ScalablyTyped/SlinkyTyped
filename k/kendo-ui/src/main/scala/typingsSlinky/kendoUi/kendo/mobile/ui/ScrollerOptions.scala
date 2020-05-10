package typingsSlinky.kendoUi.kendo.mobile.ui

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ScrollerOptions extends js.Object {
  var elastic: js.UndefOr[Boolean] = js.native
  var messages: js.UndefOr[ScrollerMessages] = js.native
  var name: js.UndefOr[String] = js.native
  var pull: js.UndefOr[js.Function1[/* e */ ScrollerEvent, Unit]] = js.native
  var pullOffset: js.UndefOr[Double] = js.native
  var pullToRefresh: js.UndefOr[Boolean] = js.native
  var resize: js.UndefOr[js.Function1[/* e */ ScrollerEvent, Unit]] = js.native
  var scroll: js.UndefOr[js.Function1[/* e */ ScrollerScrollEvent, Unit]] = js.native
  var useNative: js.UndefOr[Boolean] = js.native
  var visibleScrollHints: js.UndefOr[Boolean] = js.native
  var zoom: js.UndefOr[Boolean] = js.native
}

object ScrollerOptions {
  @scala.inline
  def apply(): ScrollerOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ScrollerOptions]
  }
  @scala.inline
  implicit class ScrollerOptionsOps[Self <: ScrollerOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withElastic(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("elastic")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutElastic: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("elastic")(js.undefined)
        ret
    }
    @scala.inline
    def withMessages(value: ScrollerMessages): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("messages")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMessages: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("messages")(js.undefined)
        ret
    }
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(js.undefined)
        ret
    }
    @scala.inline
    def withPull(value: /* e */ ScrollerEvent => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pull")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutPull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pull")(js.undefined)
        ret
    }
    @scala.inline
    def withPullOffset(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pullOffset")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPullOffset: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pullOffset")(js.undefined)
        ret
    }
    @scala.inline
    def withPullToRefresh(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pullToRefresh")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPullToRefresh: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pullToRefresh")(js.undefined)
        ret
    }
    @scala.inline
    def withResize(value: /* e */ ScrollerEvent => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resize")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutResize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resize")(js.undefined)
        ret
    }
    @scala.inline
    def withScroll(value: /* e */ ScrollerScrollEvent => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scroll")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutScroll: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scroll")(js.undefined)
        ret
    }
    @scala.inline
    def withUseNative(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("useNative")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUseNative: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("useNative")(js.undefined)
        ret
    }
    @scala.inline
    def withVisibleScrollHints(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("visibleScrollHints")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVisibleScrollHints: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("visibleScrollHints")(js.undefined)
        ret
    }
    @scala.inline
    def withZoom(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("zoom")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutZoom: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("zoom")(js.undefined)
        ret
    }
  }
  
}

