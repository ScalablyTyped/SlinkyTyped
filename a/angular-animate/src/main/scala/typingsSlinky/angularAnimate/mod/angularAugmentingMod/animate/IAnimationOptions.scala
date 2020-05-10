package typingsSlinky.angularAnimate.mod.angularAugmentingMod.animate

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Angular Animation Options
  * see https://docs.angularjs.org/api/ngAnimate/#applying-directive-specific-styles-to-an-animation
  */
@js.native
trait IAnimationOptions extends js.Object {
  /**
    * A space separated list of CSS classes that will be added to the element and spread across the animation.
    */
  var addClass: js.UndefOr[String] = js.native
  /**
    * Whether or not the provided from and to styles will be removed once the animation is closed. This is useful for
    * when the styles are used purely for the sake of the animation and do not have a lasting visual effect on the element
    * (e.g. a colapse and open animation). By default this value is set to false.
    */
  var cleanupStyles: js.UndefOr[Boolean] = js.native
  /**
    * A number value representing the total delay of the transition and/or keyframe (note that a value of
    * 1 is 1000ms). If a value of true is used then whatever delay value is detected from the CSS classes will be
    * mirrored on the elements styles (e.g. by setting delay true then the style value of the element will be
    * transition-delay: DETECTED_VALUE). Using true is useful when you want the CSS classes and inline styles to
    * all share the same CSS delay value.
    */
  var delay: js.UndefOr[Double] = js.native
  /**
    * A number value representing the total duration of the transition and/or keyframe (note that a value
    * of 1 is 1000ms). If a value of 0 is provided then the animation will be skipped entirely.
    */
  var duration: js.UndefOr[Double] = js.native
  /**
    * The CSS easing value that will be applied to the transition or keyframe animation (or both).
    */
  var easing: js.UndefOr[String] = js.native
  /**
    * The DOM event (e.g. enter, leave, move). When used, a generated CSS class of ng-EVENT and
    * ng-EVENT-active will be applied to the element during the animation. Multiple events can be provided when
    * spaces are used as a separator. (Note that this will not perform any DOM operation.)
    */
  var event: js.UndefOr[String] = js.native
  /**
    * The starting CSS styles (a key/value object) that will be applied at the start of the animation.
    */
  var from: js.UndefOr[js.Object] = js.native
  /**
    * The raw CSS keyframe animation style that will be used (e.g. 1s my_animation linear).
    */
  var keyframeStyle: js.UndefOr[String] = js.native
  /**
    * A space separated list of CSS classes that will be removed from the element and spread across
    * the animation.
    */
  var removeClass: js.UndefOr[String] = js.native
  /**
    * A numeric time value representing the delay between successively animated elements (Click here to
    * learn how CSS-based staggering works in ngAnimate.)
    */
  var stagger: js.UndefOr[Double] = js.native
  /**
    * The numeric index representing the stagger item (e.g. a value of 5 is equal to the sixth item
    * in the stagger; therefore when a stagger option value of 0.1 is used then there will be a stagger delay of 600ms)
    *
    */
  var staggerIndex: js.UndefOr[Double] = js.native
  /**
    * Indicates that the ng-prefix will be added to the event class. Setting to false or
    * omitting will turn ng-EVENT and ng-EVENT-active in EVENT and EVENT-active. Unused if event is omitted.
    */
  var structural: js.UndefOr[Boolean] = js.native
  /**
    * The ending CSS styles (a key/value object) that will be applied across the animation via a CSS transition.
    */
  var to: js.UndefOr[js.Object] = js.native
  /**
    * The raw CSS transition style that will be used (e.g. 1s linear all).
    */
  var transitionStyle: js.UndefOr[String] = js.native
}

object IAnimationOptions {
  @scala.inline
  def apply(): IAnimationOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IAnimationOptions]
  }
  @scala.inline
  implicit class IAnimationOptionsOps[Self <: IAnimationOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAddClass(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("addClass")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAddClass: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("addClass")(js.undefined)
        ret
    }
    @scala.inline
    def withCleanupStyles(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cleanupStyles")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCleanupStyles: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cleanupStyles")(js.undefined)
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
    def withEvent(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("event")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEvent: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("event")(js.undefined)
        ret
    }
    @scala.inline
    def withFrom(value: js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("from")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFrom: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("from")(js.undefined)
        ret
    }
    @scala.inline
    def withKeyframeStyle(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keyframeStyle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutKeyframeStyle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keyframeStyle")(js.undefined)
        ret
    }
    @scala.inline
    def withRemoveClass(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("removeClass")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRemoveClass: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("removeClass")(js.undefined)
        ret
    }
    @scala.inline
    def withStagger(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stagger")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStagger: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stagger")(js.undefined)
        ret
    }
    @scala.inline
    def withStaggerIndex(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("staggerIndex")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStaggerIndex: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("staggerIndex")(js.undefined)
        ret
    }
    @scala.inline
    def withStructural(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("structural")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStructural: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("structural")(js.undefined)
        ret
    }
    @scala.inline
    def withTo(value: js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("to")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTo: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("to")(js.undefined)
        ret
    }
    @scala.inline
    def withTransitionStyle(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transitionStyle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTransitionStyle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transitionStyle")(js.undefined)
        ret
    }
  }
  
}

