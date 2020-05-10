package typingsSlinky.cordovaIonic.Ionic

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Keyboard extends js.Object {
  /**
    * Whether or not the keyboard is currently visible.
    */
  var isVisible: Boolean = js.native
  /**
    * Close the keyboard if it is open.
    */
  def close(): Unit = js.native
  /**
    * Disable native scrolling, useful if you are using JavaScript to scroll
    *
    * @param disbale
    */
  def disableScroll(disbale: Boolean): Unit = js.native
  /**
    * Hide the keyboard accessory bar with the next, previous and done buttons.
    *
    * @param hide
    */
  def hideKeyboardAccessoryBar(hide: Boolean): Unit = js.native
  /**
    * Force keyboard to be shown on Android.
    * This typically helps if autofocus on a text element does not pop up the keyboard automatically
    *
    * Supported Platforms: Android, Blackberry 10
    */
  def show(): Unit = js.native
}

object Keyboard {
  @scala.inline
  def apply(
    close: () => Unit,
    disableScroll: Boolean => Unit,
    hideKeyboardAccessoryBar: Boolean => Unit,
    isVisible: Boolean,
    show: () => Unit
  ): Keyboard = {
    val __obj = js.Dynamic.literal(close = js.Any.fromFunction0(close), disableScroll = js.Any.fromFunction1(disableScroll), hideKeyboardAccessoryBar = js.Any.fromFunction1(hideKeyboardAccessoryBar), isVisible = isVisible.asInstanceOf[js.Any], show = js.Any.fromFunction0(show))
    __obj.asInstanceOf[Keyboard]
  }
  @scala.inline
  implicit class KeyboardOps[Self <: Keyboard] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withClose(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("close")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withDisableScroll(value: Boolean => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disableScroll")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withHideKeyboardAccessoryBar(value: Boolean => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hideKeyboardAccessoryBar")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withIsVisible(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isVisible")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withShow(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("show")(js.Any.fromFunction0(value))
        ret
    }
  }
  
}

