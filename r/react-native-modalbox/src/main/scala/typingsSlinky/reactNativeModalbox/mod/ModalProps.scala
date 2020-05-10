package typingsSlinky.reactNativeModalbox.mod

import slinky.core.TagMod
import slinky.core.facade.ReactElement
import typingsSlinky.reactNative.mod.StyleProp
import typingsSlinky.reactNative.mod.ViewStyle
import typingsSlinky.reactNativeModalbox.reactNativeModalboxStrings.bottom
import typingsSlinky.reactNativeModalbox.reactNativeModalboxStrings.center
import typingsSlinky.reactNativeModalbox.reactNativeModalboxStrings.top
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ModalProps extends js.Object {
  /**
    * Duration of the animation
    *
    * Default is 400ms
    *
    */
  var animationDuration: js.UndefOr[Double] = js.native
  /**
    * (Android only) Close modal when receiving back button event
    *
    * Default is false
    *
    */
  var backButtonClose: js.UndefOr[Boolean] = js.native
  /**
    * If a backdrop is displayed behind the modal
    *
    * Default is true
    *
    */
  var backdrop: js.UndefOr[Boolean] = js.native
  /**
    * Background color of the backdrop
    *
    * Default is black
    *
    */
  var backdropColor: js.UndefOr[String] = js.native
  /**
    * Add an element in the backdrop (a close button for example)
    *
    * Default is null
    *
    */
  var backdropContent: js.UndefOr[TagMod[Any]] = js.native
  /**
    * Opacity of the backdrop
    *
    * Default is 0.5
    *
    */
  var backdropOpacity: js.UndefOr[Double] = js.native
  /**
    * If the modal can be closed by pressing on the backdrop
    *
    * Default is true
    *
    */
  var backdropPressToClose: js.UndefOr[Boolean] = js.native
  /**
    *
    * Default is false
    */
  var coverScreen: js.UndefOr[Boolean] = js.native
  /**
    * The direction modal enters from
    *
    * Default is bottom
    *
    */
  var entry: js.UndefOr[top | bottom | String] = js.native
  /**
    * Checks if the modal is disabled
    *
    * Default is false
    *
    */
  var isDisabled: js.UndefOr[Boolean] = js.native
  /**
    * Checks if the modal is open
    *
    * Default is false
    *
    */
  var isOpen: js.UndefOr[Boolean] = js.native
  /**
    * This property prevent the modal to cover the ios status bar when the modal is scrolling up because the keyboard is opening
    *
    * Default is ios:22, android:0
    */
  var keyboardTopOffset: js.UndefOr[Double] = js.native
  /**
    * Event fired when the modal is closed and the animation is complete
    *
    */
  var onClosed: js.UndefOr[js.Function0[Unit]] = js.native
  /**
    * When the state of the swipe to close feature has changed
    * (useful to change the content of the modal, display a message for example)
    *
    *
    */
  var onClosingState: js.UndefOr[js.Function1[/* state */ Boolean, Unit]] = js.native
  /**
    * Event fired when the modal is opened and the animation is complete
    *
    */
  var onOpened: js.UndefOr[js.Function0[Unit]] = js.native
  /**
    * The final position of the modal.
    * Accepts top, center or bottom
    *
    * Default is center
    *
    */
  var position: js.UndefOr[top | center | bottom | String] = js.native
  /**
    * If the modal should appear open without animation upon first mount
    *
    * Default is false
    *
    */
  var startOpen: js.UndefOr[Boolean] = js.native
  /**
    * Custom styling for the content area
    */
  var style: js.UndefOr[StyleProp[ViewStyle]] = js.native
  /**
    * The height in pixels of the swipeable area
    *
    * Default is the Window Height
    *
    */
  var swipeArea: js.UndefOr[Double] = js.native
  /**
    * The threshold to reach in pixels to close the modal
    *
    * Default is 50
    *
    */
  var swipeThreshold: js.UndefOr[Double] = js.native
  /**
    * If the modal can be closed by swiping
    *
    * Default is true
    *
    */
  var swipeToClose: js.UndefOr[Boolean] = js.native
  /**
    * Enables the hardware acceleration to animate the modal. Please note that enabling this can cause some flashes in a weird way when animating
    *
    * Default is true
    *
    */
  var useNativeDriver: js.UndefOr[Boolean] = js.native
}

object ModalProps {
  @scala.inline
  def apply(): ModalProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ModalProps]
  }
  @scala.inline
  implicit class ModalPropsOps[Self <: ModalProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
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
    def withBackButtonClose(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("backButtonClose")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBackButtonClose: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("backButtonClose")(js.undefined)
        ret
    }
    @scala.inline
    def withBackdrop(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("backdrop")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBackdrop: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("backdrop")(js.undefined)
        ret
    }
    @scala.inline
    def withBackdropColor(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("backdropColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBackdropColor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("backdropColor")(js.undefined)
        ret
    }
    @scala.inline
    def withBackdropContentReactElement(value: ReactElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("backdropContent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBackdropContent(value: TagMod[Any]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("backdropContent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBackdropContent: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("backdropContent")(js.undefined)
        ret
    }
    @scala.inline
    def withBackdropOpacity(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("backdropOpacity")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBackdropOpacity: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("backdropOpacity")(js.undefined)
        ret
    }
    @scala.inline
    def withBackdropPressToClose(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("backdropPressToClose")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBackdropPressToClose: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("backdropPressToClose")(js.undefined)
        ret
    }
    @scala.inline
    def withCoverScreen(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("coverScreen")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCoverScreen: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("coverScreen")(js.undefined)
        ret
    }
    @scala.inline
    def withEntry(value: top | bottom | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("entry")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEntry: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("entry")(js.undefined)
        ret
    }
    @scala.inline
    def withIsDisabled(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isDisabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsDisabled: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isDisabled")(js.undefined)
        ret
    }
    @scala.inline
    def withIsOpen(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isOpen")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsOpen: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isOpen")(js.undefined)
        ret
    }
    @scala.inline
    def withKeyboardTopOffset(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keyboardTopOffset")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutKeyboardTopOffset: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keyboardTopOffset")(js.undefined)
        ret
    }
    @scala.inline
    def withOnClosed(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onClosed")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutOnClosed: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onClosed")(js.undefined)
        ret
    }
    @scala.inline
    def withOnClosingState(value: /* state */ Boolean => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onClosingState")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnClosingState: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onClosingState")(js.undefined)
        ret
    }
    @scala.inline
    def withOnOpened(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onOpened")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutOnOpened: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onOpened")(js.undefined)
        ret
    }
    @scala.inline
    def withPosition(value: top | center | bottom | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("position")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPosition: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("position")(js.undefined)
        ret
    }
    @scala.inline
    def withStartOpen(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("startOpen")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStartOpen: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("startOpen")(js.undefined)
        ret
    }
    @scala.inline
    def withStyle(value: StyleProp[ViewStyle]): Self = {
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
    @scala.inline
    def withStyleNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("style")(null)
        ret
    }
    @scala.inline
    def withSwipeArea(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("swipeArea")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSwipeArea: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("swipeArea")(js.undefined)
        ret
    }
    @scala.inline
    def withSwipeThreshold(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("swipeThreshold")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSwipeThreshold: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("swipeThreshold")(js.undefined)
        ret
    }
    @scala.inline
    def withSwipeToClose(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("swipeToClose")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSwipeToClose: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("swipeToClose")(js.undefined)
        ret
    }
    @scala.inline
    def withUseNativeDriver(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("useNativeDriver")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUseNativeDriver: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("useNativeDriver")(js.undefined)
        ret
    }
  }
  
}

