package typingsSlinky.reactDashNative.reactDashNativeMod

import slinky.core.SyntheticEvent
import typingsSlinky.reactDashNative.NodeHandle
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
  def apply(
    onMoveShouldSetPanResponder: (SyntheticEvent[NodeHandle, NativeTouchEvent], /* gestureState */ PanResponderGestureState) => Boolean = null,
    onMoveShouldSetPanResponderCapture: (SyntheticEvent[NodeHandle, NativeTouchEvent], /* gestureState */ PanResponderGestureState) => Boolean = null,
    onPanResponderEnd: (SyntheticEvent[NodeHandle, NativeTouchEvent], /* gestureState */ PanResponderGestureState) => Unit = null,
    onPanResponderGrant: (SyntheticEvent[NodeHandle, NativeTouchEvent], /* gestureState */ PanResponderGestureState) => Unit = null,
    onPanResponderMove: (SyntheticEvent[NodeHandle, NativeTouchEvent], /* gestureState */ PanResponderGestureState) => Unit = null,
    onPanResponderReject: (SyntheticEvent[NodeHandle, NativeTouchEvent], /* gestureState */ PanResponderGestureState) => Unit = null,
    onPanResponderRelease: (SyntheticEvent[NodeHandle, NativeTouchEvent], /* gestureState */ PanResponderGestureState) => Unit = null,
    onPanResponderStart: (SyntheticEvent[NodeHandle, NativeTouchEvent], /* gestureState */ PanResponderGestureState) => Unit = null,
    onPanResponderTerminate: (SyntheticEvent[NodeHandle, NativeTouchEvent], /* gestureState */ PanResponderGestureState) => Unit = null,
    onPanResponderTerminationRequest: (SyntheticEvent[NodeHandle, NativeTouchEvent], /* gestureState */ PanResponderGestureState) => Boolean = null,
    onShouldBlockNativeResponder: (SyntheticEvent[NodeHandle, NativeTouchEvent], /* gestureState */ PanResponderGestureState) => Boolean = null,
    onStartShouldSetPanResponder: (SyntheticEvent[NodeHandle, NativeTouchEvent], /* gestureState */ PanResponderGestureState) => Boolean = null,
    onStartShouldSetPanResponderCapture: (SyntheticEvent[NodeHandle, NativeTouchEvent], /* gestureState */ PanResponderGestureState) => Boolean = null
  ): PanResponderCallbacks = {
    val __obj = js.Dynamic.literal()
    if (onMoveShouldSetPanResponder != null) __obj.updateDynamic("onMoveShouldSetPanResponder")(js.Any.fromFunction2(onMoveShouldSetPanResponder))
    if (onMoveShouldSetPanResponderCapture != null) __obj.updateDynamic("onMoveShouldSetPanResponderCapture")(js.Any.fromFunction2(onMoveShouldSetPanResponderCapture))
    if (onPanResponderEnd != null) __obj.updateDynamic("onPanResponderEnd")(js.Any.fromFunction2(onPanResponderEnd))
    if (onPanResponderGrant != null) __obj.updateDynamic("onPanResponderGrant")(js.Any.fromFunction2(onPanResponderGrant))
    if (onPanResponderMove != null) __obj.updateDynamic("onPanResponderMove")(js.Any.fromFunction2(onPanResponderMove))
    if (onPanResponderReject != null) __obj.updateDynamic("onPanResponderReject")(js.Any.fromFunction2(onPanResponderReject))
    if (onPanResponderRelease != null) __obj.updateDynamic("onPanResponderRelease")(js.Any.fromFunction2(onPanResponderRelease))
    if (onPanResponderStart != null) __obj.updateDynamic("onPanResponderStart")(js.Any.fromFunction2(onPanResponderStart))
    if (onPanResponderTerminate != null) __obj.updateDynamic("onPanResponderTerminate")(js.Any.fromFunction2(onPanResponderTerminate))
    if (onPanResponderTerminationRequest != null) __obj.updateDynamic("onPanResponderTerminationRequest")(js.Any.fromFunction2(onPanResponderTerminationRequest))
    if (onShouldBlockNativeResponder != null) __obj.updateDynamic("onShouldBlockNativeResponder")(js.Any.fromFunction2(onShouldBlockNativeResponder))
    if (onStartShouldSetPanResponder != null) __obj.updateDynamic("onStartShouldSetPanResponder")(js.Any.fromFunction2(onStartShouldSetPanResponder))
    if (onStartShouldSetPanResponderCapture != null) __obj.updateDynamic("onStartShouldSetPanResponderCapture")(js.Any.fromFunction2(onStartShouldSetPanResponderCapture))
    __obj.asInstanceOf[PanResponderCallbacks]
  }
}

