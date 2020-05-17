package typingsSlinky.jqueryNicescroll.JQueryNiceScroll

import typingsSlinky.jqueryNicescroll.anon.Bottom
import typingsSlinky.jqueryNicescroll.anon.Left
import typingsSlinky.jqueryNicescroll.jqueryNicescrollStrings.auto
import typingsSlinky.jqueryNicescroll.jqueryNicescrollStrings.bottom
import typingsSlinky.jqueryNicescroll.jqueryNicescrollStrings.cursor
import typingsSlinky.jqueryNicescroll.jqueryNicescrollStrings.hidden
import typingsSlinky.jqueryNicescroll.jqueryNicescrollStrings.inherit
import typingsSlinky.jqueryNicescroll.jqueryNicescrollStrings.initial
import typingsSlinky.jqueryNicescroll.jqueryNicescrollStrings.leave
import typingsSlinky.jqueryNicescroll.jqueryNicescrollStrings.left
import typingsSlinky.jqueryNicescroll.jqueryNicescrollStrings.overlay
import typingsSlinky.jqueryNicescroll.jqueryNicescrollStrings.right
import typingsSlinky.jqueryNicescroll.jqueryNicescrollStrings.scroll
import typingsSlinky.jqueryNicescroll.jqueryNicescrollStrings.top
import typingsSlinky.jqueryNicescroll.jqueryNicescrollStrings.unset
import typingsSlinky.jqueryNicescroll.jqueryNicescrollStrings.visible
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NiceScrollOptions extends js.Object {
  var autohidemode: js.UndefOr[leave | scroll | cursor | hidden | Boolean] = js.native
  var background: js.UndefOr[String] = js.native
  var bouncescroll: js.UndefOr[Boolean] = js.native
  var boxzoom: js.UndefOr[Boolean] = js.native
  var cursorborder: js.UndefOr[String] = js.native
  var cursorborderradius: js.UndefOr[String] = js.native
  var cursorcolor: js.UndefOr[String] = js.native
  var cursordragontouch: js.UndefOr[Boolean] = js.native
  var cursordragspeed: js.UndefOr[Double] = js.native
  var cursorfixedheight: js.UndefOr[Double] = js.native
  var cursorminheight: js.UndefOr[Double] = js.native
  var cursoropacitymax: js.UndefOr[Double] = js.native
  var cursoropacitymin: js.UndefOr[Double] = js.native
  var cursorwidth: js.UndefOr[String] = js.native
  var dblclickzoom: js.UndefOr[Boolean] = js.native
  var directionlockdeadzone: js.UndefOr[Double] = js.native
  var disablemutationobserver: js.UndefOr[Boolean] = js.native
  var disableoutline: js.UndefOr[Boolean] = js.native
  var emulatetouch: js.UndefOr[Boolean] = js.native
  var enablekeyboard: js.UndefOr[Boolean] = js.native
  var enablemouselockapi: js.UndefOr[Boolean] = js.native
  var enablemousewheel: js.UndefOr[Boolean] = js.native
  var enableobserver: js.UndefOr[Boolean] = js.native
  var enablescrollonselection: js.UndefOr[Boolean] = js.native
  var enabletranslate3d: js.UndefOr[Boolean] = js.native
  var gesturezoom: js.UndefOr[Boolean] = js.native
  var grabcursorenabled: js.UndefOr[Boolean] = js.native
  var hidecursordelay: js.UndefOr[Double] = js.native
  var horizrailenabled: js.UndefOr[Boolean] = js.native
  var hwacceleration: js.UndefOr[Boolean] = js.native
  var iframeautoresize: js.UndefOr[Boolean] = js.native
  var mousescrollstep: js.UndefOr[Double] = js.native
  var nativeparentscrolling: js.UndefOr[Boolean] = js.native
  var oneaxismousemode: js.UndefOr[auto | Boolean] = js.native
  var overflowx: js.UndefOr[auto | hidden | inherit | initial | overlay | scroll | unset | visible] = js.native
  var overflowy: js.UndefOr[auto | hidden | inherit | initial | overlay | scroll | unset | visible] = js.native
  var preservenativescrolling: js.UndefOr[Boolean] = js.native
  var preventmultitouchscrolling: js.UndefOr[Boolean] = js.native
  var railalign: js.UndefOr[right | left | top | bottom] = js.native
  var railhoffset: js.UndefOr[Boolean | Left] = js.native
  var railoffset: js.UndefOr[Boolean | Left] = js.native
  var railpadding: js.UndefOr[Bottom] = js.native
  var railvalign: js.UndefOr[right | left | top | bottom] = js.native
  var rtlmode: js.UndefOr[auto | Boolean] = js.native
  var scriptpath: js.UndefOr[String] = js.native
  var scrollCLass: js.UndefOr[String] = js.native
  var scrollbarid: js.UndefOr[String] = js.native
  var scrollspeed: js.UndefOr[Double] = js.native
  var sensitiverail: js.UndefOr[Boolean] = js.native
  var smoothscroll: js.UndefOr[Boolean] = js.native
  var spacebarenabled: js.UndefOr[Boolean] = js.native
  var touchbehavior: js.UndefOr[Boolean] = js.native
  var usetransition: js.UndefOr[Boolean] = js.native
  var zindex: js.UndefOr[auto | Double] = js.native
}

