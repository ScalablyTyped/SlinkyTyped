package typingsSlinky.ionicCore.componentsMod.LocalJSX

import org.scalajs.dom.raw.CustomEvent
import typingsSlinky.ionicCore.ionicCoreStrings.ios
import typingsSlinky.ionicCore.ionicCoreStrings.md
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IonSlides extends js.Object {
  /**
    * The mode determines which platform styles to use.
    */
  var mode: js.UndefOr[ios | md] = js.native
  /**
    * Emitted after the active slide has changed.
    */
  var onIonSlideDidChange: js.UndefOr[js.Function1[/* event */ CustomEvent, Unit]] = js.native
  /**
    * Emitted when the user double taps on the slide's container.
    */
  var onIonSlideDoubleTap: js.UndefOr[js.Function1[/* event */ CustomEvent, Unit]] = js.native
  /**
    * Emitted when the slider is actively being moved.
    */
  var onIonSlideDrag: js.UndefOr[js.Function1[/* event */ CustomEvent, Unit]] = js.native
  /**
    * Emitted when the next slide has ended.
    */
  var onIonSlideNextEnd: js.UndefOr[js.Function1[/* event */ CustomEvent, Unit]] = js.native
  /**
    * Emitted when the next slide has started.
    */
  var onIonSlideNextStart: js.UndefOr[js.Function1[/* event */ CustomEvent, Unit]] = js.native
  /**
    * Emitted when the previous slide has ended.
    */
  var onIonSlidePrevEnd: js.UndefOr[js.Function1[/* event */ CustomEvent, Unit]] = js.native
  /**
    * Emitted when the previous slide has started.
    */
  var onIonSlidePrevStart: js.UndefOr[js.Function1[/* event */ CustomEvent, Unit]] = js.native
  /**
    * Emitted when the slider is at the last slide.
    */
  var onIonSlideReachEnd: js.UndefOr[js.Function1[/* event */ CustomEvent, Unit]] = js.native
  /**
    * Emitted when the slider is at its initial position.
    */
  var onIonSlideReachStart: js.UndefOr[js.Function1[/* event */ CustomEvent, Unit]] = js.native
  /**
    * Emitted when the user taps/clicks on the slide's container.
    */
  var onIonSlideTap: js.UndefOr[js.Function1[/* event */ CustomEvent, Unit]] = js.native
  /**
    * Emitted when the user releases the touch.
    */
  var onIonSlideTouchEnd: js.UndefOr[js.Function1[/* event */ CustomEvent, Unit]] = js.native
  /**
    * Emitted when the user first touches the slider.
    */
  var onIonSlideTouchStart: js.UndefOr[js.Function1[/* event */ CustomEvent, Unit]] = js.native
  /**
    * Emitted when the slide transition has ended.
    */
  var onIonSlideTransitionEnd: js.UndefOr[js.Function1[/* event */ CustomEvent, Unit]] = js.native
  /**
    * Emitted when the slide transition has started.
    */
  var onIonSlideTransitionStart: js.UndefOr[js.Function1[/* event */ CustomEvent, Unit]] = js.native
  /**
    * Emitted before the active slide has changed.
    */
  var onIonSlideWillChange: js.UndefOr[js.Function1[/* event */ CustomEvent, Unit]] = js.native
  /**
    * Emitted after Swiper initialization
    */
  var onIonSlidesDidLoad: js.UndefOr[js.Function1[/* event */ CustomEvent, Unit]] = js.native
  /**
    * Options to pass to the swiper instance. See http://idangero.us/swiper/api/ for valid options
    */
  var options: js.UndefOr[js.Any] = js.native
  /**
    * If `true`, show the pagination.
    */
  var pager: js.UndefOr[Boolean] = js.native
  /**
    * If `true`, show the scrollbar.
    */
  var scrollbar: js.UndefOr[Boolean] = js.native
}

