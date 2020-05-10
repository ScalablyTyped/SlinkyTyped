package typingsSlinky.owlCarousel.OwlCarousel

import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.raw.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Options extends js.Object {
  var URLhashListener: js.UndefOr[Boolean] = js.native
  var animateIn: js.UndefOr[String | Boolean] = js.native
  var animateOut: js.UndefOr[String | Boolean] = js.native
  var autoHeight: js.UndefOr[Boolean] = js.native
  var autoHeightClass: js.UndefOr[String] = js.native
  var autoWidth: js.UndefOr[Boolean] = js.native
  var autoplay: js.UndefOr[Boolean] = js.native
  var autoplayHoverPause: js.UndefOr[Boolean] = js.native
  var autoplaySpeed: js.UndefOr[Double | Boolean] = js.native
  var autoplayTimeout: js.UndefOr[Double] = js.native
  var callbacks: js.UndefOr[Boolean] = js.native
  var center: js.UndefOr[Boolean] = js.native
  var checkVisible: js.UndefOr[Boolean] = js.native
  var controlsClass: js.UndefOr[String] = js.native
  var dotClass: js.UndefOr[String] = js.native
  var dots: js.UndefOr[Boolean] = js.native
  var dotsClass: js.UndefOr[String] = js.native
  var dotsContainer: js.UndefOr[String | Boolean] = js.native
  var dotsData: js.UndefOr[Boolean] = js.native
  var dotsEach: js.UndefOr[Double | Boolean] = js.native
  var dotsSpeed: js.UndefOr[Double | Boolean] = js.native
  var dragClass: js.UndefOr[String] = js.native
  var dragEndSpeed: js.UndefOr[Double | Boolean] = js.native
  var fallbackEasing: js.UndefOr[String] = js.native
  var fluidSpeed: js.UndefOr[Double | Boolean] = js.native
  var freeDrag: js.UndefOr[Boolean] = js.native
  var grabClass: js.UndefOr[String] = js.native
  var info: js.UndefOr[HandlerCallback] = js.native
  var itemElement: js.UndefOr[String] = js.native
  // OPTIONS
  var items: js.UndefOr[Double] = js.native
  var lazyLoad: js.UndefOr[Boolean] = js.native
  var lazyLoadEager: js.UndefOr[Double] = js.native
  var loadedClass: js.UndefOr[String] = js.native
  var loadingClass: js.UndefOr[String] = js.native
  var loop: js.UndefOr[Boolean] = js.native
  var margin: js.UndefOr[Double] = js.native
  var merge: js.UndefOr[Boolean] = js.native
  var mergeFit: js.UndefOr[Boolean] = js.native
  var mouseDrag: js.UndefOr[Boolean] = js.native
  var nav: js.UndefOr[Boolean] = js.native
  var navClass: js.UndefOr[js.Array[String]] = js.native
  var navContainer: js.UndefOr[String | Boolean] = js.native
  var navContainerClass: js.UndefOr[String] = js.native
  var navElement: js.UndefOr[String] = js.native
  var navSpeed: js.UndefOr[Double | Boolean] = js.native
  var navText: js.UndefOr[js.Array[String]] = js.native
  var nestedItemSelector: js.UndefOr[String] = js.native
  var onChange: js.UndefOr[HandlerCallback] = js.native
  var onChanged: js.UndefOr[HandlerCallback] = js.native
  var onDrag: js.UndefOr[HandlerCallback] = js.native
  var onDragged: js.UndefOr[HandlerCallback] = js.native
  // EVENTS
  var onInitialize: js.UndefOr[HandlerCallback] = js.native
  var onInitialized: js.UndefOr[HandlerCallback] = js.native
  var onLoadLazy: js.UndefOr[HandlerCallback] = js.native
  var onLoadedLazy: js.UndefOr[HandlerCallback] = js.native
  var onPlayVideo: js.UndefOr[HandlerCallback] = js.native
  var onRefresh: js.UndefOr[HandlerCallback] = js.native
  var onRefreshed: js.UndefOr[HandlerCallback] = js.native
  var onResize: js.UndefOr[HandlerCallback] = js.native
  var onResized: js.UndefOr[HandlerCallback] = js.native
  var onStopVideo: js.UndefOr[HandlerCallback] = js.native
  var onTranslate: js.UndefOr[HandlerCallback] = js.native
  var onTranslated: js.UndefOr[HandlerCallback] = js.native
  var pullDrag: js.UndefOr[Boolean] = js.native
  // CLASSES
  var refreshClass: js.UndefOr[String] = js.native
  var responsive: js.UndefOr[StringDictionary[Options]] = js.native
  var responsiveBaseElement: js.UndefOr[Element] = js.native
  var responsiveClass: js.UndefOr[String | Boolean] = js.native
  var responsiveRefreshRate: js.UndefOr[Double] = js.native
  var rewind: js.UndefOr[Boolean] = js.native
  var rtlClass: js.UndefOr[String] = js.native
  var slideBy: js.UndefOr[Double | String] = js.native
  var slideTransition: js.UndefOr[String] = js.native
  var smartSpeed: js.UndefOr[Double | Boolean] = js.native
  var stageClass: js.UndefOr[String] = js.native
  var stageElement: js.UndefOr[String] = js.native
  var stageOuterClass: js.UndefOr[String] = js.native
  var stagePadding: js.UndefOr[Double] = js.native
  var startPosition: js.UndefOr[Double | String] = js.native
  var touchDrag: js.UndefOr[Boolean] = js.native
  var video: js.UndefOr[Boolean] = js.native
  var videoHeight: js.UndefOr[Double | Boolean] = js.native
  var videoWidth: js.UndefOr[Double | Boolean] = js.native
}

