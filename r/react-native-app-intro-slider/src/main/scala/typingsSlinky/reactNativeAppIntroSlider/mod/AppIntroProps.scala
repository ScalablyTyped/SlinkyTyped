package typingsSlinky.reactNativeAppIntroSlider.mod

import slinky.core.facade.ReactElement
import typingsSlinky.reactNative.mod.TextProps
import typingsSlinky.reactNative.mod.ViewStyle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AppIntroProps extends js.Object {
  var activeDotStyle: js.UndefOr[ViewStyle] = js.native
  var bottomButton: js.UndefOr[Boolean] = js.native
  var buttonStyle: js.UndefOr[ViewStyle] = js.native
  var buttonTextStyle: js.UndefOr[TextProps] = js.native
  var doneLabel: js.UndefOr[String] = js.native
  var dotStyle: js.UndefOr[ViewStyle] = js.native
  var hidePagination: js.UndefOr[Boolean] = js.native
  var nextLabel: js.UndefOr[String] = js.native
  var onDone: js.UndefOr[js.Function0[Unit]] = js.native
  var onSkip: js.UndefOr[js.Function0[Unit]] = js.native
  var onSlideChange: js.UndefOr[js.Function2[/* index */ Double, /* lastIndex */ Double, Unit]] = js.native
  var paginationStyle: js.UndefOr[ViewStyle] = js.native
  var prevLabel: js.UndefOr[String] = js.native
  var renderDoneButton: js.UndefOr[js.Function0[Unit]] = js.native
  var renderItem: js.UndefOr[js.Function1[/* item */ js.Any, ReactElement]] = js.native
  var renderNextButton: js.UndefOr[js.Function0[Unit]] = js.native
  var renderPrevButton: js.UndefOr[js.Function0[Unit]] = js.native
  var renderSkipButton: js.UndefOr[js.Function0[Unit]] = js.native
  var showDoneButton: js.UndefOr[Boolean] = js.native
  var showNextButton: js.UndefOr[Boolean] = js.native
  var showPrevButton: js.UndefOr[Boolean] = js.native
  var showSkipButton: js.UndefOr[Boolean] = js.native
  var skipLabel: js.UndefOr[String] = js.native
  var slides: js.Array[_] = js.native
}

object AppIntroProps {
  @scala.inline
  def apply(slides: js.Array[_]): AppIntroProps = {
    val __obj = js.Dynamic.literal(slides = slides.asInstanceOf[js.Any])
    __obj.asInstanceOf[AppIntroProps]
  }
  @scala.inline
  implicit class AppIntroPropsOps[Self <: AppIntroProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withSlides(value: js.Array[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("slides")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withActiveDotStyle(value: ViewStyle): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("activeDotStyle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutActiveDotStyle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("activeDotStyle")(js.undefined)
        ret
    }
    @scala.inline
    def withBottomButton(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bottomButton")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBottomButton: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bottomButton")(js.undefined)
        ret
    }
    @scala.inline
    def withButtonStyle(value: ViewStyle): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("buttonStyle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutButtonStyle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("buttonStyle")(js.undefined)
        ret
    }
    @scala.inline
    def withButtonTextStyle(value: TextProps): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("buttonTextStyle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutButtonTextStyle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("buttonTextStyle")(js.undefined)
        ret
    }
    @scala.inline
    def withDoneLabel(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("doneLabel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDoneLabel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("doneLabel")(js.undefined)
        ret
    }
    @scala.inline
    def withDotStyle(value: ViewStyle): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dotStyle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDotStyle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dotStyle")(js.undefined)
        ret
    }
    @scala.inline
    def withHidePagination(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hidePagination")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHidePagination: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hidePagination")(js.undefined)
        ret
    }
    @scala.inline
    def withNextLabel(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nextLabel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNextLabel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nextLabel")(js.undefined)
        ret
    }
    @scala.inline
    def withOnDone(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onDone")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutOnDone: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onDone")(js.undefined)
        ret
    }
    @scala.inline
    def withOnSkip(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onSkip")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutOnSkip: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onSkip")(js.undefined)
        ret
    }
    @scala.inline
    def withOnSlideChange(value: (/* index */ Double, /* lastIndex */ Double) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onSlideChange")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutOnSlideChange: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onSlideChange")(js.undefined)
        ret
    }
    @scala.inline
    def withPaginationStyle(value: ViewStyle): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("paginationStyle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPaginationStyle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("paginationStyle")(js.undefined)
        ret
    }
    @scala.inline
    def withPrevLabel(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("prevLabel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPrevLabel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("prevLabel")(js.undefined)
        ret
    }
    @scala.inline
    def withRenderDoneButton(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("renderDoneButton")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutRenderDoneButton: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("renderDoneButton")(js.undefined)
        ret
    }
    @scala.inline
    def withRenderItem(value: /* item */ js.Any => ReactElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("renderItem")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutRenderItem: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("renderItem")(js.undefined)
        ret
    }
    @scala.inline
    def withRenderNextButton(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("renderNextButton")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutRenderNextButton: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("renderNextButton")(js.undefined)
        ret
    }
    @scala.inline
    def withRenderPrevButton(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("renderPrevButton")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutRenderPrevButton: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("renderPrevButton")(js.undefined)
        ret
    }
    @scala.inline
    def withRenderSkipButton(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("renderSkipButton")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutRenderSkipButton: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("renderSkipButton")(js.undefined)
        ret
    }
    @scala.inline
    def withShowDoneButton(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showDoneButton")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShowDoneButton: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showDoneButton")(js.undefined)
        ret
    }
    @scala.inline
    def withShowNextButton(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showNextButton")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShowNextButton: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showNextButton")(js.undefined)
        ret
    }
    @scala.inline
    def withShowPrevButton(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showPrevButton")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShowPrevButton: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showPrevButton")(js.undefined)
        ret
    }
    @scala.inline
    def withShowSkipButton(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showSkipButton")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShowSkipButton: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showSkipButton")(js.undefined)
        ret
    }
    @scala.inline
    def withSkipLabel(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("skipLabel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSkipLabel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("skipLabel")(js.undefined)
        ret
    }
  }
  
}

