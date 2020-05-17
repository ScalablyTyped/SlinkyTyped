package typingsSlinky.hopscotch

import typingsSlinky.hopscotch.anon.CloseTooltip
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait HopscotchConfiguration extends js.Object {
  var arrowWidth: js.UndefOr[Double] = js.native
  var bubbleWidth: js.UndefOr[Double] = js.native
  var buddleHeight: js.UndefOr[Double] = js.native
  var i18n: js.UndefOr[CloseTooltip] = js.native
  var nextOnTargetClick: js.UndefOr[Boolean] = js.native
  var onClose: js.UndefOr[CallbackNameNamesOrDefinition] = js.native
  var onEnd: js.UndefOr[CallbackNameNamesOrDefinition] = js.native
  var onError: js.UndefOr[CallbackNameNamesOrDefinition] = js.native
  var onNext: js.UndefOr[CallbackNameNamesOrDefinition] = js.native
  var onPrev: js.UndefOr[CallbackNameNamesOrDefinition] = js.native
  var onShow: js.UndefOr[CallbackNameNamesOrDefinition] = js.native
  var onStart: js.UndefOr[CallbackNameNamesOrDefinition] = js.native
  var scrollDuration: js.UndefOr[Double] = js.native
  var scrollTopMargin: js.UndefOr[Double] = js.native
  var showCloseButton: js.UndefOr[Boolean] = js.native
  var showNextButton: js.UndefOr[Boolean] = js.native
  var showPrevButton: js.UndefOr[Boolean] = js.native
  var skipIfNoElement: js.UndefOr[Boolean] = js.native
  var smoothScroll: js.UndefOr[Boolean] = js.native
}

object HopscotchConfiguration {
  @scala.inline
  def apply(): HopscotchConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[HopscotchConfiguration]
  }
  @scala.inline
  implicit class HopscotchConfigurationOps[Self <: HopscotchConfiguration] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withArrowWidth(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("arrowWidth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutArrowWidth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("arrowWidth")(js.undefined)
        ret
    }
    @scala.inline
    def withBubbleWidth(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bubbleWidth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBubbleWidth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bubbleWidth")(js.undefined)
        ret
    }
    @scala.inline
    def withBuddleHeight(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("buddleHeight")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBuddleHeight: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("buddleHeight")(js.undefined)
        ret
    }
    @scala.inline
    def withI18n(value: CloseTooltip): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("i18n")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutI18n: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("i18n")(js.undefined)
        ret
    }
    @scala.inline
    def withNextOnTargetClick(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nextOnTargetClick")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNextOnTargetClick: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nextOnTargetClick")(js.undefined)
        ret
    }
    @scala.inline
    def withOnCloseFunction0(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onClose")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withOnClose(value: CallbackNameNamesOrDefinition): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onClose")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOnClose: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onClose")(js.undefined)
        ret
    }
    @scala.inline
    def withOnEndFunction0(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onEnd")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withOnEnd(value: CallbackNameNamesOrDefinition): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onEnd")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOnEnd: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onEnd")(js.undefined)
        ret
    }
    @scala.inline
    def withOnErrorFunction0(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onError")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withOnError(value: CallbackNameNamesOrDefinition): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onError")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOnError: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onError")(js.undefined)
        ret
    }
    @scala.inline
    def withOnNextFunction0(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onNext")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withOnNext(value: CallbackNameNamesOrDefinition): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onNext")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOnNext: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onNext")(js.undefined)
        ret
    }
    @scala.inline
    def withOnPrevFunction0(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onPrev")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withOnPrev(value: CallbackNameNamesOrDefinition): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onPrev")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOnPrev: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onPrev")(js.undefined)
        ret
    }
    @scala.inline
    def withOnShowFunction0(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onShow")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withOnShow(value: CallbackNameNamesOrDefinition): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onShow")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOnShow: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onShow")(js.undefined)
        ret
    }
    @scala.inline
    def withOnStartFunction0(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onStart")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withOnStart(value: CallbackNameNamesOrDefinition): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onStart")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOnStart: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onStart")(js.undefined)
        ret
    }
    @scala.inline
    def withScrollDuration(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scrollDuration")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutScrollDuration: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scrollDuration")(js.undefined)
        ret
    }
    @scala.inline
    def withScrollTopMargin(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scrollTopMargin")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutScrollTopMargin: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scrollTopMargin")(js.undefined)
        ret
    }
    @scala.inline
    def withShowCloseButton(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showCloseButton")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShowCloseButton: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showCloseButton")(js.undefined)
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
    def withSkipIfNoElement(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("skipIfNoElement")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSkipIfNoElement: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("skipIfNoElement")(js.undefined)
        ret
    }
    @scala.inline
    def withSmoothScroll(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("smoothScroll")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSmoothScroll: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("smoothScroll")(js.undefined)
        ret
    }
  }
  
}

