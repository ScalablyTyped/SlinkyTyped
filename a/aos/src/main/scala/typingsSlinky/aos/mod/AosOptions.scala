package typingsSlinky.aos.mod

import typingsSlinky.aos.aosStrings.mobile
import typingsSlinky.aos.aosStrings.phone
import typingsSlinky.aos.aosStrings.tablet
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AosOptions extends js.Object {
  // #endregion
  // #region Settings that can be overridden on per-element basis, by `data-aos-*` attributes
  /**
    * Defines which position of the element regarding to window should trigger the animation
    */
  var anchorPlacement: js.UndefOr[anchorPlacementOptions] = js.native
  // #region Global settings
  /**
    * Class applied on animation
    */
  var animatedClassName: js.UndefOr[String] = js.native
  /**
    * The delay on debounce used while resizing window
    */
  var debounceDelay: js.UndefOr[Double] = js.native
  /**
    * Values from 0 to 3000, with step 50ms
    */
  var delay: js.UndefOr[Double] = js.native
  /**
    * Accepts following values: 'phone', 'tablet', 'mobile', boolean, expression or function
    */
  var disable: js.UndefOr[phone | tablet | mobile | Boolean | js.Function0[Boolean]] = js.native
  /**
    * Disables automatic mutations' detections
    */
  var disableMutationObserver: js.UndefOr[Boolean] = js.native
  /**
    * Values from 0 to 3000, with step 50ms
    */
  var duration: js.UndefOr[Double] = js.native
  /**
    * Default easing for AOS animations
    */
  var easing: js.UndefOr[easingOptions] = js.native
  /**
    * Class applied after initialization
    */
  var initClassName: js.UndefOr[String] = js.native
  /**
    * Whether elements should animate out while scrolling past them
    */
  var mirror: js.UndefOr[Boolean] = js.native
  /**
    * Offset (in px) from the original trigger point
    */
  var offset: js.UndefOr[Double] = js.native
  /**
    * Whether animation should happen only once - while scrolling down
    */
  var once: js.UndefOr[Boolean] = js.native
  /**
    * Name of the event dispatched on the document, that AOS should initialize on
    */
  var startEvent: js.UndefOr[String] = js.native
  /**
    * The delay on throttle used while scrolling the page
    */
  var throttleDelay: js.UndefOr[Double] = js.native
  /**
    * If true, will add content of `data-aos` as classes on scroll
    */
  var useClassNames: js.UndefOr[Boolean] = js.native
}

object AosOptions {
  @scala.inline
  def apply(): AosOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AosOptions]
  }
  @scala.inline
  implicit class AosOptionsOps[Self <: AosOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAnchorPlacement(value: anchorPlacementOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("anchorPlacement")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAnchorPlacement: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("anchorPlacement")(js.undefined)
        ret
    }
    @scala.inline
    def withAnimatedClassName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("animatedClassName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAnimatedClassName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("animatedClassName")(js.undefined)
        ret
    }
    @scala.inline
    def withDebounceDelay(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("debounceDelay")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDebounceDelay: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("debounceDelay")(js.undefined)
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
    def withDisableFunction0(value: () => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disable")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withDisable(value: phone | tablet | mobile | Boolean | js.Function0[Boolean]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disable")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDisable: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disable")(js.undefined)
        ret
    }
    @scala.inline
    def withDisableMutationObserver(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disableMutationObserver")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDisableMutationObserver: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disableMutationObserver")(js.undefined)
        ret
    }
    @scala.inline
    def withDuration(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("duration")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDuration: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("duration")(js.undefined)
        ret
    }
    @scala.inline
    def withEasing(value: easingOptions): Self = {
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
    def withInitClassName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("initClassName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInitClassName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("initClassName")(js.undefined)
        ret
    }
    @scala.inline
    def withMirror(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mirror")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMirror: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mirror")(js.undefined)
        ret
    }
    @scala.inline
    def withOffset(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("offset")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOffset: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("offset")(js.undefined)
        ret
    }
    @scala.inline
    def withOnce(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("once")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOnce: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("once")(js.undefined)
        ret
    }
    @scala.inline
    def withStartEvent(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("startEvent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStartEvent: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("startEvent")(js.undefined)
        ret
    }
    @scala.inline
    def withThrottleDelay(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("throttleDelay")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutThrottleDelay: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("throttleDelay")(js.undefined)
        ret
    }
    @scala.inline
    def withUseClassNames(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("useClassNames")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUseClassNames: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("useClassNames")(js.undefined)
        ret
    }
  }
  
}