object NiceScrollOptions {
  @scala.inline
  def apply(): NiceScrollOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NiceScrollOptions]
  }
  @scala.inline
  implicit class NiceScrollOptionsOps[Self <: NiceScrollOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAutohidemode(value: leave | scroll | cursor | hidden | Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autohidemode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAutohidemode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autohidemode")(js.undefined)
        ret
    }
    @scala.inline
    def withBackground(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("background")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBackground: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("background")(js.undefined)
        ret
    }
    @scala.inline
    def withBouncescroll(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bouncescroll")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBouncescroll: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bouncescroll")(js.undefined)
        ret
    }
    @scala.inline
    def withBoxzoom(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("boxzoom")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBoxzoom: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("boxzoom")(js.undefined)
        ret
    }
    @scala.inline
    def withCursorborder(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cursorborder")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCursorborder: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cursorborder")(js.undefined)
        ret
    }
    @scala.inline
    def withCursorborderradius(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cursorborderradius")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCursorborderradius: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cursorborderradius")(js.undefined)
        ret
    }
    @scala.inline
    def withCursorcolor(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cursorcolor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCursorcolor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cursorcolor")(js.undefined)
        ret
    }
    @scala.inline
    def withCursordragontouch(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cursordragontouch")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCursordragontouch: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cursordragontouch")(js.undefined)
        ret
    }
    @scala.inline
    def withCursordragspeed(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cursordragspeed")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCursordragspeed: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cursordragspeed")(js.undefined)
        ret
    }
    @scala.inline
    def withCursorfixedheight(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cursorfixedheight")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCursorfixedheight: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cursorfixedheight")(js.undefined)
        ret
    }
    @scala.inline
    def withCursorminheight(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cursorminheight")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCursorminheight: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cursorminheight")(js.undefined)
        ret
    }
    @scala.inline
    def withCursoropacitymax(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cursoropacitymax")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCursoropacitymax: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cursoropacitymax")(js.undefined)
        ret
    }
    @scala.inline
    def withCursoropacitymin(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cursoropacitymin")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCursoropacitymin: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cursoropacitymin")(js.undefined)
        ret
    }
    @scala.inline
    def withCursorwidth(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cursorwidth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCursorwidth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cursorwidth")(js.undefined)
        ret
    }
    @scala.inline
    def withDblclickzoom(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dblclickzoom")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDblclickzoom: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dblclickzoom")(js.undefined)
        ret
    }
    @scala.inline
    def withDirectionlockdeadzone(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("directionlockdeadzone")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDirectionlockdeadzone: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("directionlockdeadzone")(js.undefined)
        ret
    }
    @scala.inline
    def withDisablemutationobserver(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disablemutationobserver")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDisablemutationobserver: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disablemutationobserver")(js.undefined)
        ret
    }
    @scala.inline
    def withDisableoutline(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disableoutline")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDisableoutline: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disableoutline")(js.undefined)
        ret
    }
    @scala.inline
    def withEmulatetouch(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("emulatetouch")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEmulatetouch: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("emulatetouch")(js.undefined)
        ret
    }
    @scala.inline
    def withEnablekeyboard(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enablekeyboard")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnablekeyboard: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enablekeyboard")(js.undefined)
        ret
    }
    @scala.inline
    def withEnablemouselockapi(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enablemouselockapi")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnablemouselockapi: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enablemouselockapi")(js.undefined)
        ret
    }
    @scala.inline
    def withEnablemousewheel(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enablemousewheel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnablemousewheel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enablemousewheel")(js.undefined)
        ret
    }
    @scala.inline
    def withEnableobserver(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableobserver")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnableobserver: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableobserver")(js.undefined)
        ret
    }
    @scala.inline
    def withEnablescrollonselection(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enablescrollonselection")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnablescrollonselection: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enablescrollonselection")(js.undefined)
        ret
    }
    @scala.inline
    def withEnabletranslate3d(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enabletranslate3d")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnabletranslate3d: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enabletranslate3d")(js.undefined)
        ret
    }
    @scala.inline
    def withGesturezoom(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gesturezoom")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGesturezoom: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gesturezoom")(js.undefined)
        ret
    }
    @scala.inline
    def withGrabcursorenabled(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("grabcursorenabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGrabcursorenabled: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("grabcursorenabled")(js.undefined)
        ret
    }
    @scala.inline
    def withHidecursordelay(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hidecursordelay")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHidecursordelay: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hidecursordelay")(js.undefined)
        ret
    }
    @scala.inline
    def withHorizrailenabled(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("horizrailenabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHorizrailenabled: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("horizrailenabled")(js.undefined)
        ret
    }
    @scala.inline
    def withHwacceleration(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hwacceleration")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHwacceleration: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hwacceleration")(js.undefined)
        ret
    }
    @scala.inline
    def withIframeautoresize(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("iframeautoresize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIframeautoresize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("iframeautoresize")(js.undefined)
        ret
    }
    @scala.inline
    def withMousescrollstep(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mousescrollstep")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMousescrollstep: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mousescrollstep")(js.undefined)
        ret
    }
    @scala.inline
    def withNativeparentscrolling(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nativeparentscrolling")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNativeparentscrolling: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nativeparentscrolling")(js.undefined)
        ret
    }
    @scala.inline
    def withOneaxismousemode(value: auto | Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("oneaxismousemode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOneaxismousemode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("oneaxismousemode")(js.undefined)
        ret
    }
    @scala.inline
    def withOverflowx(value: auto | hidden | inherit | initial | overlay | scroll | unset | visible): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("overflowx")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOverflowx: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("overflowx")(js.undefined)
        ret
    }
    @scala.inline
    def withOverflowy(value: auto | hidden | inherit | initial | overlay | scroll | unset | visible): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("overflowy")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOverflowy: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("overflowy")(js.undefined)
        ret
    }
    @scala.inline
    def withPreservenativescrolling(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("preservenativescrolling")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPreservenativescrolling: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("preservenativescrolling")(js.undefined)
        ret
    }
    @scala.inline
    def withPreventmultitouchscrolling(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("preventmultitouchscrolling")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPreventmultitouchscrolling: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("preventmultitouchscrolling")(js.undefined)
        ret
    }
    @scala.inline
    def withRailalign(value: right | left | top | bottom): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("railalign")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRailalign: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("railalign")(js.undefined)
        ret
    }
    @scala.inline
    def withRailhoffset(value: Boolean | Left): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("railhoffset")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRailhoffset: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("railhoffset")(js.undefined)
        ret
    }
    @scala.inline
    def withRailoffset(value: Boolean | Left): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("railoffset")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRailoffset: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("railoffset")(js.undefined)
        ret
    }
    @scala.inline
    def withRailpadding(value: Bottom): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("railpadding")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRailpadding: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("railpadding")(js.undefined)
        ret
    }
    @scala.inline
    def withRailvalign(value: right | left | top | bottom): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("railvalign")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRailvalign: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("railvalign")(js.undefined)
        ret
    }
    @scala.inline
    def withRtlmode(value: auto | Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rtlmode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRtlmode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rtlmode")(js.undefined)
        ret
    }
    @scala.inline
    def withScriptpath(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scriptpath")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutScriptpath: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scriptpath")(js.undefined)
        ret
    }
    @scala.inline
    def withScrollCLass(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scrollCLass")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutScrollCLass: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scrollCLass")(js.undefined)
        ret
    }
    @scala.inline
    def withScrollbarid(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scrollbarid")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutScrollbarid: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scrollbarid")(js.undefined)
        ret
    }
    @scala.inline
    def withScrollspeed(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scrollspeed")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutScrollspeed: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scrollspeed")(js.undefined)
        ret
    }
    @scala.inline
    def withSensitiverail(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sensitiverail")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSensitiverail: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sensitiverail")(js.undefined)
        ret
    }
    @scala.inline
    def withSmoothscroll(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("smoothscroll")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSmoothscroll: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("smoothscroll")(js.undefined)
        ret
    }
    @scala.inline
    def withSpacebarenabled(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("spacebarenabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSpacebarenabled: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("spacebarenabled")(js.undefined)
        ret
    }
    @scala.inline
    def withTouchbehavior(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("touchbehavior")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTouchbehavior: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("touchbehavior")(js.undefined)
        ret
    }
    @scala.inline
    def withUsetransition(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("usetransition")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUsetransition: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("usetransition")(js.undefined)
        ret
    }
    @scala.inline
    def withZindex(value: auto | Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("zindex")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutZindex: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("zindex")(js.undefined)
        ret
    }
  }
  
}

