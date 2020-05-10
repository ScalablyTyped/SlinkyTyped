package typingsSlinky.reveal

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RevealOptions extends js.Object {
  var autoSlide: js.UndefOr[Double] = js.native
  var autoSlideMethod: js.UndefOr[js.Any] = js.native
  var autoSlideStoppable: js.UndefOr[Boolean] = js.native
  var backgroundTransition: js.UndefOr[String] = js.native
  var center: js.UndefOr[Boolean] = js.native
  // Configuration
  var controls: js.UndefOr[Boolean] = js.native
  // Dependencies
  // https://github.com/hakimel/reveal.js/#dependencies
  var dependencies: js.UndefOr[js.Array[RevealDependency]] = js.native
  var embedded: js.UndefOr[Boolean] = js.native
  var fragments: js.UndefOr[Boolean] = js.native
  var height: js.UndefOr[Double | String] = js.native
  var help: js.UndefOr[Boolean] = js.native
  var hideAddressBar: js.UndefOr[Boolean] = js.native
  var history: js.UndefOr[Boolean] = js.native
  // https://github.com/hakimel/reveal.js/#keyboard-bindings
  var keyboard: js.UndefOr[js.Any] = js.native
  var loop: js.UndefOr[Boolean] = js.native
  var margin: js.UndefOr[Double | String] = js.native
  // https://github.com/hakimel/reveal.js/#mathjax
  var math: js.UndefOr[MathConfig] = js.native
  var maxScale: js.UndefOr[Double | String] = js.native
  var minScale: js.UndefOr[Double | String] = js.native
  var mouseWheel: js.UndefOr[Boolean] = js.native
  // https://github.com/hakimel/reveal.js/#multiplexing
  var multiplex: js.UndefOr[MultiplexConfig] = js.native
  var overview: js.UndefOr[Boolean] = js.native
   // CSS syntax, e.g. "2100px 900px" - currently only pixels are supported (don't use % or auto)
  // Number of pixels to move the parallax background per slide
  // - Calculated automatically unless specified
  // - Set to 0 to disable movement along an axis
  var parallaxBackgroundHorizontal: js.UndefOr[Double] = js.native
  // https://github.com/hakimel/reveal.js/#parallax-background
  // Parallax background image
  var parallaxBackgroundImage: js.UndefOr[String] = js.native
  // Parallax background size
  var parallaxBackgroundSize: js.UndefOr[String] = js.native
  var parallaxBackgroundVertical: js.UndefOr[Double] = js.native
  // Exposes the reveal.js API through window.postMessage
  var postMessage: js.UndefOr[Boolean] = js.native
  // Dispatches all reveal.js events to the parent window through postMessage
  var postMessageEvents: js.UndefOr[Boolean] = js.native
  var previewLinks: js.UndefOr[Boolean] = js.native
  var progress: js.UndefOr[Boolean] = js.native
  var rollingLinks: js.UndefOr[Boolean] = js.native
  var rtl: js.UndefOr[Boolean] = js.native
  var showNotes: js.UndefOr[Boolean] = js.native
  var shuffle: js.UndefOr[Boolean] = js.native
  // https://github.com/hakimel/reveal.js/#slide-number
  var slideNumber: js.UndefOr[Boolean | String] = js.native
  var theme: js.UndefOr[String] = js.native
  var touch: js.UndefOr[Boolean] = js.native
  var transition: js.UndefOr[String] = js.native
  var transitionSpeed: js.UndefOr[String] = js.native
  var viewDistance: js.UndefOr[Double] = js.native
  // Presentation Size
  // https://github.com/hakimel/reveal.js/#presentation-size
  var width: js.UndefOr[Double | String] = js.native
}

