package typingsSlinky.jqueryNicescroll

import org.scalajs.dom.raw.Event
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
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object JQueryNiceScroll {
  
  @js.native
  trait NiceScroll extends StObject {
    
    def doScrollLeft(x: Double, duration: Double): Unit = js.native
    
    def doScrollPos(x: Double, y: Double, spd: Double): Unit = js.native
    
    def doScrollTop(x: Double, duration: Double): Unit = js.native
    
    def hide(): NiceScroll = js.native
    
    def onResize(): NiceScroll = js.native
    def onResize(e: js.UndefOr[scala.Nothing], page: NiceScrollPage): NiceScroll = js.native
    def onResize(e: Event): NiceScroll = js.native
    def onResize(e: Event, page: NiceScrollPage): NiceScroll = js.native
    
    def remove(): Unit = js.native
    
    def resize(): NiceScroll = js.native
    def resize(e: js.UndefOr[scala.Nothing], page: NiceScrollPage): NiceScroll = js.native
    def resize(e: Event): NiceScroll = js.native
    def resize(e: Event, page: NiceScrollPage): NiceScroll = js.native
    
    def show(): NiceScroll = js.native
    
    def stop(): NiceScroll = js.native
    
    def toggle(): NiceScroll = js.native
  }
  
  @js.native
  trait NiceScrollOptions extends StObject {
    
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
    implicit class NiceScrollOptionsMutableBuilder[Self <: NiceScrollOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAutohidemode(value: leave | scroll | cursor | hidden | Boolean): Self = StObject.set(x, "autohidemode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAutohidemodeUndefined: Self = StObject.set(x, "autohidemode", js.undefined)
      
      @scala.inline
      def setBackground(value: String): Self = StObject.set(x, "background", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBackgroundUndefined: Self = StObject.set(x, "background", js.undefined)
      
      @scala.inline
      def setBouncescroll(value: Boolean): Self = StObject.set(x, "bouncescroll", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBouncescrollUndefined: Self = StObject.set(x, "bouncescroll", js.undefined)
      
      @scala.inline
      def setBoxzoom(value: Boolean): Self = StObject.set(x, "boxzoom", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBoxzoomUndefined: Self = StObject.set(x, "boxzoom", js.undefined)
      
      @scala.inline
      def setCursorborder(value: String): Self = StObject.set(x, "cursorborder", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCursorborderUndefined: Self = StObject.set(x, "cursorborder", js.undefined)
      
      @scala.inline
      def setCursorborderradius(value: String): Self = StObject.set(x, "cursorborderradius", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCursorborderradiusUndefined: Self = StObject.set(x, "cursorborderradius", js.undefined)
      
      @scala.inline
      def setCursorcolor(value: String): Self = StObject.set(x, "cursorcolor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCursorcolorUndefined: Self = StObject.set(x, "cursorcolor", js.undefined)
      
      @scala.inline
      def setCursordragontouch(value: Boolean): Self = StObject.set(x, "cursordragontouch", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCursordragontouchUndefined: Self = StObject.set(x, "cursordragontouch", js.undefined)
      
      @scala.inline
      def setCursordragspeed(value: Double): Self = StObject.set(x, "cursordragspeed", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCursordragspeedUndefined: Self = StObject.set(x, "cursordragspeed", js.undefined)
      
      @scala.inline
      def setCursorfixedheight(value: Double): Self = StObject.set(x, "cursorfixedheight", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCursorfixedheightUndefined: Self = StObject.set(x, "cursorfixedheight", js.undefined)
      
      @scala.inline
      def setCursorminheight(value: Double): Self = StObject.set(x, "cursorminheight", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCursorminheightUndefined: Self = StObject.set(x, "cursorminheight", js.undefined)
      
      @scala.inline
      def setCursoropacitymax(value: Double): Self = StObject.set(x, "cursoropacitymax", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCursoropacitymaxUndefined: Self = StObject.set(x, "cursoropacitymax", js.undefined)
      
      @scala.inline
      def setCursoropacitymin(value: Double): Self = StObject.set(x, "cursoropacitymin", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCursoropacityminUndefined: Self = StObject.set(x, "cursoropacitymin", js.undefined)
      
      @scala.inline
      def setCursorwidth(value: String): Self = StObject.set(x, "cursorwidth", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCursorwidthUndefined: Self = StObject.set(x, "cursorwidth", js.undefined)
      
      @scala.inline
      def setDblclickzoom(value: Boolean): Self = StObject.set(x, "dblclickzoom", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDblclickzoomUndefined: Self = StObject.set(x, "dblclickzoom", js.undefined)
      
      @scala.inline
      def setDirectionlockdeadzone(value: Double): Self = StObject.set(x, "directionlockdeadzone", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDirectionlockdeadzoneUndefined: Self = StObject.set(x, "directionlockdeadzone", js.undefined)
      
      @scala.inline
      def setDisablemutationobserver(value: Boolean): Self = StObject.set(x, "disablemutationobserver", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisablemutationobserverUndefined: Self = StObject.set(x, "disablemutationobserver", js.undefined)
      
      @scala.inline
      def setDisableoutline(value: Boolean): Self = StObject.set(x, "disableoutline", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisableoutlineUndefined: Self = StObject.set(x, "disableoutline", js.undefined)
      
      @scala.inline
      def setEmulatetouch(value: Boolean): Self = StObject.set(x, "emulatetouch", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEmulatetouchUndefined: Self = StObject.set(x, "emulatetouch", js.undefined)
      
      @scala.inline
      def setEnablekeyboard(value: Boolean): Self = StObject.set(x, "enablekeyboard", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEnablekeyboardUndefined: Self = StObject.set(x, "enablekeyboard", js.undefined)
      
      @scala.inline
      def setEnablemouselockapi(value: Boolean): Self = StObject.set(x, "enablemouselockapi", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEnablemouselockapiUndefined: Self = StObject.set(x, "enablemouselockapi", js.undefined)
      
      @scala.inline
      def setEnablemousewheel(value: Boolean): Self = StObject.set(x, "enablemousewheel", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEnablemousewheelUndefined: Self = StObject.set(x, "enablemousewheel", js.undefined)
      
      @scala.inline
      def setEnableobserver(value: Boolean): Self = StObject.set(x, "enableobserver", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEnableobserverUndefined: Self = StObject.set(x, "enableobserver", js.undefined)
      
      @scala.inline
      def setEnablescrollonselection(value: Boolean): Self = StObject.set(x, "enablescrollonselection", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEnablescrollonselectionUndefined: Self = StObject.set(x, "enablescrollonselection", js.undefined)
      
      @scala.inline
      def setEnabletranslate3d(value: Boolean): Self = StObject.set(x, "enabletranslate3d", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEnabletranslate3dUndefined: Self = StObject.set(x, "enabletranslate3d", js.undefined)
      
      @scala.inline
      def setGesturezoom(value: Boolean): Self = StObject.set(x, "gesturezoom", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGesturezoomUndefined: Self = StObject.set(x, "gesturezoom", js.undefined)
      
      @scala.inline
      def setGrabcursorenabled(value: Boolean): Self = StObject.set(x, "grabcursorenabled", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGrabcursorenabledUndefined: Self = StObject.set(x, "grabcursorenabled", js.undefined)
      
      @scala.inline
      def setHidecursordelay(value: Double): Self = StObject.set(x, "hidecursordelay", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHidecursordelayUndefined: Self = StObject.set(x, "hidecursordelay", js.undefined)
      
      @scala.inline
      def setHorizrailenabled(value: Boolean): Self = StObject.set(x, "horizrailenabled", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHorizrailenabledUndefined: Self = StObject.set(x, "horizrailenabled", js.undefined)
      
      @scala.inline
      def setHwacceleration(value: Boolean): Self = StObject.set(x, "hwacceleration", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHwaccelerationUndefined: Self = StObject.set(x, "hwacceleration", js.undefined)
      
      @scala.inline
      def setIframeautoresize(value: Boolean): Self = StObject.set(x, "iframeautoresize", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIframeautoresizeUndefined: Self = StObject.set(x, "iframeautoresize", js.undefined)
      
      @scala.inline
      def setMousescrollstep(value: Double): Self = StObject.set(x, "mousescrollstep", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMousescrollstepUndefined: Self = StObject.set(x, "mousescrollstep", js.undefined)
      
      @scala.inline
      def setNativeparentscrolling(value: Boolean): Self = StObject.set(x, "nativeparentscrolling", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNativeparentscrollingUndefined: Self = StObject.set(x, "nativeparentscrolling", js.undefined)
      
      @scala.inline
      def setOneaxismousemode(value: auto | Boolean): Self = StObject.set(x, "oneaxismousemode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOneaxismousemodeUndefined: Self = StObject.set(x, "oneaxismousemode", js.undefined)
      
      @scala.inline
      def setOverflowx(value: auto | hidden | inherit | initial | overlay | scroll | unset | visible): Self = StObject.set(x, "overflowx", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOverflowxUndefined: Self = StObject.set(x, "overflowx", js.undefined)
      
      @scala.inline
      def setOverflowy(value: auto | hidden | inherit | initial | overlay | scroll | unset | visible): Self = StObject.set(x, "overflowy", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOverflowyUndefined: Self = StObject.set(x, "overflowy", js.undefined)
      
      @scala.inline
      def setPreservenativescrolling(value: Boolean): Self = StObject.set(x, "preservenativescrolling", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPreservenativescrollingUndefined: Self = StObject.set(x, "preservenativescrolling", js.undefined)
      
      @scala.inline
      def setPreventmultitouchscrolling(value: Boolean): Self = StObject.set(x, "preventmultitouchscrolling", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPreventmultitouchscrollingUndefined: Self = StObject.set(x, "preventmultitouchscrolling", js.undefined)
      
      @scala.inline
      def setRailalign(value: right | left | top | bottom): Self = StObject.set(x, "railalign", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRailalignUndefined: Self = StObject.set(x, "railalign", js.undefined)
      
      @scala.inline
      def setRailhoffset(value: Boolean | Left): Self = StObject.set(x, "railhoffset", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRailhoffsetUndefined: Self = StObject.set(x, "railhoffset", js.undefined)
      
      @scala.inline
      def setRailoffset(value: Boolean | Left): Self = StObject.set(x, "railoffset", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRailoffsetUndefined: Self = StObject.set(x, "railoffset", js.undefined)
      
      @scala.inline
      def setRailpadding(value: Bottom): Self = StObject.set(x, "railpadding", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRailpaddingUndefined: Self = StObject.set(x, "railpadding", js.undefined)
      
      @scala.inline
      def setRailvalign(value: right | left | top | bottom): Self = StObject.set(x, "railvalign", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRailvalignUndefined: Self = StObject.set(x, "railvalign", js.undefined)
      
      @scala.inline
      def setRtlmode(value: auto | Boolean): Self = StObject.set(x, "rtlmode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRtlmodeUndefined: Self = StObject.set(x, "rtlmode", js.undefined)
      
      @scala.inline
      def setScriptpath(value: String): Self = StObject.set(x, "scriptpath", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setScriptpathUndefined: Self = StObject.set(x, "scriptpath", js.undefined)
      
      @scala.inline
      def setScrollCLass(value: String): Self = StObject.set(x, "scrollCLass", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setScrollCLassUndefined: Self = StObject.set(x, "scrollCLass", js.undefined)
      
      @scala.inline
      def setScrollbarid(value: String): Self = StObject.set(x, "scrollbarid", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setScrollbaridUndefined: Self = StObject.set(x, "scrollbarid", js.undefined)
      
      @scala.inline
      def setScrollspeed(value: Double): Self = StObject.set(x, "scrollspeed", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setScrollspeedUndefined: Self = StObject.set(x, "scrollspeed", js.undefined)
      
      @scala.inline
      def setSensitiverail(value: Boolean): Self = StObject.set(x, "sensitiverail", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSensitiverailUndefined: Self = StObject.set(x, "sensitiverail", js.undefined)
      
      @scala.inline
      def setSmoothscroll(value: Boolean): Self = StObject.set(x, "smoothscroll", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSmoothscrollUndefined: Self = StObject.set(x, "smoothscroll", js.undefined)
      
      @scala.inline
      def setSpacebarenabled(value: Boolean): Self = StObject.set(x, "spacebarenabled", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSpacebarenabledUndefined: Self = StObject.set(x, "spacebarenabled", js.undefined)
      
      @scala.inline
      def setTouchbehavior(value: Boolean): Self = StObject.set(x, "touchbehavior", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTouchbehaviorUndefined: Self = StObject.set(x, "touchbehavior", js.undefined)
      
      @scala.inline
      def setUsetransition(value: Boolean): Self = StObject.set(x, "usetransition", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUsetransitionUndefined: Self = StObject.set(x, "usetransition", js.undefined)
      
      @scala.inline
      def setZindex(value: auto | Double): Self = StObject.set(x, "zindex", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setZindexUndefined: Self = StObject.set(x, "zindex", js.undefined)
    }
  }
  
  @js.native
  trait NiceScrollPage extends StObject {
    
    var h: Double = js.native
    
    var height: Double = js.native
    
    var maxh: Double = js.native
    
    var maxw: Double = js.native
    
    var w: Double = js.native
    
    var width: Double = js.native
  }
  object NiceScrollPage {
    
    @scala.inline
    def apply(h: Double, height: Double, maxh: Double, maxw: Double, w: Double, width: Double): NiceScrollPage = {
      val __obj = js.Dynamic.literal(h = h.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], maxh = maxh.asInstanceOf[js.Any], maxw = maxw.asInstanceOf[js.Any], w = w.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
      __obj.asInstanceOf[NiceScrollPage]
    }
    
    @scala.inline
    implicit class NiceScrollPageMutableBuilder[Self <: NiceScrollPage] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setH(value: Double): Self = StObject.set(x, "h", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxh(value: Double): Self = StObject.set(x, "maxh", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxw(value: Double): Self = StObject.set(x, "maxw", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setW(value: Double): Self = StObject.set(x, "w", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    }
  }
}
