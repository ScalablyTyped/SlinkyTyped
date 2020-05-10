package typingsSlinky.dwBxslider4

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait bxSliderOptions extends js.Object {
  /**
    * adaptiveHeight Dynamically adjust slider height based on each slide's height
    * 
    * default: false
    * options: boolean (true / false)
    */
  var adaptiveHeight: js.UndefOr[Boolean] = js.native
  /**
    * adaptiveHeightSpeed Slide height transition duration (in ms). Note: only used if adaptiveHeight: true
    * 
    * default: 500
    * options: integer
    */
  var adaptiveHeightSpeed: js.UndefOr[Double] = js.native
  /**
    * ariaHidden Adds Aria Hidden attribute to any nonvisible slides.
    * 
    * default: true
    * options: boolean (true / false)
    */
  var ariaHidden: js.UndefOr[Boolean] = js.native
  /**
    * ariaLive Adds Aria Live attribute to slider.
    * 
    * default: true
    * options: boolean (true / false)
    */
  var ariaLive: js.UndefOr[Boolean] = js.native
  /**
    * auto Slides will automatically transition
    * 
    * default: false
    * options: boolean (true / false)
    */
  var auto: js.UndefOr[Boolean] = js.native
  /**
    * autoControls If true, "Start" / "Stop" controls will be added
    * 
    * default: false
    * options: boolean (true / false)
    */
  var autoControls: js.UndefOr[Boolean] = js.native
  /**
    * autoControlsCombine When slideshow is playing only "Stop" control is displayed and vice-versa
    * 
    * default: false
    * options: boolean (true / false)
    */
  var autoControlsCombine: js.UndefOr[Boolean] = js.native
  /**
    * autoControlsSelector Element used to populate the auto controls
    * 
    * default: null
    * options: jQuery selector
    */
  var autoControlsSelector: js.UndefOr[String] = js.native
  /**
    * autoDelay Time (in ms) auto show should wait before starting
    * 
    * default: 0
    * options: integer
    */
  var autoDelay: js.UndefOr[Double] = js.native
  /**
    * autoDirection The direction of auto show slide transitions
    * 
    * default: 'next'
    * options: 'next', 'prev'
    */
  var autoDirection: js.UndefOr[String] = js.native
  /**
    * autoHover Auto show will pause when mouse hovers over slider
    * 
    * default: false
    * options: boolean (true / false)
    */
  var autoHover: js.UndefOr[Boolean] = js.native
  /**
    * autoStart Auto show starts playing on load. If false, slideshow will start when the "Start" control is clicked
    * 
    * default: true
    * options: boolean (true / false)
    */
  var autoStart: js.UndefOr[Boolean] = js.native
  /**
    * buildPager If supplied, function is called on every slide element, and the returned value is used as the pager item markup.
    * See examples for detailed implementation
    * 
    * default: null
    * options: functoin(slideIndex)
    */
  var buildPager: js.UndefOr[js.Function1[/* slideIndex */ Double, Unit]] = js.native
  /**
    * captions Include image captions. Captions are derived from the image's title attribute
    * 
    * default: false
    * options: boolean (true / false)
    */
  var captions: js.UndefOr[Boolean] = js.native
  /**
    * controls If true, "Next" / "Prev" controls will be added
    * 
    * default: true
    * options: boolean (true / false)
    */
  var controls: js.UndefOr[Boolean] = js.native
  /**
    * easing The type of "easing" to use during transitions. If using CSS transitions, include a value for the transition-timing-function property. If not using CSS transitions, you may include plugins/jquery.easing.1.3.js for many options.
    * See http://gsgd.co.uk/sandbox/jquery/easing/ for more info.
    * 
    * default: null
    * options: if using CSS: 'linear', 'ease', 'ease-in', 'ease-out', 'ease-in-out', 'cubic-bezier(n,n,n,n)'. If not using CSS: 'swing', 'linear' (see the above file for more options)
    */
  var easing: js.UndefOr[String] = js.native
  /**
    * hideControlOnEnd If true, "Prev" and "Next" controls will receive a class disabled when slide is the first or the last
    * Note: Only used when infiniteLoop: false
    * 
    * default: false
    * options: boolean (true / false)
    */
  var hideControlOnEnd: js.UndefOr[Boolean] = js.native
  /**
    * infiniteLoop If true, clicking "Next" while on the last slide will transition to the first slide and vice-versa
    * 
    * default: true
    * options: boolean (true / false)
    */
  var infiniteLoop: js.UndefOr[Boolean] = js.native
  /**
    * keyboardEnabled Allows for keyboard control of visible slider. Keypress ignored if slider not visible.
    * 
    * default: false
    * options: boolean (true / false)
    */
  var keyboardEnabled: js.UndefOr[Boolean] = js.native
  /**
    * maxSlides The maximum number of slides to be shown. Slides will be sized up if carousel becomes larger than the original size.
    * 
    * default: 1
    * options: integer
    */
  var maxSlides: js.UndefOr[Double] = js.native
  /**
    * minSlides The minimum number of slides to be shown. Slides will be sized down if carousel becomes smaller than the original size.
    * 
    * default: 1
    * options: integer
    */
  var minSlides: js.UndefOr[Double] = js.native
  /**
    * mode Type of transition between slides
    * 
    * default: 'horizontal'
    * options: 'horizontal', 'vertical', 'fade'
    */
  var mode: js.UndefOr[String] = js.native
  /**
    * moveSlides The number of slides to move on transition. This value must be >= minSlides, and <= maxSlides. If zero (default), the number of fully-visible slides will be used.
    * 
    * default: 0
    * options: integer
    */
  var moveSlides: js.UndefOr[Double] = js.native
  /**
    * nextSelector Element used to populate the "Next" control
    * 
    * default: null
    * options: jQuery selector
    */
  var nextSelector: js.UndefOr[String] = js.native
  /**
    * nextText Text to be used for the "Next" control
    * 
    * default: 'Next'
    * options: string
    */
  var nextText: js.UndefOr[String] = js.native
  /**
    * onSlideAfter Executes immediately after each slide transition. Function argument is the current slide element (when transition completes).
    * 
    * default: function(){}
    * options: function($slideElement, oldIndex, newIndex){ // your code here }
    * arguments:
    *   $slideElement: jQuery element of the destination element
    *   oldIndex: element index of the previous slide (before the transition)
    *   newIndex: element index of the destination slide (after the transition)
    */
  var onSlideAfter: js.UndefOr[
    js.Function3[
      /* $slideElement */ js.UndefOr[JQuery], 
      /* oldIndex */ js.UndefOr[Double], 
      /* newIndex */ js.UndefOr[Double], 
      Unit
    ]
  ] = js.native
  /**
    * onSlideBefore Executes immediately before each slide transition.
    * 
    * default: function(){}
    * options: function($slideElement, oldIndex, newIndex){ // your code here }
    * arguments:
    *   $slideElement: jQuery element of the destination element
    *   oldIndex: element index of the previous slide (before the transition)
    *   newIndex: element index of the destination slide (after the transition)
    */
  var onSlideBefore: js.UndefOr[
    js.Function3[
      /* $slideElement */ js.UndefOr[JQuery], 
      /* oldIndex */ js.UndefOr[Double], 
      /* newIndex */ js.UndefOr[Double], 
      Unit
    ]
  ] = js.native
  /**
    * onSlideNext Executes immediately before each "Next" slide transition. Function argument is the target (next) slide element.
    * 
    * default: function(){}
    * options: function($slideElement, oldIndex, newIndex){ // your code here }
    * arguments:
    *   $slideElement: jQuery element of the destination element
    *   oldIndex: element index of the previous slide (before the transition)
    *   newIndex: element index of the destination slide (after the transition)
    */
  var onSlideNext: js.UndefOr[
    js.Function3[
      /* $slideElement */ js.UndefOr[JQuery], 
      /* oldIndex */ js.UndefOr[Double], 
      /* newIndex */ js.UndefOr[Double], 
      Unit
    ]
  ] = js.native
  /**
    * onSlidePrev Executes immediately before each "Prev" slide transition. Function argument is the target (prev) slide element.
    * 
    * default: function(){}
    * options: function($slideElement, oldIndex, newIndex){ // your code here }
    * arguments:
    *   $slideElement: jQuery element of the destination element
    *   oldIndex: element index of the previous slide (before the transition)
    *   newIndex: element index of the destination slide (after the transition)
    */
  var onSlidePrev: js.UndefOr[
    js.Function3[
      /* $slideElement */ js.UndefOr[JQuery], 
      /* oldIndex */ js.UndefOr[Double], 
      /* newIndex */ js.UndefOr[Double], 
      Unit
    ]
  ] = js.native
  /**
    * onSliderLoad Executes immediately after the slider is fully loaded
    * 
    * default: function(){}
    * options: function(currentIndex){ // your code here }
    * arguments:
    *   currentIndex: element index of the current slide
    */
  var onSliderLoad: js.UndefOr[js.Function1[/* currentIndex */ js.UndefOr[Double], Unit]] = js.native
  /**
    * onSliderResize Executes immediately after the slider is resized
    * 
    * default: function(){}
    * options: function(currentIndex){ // your code here }
    * arguments:
    *   currentIndex: element index of the current slide
    */
  var onSliderResize: js.UndefOr[js.Function1[/* currentIndex */ js.UndefOr[Double], Unit]] = js.native
  /**
    * oneToOneTouch If true, non-fade slides follow the finger as it swipes
    * 
    * default: true
    * options: boolean (true / false)
    */
  var oneToOneTouch: js.UndefOr[Boolean] = js.native
  /**
    * pager If true, a pager will be added
    * 
    * default: true
    * options: boolean (true / false)
    */
  var pager: js.UndefOr[Boolean] = js.native
  /**
    * pagerCustom Parent element to be used as the pager. Parent element must contain a <a data-slide-index="x"> element for each slide. See example here. Not for use with dynamic carousels.
    * 
    * default: null
    * options: jQuery selector
    */
  var pagerCustom: js.UndefOr[String] = js.native
  /**
    * pagerSelector Element used to populate the populate the pager. By default, the pager is appended to the bx-viewport
    * 
    * default: ''
    * options: jQuery selector
    */
  var pagerSelector: js.UndefOr[String] = js.native
  /**
    * pagerShortSeparator If pagerType: 'short', pager will use this value as the separating character
    * 
    * default: ' / '
    * options: string
    */
  var pagerShortSeparator: js.UndefOr[String] = js.native
  /**
    * pagerType If 'full', a pager link will be generated for each slide. If 'short', a x / y pager will be used (ex. 1 / 5)
    * 
    * default: 'full'
    * options: 'full', 'short'
    */
  var pagerType: js.UndefOr[String] = js.native
  /**
    * pause The amount of time (in ms) between each auto transition
    * 
    * default: 4000
    * options: integer
    */
  var pause: js.UndefOr[Double] = js.native
  /**
    * preloadImages If 'all', preloads all images before starting the slider. If 'visible', preloads only images in the initially visible slides before starting the slider (tip: use 'visible' if all slides are identical dimensions)
    * 
    * default: 'visible'
    * options: 'all', 'visible'
    */
  var preloadImages: js.UndefOr[String] = js.native
  /**
    * prevSelector Element used to populate the "Prev" control
    * 
    * default: null
    * options: jQuery selector
    */
  var prevSelector: js.UndefOr[String] = js.native
  /**
    * prevText Text to be used for the "Prev" control
    * 
    * default: 'Prev'
    * options: string
    */
  var prevText: js.UndefOr[String] = js.native
  /**
    * preventDefaultSwipeX If true, touch screen will not move along the x-axis as the finger swipes
    * 
    * default: true
    * options: boolean (true / false)
    */
  var preventDefaultSwipeX: js.UndefOr[Boolean] = js.native
  /**
    * preventDefaultSwipeY If true, touch screen will not move along the y-axis as the finger swipes
    * 
    * default: false
    * options: boolean (true / false)
    */
  var preventDefaultSwipeY: js.UndefOr[Boolean] = js.native
  /**
    * randomStart Start slider on a random slide
    * 
    * default: false
    * options: boolean (true / false)
    */
  var randomStart: js.UndefOr[Boolean] = js.native
  /**
    * responsive Enable or disable auto resize of the slider. Useful if you need to use fixed width sliders.
    * 
    * default: true
    * options: boolean (true / false)
    */
  var responsive: js.UndefOr[Boolean] = js.native
  /**
    * shrinkItems The Carousel will only show whole items and shrink the images to fit the viewport based on maxSlides/MinSlides.
    * 
    * default: false
    * options: boolean (true / false)
    */
  var shrinkItems: js.UndefOr[Boolean] = js.native
  /**
    * slideMargin Margin between each slide
    * 
    * default: 0
    * options: integer
    */
  var slideMargin: js.UndefOr[Double] = js.native
  /**
    * slideSelector Element to use as slides (ex. 'div.slide').
    * Note: by default, bxSlider will use all immediate children of the slider element
    * 
    * default: ''
    * options: jQuery selector
    */
  var slideSelector: js.UndefOr[String] = js.native
  /**
    * slideWidth The width of each slide. This setting is required for all horizontal carousels!
    * 
    * default: 0
    * options: integer
    */
  var slideWidth: js.UndefOr[Double] = js.native
  /**
    * speed Slide transition duration (in ms)
    * 
    * default: 500
    * options: integer
    */
  var speed: js.UndefOr[Double] = js.native
  /**
    * startSlide Starting slide index (zero-based)
    * 
    * default: 0
    * options: integer
    */
  var startSlide: js.UndefOr[Double] = js.native
  /**
    * startText Text to be used for the "Start" control
    * 
    * default: 'Start'
    * options: string
    */
  var startText: js.UndefOr[String] = js.native
  /**
    * stopAutoOnClick Auto will stop on interaction with controls
    * 
    * default: false
    * options: boolean (true / false)
    */
  var stopAutoOnClick: js.UndefOr[Boolean] = js.native
  /**
    * stopText Text to be used for the "Stop" control
    * 
    * default: 'Stop'
    * options: string
    */
  var stopText: js.UndefOr[String] = js.native
  /**
    * swipeThreshold Amount of pixels a touch swipe needs to exceed in order to execute a slide transition. Note: only used if touchEnabled: true
    * 
    * default: 50
    * options: integer
    */
  var swipeThreshold: js.UndefOr[Double] = js.native
  /**
    * ticker Use slider in ticker mode (similar to a news ticker)
    * 
    * default: false
    * options: boolean (true / false)
    */
  var ticker: js.UndefOr[Boolean] = js.native
  /**
    * tickerHover Ticker will pause when mouse hovers over slider. Note: this functionality does NOT work if using CSS transitions!
    * 
    * default: false
    * options: boolean (true / false)
    */
  var tickerHover: js.UndefOr[Boolean] = js.native
  /**
    * touchEnabled If true, slider will allow touch swipe transitions
    * 
    * default: true
    * options: boolean (true / false)
    */
  var touchEnabled: js.UndefOr[Boolean] = js.native
  /**
    * useCSS If true, CSS transitions will be used for horizontal and vertical slide animations (this uses native hardware acceleration). If false, jQuery animate() will be used.
    * 
    * default: true
    * options: boolean (true / false)
    */
  var useCSS: js.UndefOr[Boolean] = js.native
  /**
    * video If any slides contain video, set this to true. Also, include plugins/jquery.fitvids.js
    * See http://fitvidsjs.com/ for more info
    * 
    * default: false
    * options: boolean (true / false)
    */
  var video: js.UndefOr[Boolean] = js.native
  /**
    * wrapperClass Class to wrap the slider in. Change to prevent from using default bxSlider styles.
    * 
    * default: 'bx-wrapper'
    * options: string
    */
  var wrapperClass: js.UndefOr[String] = js.native
}

