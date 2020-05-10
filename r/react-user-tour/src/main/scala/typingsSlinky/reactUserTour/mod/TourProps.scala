package typingsSlinky.reactUserTour.mod

import typingsSlinky.react.mod.HTMLAttributes
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TourProps
  extends HTMLAttributes[js.Any] {
  /**
    A boolean value representing whether or not the tour should currently be displayed
    */
  var active: Boolean = js.native
  /**
    We provide an arrow that points to the selector, but you may optionally pass in your own React element in the place of the arrow provided.
    */
  var arrow: js.UndefOr[js.Any] = js.native
  /**
    If you choose to use the provided arrow, you can set the color here by passing in a hex value.
    */
  var arrowColor: js.UndefOr[String] = js.native
  /**
    If you choose to use the provided arrow, you can set the pixel size here with an integer value.
    */
  var arrowSize: js.UndefOr[Double] = js.native
  /**
    Text that will appear on the button that moves the tour backwards.
    Defaults to Back
    */
  var backButtonText: js.UndefOr[String] = js.native
  /**
    Optional style object for the container div around the buttons.
    */
  var buttonContainerStyle: js.UndefOr[js.Any] = js.native
  /**
    Optional style object for buttons displayed on component.
    */
  var buttonStyle: js.UndefOr[js.Any] = js.native
  /**
    Text that will appear on the button that closes the tour.
    Defaults to Close
    */
  var closeButtonText: js.UndefOr[String] = js.native
  /**
    Text that will appear on the button that finishes the tour.
    Defaults to Done
    */
  var doneButtonText: js.UndefOr[String] = js.native
  /**
    Boolean to disable the showing of next/back/done buttons.
    Set this to true if you want to insert your own buttons in the body.
    */
  var hideButtons: js.UndefOr[Boolean] = js.native
  /**
    Boolean to disable the showing of the close text in the upper left of
    the component. Set this to true if you want to insert your own close
    functionality or if you would like to disable the ability for the user
    to prematurely exit the tour.
    */
  var hideClose: js.UndefOr[Boolean] = js.native
  /**
    Text that will appear on the button that moves the tour forward.
    Defaults to Next
    */
  var nextButtonText: js.UndefOr[String] = js.native
  /**
    function that fires when user clicks the Back button.
    Receives the previous step integer as a callback.
    For example, if current step is 2 and user clicks the Back button, onBack(1) will be called.
    */
  var onBack: js.Function = js.native
  /**
    function that fires when user clicks the X button or the Done Button.
    */
  var onCancel: js.Function = js.native
  /**
    function that fires when user clicks the Next button.
    Receives the next step integer as a callback.
    For example, if current step is 1 and user clicks the Next button, onNext(2) will be called.
    */
  var onNext: js.Function = js.native
  /**
    An integer representing the current active step of the tour
    */
  var step: Double = js.native
  /**
    An array of TourStep.
    */
  var steps: js.Array[TourStep] = js.native
  /**
    Optional style object.
    */
  @JSName("style")
  var style_TourProps: js.UndefOr[js.Any] = js.native
}

object TourProps {
  @scala.inline
  def apply(
    active: Boolean,
    onBack: js.Function,
    onCancel: js.Function,
    onNext: js.Function,
    step: Double,
    steps: js.Array[TourStep]
  ): TourProps = {
    val __obj = js.Dynamic.literal(active = active.asInstanceOf[js.Any], onBack = onBack.asInstanceOf[js.Any], onCancel = onCancel.asInstanceOf[js.Any], onNext = onNext.asInstanceOf[js.Any], step = step.asInstanceOf[js.Any], steps = steps.asInstanceOf[js.Any])
    __obj.asInstanceOf[TourProps]
  }
  @scala.inline
  implicit class TourPropsOps[Self <: TourProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withActive(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("active")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOnBack(value: js.Function): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onBack")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOnCancel(value: js.Function): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onCancel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOnNext(value: js.Function): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onNext")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStep(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("step")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSteps(value: js.Array[TourStep]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("steps")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withArrow(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("arrow")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutArrow: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("arrow")(js.undefined)
        ret
    }
    @scala.inline
    def withArrowColor(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("arrowColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutArrowColor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("arrowColor")(js.undefined)
        ret
    }
    @scala.inline
    def withArrowSize(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("arrowSize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutArrowSize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("arrowSize")(js.undefined)
        ret
    }
    @scala.inline
    def withBackButtonText(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("backButtonText")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBackButtonText: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("backButtonText")(js.undefined)
        ret
    }
    @scala.inline
    def withButtonContainerStyle(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("buttonContainerStyle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutButtonContainerStyle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("buttonContainerStyle")(js.undefined)
        ret
    }
    @scala.inline
    def withButtonStyle(value: js.Any): Self = {
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
    def withCloseButtonText(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("closeButtonText")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCloseButtonText: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("closeButtonText")(js.undefined)
        ret
    }
    @scala.inline
    def withDoneButtonText(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("doneButtonText")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDoneButtonText: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("doneButtonText")(js.undefined)
        ret
    }
    @scala.inline
    def withHideButtons(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hideButtons")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHideButtons: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hideButtons")(js.undefined)
        ret
    }
    @scala.inline
    def withHideClose(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hideClose")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHideClose: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hideClose")(js.undefined)
        ret
    }
    @scala.inline
    def withNextButtonText(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nextButtonText")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNextButtonText: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nextButtonText")(js.undefined)
        ret
    }
    @scala.inline
    def withStyle(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("style")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStyle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("style")(js.undefined)
        ret
    }
  }
  
}