object Options {
  @scala.inline
  def apply(): Options = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Options]
  }
  @scala.inline
  implicit class OptionsOps[Self <: Options] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withURLhashListener(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("URLhashListener")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutURLhashListener: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("URLhashListener")(js.undefined)
        ret
    }
    @scala.inline
    def withAnimateIn(value: String | Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("animateIn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAnimateIn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("animateIn")(js.undefined)
        ret
    }
    @scala.inline
    def withAnimateOut(value: String | Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("animateOut")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAnimateOut: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("animateOut")(js.undefined)
        ret
    }
    @scala.inline
    def withAutoHeight(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoHeight")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAutoHeight: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoHeight")(js.undefined)
        ret
    }
    @scala.inline
    def withAutoHeightClass(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoHeightClass")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAutoHeightClass: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoHeightClass")(js.undefined)
        ret
    }
    @scala.inline
    def withAutoWidth(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoWidth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAutoWidth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoWidth")(js.undefined)
        ret
    }
    @scala.inline
    def withAutoplay(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoplay")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAutoplay: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoplay")(js.undefined)
        ret
    }
    @scala.inline
    def withAutoplayHoverPause(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoplayHoverPause")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAutoplayHoverPause: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoplayHoverPause")(js.undefined)
        ret
    }
    @scala.inline
    def withAutoplaySpeed(value: Double | Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoplaySpeed")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAutoplaySpeed: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoplaySpeed")(js.undefined)
        ret
    }
    @scala.inline
    def withAutoplayTimeout(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoplayTimeout")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAutoplayTimeout: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoplayTimeout")(js.undefined)
        ret
    }
    @scala.inline
    def withCallbacks(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("callbacks")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCallbacks: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("callbacks")(js.undefined)
        ret
    }
    @scala.inline
    def withCenter(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("center")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCenter: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("center")(js.undefined)
        ret
    }
    @scala.inline
    def withCheckVisible(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("checkVisible")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCheckVisible: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("checkVisible")(js.undefined)
        ret
    }
    @scala.inline
    def withControlsClass(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("controlsClass")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutControlsClass: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("controlsClass")(js.undefined)
        ret
    }
    @scala.inline
    def withDotClass(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dotClass")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDotClass: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dotClass")(js.undefined)
        ret
    }
    @scala.inline
    def withDots(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dots")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDots: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dots")(js.undefined)
        ret
    }
    @scala.inline
    def withDotsClass(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dotsClass")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDotsClass: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dotsClass")(js.undefined)
        ret
    }
    @scala.inline
    def withDotsContainer(value: String | Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dotsContainer")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDotsContainer: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dotsContainer")(js.undefined)
        ret
    }
    @scala.inline
    def withDotsData(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dotsData")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDotsData: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dotsData")(js.undefined)
        ret
    }
    @scala.inline
    def withDotsEach(value: Double | Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dotsEach")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDotsEach: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dotsEach")(js.undefined)
        ret
    }
    @scala.inline
    def withDotsSpeed(value: Double | Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dotsSpeed")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDotsSpeed: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dotsSpeed")(js.undefined)
        ret
    }
    @scala.inline
    def withDragClass(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dragClass")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDragClass: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dragClass")(js.undefined)
        ret
    }
    @scala.inline
    def withDragEndSpeed(value: Double | Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dragEndSpeed")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDragEndSpeed: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dragEndSpeed")(js.undefined)
        ret
    }
    @scala.inline
    def withFallbackEasing(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fallbackEasing")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFallbackEasing: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fallbackEasing")(js.undefined)
        ret
    }
    @scala.inline
    def withFluidSpeed(value: Double | Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fluidSpeed")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFluidSpeed: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fluidSpeed")(js.undefined)
        ret
    }
    @scala.inline
    def withFreeDrag(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("freeDrag")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFreeDrag: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("freeDrag")(js.undefined)
        ret
    }
    @scala.inline
    def withGrabClass(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("grabClass")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGrabClass: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("grabClass")(js.undefined)
        ret
    }
    @scala.inline
    def withInfo(value: /* repeated */ js.Any => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("info")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutInfo: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("info")(js.undefined)
        ret
    }
    @scala.inline
    def withItemElement(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("itemElement")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutItemElement: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("itemElement")(js.undefined)
        ret
    }
    @scala.inline
    def withItems(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("items")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutItems: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("items")(js.undefined)
        ret
    }
    @scala.inline
    def withLazyLoad(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lazyLoad")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLazyLoad: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lazyLoad")(js.undefined)
        ret
    }
    @scala.inline
    def withLazyLoadEager(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lazyLoadEager")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLazyLoadEager: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lazyLoadEager")(js.undefined)
        ret
    }
    @scala.inline
    def withLoadedClass(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("loadedClass")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLoadedClass: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("loadedClass")(js.undefined)
        ret
    }
    @scala.inline
    def withLoadingClass(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("loadingClass")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLoadingClass: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("loadingClass")(js.undefined)
        ret
    }
    @scala.inline
    def withLoop(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("loop")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLoop: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("loop")(js.undefined)
        ret
    }
    @scala.inline
    def withMargin(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("margin")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMargin: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("margin")(js.undefined)
        ret
    }
    @scala.inline
    def withMerge(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("merge")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMerge: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("merge")(js.undefined)
        ret
    }
    @scala.inline
    def withMergeFit(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mergeFit")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMergeFit: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mergeFit")(js.undefined)
        ret
    }
    @scala.inline
    def withMouseDrag(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mouseDrag")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMouseDrag: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mouseDrag")(js.undefined)
        ret
    }
    @scala.inline
    def withNav(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nav")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNav: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nav")(js.undefined)
        ret
    }
    @scala.inline
    def withNavClass(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("navClass")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNavClass: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("navClass")(js.undefined)
        ret
    }
    @scala.inline
    def withNavContainer(value: String | Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("navContainer")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNavContainer: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("navContainer")(js.undefined)
        ret
    }
    @scala.inline
    def withNavContainerClass(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("navContainerClass")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNavContainerClass: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("navContainerClass")(js.undefined)
        ret
    }
    @scala.inline
    def withNavElement(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("navElement")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNavElement: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("navElement")(js.undefined)
        ret
    }
    @scala.inline
    def withNavSpeed(value: Double | Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("navSpeed")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNavSpeed: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("navSpeed")(js.undefined)
        ret
    }
    @scala.inline
    def withNavText(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("navText")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNavText: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("navText")(js.undefined)
        ret
    }
    @scala.inline
    def withNestedItemSelector(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nestedItemSelector")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNestedItemSelector: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nestedItemSelector")(js.undefined)
        ret
    }
    @scala.inline
    def withOnChange(value: /* repeated */ js.Any => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onChange")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnChange: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onChange")(js.undefined)
        ret
    }
    @scala.inline
    def withOnChanged(value: /* repeated */ js.Any => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onChanged")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnChanged: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onChanged")(js.undefined)
        ret
    }
    @scala.inline
    def withOnDrag(value: /* repeated */ js.Any => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onDrag")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnDrag: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onDrag")(js.undefined)
        ret
    }
    @scala.inline
    def withOnDragged(value: /* repeated */ js.Any => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onDragged")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnDragged: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onDragged")(js.undefined)
        ret
    }
    @scala.inline
    def withOnInitialize(value: /* repeated */ js.Any => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onInitialize")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnInitialize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onInitialize")(js.undefined)
        ret
    }
    @scala.inline
    def withOnInitialized(value: /* repeated */ js.Any => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onInitialized")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnInitialized: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onInitialized")(js.undefined)
        ret
    }
    @scala.inline
    def withOnLoadLazy(value: /* repeated */ js.Any => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onLoadLazy")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnLoadLazy: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onLoadLazy")(js.undefined)
        ret
    }
    @scala.inline
    def withOnLoadedLazy(value: /* repeated */ js.Any => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onLoadedLazy")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnLoadedLazy: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onLoadedLazy")(js.undefined)
        ret
    }
    @scala.inline
    def withOnPlayVideo(value: /* repeated */ js.Any => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onPlayVideo")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnPlayVideo: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onPlayVideo")(js.undefined)
        ret
    }
    @scala.inline
    def withOnRefresh(value: /* repeated */ js.Any => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onRefresh")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnRefresh: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onRefresh")(js.undefined)
        ret
    }
    @scala.inline
    def withOnRefreshed(value: /* repeated */ js.Any => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onRefreshed")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnRefreshed: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onRefreshed")(js.undefined)
        ret
    }
    @scala.inline
    def withOnResize(value: /* repeated */ js.Any => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onResize")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnResize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onResize")(js.undefined)
        ret
    }
    @scala.inline
    def withOnResized(value: /* repeated */ js.Any => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onResized")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnResized: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onResized")(js.undefined)
        ret
    }
    @scala.inline
    def withOnStopVideo(value: /* repeated */ js.Any => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onStopVideo")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnStopVideo: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onStopVideo")(js.undefined)
        ret
    }
    @scala.inline
    def withOnTranslate(value: /* repeated */ js.Any => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onTranslate")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnTranslate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onTranslate")(js.undefined)
        ret
    }
    @scala.inline
    def withOnTranslated(value: /* repeated */ js.Any => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onTranslated")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnTranslated: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onTranslated")(js.undefined)
        ret
    }
    @scala.inline
    def withPullDrag(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pullDrag")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPullDrag: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pullDrag")(js.undefined)
        ret
    }
    @scala.inline
    def withRefreshClass(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("refreshClass")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRefreshClass: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("refreshClass")(js.undefined)
        ret
    }
    @scala.inline
    def withResponsive(value: StringDictionary[Options]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("responsive")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutResponsive: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("responsive")(js.undefined)
        ret
    }
    @scala.inline
    def withResponsiveBaseElement(value: Element): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("responsiveBaseElement")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutResponsiveBaseElement: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("responsiveBaseElement")(js.undefined)
        ret
    }
    @scala.inline
    def withResponsiveClass(value: String | Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("responsiveClass")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutResponsiveClass: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("responsiveClass")(js.undefined)
        ret
    }
    @scala.inline
    def withResponsiveRefreshRate(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("responsiveRefreshRate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutResponsiveRefreshRate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("responsiveRefreshRate")(js.undefined)
        ret
    }
    @scala.inline
    def withRewind(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rewind")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRewind: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rewind")(js.undefined)
        ret
    }
    @scala.inline
    def withRtlClass(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rtlClass")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRtlClass: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rtlClass")(js.undefined)
        ret
    }
    @scala.inline
    def withSlideBy(value: Double | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("slideBy")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSlideBy: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("slideBy")(js.undefined)
        ret
    }
    @scala.inline
    def withSlideTransition(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("slideTransition")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSlideTransition: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("slideTransition")(js.undefined)
        ret
    }
    @scala.inline
    def withSmartSpeed(value: Double | Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("smartSpeed")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSmartSpeed: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("smartSpeed")(js.undefined)
        ret
    }
    @scala.inline
    def withStageClass(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stageClass")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStageClass: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stageClass")(js.undefined)
        ret
    }
    @scala.inline
    def withStageElement(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stageElement")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStageElement: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stageElement")(js.undefined)
        ret
    }
    @scala.inline
    def withStageOuterClass(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stageOuterClass")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStageOuterClass: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stageOuterClass")(js.undefined)
        ret
    }
    @scala.inline
    def withStagePadding(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stagePadding")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStagePadding: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stagePadding")(js.undefined)
        ret
    }
    @scala.inline
    def withStartPosition(value: Double | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("startPosition")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStartPosition: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("startPosition")(js.undefined)
        ret
    }
    @scala.inline
    def withTouchDrag(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("touchDrag")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTouchDrag: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("touchDrag")(js.undefined)
        ret
    }
    @scala.inline
    def withVideo(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("video")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVideo: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("video")(js.undefined)
        ret
    }
    @scala.inline
    def withVideoHeight(value: Double | Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("videoHeight")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVideoHeight: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("videoHeight")(js.undefined)
        ret
    }
    @scala.inline
    def withVideoWidth(value: Double | Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("videoWidth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVideoWidth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("videoWidth")(js.undefined)
        ret
    }
  }
  
}

