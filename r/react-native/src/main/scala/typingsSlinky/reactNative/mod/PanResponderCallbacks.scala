package typingsSlinky.reactNative.mod

import slinky.core.SyntheticEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PanResponderCallbacks extends js.Object {
  var onMoveShouldSetPanResponder: js.UndefOr[
    js.Function2[
      SyntheticEvent[NodeHandle, NativeTouchEvent], 
      /* gestureState */ PanResponderGestureState, 
      Boolean
    ]
  ] = js.native
  var onMoveShouldSetPanResponderCapture: js.UndefOr[
    js.Function2[
      SyntheticEvent[NodeHandle, NativeTouchEvent], 
      /* gestureState */ PanResponderGestureState, 
      Boolean
    ]
  ] = js.native
  var onPanResponderEnd: js.UndefOr[
    js.Function2[
      SyntheticEvent[NodeHandle, NativeTouchEvent], 
      /* gestureState */ PanResponderGestureState, 
      Unit
    ]
  ] = js.native
  var onPanResponderGrant: js.UndefOr[
    js.Function2[
      SyntheticEvent[NodeHandle, NativeTouchEvent], 
      /* gestureState */ PanResponderGestureState, 
      Unit
    ]
  ] = js.native
  var onPanResponderMove: js.UndefOr[
    js.Function2[
      SyntheticEvent[NodeHandle, NativeTouchEvent], 
      /* gestureState */ PanResponderGestureState, 
      Unit
    ]
  ] = js.native
  var onPanResponderReject: js.UndefOr[
    js.Function2[
      SyntheticEvent[NodeHandle, NativeTouchEvent], 
      /* gestureState */ PanResponderGestureState, 
      Unit
    ]
  ] = js.native
  var onPanResponderRelease: js.UndefOr[
    js.Function2[
      SyntheticEvent[NodeHandle, NativeTouchEvent], 
      /* gestureState */ PanResponderGestureState, 
      Unit
    ]
  ] = js.native
  var onPanResponderStart: js.UndefOr[
    js.Function2[
      SyntheticEvent[NodeHandle, NativeTouchEvent], 
      /* gestureState */ PanResponderGestureState, 
      Unit
    ]
  ] = js.native
  var onPanResponderTerminate: js.UndefOr[
    js.Function2[
      SyntheticEvent[NodeHandle, NativeTouchEvent], 
      /* gestureState */ PanResponderGestureState, 
      Unit
    ]
  ] = js.native
  var onPanResponderTerminationRequest: js.UndefOr[
    js.Function2[
      SyntheticEvent[NodeHandle, NativeTouchEvent], 
      /* gestureState */ PanResponderGestureState, 
      Boolean
    ]
  ] = js.native
  var onShouldBlockNativeResponder: js.UndefOr[
    js.Function2[
      SyntheticEvent[NodeHandle, NativeTouchEvent], 
      /* gestureState */ PanResponderGestureState, 
      Boolean
    ]
  ] = js.native
  var onStartShouldSetPanResponder: js.UndefOr[
    js.Function2[
      SyntheticEvent[NodeHandle, NativeTouchEvent], 
      /* gestureState */ PanResponderGestureState, 
      Boolean
    ]
  ] = js.native
  var onStartShouldSetPanResponderCapture: js.UndefOr[
    js.Function2[
      SyntheticEvent[NodeHandle, NativeTouchEvent], 
      /* gestureState */ PanResponderGestureState, 
      Boolean
    ]
  ] = js.native
}