object bxSliderOptions {
  @scala.inline
  def apply(): bxSliderOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[bxSliderOptions]
  }
  @scala.inline
  implicit class bxSliderOptionsOps[Self <: bxSliderOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAdaptiveHeight(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("adaptiveHeight")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAdaptiveHeight: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("adaptiveHeight")(js.undefined)
        ret
    }
    @scala.inline
    def withAdaptiveHeightSpeed(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("adaptiveHeightSpeed")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAdaptiveHeightSpeed: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("adaptiveHeightSpeed")(js.undefined)
        ret
    }
    @scala.inline
    def withAriaHidden(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ariaHidden")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAriaHidden: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ariaHidden")(js.undefined)
        ret
    }
    @scala.inline
    def withAriaLive(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ariaLive")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAriaLive: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ariaLive")(js.undefined)
        ret
    }
    @scala.inline
    def withAuto(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("auto")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAuto: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("auto")(js.undefined)
        ret
    }
    @scala.inline
    def withAutoControls(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoControls")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAutoControls: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoControls")(js.undefined)
        ret
    }
    @scala.inline
    def withAutoControlsCombine(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoControlsCombine")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAutoControlsCombine: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoControlsCombine")(js.undefined)
        ret
    }
    @scala.inline
    def withAutoControlsSelector(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoControlsSelector")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAutoControlsSelector: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoControlsSelector")(js.undefined)
        ret
    }
    @scala.inline
    def withAutoDelay(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoDelay")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAutoDelay: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoDelay")(js.undefined)
        ret
    }
    @scala.inline
    def withAutoDirection(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoDirection")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAutoDirection: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoDirection")(js.undefined)
        ret
    }
    @scala.inline
    def withAutoHover(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoHover")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAutoHover: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoHover")(js.undefined)
        ret
    }
    @scala.inline
    def withAutoStart(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoStart")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAutoStart: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoStart")(js.undefined)
        ret
    }
    @scala.inline
    def withBuildPager(value: /* slideIndex */ Double => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("buildPager")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutBuildPager: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("buildPager")(js.undefined)
        ret
    }
    @scala.inline
    def withCaptions(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("captions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCaptions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("captions")(js.undefined)
        ret
    }
    @scala.inline
    def withControls(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("controls")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutControls: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("controls")(js.undefined)
        ret
    }
    @scala.inline
    def withEasing(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("easing")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEasing: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("easing")(js.undefined)
        ret
    }
    @scala.inline
    def withHideControlOnEnd(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hideControlOnEnd")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHideControlOnEnd: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hideControlOnEnd")(js.undefined)
        ret
    }
    @scala.inline
    def withInfiniteLoop(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("infiniteLoop")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInfiniteLoop: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("infiniteLoop")(js.undefined)
        ret
    }
    @scala.inline
    def withKeyboardEnabled(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keyboardEnabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutKeyboardEnabled: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keyboardEnabled")(js.undefined)
        ret
    }
    @scala.inline
    def withMaxSlides(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxSlides")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxSlides: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxSlides")(js.undefined)
        ret
    }
    @scala.inline
    def withMinSlides(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minSlides")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMinSlides: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minSlides")(js.undefined)
        ret
    }
    @scala.inline
    def withMode(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mode")(js.undefined)
        ret
    }
    @scala.inline
    def withMoveSlides(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("moveSlides")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMoveSlides: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("moveSlides")(js.undefined)
        ret
    }
    @scala.inline
    def withNextSelector(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nextSelector")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNextSelector: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nextSelector")(js.undefined)
        ret
    }
    @scala.inline
    def withNextText(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nextText")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNextText: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nextText")(js.undefined)
        ret
    }
    @scala.inline
    def withOnSlideAfter(
      value: (/* $slideElement */ js.UndefOr[JQuery], /* oldIndex */ js.UndefOr[Double], /* newIndex */ js.UndefOr[Double]) => Unit
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onSlideAfter")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withoutOnSlideAfter: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onSlideAfter")(js.undefined)
        ret
    }
    @scala.inline
    def withOnSlideBefore(
      value: (/* $slideElement */ js.UndefOr[JQuery], /* oldIndex */ js.UndefOr[Double], /* newIndex */ js.UndefOr[Double]) => Unit
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onSlideBefore")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withoutOnSlideBefore: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onSlideBefore")(js.undefined)
        ret
    }
    @scala.inline
    def withOnSlideNext(
      value: (/* $slideElement */ js.UndefOr[JQuery], /* oldIndex */ js.UndefOr[Double], /* newIndex */ js.UndefOr[Double]) => Unit
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onSlideNext")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withoutOnSlideNext: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onSlideNext")(js.undefined)
        ret
    }
    @scala.inline
    def withOnSlidePrev(
      value: (/* $slideElement */ js.UndefOr[JQuery], /* oldIndex */ js.UndefOr[Double], /* newIndex */ js.UndefOr[Double]) => Unit
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onSlidePrev")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withoutOnSlidePrev: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onSlidePrev")(js.undefined)
        ret
    }
    @scala.inline
    def withOnSliderLoad(value: /* currentIndex */ js.UndefOr[Double] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onSliderLoad")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnSliderLoad: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onSliderLoad")(js.undefined)
        ret
    }
    @scala.inline
    def withOnSliderResize(value: /* currentIndex */ js.UndefOr[Double] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onSliderResize")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnSliderResize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onSliderResize")(js.undefined)
        ret
    }
    @scala.inline
    def withOneToOneTouch(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("oneToOneTouch")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOneToOneTouch: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("oneToOneTouch")(js.undefined)
        ret
    }
    @scala.inline
    def withPager(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pager")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPager: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pager")(js.undefined)
        ret
    }
    @scala.inline
    def withPagerCustom(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pagerCustom")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPagerCustom: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pagerCustom")(js.undefined)
        ret
    }
    @scala.inline
    def withPagerSelector(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pagerSelector")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPagerSelector: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pagerSelector")(js.undefined)
        ret
    }
    @scala.inline
    def withPagerShortSeparator(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pagerShortSeparator")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPagerShortSeparator: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pagerShortSeparator")(js.undefined)
        ret
    }
    @scala.inline
    def withPagerType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pagerType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPagerType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pagerType")(js.undefined)
        ret
    }
    @scala.inline
    def withPause(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pause")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPause: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pause")(js.undefined)
        ret
    }
    @scala.inline
    def withPreloadImages(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("preloadImages")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPreloadImages: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("preloadImages")(js.undefined)
        ret
    }
    @scala.inline
    def withPrevSelector(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("prevSelector")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPrevSelector: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("prevSelector")(js.undefined)
        ret
    }
    @scala.inline
    def withPrevText(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("prevText")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPrevText: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("prevText")(js.undefined)
        ret
    }
    @scala.inline
    def withPreventDefaultSwipeX(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("preventDefaultSwipeX")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPreventDefaultSwipeX: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("preventDefaultSwipeX")(js.undefined)
        ret
    }
    @scala.inline
    def withPreventDefaultSwipeY(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("preventDefaultSwipeY")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPreventDefaultSwipeY: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("preventDefaultSwipeY")(js.undefined)
        ret
    }
    @scala.inline
    def withRandomStart(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("randomStart")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRandomStart: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("randomStart")(js.undefined)
        ret
    }
    @scala.inline
    def withResponsive(value: Boolean): Self = {
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
    def withShrinkItems(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shrinkItems")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShrinkItems: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shrinkItems")(js.undefined)
        ret
    }
    @scala.inline
    def withSlideMargin(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("slideMargin")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSlideMargin: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("slideMargin")(js.undefined)
        ret
    }
    @scala.inline
    def withSlideSelector(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("slideSelector")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSlideSelector: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("slideSelector")(js.undefined)
        ret
    }
    @scala.inline
    def withSlideWidth(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("slideWidth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSlideWidth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("slideWidth")(js.undefined)
        ret
    }
    @scala.inline
    def withSpeed(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("speed")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSpeed: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("speed")(js.undefined)
        ret
    }
    @scala.inline
    def withStartSlide(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("startSlide")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStartSlide: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("startSlide")(js.undefined)
        ret
    }
    @scala.inline
    def withStartText(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("startText")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStartText: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("startText")(js.undefined)
        ret
    }
    @scala.inline
    def withStopAutoOnClick(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stopAutoOnClick")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStopAutoOnClick: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stopAutoOnClick")(js.undefined)
        ret
    }
    @scala.inline
    def withStopText(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stopText")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStopText: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stopText")(js.undefined)
        ret
    }
    @scala.inline
    def withSwipeThreshold(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("swipeThreshold")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSwipeThreshold: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("swipeThreshold")(js.undefined)
        ret
    }
    @scala.inline
    def withTicker(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ticker")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTicker: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ticker")(js.undefined)
        ret
    }
    @scala.inline
    def withTickerHover(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tickerHover")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTickerHover: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tickerHover")(js.undefined)
        ret
    }
    @scala.inline
    def withTouchEnabled(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("touchEnabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTouchEnabled: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("touchEnabled")(js.undefined)
        ret
    }
    @scala.inline
    def withUseCSS(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("useCSS")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUseCSS: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("useCSS")(js.undefined)
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
    def withWrapperClass(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("wrapperClass")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWrapperClass: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("wrapperClass")(js.undefined)
        ret
    }
  }
  
}

