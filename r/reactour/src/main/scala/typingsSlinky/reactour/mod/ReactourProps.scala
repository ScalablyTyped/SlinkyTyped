package typingsSlinky.reactour.mod

import org.scalajs.dom.raw.HTMLDivElement
import slinky.core.TagMod
import slinky.core.facade.ReactElement
import slinky.web.SyntheticMouseEvent
import typingsSlinky.reactour.reactourStrings.esc
import typingsSlinky.reactour.reactourStrings.left
import typingsSlinky.reactour.reactourStrings.right
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ReactourProps extends js.Object {
  /**
    * Change `--reactour-accent` _(defaults to accentColor on IE)_ css custom prop to apply color in _Helper_, number, dots, etc
    * @default #007aff
    */
  var accentColor: js.UndefOr[String] = js.native
  /**
    * Customize _Badge_ content using `current` and `total` steps values
    */
  var badgeContent: js.UndefOr[js.Function2[/* current */ Double, /* total */ Double, TagMod[Any]]] = js.native
  /**
    * Content to be rendered inside the _Helper_
    */
  var children: js.UndefOr[TagMod[Any]] = js.native
  /**
    * Custom class name to add to the _Helper_
    */
  var className: js.UndefOr[String] = js.native
  /**
    * Close the _Tour_ by clicking the _Mask_
    * @default true
    */
  var closeWithMask: js.UndefOr[Boolean] = js.native
  /**
    * Disable interactivity with _Dots_ navigation in _Helper_
    */
  var disableDotsNavigation: js.UndefOr[Boolean] = js.native
  /**
    * Disable the ability to click or intercat in any way with the _Highlighted_ element
    */
  var disableInteraction: js.UndefOr[Boolean] = js.native
  /**
    * Disable all keyboard navigation (next and prev step) when true, disable only selected keys when array
    */
  var disableKeyboardNavigation: js.UndefOr[Boolean | (js.Array[esc | right | left])] = js.native
  /**
    * Function triggered each time current step change
    */
  var getCurrentStep: js.UndefOr[js.Function1[/* currentStep */ Double, Unit]] = js.native
  /**
    * Programmatically change current step after the first render, when the value changes
    */
  var goToStep: js.UndefOr[Double] = js.native
  /**
    * Custom class name to add to the element which is the overlay for the target element when `disableInteraction`
    */
  var highlightedMaskClassName: js.UndefOr[String] = js.native
  /**
    * Tolerance in pixels to add when calculating if an element is outside viewport to scroll into view
    */
  var inViewThreshold: js.UndefOr[Double] = js.native
  /**
    * You know…
    */
  var isOpen: Boolean = js.native
  /**
    * Change Next button in last step into a custom button to close the Tour
    */
  var lastStepNextButton: js.UndefOr[TagMod[Any]] = js.native
  /**
    * Custom class name to add to the _Mask_
    */
  var maskClassName: js.UndefOr[String] = js.native
  /**
    * Extra Space between in pixels between _Highlighted_ element and _Mask_
    */
  var maskSpace: js.UndefOr[Double] = js.native
  /**
    * Renders as next button navigation
    */
  var nextButton: js.UndefOr[TagMod[Any]] = js.native
  /**
    * Overrides default `nextStep` internal function
    */
  var nextStep: js.UndefOr[js.Function0[Unit]] = js.native
  /**
    * Do something after _Tour_ is opened
    */
  var onAfterOpen: js.UndefOr[js.Function1[/* target */ HTMLDivElement, Unit]] = js.native
  /**
    * Do something before _Tour_ is closed
    */
  var onBeforeClose: js.UndefOr[js.Function1[/* target */ HTMLDivElement, Unit]] = js.native
  /**
    * Renders as prev button navigation
    */
  var prevButton: js.UndefOr[TagMod[Any]] = js.native
  /**
    * Overrides default `prevStep` internal function
    */
  var prevStep: js.UndefOr[js.Function0[Unit]] = js.native
  /**
    * Beautify _Helper_ and _Mask_ with `border-radius` (in px)
    * @default 0
    */
  var rounded: js.UndefOr[Double] = js.native
  /**
    * Smooth scroll duration when positioning the target element (in ms)
    * @default 1
    */
  var scrollDuration: js.UndefOr[Double] = js.native
  /**
    * Offset when positioning the target element after scroll to it, by default it's a calculation to the center of the viewport
    */
  var scrollOffset: js.UndefOr[Double] = js.native
  /**
    * Show/Hide _Helper_ Navigation buttons
    * @default true
    */
  var showButtons: js.UndefOr[Boolean] = js.native
  /**
    * Show/Hide _Helper_ Close button
    * @default true
    */
  var showCloseButton: js.UndefOr[Boolean] = js.native
  /**
    * Show/Hide _Helper_ Navigation Dots
    * @default true
    */
  var showNavigation: js.UndefOr[Boolean] = js.native
  /**
    * Show/Hide number when hovers on each Navigation Dot
    * @default true
    */
  var showNavigationNumber: js.UndefOr[Boolean] = js.native
  /**
    * Show/Hide _Helper_ Number Badge
    * @default true
    */
  var showNumber: js.UndefOr[Boolean] = js.native
  /**
    * Starting step when _Tour_ is open the first time
    */
  var startAt: js.UndefOr[Double] = js.native
  /**
    * Array of elements to highlight with special info and props
    */
  var steps: js.Array[ReactourStep] = js.native
  /**
    * Value to listen if a forced update is needed
    */
  var update: js.UndefOr[String] = js.native
  /**
    * Delay time when forcing update. Useful when there are known animation/transitions
    * @default 1
    */
  var updateDelay: js.UndefOr[Double] = js.native
  /**
    * Function to close the _Tour_
    */
  def onRequestClose(event: SyntheticMouseEvent[HTMLDivElement]): Unit = js.native
}

