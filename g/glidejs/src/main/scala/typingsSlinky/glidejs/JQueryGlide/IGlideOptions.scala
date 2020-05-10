package typingsSlinky.glidejs.JQueryGlide

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IGlideOptions extends js.Object {
  /**
    * Default: function () {}
    * {Function} Callback after plugin init
    */
  var afterInit: js.UndefOr[js.Function] = js.native
  /**
    * Default: function() {}
    * {Function} Callback after slide change
    */
  var afterTransition: js.UndefOr[js.Function] = js.native
  /**
    * Default: 500
    * Animation time in ms
    * @type {number}
    */
  var animationDuration: js.UndefOr[Double] = js.native
  /**
    * Default: cubic-bezier(0.165, 0.840, 0.440, 1.000)
    * cubic-bezier(0.165, 0.840, 0.440, 1.000)
    */
  var animationTimingFunc: js.UndefOr[String] = js.native
  /**
    * Default: 'slider-arrow--left'
    * {String} Left arrow
    */
  var arrowLeftClass: js.UndefOr[String] = js.native
  /**
    * Default: 'prev'
    * {String} Left arrow text
    */
  var arrowLeftText: js.UndefOr[String] = js.native
  /**
    * Default: 'slider-arrow'
    * {String} Main class for both arrows
    */
  var arrowMainClass: js.UndefOr[String] = js.native
  /**
    * Default: 'slider-arrow--right'
    * {String} Right arrow
    */
  var arrowRightClass: js.UndefOr[String] = js.native
  /**
    * Default: 'next'
    * {String} Right arrow text
    */
  var arrowRightText: js.UndefOr[String] = js.native
  /**
    * Default: true
    * {Bool or String} Show/hide/appendTo arrows
    * True for append arrows to slider wrapper
    * False for not appending arrows
    * Id or class name (e.g. '.class-name') for appending to specific HTML markup
    */
  var arrows: js.UndefOr[js.Any] = js.native
  /**
    * Default: 'slider-arrows'
    * {String} Arrows wrapper class
    */
  var arrowsWrapperClass: js.UndefOr[String] = js.native
  /**
    * Default: 4000
    * {Int or Bool} False for turning off autoplay
    */
  var autoplay: js.UndefOr[js.Any] = js.native
  /**
    * Default: function () {}
    * {Function} Callback before plugin init
    */
  var beforeInit: js.UndefOr[js.Function] = js.native
  /**
    * Default: function () {}
    * {Function} Callback before slide change
    */
  var beforeTransition: js.UndefOr[js.Function] = js.native
  /**
    * Default: true {Bool} Circular play (Animation continues without starting over once it reaches the last slide)
    */
  var circular: js.UndefOr[Boolean] = js.native
  /**
    * Default: true {Bool} Pause autoplay on mouseover slider
    */
  var hoverpause: js.UndefOr[Boolean] = js.native
  /**
    * Default: true
    * {Bool} Slide on left / right keyboard arrows press
    */
  var keyboard: js.UndefOr[Boolean] = js.native
  /**
    * Default: true
    * {Bool or String} Show/hide/appendTo bullets navigation
    * True for append arrows to slider wrapper
    * False for not appending arrows
    * Id or class name (e.g. '.class-name') for appending to specific HTML markup
    */
  var navigation: js.UndefOr[js.Any] = js.native
  /**
    * Default: true
    * {Bool} Center bullet navigation
    */
  var navigationCenter: js.UndefOr[Boolean] = js.native
  /**
    * Default: 'slider-nav'
    * {String} Navigation class
    */
  var navigationClass: js.UndefOr[String] = js.native
  /**
    * Default: 'slider-nav__item--current'
    * {String} Current navigation item class
    */
  var navigationCurrentItemClass: js.UndefOr[String] = js.native
  /**
    * Default: 'slider-nav__item'
    * {String} Navigation item class
    */
  var navigationItemClass: js.UndefOr[String] = js.native
  /**
    * Default: 60
    * {Int or Bool} Touch settings
    */
  var touchDistance: js.UndefOr[js.Any] = js.native
}

object IGlideOptions {
  @scala.inline
  def apply(): IGlideOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IGlideOptions]
  }
  @scala.inline
  implicit class IGlideOptionsOps[Self <: IGlideOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAfterInit(value: js.Function): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("afterInit")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAfterInit: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("afterInit")(js.undefined)
        ret
    }
    @scala.inline
    def withAfterTransition(value: js.Function): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("afterTransition")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAfterTransition: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("afterTransition")(js.undefined)
        ret
    }
    @scala.inline
    def withAnimationDuration(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("animationDuration")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAnimationDuration: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("animationDuration")(js.undefined)
        ret
    }
    @scala.inline
    def withAnimationTimingFunc(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("animationTimingFunc")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAnimationTimingFunc: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("animationTimingFunc")(js.undefined)
        ret
    }
    @scala.inline
    def withArrowLeftClass(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("arrowLeftClass")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutArrowLeftClass: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("arrowLeftClass")(js.undefined)
        ret
    }
    @scala.inline
    def withArrowLeftText(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("arrowLeftText")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutArrowLeftText: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("arrowLeftText")(js.undefined)
        ret
    }
    @scala.inline
    def withArrowMainClass(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("arrowMainClass")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutArrowMainClass: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("arrowMainClass")(js.undefined)
        ret
    }
    @scala.inline
    def withArrowRightClass(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("arrowRightClass")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutArrowRightClass: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("arrowRightClass")(js.undefined)
        ret
    }
    @scala.inline
    def withArrowRightText(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("arrowRightText")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutArrowRightText: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("arrowRightText")(js.undefined)
        ret
    }
    @scala.inline
    def withArrows(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("arrows")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutArrows: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("arrows")(js.undefined)
        ret
    }
    @scala.inline
    def withArrowsWrapperClass(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("arrowsWrapperClass")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutArrowsWrapperClass: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("arrowsWrapperClass")(js.undefined)
        ret
    }
    @scala.inline
    def withAutoplay(value: js.Any): Self = {
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
    def withBeforeInit(value: js.Function): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("beforeInit")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBeforeInit: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("beforeInit")(js.undefined)
        ret
    }
    @scala.inline
    def withBeforeTransition(value: js.Function): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("beforeTransition")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBeforeTransition: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("beforeTransition")(js.undefined)
        ret
    }
    @scala.inline
    def withCircular(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("circular")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCircular: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("circular")(js.undefined)
        ret
    }
    @scala.inline
    def withHoverpause(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hoverpause")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHoverpause: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hoverpause")(js.undefined)
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
    def withNavigation(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("navigation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNavigation: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("navigation")(js.undefined)
        ret
    }
    @scala.inline
    def withNavigationCenter(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("navigationCenter")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNavigationCenter: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("navigationCenter")(js.undefined)
        ret
    }
    @scala.inline
    def withNavigationClass(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("navigationClass")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNavigationClass: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("navigationClass")(js.undefined)
        ret
    }
    @scala.inline
    def withNavigationCurrentItemClass(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("navigationCurrentItemClass")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNavigationCurrentItemClass: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("navigationCurrentItemClass")(js.undefined)
        ret
    }
    @scala.inline
    def withNavigationItemClass(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("navigationItemClass")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNavigationItemClass: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("navigationItemClass")(js.undefined)
        ret
    }
    @scala.inline
    def withTouchDistance(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("touchDistance")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTouchDistance: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("touchDistance")(js.undefined)
        ret
    }
  }
  
}

