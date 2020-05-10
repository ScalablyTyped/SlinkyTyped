package typingsSlinky.jquerymobile

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait JQueryMobileEvents extends js.Object {
  var orientationchange: js.Any = js.native
  var pagebeforechange: js.Any = js.native
  var pagebeforecreate: js.Any = js.native
  var pagebeforehide: js.Any = js.native
  var pagebeforeload: js.Any = js.native
  var pagebeforeshow: js.Any = js.native
  var pagechange: js.Any = js.native
  var pagechangefailed: js.Any = js.native
  var pagecreate: js.Any = js.native
  var pagehide: js.Any = js.native
  var pageinit: js.Any = js.native
  var pageload: js.Any = js.native
  var pageloadfailed: js.Any = js.native
  var pageremove: js.Any = js.native
  var pageshow: js.Any = js.native
  var scrollstart: js.Any = js.native
  var scrollstop: js.Any = js.native
  var swipe: js.Any = js.native
  var swipeleft: js.Any = js.native
  var swiperight: js.Any = js.native
  var tap: js.Any = js.native
  var taphold: js.Any = js.native
  var updatelayout: js.Any = js.native
  var vclick: js.Any = js.native
  var vmousecancel: js.Any = js.native
  var vmousedown: js.Any = js.native
  var vmousemove: js.Any = js.native
  var vmouseout: js.Any = js.native
  var vmouseover: js.Any = js.native
  var vmouseup: js.Any = js.native
}

object JQueryMobileEvents {
  @scala.inline
  def apply(
    orientationchange: js.Any,
    pagebeforechange: js.Any,
    pagebeforecreate: js.Any,
    pagebeforehide: js.Any,
    pagebeforeload: js.Any,
    pagebeforeshow: js.Any,
    pagechange: js.Any,
    pagechangefailed: js.Any,
    pagecreate: js.Any,
    pagehide: js.Any,
    pageinit: js.Any,
    pageload: js.Any,
    pageloadfailed: js.Any,
    pageremove: js.Any,
    pageshow: js.Any,
    scrollstart: js.Any,
    scrollstop: js.Any,
    swipe: js.Any,
    swipeleft: js.Any,
    swiperight: js.Any,
    tap: js.Any,
    taphold: js.Any,
    updatelayout: js.Any,
    vclick: js.Any,
    vmousecancel: js.Any,
    vmousedown: js.Any,
    vmousemove: js.Any,
    vmouseout: js.Any,
    vmouseover: js.Any,
    vmouseup: js.Any
  ): JQueryMobileEvents = {
    val __obj = js.Dynamic.literal(orientationchange = orientationchange.asInstanceOf[js.Any], pagebeforechange = pagebeforechange.asInstanceOf[js.Any], pagebeforecreate = pagebeforecreate.asInstanceOf[js.Any], pagebeforehide = pagebeforehide.asInstanceOf[js.Any], pagebeforeload = pagebeforeload.asInstanceOf[js.Any], pagebeforeshow = pagebeforeshow.asInstanceOf[js.Any], pagechange = pagechange.asInstanceOf[js.Any], pagechangefailed = pagechangefailed.asInstanceOf[js.Any], pagecreate = pagecreate.asInstanceOf[js.Any], pagehide = pagehide.asInstanceOf[js.Any], pageinit = pageinit.asInstanceOf[js.Any], pageload = pageload.asInstanceOf[js.Any], pageloadfailed = pageloadfailed.asInstanceOf[js.Any], pageremove = pageremove.asInstanceOf[js.Any], pageshow = pageshow.asInstanceOf[js.Any], scrollstart = scrollstart.asInstanceOf[js.Any], scrollstop = scrollstop.asInstanceOf[js.Any], swipe = swipe.asInstanceOf[js.Any], swipeleft = swipeleft.asInstanceOf[js.Any], swiperight = swiperight.asInstanceOf[js.Any], tap = tap.asInstanceOf[js.Any], taphold = taphold.asInstanceOf[js.Any], updatelayout = updatelayout.asInstanceOf[js.Any], vclick = vclick.asInstanceOf[js.Any], vmousecancel = vmousecancel.asInstanceOf[js.Any], vmousedown = vmousedown.asInstanceOf[js.Any], vmousemove = vmousemove.asInstanceOf[js.Any], vmouseout = vmouseout.asInstanceOf[js.Any], vmouseover = vmouseover.asInstanceOf[js.Any], vmouseup = vmouseup.asInstanceOf[js.Any])
    __obj.asInstanceOf[JQueryMobileEvents]
  }
  @scala.inline
  implicit class JQueryMobileEventsOps[Self <: JQueryMobileEvents] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withOrientationchange(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("orientationchange")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPagebeforechange(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pagebeforechange")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPagebeforecreate(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pagebeforecreate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPagebeforehide(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pagebeforehide")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPagebeforeload(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pagebeforeload")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPagebeforeshow(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pagebeforeshow")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPagechange(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pagechange")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPagechangefailed(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pagechangefailed")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPagecreate(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pagecreate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPagehide(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pagehide")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPageinit(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pageinit")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPageload(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pageload")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPageloadfailed(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pageloadfailed")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPageremove(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pageremove")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPageshow(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pageshow")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withScrollstart(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scrollstart")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withScrollstop(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scrollstop")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSwipe(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("swipe")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSwipeleft(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("swipeleft")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSwiperight(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("swiperight")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTap(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tap")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTaphold(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("taphold")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUpdatelayout(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("updatelayout")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withVclick(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("vclick")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withVmousecancel(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("vmousecancel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withVmousedown(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("vmousedown")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withVmousemove(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("vmousemove")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withVmouseout(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("vmouseout")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withVmouseover(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("vmouseover")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withVmouseup(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("vmouseup")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

