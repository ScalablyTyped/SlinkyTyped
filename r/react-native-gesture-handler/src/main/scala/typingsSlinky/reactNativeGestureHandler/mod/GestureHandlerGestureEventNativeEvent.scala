package typingsSlinky.reactNativeGestureHandler.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GestureHandlerGestureEventNativeEvent extends js.Object {
  var handlerTag: Double = js.native
  var numberOfPointers: Double = js.native
  var state: State = js.native
}

object GestureHandlerGestureEventNativeEvent {
  @scala.inline
  def apply(handlerTag: Double, numberOfPointers: Double, state: State): GestureHandlerGestureEventNativeEvent = {
    val __obj = js.Dynamic.literal(handlerTag = handlerTag.asInstanceOf[js.Any], numberOfPointers = numberOfPointers.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any])
    __obj.asInstanceOf[GestureHandlerGestureEventNativeEvent]
  }
  @scala.inline
  implicit class GestureHandlerGestureEventNativeEventOps[Self <: GestureHandlerGestureEventNativeEvent] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withHandlerTag(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("handlerTag")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNumberOfPointers(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("numberOfPointers")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withState(value: State): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("state")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

