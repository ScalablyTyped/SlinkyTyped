package typingsSlinky.reactNative.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AccessibilityInfoStatic extends js.Object {
  /**
    * Add an event handler. Supported events:
    * - announcementFinished: iOS-only event. Fires when the screen reader has finished making an announcement.
    *                         The argument to the event handler is a dictionary with these keys:
    *                          - announcement: The string announced by the screen reader.
    *                          - success: A boolean indicating whether the announcement was successfully made.
    * - AccessibilityEventName constants other than announcementFinished: Fires on accessibility feature change.
    *            The argument to the event handler is a boolean.
    *            The boolean is true when the related event's feature is enabled and false otherwise.
    *
    */
  def addEventListener(eventName: AccessibilityEventName, handler: js.Function1[/* event */ AccessibilityEvent, Unit]): Unit = js.native
  /**
    * Post a string to be announced by the screen reader.
    *
    * @platform ios
    */
  def announceForAccessibility(announcement: String): Unit = js.native
  /**
    * Query whether a screen reader is currently enabled.
    *
    * @deprecated use isScreenReaderChanged instead
    */
  def fetch(): js.Promise[Boolean] = js.native
  /**
    * Query whether bold text is currently enabled.
    *
    * @platform ios
    */
  def isBoldTextEnabled(): js.Promise[Boolean] = js.native
  /**
    * Query whether grayscale is currently enabled.
    *
    * @platform ios
    */
  def isGrayscaleEnabled(): js.Promise[Boolean] = js.native
  /**
    * Query whether invert colors is currently enabled.
    *
    * @platform ios
    */
  def isInvertColorsEnabled(): js.Promise[Boolean] = js.native
  /**
    * Query whether reduce motion is currently enabled.
    */
  def isReduceMotionEnabled(): js.Promise[Boolean] = js.native
  /**
    * Query whether reduce transparency is currently enabled.
    *
    * @platform ios
    */
  def isReduceTransparencyEnabled(): js.Promise[Boolean] = js.native
  /**
    * Query whether a screen reader is currently enabled.
    */
  def isScreenReaderEnabled(): js.Promise[Boolean] = js.native
  /**
    * Remove an event handler.
    */
  def removeEventListener(eventName: AccessibilityEventName, handler: js.Function1[/* event */ AccessibilityEvent, Unit]): Unit = js.native
  /**
    * Set acessibility focus to a react component.
    *
    * @platform ios
    */
  def setAccessibilityFocus(reactTag: Double): Unit = js.native
}

object AccessibilityInfoStatic {
  @scala.inline
  def apply(
    addEventListener: (AccessibilityEventName, js.Function1[/* event */ AccessibilityEvent, Unit]) => Unit,
    announceForAccessibility: String => Unit,
    fetch: () => js.Promise[Boolean],
    isBoldTextEnabled: () => js.Promise[Boolean],
    isGrayscaleEnabled: () => js.Promise[Boolean],
    isInvertColorsEnabled: () => js.Promise[Boolean],
    isReduceMotionEnabled: () => js.Promise[Boolean],
    isReduceTransparencyEnabled: () => js.Promise[Boolean],
    isScreenReaderEnabled: () => js.Promise[Boolean],
    removeEventListener: (AccessibilityEventName, js.Function1[/* event */ AccessibilityEvent, Unit]) => Unit,
    setAccessibilityFocus: Double => Unit
  ): AccessibilityInfoStatic = {
    val __obj = js.Dynamic.literal(addEventListener = js.Any.fromFunction2(addEventListener), announceForAccessibility = js.Any.fromFunction1(announceForAccessibility), fetch = js.Any.fromFunction0(fetch), isBoldTextEnabled = js.Any.fromFunction0(isBoldTextEnabled), isGrayscaleEnabled = js.Any.fromFunction0(isGrayscaleEnabled), isInvertColorsEnabled = js.Any.fromFunction0(isInvertColorsEnabled), isReduceMotionEnabled = js.Any.fromFunction0(isReduceMotionEnabled), isReduceTransparencyEnabled = js.Any.fromFunction0(isReduceTransparencyEnabled), isScreenReaderEnabled = js.Any.fromFunction0(isScreenReaderEnabled), removeEventListener = js.Any.fromFunction2(removeEventListener), setAccessibilityFocus = js.Any.fromFunction1(setAccessibilityFocus))
    __obj.asInstanceOf[AccessibilityInfoStatic]
  }
  @scala.inline
  implicit class AccessibilityInfoStaticOps[Self <: AccessibilityInfoStatic] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAddEventListener(value: (AccessibilityEventName, js.Function1[/* event */ AccessibilityEvent, Unit]) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("addEventListener")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withAnnounceForAccessibility(value: String => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("announceForAccessibility")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withFetch(value: () => js.Promise[Boolean]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fetch")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withIsBoldTextEnabled(value: () => js.Promise[Boolean]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isBoldTextEnabled")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withIsGrayscaleEnabled(value: () => js.Promise[Boolean]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isGrayscaleEnabled")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withIsInvertColorsEnabled(value: () => js.Promise[Boolean]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isInvertColorsEnabled")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withIsReduceMotionEnabled(value: () => js.Promise[Boolean]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isReduceMotionEnabled")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withIsReduceTransparencyEnabled(value: () => js.Promise[Boolean]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isReduceTransparencyEnabled")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withIsScreenReaderEnabled(value: () => js.Promise[Boolean]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isScreenReaderEnabled")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withRemoveEventListener(value: (AccessibilityEventName, js.Function1[/* event */ AccessibilityEvent, Unit]) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("removeEventListener")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withSetAccessibilityFocus(value: Double => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setAccessibilityFocus")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

