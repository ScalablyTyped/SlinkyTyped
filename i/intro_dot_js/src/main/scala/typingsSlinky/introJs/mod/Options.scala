package typingsSlinky.introJs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Options extends js.Object {
  var disableInteraction: js.UndefOr[Boolean] = js.native
  var doneLabel: js.UndefOr[String] = js.native
  var exitOnEsc: js.UndefOr[Boolean] = js.native
  var exitOnOverlayClick: js.UndefOr[Boolean] = js.native
  var hideNext: js.UndefOr[Boolean] = js.native
  var hidePrev: js.UndefOr[Boolean] = js.native
  var highlightClass: js.UndefOr[String] = js.native
  var hintAnimation: js.UndefOr[Boolean] = js.native
  var hintButtonLabel: js.UndefOr[String] = js.native
  var hintPosition: js.UndefOr[String] = js.native
  var hints: js.UndefOr[js.Array[Hint]] = js.native
  var keyboardNavigation: js.UndefOr[Boolean] = js.native
  var nextLabel: js.UndefOr[String] = js.native
  var overlayOpacity: js.UndefOr[Double] = js.native
  var positionPrecedence: js.UndefOr[js.Array[String]] = js.native
  var prevLabel: js.UndefOr[String] = js.native
  var scrollPadding: js.UndefOr[Double] = js.native
  var scrollToElement: js.UndefOr[Boolean] = js.native
  var showBullets: js.UndefOr[Boolean] = js.native
  var showButtons: js.UndefOr[Boolean] = js.native
  var showProgress: js.UndefOr[Boolean] = js.native
  var showStepNumbers: js.UndefOr[Boolean] = js.native
  var skipLabel: js.UndefOr[String] = js.native
  var steps: js.UndefOr[js.Array[Step]] = js.native
  var tooltipClass: js.UndefOr[String] = js.native
  var tooltipPosition: js.UndefOr[String] = js.native
}

object Options {
  @scala.inline
  def apply(): Options = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Options]
  }
  @scala.inline
  implicit class OptionsOps[Self <: Options] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDisableInteraction(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disableInteraction")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDisableInteraction: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disableInteraction")(js.undefined)
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
    def withExitOnEsc(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("exitOnEsc")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExitOnEsc: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("exitOnEsc")(js.undefined)
        ret
    }
    @scala.inline
    def withExitOnOverlayClick(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("exitOnOverlayClick")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExitOnOverlayClick: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("exitOnOverlayClick")(js.undefined)
        ret
    }
    @scala.inline
    def withHideNext(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hideNext")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHideNext: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hideNext")(js.undefined)
        ret
    }
    @scala.inline
    def withHidePrev(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hidePrev")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHidePrev: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hidePrev")(js.undefined)
        ret
    }
    @scala.inline
    def withHighlightClass(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("highlightClass")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHighlightClass: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("highlightClass")(js.undefined)
        ret
    }
    @scala.inline
    def withHintAnimation(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hintAnimation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHintAnimation: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hintAnimation")(js.undefined)
        ret
    }
    @scala.inline
    def withHintButtonLabel(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hintButtonLabel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHintButtonLabel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hintButtonLabel")(js.undefined)
        ret
    }
    @scala.inline
    def withHintPosition(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hintPosition")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHintPosition: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hintPosition")(js.undefined)
        ret
    }
    @scala.inline
    def withHints(value: js.Array[Hint]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hints")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHints: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hints")(js.undefined)
        ret
    }
    @scala.inline
    def withKeyboardNavigation(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keyboardNavigation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutKeyboardNavigation: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keyboardNavigation")(js.undefined)
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
    def withOverlayOpacity(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("overlayOpacity")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOverlayOpacity: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("overlayOpacity")(js.undefined)
        ret
    }
    @scala.inline
    def withPositionPrecedence(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("positionPrecedence")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPositionPrecedence: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("positionPrecedence")(js.undefined)
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
    def withScrollPadding(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scrollPadding")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutScrollPadding: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scrollPadding")(js.undefined)
        ret
    }
    @scala.inline
    def withScrollToElement(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scrollToElement")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutScrollToElement: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scrollToElement")(js.undefined)
        ret
    }
    @scala.inline
    def withShowBullets(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showBullets")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShowBullets: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showBullets")(js.undefined)
        ret
    }
    @scala.inline
    def withShowButtons(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showButtons")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShowButtons: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showButtons")(js.undefined)
        ret
    }
    @scala.inline
    def withShowProgress(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showProgress")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShowProgress: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showProgress")(js.undefined)
        ret
    }
    @scala.inline
    def withShowStepNumbers(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showStepNumbers")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShowStepNumbers: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showStepNumbers")(js.undefined)
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
    @scala.inline
    def withSteps(value: js.Array[Step]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("steps")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSteps: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("steps")(js.undefined)
        ret
    }
    @scala.inline
    def withTooltipClass(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tooltipClass")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTooltipClass: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tooltipClass")(js.undefined)
        ret
    }
    @scala.inline
    def withTooltipPosition(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tooltipPosition")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTooltipPosition: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tooltipPosition")(js.undefined)
        ret
    }
  }
  
}