object ReactourProps {
  @scala.inline
  def apply(
    isOpen: Boolean,
    onRequestClose: SyntheticMouseEvent[HTMLDivElement] => Unit,
    steps: js.Array[ReactourStep]
  ): ReactourProps = {
    val __obj = js.Dynamic.literal(isOpen = isOpen.asInstanceOf[js.Any], onRequestClose = js.Any.fromFunction1(onRequestClose), steps = steps.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReactourProps]
  }
  @scala.inline
  implicit class ReactourPropsOps[Self <: ReactourProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withIsOpen(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isOpen")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOnRequestClose(value: SyntheticMouseEvent[HTMLDivElement] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onRequestClose")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSteps(value: js.Array[ReactourStep]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("steps")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAccentColor(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("accentColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAccentColor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("accentColor")(js.undefined)
        ret
    }
    @scala.inline
    def withBadgeContent(value: (/* current */ Double, /* total */ Double) => TagMod[Any]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("badgeContent")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutBadgeContent: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("badgeContent")(js.undefined)
        ret
    }
    @scala.inline
    def withChildrenReactElement(value: ReactElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("children")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withChildren(value: TagMod[Any]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("children")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutChildren: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("children")(js.undefined)
        ret
    }
    @scala.inline
    def withClassName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("className")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutClassName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("className")(js.undefined)
        ret
    }
    @scala.inline
    def withCloseWithMask(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("closeWithMask")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCloseWithMask: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("closeWithMask")(js.undefined)
        ret
    }
    @scala.inline
    def withDisableDotsNavigation(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disableDotsNavigation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDisableDotsNavigation: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disableDotsNavigation")(js.undefined)
        ret
    }
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
    def withDisableKeyboardNavigation(value: Boolean | (js.Array[esc | right | left])): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disableKeyboardNavigation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDisableKeyboardNavigation: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disableKeyboardNavigation")(js.undefined)
        ret
    }
    @scala.inline
    def withGetCurrentStep(value: /* currentStep */ Double => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getCurrentStep")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutGetCurrentStep: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getCurrentStep")(js.undefined)
        ret
    }
    @scala.inline
    def withGoToStep(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("goToStep")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGoToStep: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("goToStep")(js.undefined)
        ret
    }
    @scala.inline
    def withHighlightedMaskClassName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("highlightedMaskClassName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHighlightedMaskClassName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("highlightedMaskClassName")(js.undefined)
        ret
    }
    @scala.inline
    def withInViewThreshold(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inViewThreshold")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInViewThreshold: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inViewThreshold")(js.undefined)
        ret
    }
    @scala.inline
    def withLastStepNextButtonReactElement(value: ReactElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lastStepNextButton")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLastStepNextButton(value: TagMod[Any]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lastStepNextButton")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLastStepNextButton: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lastStepNextButton")(js.undefined)
        ret
    }
    @scala.inline
    def withMaskClassName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maskClassName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaskClassName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maskClassName")(js.undefined)
        ret
    }
    @scala.inline
    def withMaskSpace(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maskSpace")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaskSpace: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maskSpace")(js.undefined)
        ret
    }
    @scala.inline
    def withNextButtonReactElement(value: ReactElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nextButton")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNextButton(value: TagMod[Any]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nextButton")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNextButton: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nextButton")(js.undefined)
        ret
    }
    @scala.inline
    def withNextStep(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nextStep")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutNextStep: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nextStep")(js.undefined)
        ret
    }
    @scala.inline
    def withOnAfterOpen(value: /* target */ HTMLDivElement => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onAfterOpen")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnAfterOpen: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onAfterOpen")(js.undefined)
        ret
    }
    @scala.inline
    def withOnBeforeClose(value: /* target */ HTMLDivElement => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onBeforeClose")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnBeforeClose: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onBeforeClose")(js.undefined)
        ret
    }
    @scala.inline
    def withPrevButtonReactElement(value: ReactElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("prevButton")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPrevButton(value: TagMod[Any]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("prevButton")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPrevButton: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("prevButton")(js.undefined)
        ret
    }
    @scala.inline
    def withPrevStep(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("prevStep")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutPrevStep: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("prevStep")(js.undefined)
        ret
    }
    @scala.inline
    def withRounded(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rounded")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRounded: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rounded")(js.undefined)
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
    def withScrollOffset(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scrollOffset")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutScrollOffset: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scrollOffset")(js.undefined)
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
    def withShowNavigation(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showNavigation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShowNavigation: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showNavigation")(js.undefined)
        ret
    }
    @scala.inline
    def withShowNavigationNumber(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showNavigationNumber")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShowNavigationNumber: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showNavigationNumber")(js.undefined)
        ret
    }
    @scala.inline
    def withShowNumber(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showNumber")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShowNumber: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showNumber")(js.undefined)
        ret
    }
    @scala.inline
    def withStartAt(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("startAt")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStartAt: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("startAt")(js.undefined)
        ret
    }
    @scala.inline
    def withUpdate(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("update")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUpdate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("update")(js.undefined)
        ret
    }
    @scala.inline
    def withUpdateDelay(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("updateDelay")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUpdateDelay: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("updateDelay")(js.undefined)
        ret
    }
  }
  
}