object RevealOptions {
  @scala.inline
  def apply(): RevealOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RevealOptions]
  }
  @scala.inline
  implicit class RevealOptionsOps[Self <: RevealOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAutoSlide(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoSlide")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAutoSlide: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoSlide")(js.undefined)
        ret
    }
    @scala.inline
    def withAutoSlideMethod(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoSlideMethod")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAutoSlideMethod: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoSlideMethod")(js.undefined)
        ret
    }
    @scala.inline
    def withAutoSlideStoppable(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoSlideStoppable")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAutoSlideStoppable: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoSlideStoppable")(js.undefined)
        ret
    }
    @scala.inline
    def withBackgroundTransition(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("backgroundTransition")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBackgroundTransition: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("backgroundTransition")(js.undefined)
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
    def withDependencies(value: js.Array[RevealDependency]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dependencies")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDependencies: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dependencies")(js.undefined)
        ret
    }
    @scala.inline
    def withEmbedded(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("embedded")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEmbedded: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("embedded")(js.undefined)
        ret
    }
    @scala.inline
    def withFragments(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fragments")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFragments: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fragments")(js.undefined)
        ret
    }
    @scala.inline
    def withHeight(value: Double | String): Self = {
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
    def withHelp(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("help")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHelp: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("help")(js.undefined)
        ret
    }
    @scala.inline
    def withHideAddressBar(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hideAddressBar")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHideAddressBar: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hideAddressBar")(js.undefined)
        ret
    }
    @scala.inline
    def withHistory(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("history")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHistory: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("history")(js.undefined)
        ret
    }
    @scala.inline
    def withKeyboard(value: js.Any): Self = {
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
    def withMargin(value: Double | String): Self = {
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
    def withMath(value: MathConfig): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("math")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMath: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("math")(js.undefined)
        ret
    }
    @scala.inline
    def withMaxScale(value: Double | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxScale")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxScale: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxScale")(js.undefined)
        ret
    }
    @scala.inline
    def withMinScale(value: Double | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minScale")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMinScale: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minScale")(js.undefined)
        ret
    }
    @scala.inline
    def withMouseWheel(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mouseWheel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMouseWheel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mouseWheel")(js.undefined)
        ret
    }
    @scala.inline
    def withMultiplex(value: MultiplexConfig): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("multiplex")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMultiplex: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("multiplex")(js.undefined)
        ret
    }
    @scala.inline
    def withOverview(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("overview")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOverview: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("overview")(js.undefined)
        ret
    }
    @scala.inline
    def withParallaxBackgroundHorizontal(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parallaxBackgroundHorizontal")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutParallaxBackgroundHorizontal: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parallaxBackgroundHorizontal")(js.undefined)
        ret
    }
    @scala.inline
    def withParallaxBackgroundImage(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parallaxBackgroundImage")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutParallaxBackgroundImage: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parallaxBackgroundImage")(js.undefined)
        ret
    }
    @scala.inline
    def withParallaxBackgroundSize(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parallaxBackgroundSize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutParallaxBackgroundSize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parallaxBackgroundSize")(js.undefined)
        ret
    }
    @scala.inline
    def withParallaxBackgroundVertical(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parallaxBackgroundVertical")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutParallaxBackgroundVertical: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parallaxBackgroundVertical")(js.undefined)
        ret
    }
    @scala.inline
    def withPostMessage(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("postMessage")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPostMessage: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("postMessage")(js.undefined)
        ret
    }
    @scala.inline
    def withPostMessageEvents(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("postMessageEvents")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPostMessageEvents: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("postMessageEvents")(js.undefined)
        ret
    }
    @scala.inline
    def withPreviewLinks(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("previewLinks")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPreviewLinks: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("previewLinks")(js.undefined)
        ret
    }
    @scala.inline
    def withProgress(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("progress")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutProgress: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("progress")(js.undefined)
        ret
    }
    @scala.inline
    def withRollingLinks(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rollingLinks")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRollingLinks: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rollingLinks")(js.undefined)
        ret
    }
    @scala.inline
    def withRtl(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rtl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRtl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rtl")(js.undefined)
        ret
    }
    @scala.inline
    def withShowNotes(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showNotes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShowNotes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showNotes")(js.undefined)
        ret
    }
    @scala.inline
    def withShuffle(value: Boolean): Self = {
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
    def withSlideNumber(value: Boolean | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("slideNumber")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSlideNumber: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("slideNumber")(js.undefined)
        ret
    }
    @scala.inline
    def withTheme(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("theme")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTheme: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("theme")(js.undefined)
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
    def withTransition(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transition")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTransition: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transition")(js.undefined)
        ret
    }
    @scala.inline
    def withTransitionSpeed(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transitionSpeed")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTransitionSpeed: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transitionSpeed")(js.undefined)
        ret
    }
    @scala.inline
    def withViewDistance(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("viewDistance")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutViewDistance: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("viewDistance")(js.undefined)
        ret
    }
    @scala.inline
    def withWidth(value: Double | String): Self = {
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

