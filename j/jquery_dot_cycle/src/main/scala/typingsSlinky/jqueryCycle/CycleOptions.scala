package typingsSlinky.jqueryCycle

import org.scalajs.dom.raw.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CycleOptions extends js.Object {
  var activePagerClass: js.UndefOr[String] = js.native
                                                                                                                  // class name used for the active pager link
  var after: js.UndefOr[
    js.Function4[
      /* currSlideElement */ Element, 
      /* nextSlideElement */ Element, 
      /* options */ CycleOptions, 
      /* forwardFlag */ Boolean, 
      Unit
    ]
  ] = js.native
                           // transition callback (scope set to element that was shown):  function(currSlideElement, nextSlideElement, options, forwardFlag)
  var allowPagerClickBubble: js.UndefOr[Boolean] = js.native
                                                                                                               // allows or prevents click event on pager anchors from bubbling
  var animIn: js.UndefOr[js.Any] = js.native
                                                                                                                               // properties that define how the slide animates in
  var animOut: js.UndefOr[js.Any] = js.native
                                                                                                                              // properties that define how the slide animates out
  var aspect: js.UndefOr[Boolean] = js.native
                                                                                                                              // preserve aspect ratio during fit resizing, cropping if necessary (must be used with fit option)
  var autostop: js.UndefOr[Boolean] = js.native
                                                                                                                            // true to end slideshow after X transitions (where X == slide count)
  var autostopCount: js.UndefOr[Double] = js.native
                                                                                                                     // number of transitions (optionally used with autostop to define X)
  var backwards: js.UndefOr[Boolean] = js.native
                                                                                                                           // true to start slideshow at last slide and move backwards through the stack
  var before: js.UndefOr[
    js.Function4[
      /* currSlideElement */ Element, 
      /* nextSlideElement */ Element, 
      /* options */ CycleOptions, 
      /* forwardFlag */ Boolean, 
      Unit
    ]
  ] = js.native
                           // transition callback (scope set to element to be shown):     function(currSlideElement, nextSlideElement, options, forwardFlag)
  var center: js.UndefOr[Boolean] = js.native
                                                                                                                              // set to true to have cycle add top/left margin to each slide (use with width and height options)
  var cleartype: js.UndefOr[Boolean] = js.native
                                                                                                                           // true if clearType corrections should be applied (for IE)
  var cleartypeNoBg: js.UndefOr[Boolean] = js.native
                                                                                                                       // set to true to disable extra cleartype fixing (leave false to force background color setting on slides)
  var containerResize: js.UndefOr[Boolean] = js.native
                                                                                                                     // resize container to fit largest slide
  var containerResizeHeight: js.UndefOr[Boolean] = js.native
                                                                                                               // resize containers height to fit the largest slide but leave the width dynamic
  var continuous: js.UndefOr[Boolean] = js.native
                                                                                                                          // true to start next transition immediately after current one completes
  var cssAfter: js.UndefOr[js.Any] = js.native
                                                                                                                             // properties that defined the state of the slide after transitioning out
  var cssBefore: js.UndefOr[js.Any] = js.native
                                                                                                                            // properties that define the initial state of the slide before transitioning in
  var delay: js.UndefOr[Double] = js.native
                                                                                                                             // additional delay (in ms) for first transition (hint: can be negative)
  var easeIn: js.UndefOr[String] = js.native
                                                                                                                            // easing for "in" transition
  var easeOut: js.UndefOr[String] = js.native
                                                                                                                           // easing for "out" transition
  var easing: js.UndefOr[String] = js.native
                                                                                                                            // easing method for both in and out transitions
  var end: js.UndefOr[js.Function1[/* options */ CycleOptions, Unit]] = js.native
                                                                                                      // callback invoked when the slideshow terminates (use with autostop or nowrap options): function(options)
  var fastOnEvent: js.UndefOr[Boolean] = js.native
                                                                                                                         // force fast transitions when triggered manually (via pager or prev/next); value == time in ms
  var fit: js.UndefOr[Boolean] = js.native
                                                                                                                                 // force slides to fit container
  var fx: js.UndefOr[String] = js.native
                                                                                                                                // name of transition effect (or comma separated names, ex: 'fade,scrollUp,shuffle')
  var fxFn: js.UndefOr[
    js.Function5[
      /* currSlideElement */ Element, 
      /* nextSlideElement */ Element, 
      /* options */ CycleOptions, 
      /* afterCalback */ js.Function, 
      /* forwardFlag */ Boolean, 
      Unit
    ]
  ] = js.native
    // function used to control the transition: function(currSlideElement, nextSlideElement, options, afterCalback, forwardFlag)
  var height: js.UndefOr[js.Any] = js.native
                                                                                                                               // container height (if the 'fit' option is true, the slides will be set to this height as well)
  var manualTrump: js.UndefOr[Boolean] = js.native
                                                                                                                         // causes manual transition to stop an active transition instead of being ignored
  var metaAttr: js.UndefOr[String] = js.native
                                                                                                                          // data- attribute that holds the option data for the slideshow
  var next: js.UndefOr[js.Any] = js.native
                                                                                                                                 // element, jQuery object, or jQuery selector string for the element to use as event trigger for next slide
  var nowrap: js.UndefOr[Boolean] = js.native
                                                                                                                              // true to prevent slideshow from wrapping
  var onPagerEvent: js.UndefOr[js.Function2[/* zeroBasedSlideIndex */ Double, /* slideElement */ Element, Unit]] = js.native
                                                                // callback fn for pager events: function(zeroBasedSlideIndex, slideElement)
  var onPrevNextEvent: js.UndefOr[
    js.Function3[
      /* isNext */ Boolean, 
      /* zeroBasedSlideIndex */ Double, 
      /* slideElement */ Element, 
      Unit
    ]
  ] = js.native
                                               // callback fn for prev/next events: function(isNext, zeroBasedSlideIndex, slideElement)
  var pager: js.UndefOr[js.Any] = js.native
                                                                                                                                // element, jQuery object, or jQuery selector string for the element to use as pager container
  var pagerAnchorBuilder: js.UndefOr[js.Function2[/* index */ Double, /* DOMelement */ Element, String]] = js.native
                                                                        // callback fn for building anchor links:  function(index, DOMelement)
  var pagerEvent: js.UndefOr[String] = js.native
                                                                                                                        // name of event which drives the pager navigation
  var pause: js.UndefOr[Boolean] = js.native
                                                                                                                               // true to enable "pause on hover"
  var pauseOnPagerHover: js.UndefOr[Boolean] = js.native
                                                                                                                   // true to pause when hovering over pager link
  var prev: js.UndefOr[js.Any] = js.native
                                                                                                                                 // element, jQuery object, or jQuery selector string for the element to use as event trigger for previous slide
  var prevNextEvent: js.UndefOr[String] = js.native
                                                                                                                     // event which drives the manual transition to the previous or next slide
  var random: js.UndefOr[Boolean] = js.native
                                                                                                                              // true for random, false for sequence (not applicable to shuffle fx)
  var randomizeEffects: js.UndefOr[Boolean] = js.native
                                                                                                                    // valid when multiple effects are used; true to make the effect sequence random
  var requeueOnImageNotLoaded: js.UndefOr[Boolean] = js.native
                                                                                                             // requeue the slideshow if any image slides are not yet loaded
  var requeueTimeout: js.UndefOr[Double] = js.native
                                                                                                                    // ms delay for requeue
  var rev: js.UndefOr[Boolean] = js.native
                                                                                                                                 // causes animations to transition in reverse (for effects that support it such as scrollHorz/scrollVert/shuffle)
  var shuffle: js.UndefOr[js.Any] = js.native
                                                                                                                              // coords for shuffle animation, ex: { top:15, left: 200 }
  var skipInitializationCallbacks: js.UndefOr[Boolean] = js.native
                                                                                                         // set to true to disable the first before/after callback that occurs prior to any transition
  var slideExpr: js.UndefOr[String] = js.native
                                                                                                                         // expression for selecting slides (if something other than all children is required)
  var slideResize: js.UndefOr[Boolean] = js.native
                                                                                                                         // force slide width/height to fixed size before every transition
  var speed: js.UndefOr[js.Any] = js.native
                                                                                                                                // speed of the transition (any valid fx speed value)
  var speedIn: js.UndefOr[js.Any] = js.native
                                                                                                                              // speed of the 'in' transition
  var speedOut: js.UndefOr[js.Any] = js.native
                                                                                                                             // speed of the 'out' transition
  var startingSlide: js.UndefOr[Double] = js.native
                                                                                                                     // zero-based index of the first slide to be displayed
  var sync: js.UndefOr[Boolean] = js.native
                                                                                                                                // true if in/out transitions should occur simultaneously
  var timeout: js.UndefOr[Double] = js.native
                                                                                                                           // milliseconds between slide transitions (0 to disable auto advance)
  var timeoutFn: js.UndefOr[
    js.Function4[
      /* currSlideElement */ Element, 
      /* nextSlideElement */ Element, 
      /* options */ CycleOptions, 
      /* forwardFlag */ Boolean, 
      Unit
    ]
  ] = js.native
                       // callback for determining per-slide timeout value:  function(currSlideElement, nextSlideElement, options, forwardFlag)
  var updateActivePagerLink: js.UndefOr[
    js.Function3[/* pager */ js.Any, /* currSlide */ Double, /* clsName */ String, Unit]
  ] = js.native
                                                           // callback fn invoked to update the active pager link (adds/removes activePagerClass style)
  var width: js.UndefOr[js.Any] = js.native
}

