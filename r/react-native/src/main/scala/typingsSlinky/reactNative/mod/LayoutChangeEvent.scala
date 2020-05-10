package typingsSlinky.reactNative.mod

import typingsSlinky.reactNative.AnonLayout
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LayoutChangeEvent extends js.Object {
  var nativeEvent: AnonLayout = js.native
}

object LayoutChangeEvent {
  @scala.inline
  def apply(nativeEvent: AnonLayout): LayoutChangeEvent = {
    val __obj = js.Dynamic.literal(nativeEvent = nativeEvent.asInstanceOf[js.Any])
    __obj.asInstanceOf[LayoutChangeEvent]
  }
  @scala.inline
  implicit class LayoutChangeEventOps[Self <: LayoutChangeEvent] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withNativeEvent(value: AnonLayout): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nativeEvent")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