object PanResponderCallbacks {
  @scala.inline
  def apply(): PanResponderCallbacks = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PanResponderCallbacks]
  }
  @scala.inline
  implicit class PanResponderCallbacksOps[Self <: PanResponderCallbacks] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withOnMoveShouldSetPanResponder(
      value: (SyntheticEvent[NodeHandle, NativeTouchEvent], /* gestureState */ PanResponderGestureState) => Boolean
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onMoveShouldSetPanResponder")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutOnMoveShouldSetPanResponder: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onMoveShouldSetPanResponder")(js.undefined)
        ret
    }
    @scala.inline
    def withOnMoveShouldSetPanResponderCapture(
      value: (SyntheticEvent[NodeHandle, NativeTouchEvent], /* gestureState */ PanResponderGestureState) => Boolean
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onMoveShouldSetPanResponderCapture")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutOnMoveShouldSetPanResponderCapture: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onMoveShouldSetPanResponderCapture")(js.undefined)
        ret
    }
    @scala.inline
    def withOnPanResponderEnd(
      value: (SyntheticEvent[NodeHandle, NativeTouchEvent], /* gestureState */ PanResponderGestureState) => Unit
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onPanResponderEnd")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutOnPanResponderEnd: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onPanResponderEnd")(js.undefined)
        ret
    }
    @scala.inline
    def withOnPanResponderGrant(
      value: (SyntheticEvent[NodeHandle, NativeTouchEvent], /* gestureState */ PanResponderGestureState) => Unit
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onPanResponderGrant")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutOnPanResponderGrant: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onPanResponderGrant")(js.undefined)
        ret
    }
    @scala.inline
    def withOnPanResponderMove(
      value: (SyntheticEvent[NodeHandle, NativeTouchEvent], /* gestureState */ PanResponderGestureState) => Unit
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onPanResponderMove")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutOnPanResponderMove: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onPanResponderMove")(js.undefined)
        ret
    }
    @scala.inline
    def withOnPanResponderReject(
      value: (SyntheticEvent[NodeHandle, NativeTouchEvent], /* gestureState */ PanResponderGestureState) => Unit
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onPanResponderReject")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutOnPanResponderReject: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onPanResponderReject")(js.undefined)
        ret
    }
    @scala.inline
    def withOnPanResponderRelease(
      value: (SyntheticEvent[NodeHandle, NativeTouchEvent], /* gestureState */ PanResponderGestureState) => Unit
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onPanResponderRelease")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutOnPanResponderRelease: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onPanResponderRelease")(js.undefined)
        ret
    }
    @scala.inline
    def withOnPanResponderStart(
      value: (SyntheticEvent[NodeHandle, NativeTouchEvent], /* gestureState */ PanResponderGestureState) => Unit
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onPanResponderStart")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutOnPanResponderStart: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onPanResponderStart")(js.undefined)
        ret
    }
    @scala.inline
    def withOnPanResponderTerminate(
      value: (SyntheticEvent[NodeHandle, NativeTouchEvent], /* gestureState */ PanResponderGestureState) => Unit
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onPanResponderTerminate")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutOnPanResponderTerminate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onPanResponderTerminate")(js.undefined)
        ret
    }
    @scala.inline
    def withOnPanResponderTerminationRequest(
      value: (SyntheticEvent[NodeHandle, NativeTouchEvent], /* gestureState */ PanResponderGestureState) => Boolean
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onPanResponderTerminationRequest")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutOnPanResponderTerminationRequest: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onPanResponderTerminationRequest")(js.undefined)
        ret
    }
    @scala.inline
    def withOnShouldBlockNativeResponder(
      value: (SyntheticEvent[NodeHandle, NativeTouchEvent], /* gestureState */ PanResponderGestureState) => Boolean
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onShouldBlockNativeResponder")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutOnShouldBlockNativeResponder: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onShouldBlockNativeResponder")(js.undefined)
        ret
    }
    @scala.inline
    def withOnStartShouldSetPanResponder(
      value: (SyntheticEvent[NodeHandle, NativeTouchEvent], /* gestureState */ PanResponderGestureState) => Boolean
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onStartShouldSetPanResponder")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutOnStartShouldSetPanResponder: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onStartShouldSetPanResponder")(js.undefined)
        ret
    }
    @scala.inline
    def withOnStartShouldSetPanResponderCapture(
      value: (SyntheticEvent[NodeHandle, NativeTouchEvent], /* gestureState */ PanResponderGestureState) => Boolean
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onStartShouldSetPanResponderCapture")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutOnStartShouldSetPanResponderCapture: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onStartShouldSetPanResponderCapture")(js.undefined)
        ret
    }
  }
  
}