object CycleOptions {
  @scala.inline
  def apply(): CycleOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CycleOptions]
  }
  @scala.inline
  implicit class CycleOptionsOps[Self <: CycleOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withActivePagerClass(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("activePagerClass")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutActivePagerClass: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("activePagerClass")(js.undefined)
        ret
    }
    @scala.inline
    def withAfter(
      value: (/* currSlideElement */ Element, /* nextSlideElement */ Element, /* options */ CycleOptions, /* forwardFlag */ Boolean) => Unit
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("after")(js.Any.fromFunction4(value))
        ret
    }
    @scala.inline
    def withoutAfter: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("after")(js.undefined)
        ret
    }
    @scala.inline
    def withAllowPagerClickBubble(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowPagerClickBubble")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAllowPagerClickBubble: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowPagerClickBubble")(js.undefined)
        ret
    }
    @scala.inline
    def withAnimIn(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("animIn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAnimIn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("animIn")(js.undefined)
        ret
    }
    @scala.inline
    def withAnimOut(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("animOut")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAnimOut: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("animOut")(js.undefined)
        ret
    }
    @scala.inline
    def withAspect(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("aspect")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAspect: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("aspect")(js.undefined)
        ret
    }
    @scala.inline
    def withAutostop(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autostop")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAutostop: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autostop")(js.undefined)
        ret
    }
    @scala.inline
    def withAutostopCount(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autostopCount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAutostopCount: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autostopCount")(js.undefined)
        ret
    }
    @scala.inline
    def withBackwards(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("backwards")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBackwards: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("backwards")(js.undefined)
        ret
    }
    @scala.inline
    def withBefore(
      value: (/* currSlideElement */ Element, /* nextSlideElement */ Element, /* options */ CycleOptions, /* forwardFlag */ Boolean) => Unit
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("before")(js.Any.fromFunction4(value))
        ret
    }
    @scala.inline
    def withoutBefore: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("before")(js.undefined)
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
    def withCleartype(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cleartype")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCleartype: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cleartype")(js.undefined)
        ret
    }
    @scala.inline
    def withCleartypeNoBg(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cleartypeNoBg")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCleartypeNoBg: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cleartypeNoBg")(js.undefined)
        ret
    }
    @scala.inline
    def withContainerResize(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("containerResize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutContainerResize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("containerResize")(js.undefined)
        ret
    }
    @scala.inline
    def withContainerResizeHeight(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("containerResizeHeight")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutContainerResizeHeight: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("containerResizeHeight")(js.undefined)
        ret
    }
    @scala.inline
    def withContinuous(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("continuous")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutContinuous: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("continuous")(js.undefined)
        ret
    }
    @scala.inline
    def withCssAfter(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cssAfter")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCssAfter: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cssAfter")(js.undefined)
        ret
    }
    @scala.inline
    def withCssBefore(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cssBefore")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCssBefore: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cssBefore")(js.undefined)
        ret
    }
    @scala.inline
    def withDelay(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("delay")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDelay: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("delay")(js.undefined)
        ret
    }
    @scala.inline
    def withEaseIn(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("easeIn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEaseIn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("easeIn")(js.undefined)
        ret
    }
    @scala.inline
    def withEaseOut(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("easeOut")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEaseOut: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("easeOut")(js.undefined)
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
    def withEnd(value: /* options */ CycleOptions => Unit): Self = {
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
    def withFastOnEvent(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fastOnEvent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFastOnEvent: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fastOnEvent")(js.undefined)
        ret
    }
    @scala.inline
    def withFit(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fit")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFit: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fit")(js.undefined)
        ret
    }
    @scala.inline
    def withFx(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fx")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFx: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fx")(js.undefined)
        ret
    }
    @scala.inline
    def withFxFn(
      value: (/* currSlideElement */ Element, /* nextSlideElement */ Element, /* options */ CycleOptions, /* afterCalback */ js.Function, /* forwardFlag */ Boolean) => Unit
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fxFn")(js.Any.fromFunction5(value))
        ret
    }
    @scala.inline
    def withoutFxFn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fxFn")(js.undefined)
        ret
    }
    @scala.inline
    def withHeight(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("height")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHeight: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("height")(js.undefined)
        ret
    }
    @scala.inline
    def withManualTrump(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("manualTrump")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutManualTrump: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("manualTrump")(js.undefined)
        ret
    }
    @scala.inline
    def withMetaAttr(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("metaAttr")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMetaAttr: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("metaAttr")(js.undefined)
        ret
    }
    @scala.inline
    def withNext(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("next")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNext: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("next")(js.undefined)
        ret
    }
    @scala.inline
    def withNowrap(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nowrap")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNowrap: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nowrap")(js.undefined)
        ret
    }
    @scala.inline
    def withOnPagerEvent(value: (/* zeroBasedSlideIndex */ Double, /* slideElement */ Element) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onPagerEvent")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutOnPagerEvent: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onPagerEvent")(js.undefined)
        ret
    }
    @scala.inline
    def withOnPrevNextEvent(
      value: (/* isNext */ Boolean, /* zeroBasedSlideIndex */ Double, /* slideElement */ Element) => Unit
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onPrevNextEvent")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withoutOnPrevNextEvent: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onPrevNextEvent")(js.undefined)
        ret
    }
    @scala.inline
    def withPager(value: js.Any): Self = {
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
    def withPagerAnchorBuilder(value: (/* index */ Double, /* DOMelement */ Element) => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pagerAnchorBuilder")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutPagerAnchorBuilder: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pagerAnchorBuilder")(js.undefined)
        ret
    }
    @scala.inline
    def withPagerEvent(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pagerEvent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPagerEvent: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pagerEvent")(js.undefined)
        ret
    }
    @scala.inline
    def withPause(value: Boolean): Self = {
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
    def withPauseOnPagerHover(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pauseOnPagerHover")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPauseOnPagerHover: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pauseOnPagerHover")(js.undefined)
        ret
    }
    @scala.inline
    def withPrev(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("prev")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPrev: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("prev")(js.undefined)
        ret
    }
    @scala.inline
    def withPrevNextEvent(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("prevNextEvent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPrevNextEvent: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("prevNextEvent")(js.undefined)
        ret
    }
    @scala.inline
    def withRandom(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("random")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRandom: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("random")(js.undefined)
        ret
    }
    @scala.inline
    def withRandomizeEffects(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("randomizeEffects")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRandomizeEffects: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("randomizeEffects")(js.undefined)
        ret
    }
    @scala.inline
    def withRequeueOnImageNotLoaded(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("requeueOnImageNotLoaded")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRequeueOnImageNotLoaded: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("requeueOnImageNotLoaded")(js.undefined)
        ret
    }
    @scala.inline
    def withRequeueTimeout(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("requeueTimeout")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRequeueTimeout: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("requeueTimeout")(js.undefined)
        ret
    }
    @scala.inline
    def withRev(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rev")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRev: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rev")(js.undefined)
        ret
    }
    @scala.inline
    def withShuffle(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shuffle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShuffle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shuffle")(js.undefined)
        ret
    }
    @scala.inline
    def withSkipInitializationCallbacks(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("skipInitializationCallbacks")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSkipInitializationCallbacks: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("skipInitializationCallbacks")(js.undefined)
        ret
    }
    @scala.inline
    def withSlideExpr(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("slideExpr")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSlideExpr: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("slideExpr")(js.undefined)
        ret
    }
    @scala.inline
    def withSlideResize(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("slideResize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSlideResize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("slideResize")(js.undefined)
        ret
    }
    @scala.inline
    def withSpeed(value: js.Any): Self = {
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
    def withSpeedIn(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("speedIn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSpeedIn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("speedIn")(js.undefined)
        ret
    }
    @scala.inline
    def withSpeedOut(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("speedOut")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSpeedOut: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("speedOut")(js.undefined)
        ret
    }
    @scala.inline
    def withStartingSlide(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("startingSlide")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStartingSlide: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("startingSlide")(js.undefined)
        ret
    }
    @scala.inline
    def withSync(value: Boolean): Self = {
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
    def withTimeout(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timeout")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTimeout: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timeout")(js.undefined)
        ret
    }
    @scala.inline
    def withTimeoutFn(
      value: (/* currSlideElement */ Element, /* nextSlideElement */ Element, /* options */ CycleOptions, /* forwardFlag */ Boolean) => Unit
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timeoutFn")(js.Any.fromFunction4(value))
        ret
    }
    @scala.inline
    def withoutTimeoutFn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timeoutFn")(js.undefined)
        ret
    }
    @scala.inline
    def withUpdateActivePagerLink(value: (/* pager */ js.Any, /* currSlide */ Double, /* clsName */ String) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("updateActivePagerLink")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withoutUpdateActivePagerLink: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("updateActivePagerLink")(js.undefined)
        ret
    }
    @scala.inline
    def withWidth(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("width")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWidth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("width")(js.undefined)
        ret
    }
  }
  
}

