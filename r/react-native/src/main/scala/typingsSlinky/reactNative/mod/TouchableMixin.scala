package typingsSlinky.reactNative.mod

import slinky.core.SyntheticEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * @see https://github.com/facebook/react-native/blob/0.34-stable\Libraries\Components\Touchable\Touchable.js
  */
@js.native
trait TouchableMixin extends js.Object {
  /**
    * Returns the number of millis to wait before triggering a highlight.
    */
  def touchableGetHighlightDelayMS(): Double = js.native
  def touchableGetHitSlop(): Insets = js.native
  // These methods are undocumented but still being used by TouchableMixin internals
  def touchableGetLongPressDelayMS(): Double = js.native
  def touchableGetPressOutDelayMS(): Double = js.native
  /**
    * Returns the amount to extend the `HitRect` into the `PressRect`. Positive
    * numbers mean the size expands outwards.
    */
  def touchableGetPressRectOffset(): Insets = js.native
  /**
    * Invoked when the item should be highlighted. Mixers should implement this
    * to visually distinguish the `VisualRect` so that the user knows that
    * releasing a touch will result in a "selection" (analog to click).
    */
  def touchableHandleActivePressIn(e: SyntheticEvent[NodeHandle, NativeTouchEvent]): Unit = js.native
  /**
    * Invoked when the item is "active" (in that it is still eligible to become
    * a "select") but the touch has left the `PressRect`. Usually the mixer will
    * want to unhighlight the `VisualRect`. If the user (while pressing) moves
    * back into the `PressRect` `touchableHandleActivePressIn` will be invoked
    * again and the mixer should probably highlight the `VisualRect` again. This
    * event will not fire on an `touchEnd/mouseUp` event, only move events while
    * the user is depressing the mouse/touch.
    */
  def touchableHandleActivePressOut(e: SyntheticEvent[NodeHandle, NativeTouchEvent]): Unit = js.native
  /**
    * Invoked when the item is long pressed - meaning the interaction ended by
    * letting up while the item was in `RESPONDER_ACTIVE_LONG_PRESS_IN`. If
    * `touchableHandleLongPress` is *not* provided, `touchableHandlePress` will
    * be called as it normally is. If `touchableHandleLongPress` is provided, by
    * default any `touchableHandlePress` callback will not be invoked. To
    * override this default behavior, override `touchableLongPressCancelsPress`
    * to return false. As a result, `touchableHandlePress` will be called when
    * lifting up, even if `touchableHandleLongPress` has also been called.
    */
  def touchableHandleLongPress(e: SyntheticEvent[NodeHandle, NativeTouchEvent]): Unit = js.native
  /**
    * Invoked when the item is "selected" - meaning the interaction ended by
    * letting up while the item was either in the state
    * `RESPONDER_ACTIVE_PRESS_IN` or `RESPONDER_INACTIVE_PRESS_IN`.
    */
  def touchableHandlePress(e: SyntheticEvent[NodeHandle, NativeTouchEvent]): Unit = js.native
}

object TouchableMixin {
  @scala.inline
  def apply(
    touchableGetHighlightDelayMS: () => Double,
    touchableGetHitSlop: () => Insets,
    touchableGetLongPressDelayMS: () => Double,
    touchableGetPressOutDelayMS: () => Double,
    touchableGetPressRectOffset: () => Insets,
    touchableHandleActivePressIn: SyntheticEvent[NodeHandle, NativeTouchEvent] => Unit,
    touchableHandleActivePressOut: SyntheticEvent[NodeHandle, NativeTouchEvent] => Unit,
    touchableHandleLongPress: SyntheticEvent[NodeHandle, NativeTouchEvent] => Unit,
    touchableHandlePress: SyntheticEvent[NodeHandle, NativeTouchEvent] => Unit
  ): TouchableMixin = {
    val __obj = js.Dynamic.literal(touchableGetHighlightDelayMS = js.Any.fromFunction0(touchableGetHighlightDelayMS), touchableGetHitSlop = js.Any.fromFunction0(touchableGetHitSlop), touchableGetLongPressDelayMS = js.Any.fromFunction0(touchableGetLongPressDelayMS), touchableGetPressOutDelayMS = js.Any.fromFunction0(touchableGetPressOutDelayMS), touchableGetPressRectOffset = js.Any.fromFunction0(touchableGetPressRectOffset), touchableHandleActivePressIn = js.Any.fromFunction1(touchableHandleActivePressIn), touchableHandleActivePressOut = js.Any.fromFunction1(touchableHandleActivePressOut), touchableHandleLongPress = js.Any.fromFunction1(touchableHandleLongPress), touchableHandlePress = js.Any.fromFunction1(touchableHandlePress))
    __obj.asInstanceOf[TouchableMixin]
  }
  @scala.inline
  implicit class TouchableMixinOps[Self <: TouchableMixin] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withTouchableGetHighlightDelayMS(value: () => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("touchableGetHighlightDelayMS")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withTouchableGetHitSlop(value: () => Insets): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("touchableGetHitSlop")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withTouchableGetLongPressDelayMS(value: () => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("touchableGetLongPressDelayMS")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withTouchableGetPressOutDelayMS(value: () => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("touchableGetPressOutDelayMS")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withTouchableGetPressRectOffset(value: () => Insets): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("touchableGetPressRectOffset")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withTouchableHandleActivePressIn(value: SyntheticEvent[NodeHandle, NativeTouchEvent] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("touchableHandleActivePressIn")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withTouchableHandleActivePressOut(value: SyntheticEvent[NodeHandle, NativeTouchEvent] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("touchableHandleActivePressOut")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withTouchableHandleLongPress(value: SyntheticEvent[NodeHandle, NativeTouchEvent] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("touchableHandleLongPress")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withTouchableHandlePress(value: SyntheticEvent[NodeHandle, NativeTouchEvent] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("touchableHandlePress")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

