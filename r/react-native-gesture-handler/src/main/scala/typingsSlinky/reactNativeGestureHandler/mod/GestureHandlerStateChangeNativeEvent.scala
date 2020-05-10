package typingsSlinky.reactNativeGestureHandler.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GestureHandlerStateChangeNativeEvent extends js.Object {
  var handlerTag: Double = js.native
  var numberOfPointers: Double = js.native
  var oldState: State = js.native
  var state: State = js.native
}

object GestureHandlerStateChangeNativeEvent {
  @scala.inline
  def apply(handlerTag: Double, numberOfPointers: Double, oldState: State, state: State): GestureHandlerStateChangeNativeEvent = {
    val __obj = js.Dynamic.literal(handlerTag = handlerTag.asInstanceOf[js.Any], numberOfPointers = numberOfPointers.asInstanceOf[js.Any], oldState = oldState.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any])
    __obj.asInstanceOf[GestureHandlerStateChangeNativeEvent]
  }
  @scala.inline
  implicit class GestureHandlerStateChangeNativeEventOps[Self <: GestureHandlerStateChangeNativeEvent] (val x: Self) extends AnyVal {
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
    def withOldState(value: State): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("oldState")(value.asInstanceOf[js.Any])
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

