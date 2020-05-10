package typingsSlinky.loryJs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LoryOptions extends js.Object {
  /**
    * executed after initialisation (end of setup function)
    */
  var afterInit: js.UndefOr[js.Function0[_]] = js.native
  //////////////////////////////////////////////////
  //  Callbacks
  //////////////////////////////////////////////////
  /**
    * executed before initialisation (first in setup function)
    */
  var beforeInit: js.UndefOr[js.Function0[_]] = js.native
  /**
    * executed on click of next controls (next function)
    */
  var beforeNext: js.UndefOr[js.Function0[_]] = js.native
  /**
    * executed on click of prev controls (prev function)
    */
  var beforePrev: js.UndefOr[js.Function0[_]] = js.native
  /**
    * executed on every resize event
    */
  var beforeResize: js.UndefOr[js.Function0[_]] = js.native
  /**
    * executed on touch attempt (touchstart)
    */
  var beforeTouch: js.UndefOr[js.Function0[_]] = js.native
  /**
    * class name for slider frame
    * default: 'js_frame'
    */
  var classNameFrame: js.UndefOr[String] = js.native
  /**
    * class name for slider next control
    * default: 'js_next'
    */
  var classNameNextCtrl: js.UndefOr[String] = js.native
  /**
    * class name for slider previous control
    * default: 'js_prev'
    */
  var classNamePrevCtrl: js.UndefOr[String] = js.native
  /**
    * class name for slides container
    * default: 'js_slides'
    */
  var classNameSlideContainer: js.UndefOr[String] = js.native
  /**
    * cubic bezier easing functions: http://easings.net/de (default: 'cubic-bezier(0.455, 0.03, 0.515, 0.955)').
    */
  var ease: js.UndefOr[String] = js.native
  /**
    * enabled mouse events
    * default: false
    */
  var enableMouseEvents: js.UndefOr[Boolean] = js.native
  /**
    * like carousel, works with multiple slides (default: false). (do not combine with rewind)
    */
  var infinite: js.UndefOr[Boolean | Double] = js.native
  /**
    * the slide index to show when the slider is initialized (	default: 0 )
    */
  var initialIndex: js.UndefOr[Double] = js.native
  /**
    * if slider reached the last slide, with next click the slider goes back to the startindex (default: false).
    */
  var rewind: js.UndefOr[Boolean] = js.native
  /**
    * time in milliseconds for the animation of the rewind after the last slide (default: 600).
    */
  var rewindSpeed: js.UndefOr[Double] = js.native
  /**
    * time in milliseconds for the animation of a valid slide attempt (default: 300).
    */
  var slideSpeed: js.UndefOr[Double] = js.native
  //////////////////////////////////////////////////
  //  Options
  //////////////////////////////////////////////////
  /**
    * slides scrolled at once (default: 1).
    */
  var slidesToScroll: js.UndefOr[Double] = js.native
  /**
    * time for the snapBack of the slider if the slide attempt was not valid (default: 200).
    */
  var snapBackSpeed: js.UndefOr[Double] = js.native
}

object LoryOptions {
  @scala.inline
  def apply(): LoryOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LoryOptions]
  }
  @scala.inline
  implicit class LoryOptionsOps[Self <: LoryOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAfterInit(value: () => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("afterInit")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutAfterInit: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("afterInit")(js.undefined)
        ret
    }
    @scala.inline
    def withBeforeInit(value: () => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("beforeInit")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutBeforeInit: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("beforeInit")(js.undefined)
        ret
    }
    @scala.inline
    def withBeforeNext(value: () => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("beforeNext")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutBeforeNext: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("beforeNext")(js.undefined)
        ret
    }
    @scala.inline
    def withBeforePrev(value: () => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("beforePrev")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutBeforePrev: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("beforePrev")(js.undefined)
        ret
    }
    @scala.inline
    def withBeforeResize(value: () => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("beforeResize")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutBeforeResize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("beforeResize")(js.undefined)
        ret
    }
    @scala.inline
    def withBeforeTouch(value: () => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("beforeTouch")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutBeforeTouch: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("beforeTouch")(js.undefined)
        ret
    }
    @scala.inline
    def withClassNameFrame(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("classNameFrame")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutClassNameFrame: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("classNameFrame")(js.undefined)
        ret
    }
    @scala.inline
    def withClassNameNextCtrl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("classNameNextCtrl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutClassNameNextCtrl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("classNameNextCtrl")(js.undefined)
        ret
    }
    @scala.inline
    def withClassNamePrevCtrl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("classNamePrevCtrl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutClassNamePrevCtrl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("classNamePrevCtrl")(js.undefined)
        ret
    }
    @scala.inline
    def withClassNameSlideContainer(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("classNameSlideContainer")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutClassNameSlideContainer: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("classNameSlideContainer")(js.undefined)
        ret
    }
    @scala.inline
    def withEase(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ease")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEase: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ease")(js.undefined)
        ret
    }
    @scala.inline
    def withEnableMouseEvents(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableMouseEvents")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnableMouseEvents: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableMouseEvents")(js.undefined)
        ret
    }
    @scala.inline
    def withInfinite(value: Boolean | Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("infinite")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInfinite: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("infinite")(js.undefined)
        ret
    }
    @scala.inline
    def withInitialIndex(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("initialIndex")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInitialIndex: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("initialIndex")(js.undefined)
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
    def withRewindSpeed(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rewindSpeed")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRewindSpeed: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rewindSpeed")(js.undefined)
        ret
    }
    @scala.inline
    def withSlideSpeed(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("slideSpeed")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSlideSpeed: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("slideSpeed")(js.undefined)
        ret
    }
    @scala.inline
    def withSlidesToScroll(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("slidesToScroll")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSlidesToScroll: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("slidesToScroll")(js.undefined)
        ret
    }
    @scala.inline
    def withSnapBackSpeed(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("snapBackSpeed")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSnapBackSpeed: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("snapBackSpeed")(js.undefined)
        ret
    }
  }
  
}

