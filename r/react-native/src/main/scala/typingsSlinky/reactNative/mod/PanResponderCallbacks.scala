package typingsSlinky.reactNative.mod

import slinky.core.SyntheticEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PanResponderCallbacks extends js.Object {
  var onMoveShouldSetPanResponder: js.UndefOr[
    js.Function2[
      SyntheticEvent[NodeHandle, NativeTouchEvent], 
      /* gestureState */ PanResponderGestureState, 
      Boolean
    ]
  ] = js.undefined
  var onMoveShouldSetPanResponderCapture: js.UndefOr[
    js.Function2[
      SyntheticEvent[NodeHandle, NativeTouchEvent], 
      /* gestureState */ PanResponderGestureState, 
      Boolean
    ]
  ] = js.undefined
  var onPanResponderEnd: js.UndefOr[
    js.Function2[
      SyntheticEvent[NodeHandle, NativeTouchEvent], 
      /* gestureState */ PanResponderGestureState, 
      Unit
    ]
  ] = js.undefined
  var onPanResponderGrant: js.UndefOr[
    js.Function2[
      SyntheticEvent[NodeHandle, NativeTouchEvent], 
      /* gestureState */ PanResponderGestureState, 
      Unit
    ]
  ] = js.undefined
  var onPanResponderMove: js.UndefOr[
    js.Function2[
      SyntheticEvent[NodeHandle, NativeTouchEvent], 
      /* gestureState */ PanResponderGestureState, 
      Unit
    ]
  ] = js.undefined
  var onPanResponderReject: js.UndefOr[
    js.Function2[
      SyntheticEvent[NodeHandle, NativeTouchEvent], 
      /* gestureState */ PanResponderGestureState, 
      Unit
    ]
  ] = js.undefined
  var onPanResponderRelease: js.UndefOr[
    js.Function2[
      SyntheticEvent[NodeHandle, NativeTouchEvent], 
      /* gestureState */ PanResponderGestureState, 
      Unit
    ]
  ] = js.undefined
  var onPanResponderStart: js.UndefOr[
    js.Function2[
      SyntheticEvent[NodeHandle, NativeTouchEvent], 
      /* gestureState */ PanResponderGestureState, 
      Unit
    ]
  ] = js.undefined
  var onPanResponderTerminate: js.UndefOr[
    js.Function2[
      SyntheticEvent[NodeHandle, NativeTouchEvent], 
      /* gestureState */ PanResponderGestureState, 
      Unit
    ]
  ] = js.undefined
  var onPanResponderTerminationRequest: js.UndefOr[
    js.Function2[
      SyntheticEvent[NodeHandle, NativeTouchEvent], 
      /* gestureState */ PanResponderGestureState, 
      Boolean
    ]
  ] = js.undefined
  var onShouldBlockNativeResponder: js.UndefOr[
    js.Function2[
      SyntheticEvent[NodeHandle, NativeTouchEvent], 
      /* gestureState */ PanResponderGestureState, 
      Boolean
    ]
  ] = js.undefined
  var onStartShouldSetPanResponder: js.UndefOr[
    js.Function2[
      SyntheticEvent[NodeHandle, NativeTouchEvent], 
      /* gestureState */ PanResponderGestureState, 
      Boolean
    ]
  ] = js.undefined
  var onStartShouldSetPanResponderCapture: js.UndefOr[
    js.Function2[
      SyntheticEvent[NodeHandle, NativeTouchEvent], 
      /* gestureState */ PanResponderGestureState, 
      Boolean
    ]
  ] = js.undefined
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
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setOnMoveShouldSetPanResponder(
      value: (SyntheticEvent[NodeHandle, NativeTouchEvent], /* gestureState */ PanResponderGestureState) => Boolean
    ): Self = this.set("onMoveShouldSetPanResponder", js.Any.fromFunction2(value))
    @scala.inline
    def deleteOnMoveShouldSetPanResponder: Self = this.set("onMoveShouldSetPanResponder", js.undefined)
    @scala.inline
    def setOnMoveShouldSetPanResponderCapture(
      value: (SyntheticEvent[NodeHandle, NativeTouchEvent], /* gestureState */ PanResponderGestureState) => Boolean
    ): Self = this.set("onMoveShouldSetPanResponderCapture", js.Any.fromFunction2(value))
    @scala.inline
    def deleteOnMoveShouldSetPanResponderCapture: Self = this.set("onMoveShouldSetPanResponderCapture", js.undefined)
    @scala.inline
    def setOnPanResponderEnd(
      value: (SyntheticEvent[NodeHandle, NativeTouchEvent], /* gestureState */ PanResponderGestureState) => Unit
    ): Self = this.set("onPanResponderEnd", js.Any.fromFunction2(value))
    @scala.inline
    def deleteOnPanResponderEnd: Self = this.set("onPanResponderEnd", js.undefined)
    @scala.inline
    def setOnPanResponderGrant(
      value: (SyntheticEvent[NodeHandle, NativeTouchEvent], /* gestureState */ PanResponderGestureState) => Unit
    ): Self = this.set("onPanResponderGrant", js.Any.fromFunction2(value))
    @scala.inline
    def deleteOnPanResponderGrant: Self = this.set("onPanResponderGrant", js.undefined)
    @scala.inline
    def setOnPanResponderMove(
      value: (SyntheticEvent[NodeHandle, NativeTouchEvent], /* gestureState */ PanResponderGestureState) => Unit
    ): Self = this.set("onPanResponderMove", js.Any.fromFunction2(value))
    @scala.inline
    def deleteOnPanResponderMove: Self = this.set("onPanResponderMove", js.undefined)
    @scala.inline
    def setOnPanResponderReject(
      value: (SyntheticEvent[NodeHandle, NativeTouchEvent], /* gestureState */ PanResponderGestureState) => Unit
    ): Self = this.set("onPanResponderReject", js.Any.fromFunction2(value))
    @scala.inline
    def deleteOnPanResponderReject: Self = this.set("onPanResponderReject", js.undefined)
    @scala.inline
    def setOnPanResponderRelease(
      value: (SyntheticEvent[NodeHandle, NativeTouchEvent], /* gestureState */ PanResponderGestureState) => Unit
    ): Self = this.set("onPanResponderRelease", js.Any.fromFunction2(value))
    @scala.inline
    def deleteOnPanResponderRelease: Self = this.set("onPanResponderRelease", js.undefined)
    @scala.inline
    def setOnPanResponderStart(
      value: (SyntheticEvent[NodeHandle, NativeTouchEvent], /* gestureState */ PanResponderGestureState) => Unit
    ): Self = this.set("onPanResponderStart", js.Any.fromFunction2(value))
    @scala.inline
    def deleteOnPanResponderStart: Self = this.set("onPanResponderStart", js.undefined)
    @scala.inline
    def setOnPanResponderTerminate(
      value: (SyntheticEvent[NodeHandle, NativeTouchEvent], /* gestureState */ PanResponderGestureState) => Unit
    ): Self = this.set("onPanResponderTerminate", js.Any.fromFunction2(value))
    @scala.inline
    def deleteOnPanResponderTerminate: Self = this.set("onPanResponderTerminate", js.undefined)
    @scala.inline
    def setOnPanResponderTerminationRequest(
      value: (SyntheticEvent[NodeHandle, NativeTouchEvent], /* gestureState */ PanResponderGestureState) => Boolean
    ): Self = this.set("onPanResponderTerminationRequest", js.Any.fromFunction2(value))
    @scala.inline
    def deleteOnPanResponderTerminationRequest: Self = this.set("onPanResponderTerminationRequest", js.undefined)
    @scala.inline
    def setOnShouldBlockNativeResponder(
      value: (SyntheticEvent[NodeHandle, NativeTouchEvent], /* gestureState */ PanResponderGestureState) => Boolean
    ): Self = this.set("onShouldBlockNativeResponder", js.Any.fromFunction2(value))
    @scala.inline
    def deleteOnShouldBlockNativeResponder: Self = this.set("onShouldBlockNativeResponder", js.undefined)
    @scala.inline
    def setOnStartShouldSetPanResponder(
      value: (SyntheticEvent[NodeHandle, NativeTouchEvent], /* gestureState */ PanResponderGestureState) => Boolean
    ): Self = this.set("onStartShouldSetPanResponder", js.Any.fromFunction2(value))
    @scala.inline
    def deleteOnStartShouldSetPanResponder: Self = this.set("onStartShouldSetPanResponder", js.undefined)
    @scala.inline
    def setOnStartShouldSetPanResponderCapture(
      value: (SyntheticEvent[NodeHandle, NativeTouchEvent], /* gestureState */ PanResponderGestureState) => Boolean
    ): Self = this.set("onStartShouldSetPanResponderCapture", js.Any.fromFunction2(value))
    @scala.inline
    def deleteOnStartShouldSetPanResponderCapture: Self = this.set("onStartShouldSetPanResponderCapture", js.undefined)
  }
  
}