object IonSlides {
  @scala.inline
  def apply(): IonSlides = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IonSlides]
  }
  @scala.inline
  implicit class IonSlidesOps[Self <: IonSlides] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withMode(value: ios | md): Self = {
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
    def withOnIonSlideDidChange(value: /* event */ CustomEvent => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onIonSlideDidChange")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnIonSlideDidChange: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onIonSlideDidChange")(js.undefined)
        ret
    }
    @scala.inline
    def withOnIonSlideDoubleTap(value: /* event */ CustomEvent => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onIonSlideDoubleTap")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnIonSlideDoubleTap: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onIonSlideDoubleTap")(js.undefined)
        ret
    }
    @scala.inline
    def withOnIonSlideDrag(value: /* event */ CustomEvent => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onIonSlideDrag")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnIonSlideDrag: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onIonSlideDrag")(js.undefined)
        ret
    }
    @scala.inline
    def withOnIonSlideNextEnd(value: /* event */ CustomEvent => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onIonSlideNextEnd")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnIonSlideNextEnd: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onIonSlideNextEnd")(js.undefined)
        ret
    }
    @scala.inline
    def withOnIonSlideNextStart(value: /* event */ CustomEvent => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onIonSlideNextStart")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnIonSlideNextStart: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onIonSlideNextStart")(js.undefined)
        ret
    }
    @scala.inline
    def withOnIonSlidePrevEnd(value: /* event */ CustomEvent => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onIonSlidePrevEnd")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnIonSlidePrevEnd: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onIonSlidePrevEnd")(js.undefined)
        ret
    }
    @scala.inline
    def withOnIonSlidePrevStart(value: /* event */ CustomEvent => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onIonSlidePrevStart")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnIonSlidePrevStart: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onIonSlidePrevStart")(js.undefined)
        ret
    }
    @scala.inline
    def withOnIonSlideReachEnd(value: /* event */ CustomEvent => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onIonSlideReachEnd")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnIonSlideReachEnd: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onIonSlideReachEnd")(js.undefined)
        ret
    }
    @scala.inline
    def withOnIonSlideReachStart(value: /* event */ CustomEvent => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onIonSlideReachStart")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnIonSlideReachStart: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onIonSlideReachStart")(js.undefined)
        ret
    }
    @scala.inline
    def withOnIonSlideTap(value: /* event */ CustomEvent => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onIonSlideTap")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnIonSlideTap: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onIonSlideTap")(js.undefined)
        ret
    }
    @scala.inline
    def withOnIonSlideTouchEnd(value: /* event */ CustomEvent => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onIonSlideTouchEnd")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnIonSlideTouchEnd: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onIonSlideTouchEnd")(js.undefined)
        ret
    }
    @scala.inline
    def withOnIonSlideTouchStart(value: /* event */ CustomEvent => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onIonSlideTouchStart")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnIonSlideTouchStart: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onIonSlideTouchStart")(js.undefined)
        ret
    }
    @scala.inline
    def withOnIonSlideTransitionEnd(value: /* event */ CustomEvent => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onIonSlideTransitionEnd")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnIonSlideTransitionEnd: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onIonSlideTransitionEnd")(js.undefined)
        ret
    }
    @scala.inline
    def withOnIonSlideTransitionStart(value: /* event */ CustomEvent => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onIonSlideTransitionStart")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnIonSlideTransitionStart: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onIonSlideTransitionStart")(js.undefined)
        ret
    }
    @scala.inline
    def withOnIonSlideWillChange(value: /* event */ CustomEvent => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onIonSlideWillChange")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnIonSlideWillChange: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onIonSlideWillChange")(js.undefined)
        ret
    }
    @scala.inline
    def withOnIonSlidesDidLoad(value: /* event */ CustomEvent => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onIonSlidesDidLoad")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnIonSlidesDidLoad: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onIonSlidesDidLoad")(js.undefined)
        ret
    }
    @scala.inline
    def withOptions(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("options")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOptions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("options")(js.undefined)
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
    def withScrollbar(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scrollbar")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutScrollbar: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scrollbar")(js.undefined)
        ret
    }
  }
  
}

