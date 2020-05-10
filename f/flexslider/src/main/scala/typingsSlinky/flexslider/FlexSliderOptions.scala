package typingsSlinky.flexslider

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FlexSliderOptions extends js.Object {
                //Callback: function(slider) - Fires when the slider reaches the last slide (asynchronous)
  var added: js.UndefOr[js.Function1[/* slider */ SliderObject, _]] = js.native
             //Callback: function(slider) - Fires asynchronously with each slider animation
  var after: js.UndefOr[js.Function1[/* slider */ SliderObject, _]] = js.native
         //{NEW} Selector: Must match a simple pattern. '{container} > {slide}' -- Ignore pattern at your own peril
  var animation: js.UndefOr[String] = js.native
                   //{NEW} Boolean: Reverse the animation direction
  var animationLoop: js.UndefOr[Boolean] = js.native
             //Integer: Set the speed of the slideshow cycling, in milliseconds
  var animationSpeed: js.UndefOr[Double] = js.native
                         //{NEW} Selector: Mirror the actions performed on this slider with another slider. Use with care.
  var asNavFor: js.UndefOr[String] = js.native
              //Callback: function(slider) - Fires when the slider loads the first slide
  var before: js.UndefOr[js.Function1[/* slider */ SliderObject, _]] = js.native
                     //{NEW} Boolean: If using video in the slider, will prevent CSS3 3D Transforms to avoid graphical glitches
  // Primary Controls
  var controlNav: js.UndefOr[js.Any] = js.native
                 //String: Set the text for the "play" pausePlay item
  // Special properties
  var controlsContainer: js.UndefOr[String] = js.native
                 //{NEW} String: Determines the easing method used in jQuery transitions. jQuery easing plugin is supported!
  var direction: js.UndefOr[String] = js.native
                 //Boolean: Create navigation for paging control of each clide? Note: Leave true for manualControls usage
  var directionNav: js.UndefOr[Boolean] = js.native
                //String: Select your animation type, "fade" or "slide"
  var easing: js.UndefOr[String] = js.native
              //Callback: function(slider) - Fires after each slider animation completes
  var end: js.UndefOr[js.Function1[/* slider */ SliderObject, _]] = js.native
              //Integer: Set the speed of animations, in milliseconds
  var initDelay: js.UndefOr[Double] = js.native
                     //{NEW} Integer: Box-model width of individual carousel items, including horizontal borders and padding.
  var itemMargin: js.UndefOr[Double] = js.native
                     //{NEW} Selector: Internal property exposed for turning the slider into a thumbnail navigation for another slider
  // Carousel Options
  var itemWidth: js.UndefOr[Double] = js.native
                 //String: Set the text for the "next" directionNav item
  // Secondary Navigation
  var keyboard: js.UndefOr[Boolean] = js.native
            //{UPDATED} Selector: USE CLASS SELECTOR. Declare which container the navigation elements should be appended too. Default container is the FlexSlider element. Example use would be ".flexslider-container". Property is ignored if given element is not found.
  var manualControls: js.UndefOr[String] = js.native
                      //{NEW} Integer: Minimum number of carousel items that should be visible. Items will resize fluidly when below this.
  var maxItems: js.UndefOr[Double] = js.native
                    //{NEW} Integer: Margin between carousel items.
  var minItems: js.UndefOr[Double] = js.native
          //{NEW} Boolean: Allow keyboard navigation to affect multiple sliders. Default behavior cuts out keyboard navigation with more than one slider present.
  var mousewheel: js.UndefOr[Boolean] = js.native
                      //{NEW} Integer: Maxmimum number of carousel items that should be visible. Items will resize fluidly when above this limit.
  var move: js.UndefOr[Double] = js.native
                   //Boolean: Allow slider navigating via keyboard left/right keys
  var multipleKeyboard: js.UndefOr[Boolean] = js.native
  var namespace: js.UndefOr[String] = js.native
             //String: Set the text for the "previous" directionNav item
  var nextText: js.UndefOr[String] = js.native
                 //Boolean: Randomize slide order
  // Usability features
  var pauseOnAction: js.UndefOr[Boolean] = js.native
              //Boolean: Pause the slideshow when interacting with control elements, highly recommended.
  var pauseOnHover: js.UndefOr[Boolean] = js.native
                //{UPDATED} Boolean: Requires jquery.mousewheel.js (https://github.com/brandonaaron/jquery-mousewheel) - Allows slider navigating via mousewheel
  var pausePlay: js.UndefOr[Boolean] = js.native
                 //Boolean: Create pause/play dynamic element
  var pauseText: js.UndefOr[String] = js.native
               //String: Set the text for the "pause" pausePlay item
  var playText: js.UndefOr[String] = js.native
               //Boolean: Create navigation for previous/next navigation? (true/false)
  var prevText: js.UndefOr[String] = js.native
                     //{NEW} Integer: Set an initialization delay, in milliseconds
  var randomize: js.UndefOr[Boolean] = js.native
              //{NEW} Callback: function(slider) - Fires after a slide is added
  var removed: js.UndefOr[js.Function1[/* slider */ SliderObject, _]] = js.native
          //String: Select the sliding direction, "horizontal" or "vertical"
  var reverse: js.UndefOr[Boolean] = js.native
               //{NEW} String: Prefix string attached to the class of every element generated by the plugin
  var selector: js.UndefOr[String] = js.native
                       //Integer: The slide that the slider should start on. Array notation (0 = first slide)
  var slideshow: js.UndefOr[Boolean] = js.native
                  //Boolean: Animate slider automatically
  var slideshowSpeed: js.UndefOr[Double] = js.native
               //Boolean: Should the animation loop? If boolean; directionNav will received "disable" classes at either end
  var smoothHeight: js.UndefOr[Boolean] = js.native
                          //{NEW} Integer: Number of carousel items that should move on animation. If number; slider will move all visible items.
  // Callback API
  var start: js.UndefOr[js.Function1[/* slider */ SliderObject, _]] = js.native
              //{NEW} Boolean: Allow height of the slider to animate smoothly in horizontal mode
  var startAt: js.UndefOr[Double] = js.native
               //Selector: Declare custom control navigation. Examples would be ".flex-control-nav li" or "#tabs-nav li img", etc. The number of elements in your controlNav should match the number of slides/tabs.
  var sync: js.UndefOr[String] = js.native
                     //{NEW} Boolean: Slider will use CSS3 transitions if available
  var touch: js.UndefOr[Boolean] = js.native
              //Boolean: Pause the slideshow when hovering over slider, then resume when no longer hovering
  var useCSS: js.UndefOr[Boolean] = js.native
                      //{NEW} Boolean: Allow touch swipe navigation of the slider on touch-enabled devices
  var video: js.UndefOr[Boolean] = js.native
}

object FlexSliderOptions {
  @scala.inline
  def apply(): FlexSliderOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FlexSliderOptions]
  }
  @scala.inline
  implicit class FlexSliderOptionsOps[Self <: FlexSliderOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAdded(value: /* slider */ SliderObject => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("added")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutAdded: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("added")(js.undefined)
        ret
    }
    @scala.inline
    def withAfter(value: /* slider */ SliderObject => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("after")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutAfter: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("after")(js.undefined)
        ret
    }
    @scala.inline
    def withAnimation(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("animation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAnimation: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("animation")(js.undefined)
        ret
    }
    @scala.inline
    def withAnimationLoop(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("animationLoop")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAnimationLoop: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("animationLoop")(js.undefined)
        ret
    }
    @scala.inline
    def withAnimationSpeed(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("animationSpeed")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAnimationSpeed: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("animationSpeed")(js.undefined)
        ret
    }
    @scala.inline
    def withAsNavFor(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("asNavFor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAsNavFor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("asNavFor")(js.undefined)
        ret
    }
    @scala.inline
    def withBefore(value: /* slider */ SliderObject => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("before")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutBefore: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("before")(js.undefined)
        ret
    }
    @scala.inline
    def withControlNav(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("controlNav")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutControlNav: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("controlNav")(js.undefined)
        ret
    }
    @scala.inline
    def withControlsContainer(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("controlsContainer")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutControlsContainer: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("controlsContainer")(js.undefined)
        ret
    }
    @scala.inline
    def withDirection(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("direction")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDirection: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("direction")(js.undefined)
        ret
    }
    @scala.inline
    def withDirectionNav(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("directionNav")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDirectionNav: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("directionNav")(js.undefined)
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
    def withEnd(value: /* slider */ SliderObject => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("end")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutEnd: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("end")(js.undefined)
        ret
    }
    @scala.inline
    def withInitDelay(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("initDelay")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInitDelay: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("initDelay")(js.undefined)
        ret
    }
    @scala.inline
    def withItemMargin(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("itemMargin")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutItemMargin: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("itemMargin")(js.undefined)
        ret
    }
    @scala.inline
    def withItemWidth(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("itemWidth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutItemWidth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("itemWidth")(js.undefined)
        ret
    }
    @scala.inline
    def withKeyboard(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keyboard")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutKeyboard: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keyboard")(js.undefined)
        ret
    }
    @scala.inline
    def withManualControls(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("manualControls")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutManualControls: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("manualControls")(js.undefined)
        ret
    }
    @scala.inline
    def withMaxItems(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxItems")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxItems: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxItems")(js.undefined)
        ret
    }
    @scala.inline
    def withMinItems(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minItems")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMinItems: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minItems")(js.undefined)
        ret
    }
    @scala.inline
    def withMousewheel(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mousewheel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMousewheel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mousewheel")(js.undefined)
        ret
    }
    @scala.inline
    def withMove(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("move")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMove: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("move")(js.undefined)
        ret
    }
    @scala.inline
    def withMultipleKeyboard(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("multipleKeyboard")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMultipleKeyboard: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("multipleKeyboard")(js.undefined)
        ret
    }
    @scala.inline
    def withNamespace(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("namespace")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNamespace: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("namespace")(js.undefined)
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
    def withPauseOnAction(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pauseOnAction")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPauseOnAction: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pauseOnAction")(js.undefined)
        ret
    }
    @scala.inline
    def withPauseOnHover(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pauseOnHover")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPauseOnHover: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pauseOnHover")(js.undefined)
        ret
    }
    @scala.inline
    def withPausePlay(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pausePlay")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPausePlay: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pausePlay")(js.undefined)
        ret
    }
    @scala.inline
    def withPauseText(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pauseText")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPauseText: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pauseText")(js.undefined)
        ret
    }
    @scala.inline
    def withPlayText(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("playText")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPlayText: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("playText")(js.undefined)
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
    def withRandomize(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("randomize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRandomize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("randomize")(js.undefined)
        ret
    }
    @scala.inline
    def withRemoved(value: /* slider */ SliderObject => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("removed")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutRemoved: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("removed")(js.undefined)
        ret
    }
    @scala.inline
    def withReverse(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reverse")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReverse: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reverse")(js.undefined)
        ret
    }
    @scala.inline
    def withSelector(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selector")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSelector: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selector")(js.undefined)
        ret
    }
    @scala.inline
    def withSlideshow(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("slideshow")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSlideshow: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("slideshow")(js.undefined)
        ret
    }
    @scala.inline
    def withSlideshowSpeed(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("slideshowSpeed")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSlideshowSpeed: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("slideshowSpeed")(js.undefined)
        ret
    }
    @scala.inline
    def withSmoothHeight(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("smoothHeight")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSmoothHeight: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("smoothHeight")(js.undefined)
        ret
    }
    @scala.inline
    def withStart(value: /* slider */ SliderObject => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("start")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutStart: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("start")(js.undefined)
        ret
    }
    @scala.inline
    def withStartAt(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("startAt")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStartAt: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("startAt")(js.undefined)
        ret
    }
    @scala.inline
    def withSync(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sync")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSync: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sync")(js.undefined)
        ret
    }
    @scala.inline
    def withTouch(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("touch")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTouch: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("touch")(js.undefined)
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
  }
  
}

