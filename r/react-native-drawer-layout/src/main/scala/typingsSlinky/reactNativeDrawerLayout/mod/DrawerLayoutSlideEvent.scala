package typingsSlinky.reactNativeDrawerLayout.mod

import typingsSlinky.reactNativeDrawerLayout.anon.Offset
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DrawerLayoutSlideEvent extends js.Object {
  var nativeEvent: Offset = js.native
}

object DrawerLayoutSlideEvent {
  @scala.inline
  def apply(nativeEvent: Offset): DrawerLayoutSlideEvent = {
    val __obj = js.Dynamic.literal(nativeEvent = nativeEvent.asInstanceOf[js.Any])
    __obj.asInstanceOf[DrawerLayoutSlideEvent]
  }
  @scala.inline
  implicit class DrawerLayoutSlideEventOps[Self <: DrawerLayoutSlideEvent] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withNativeEvent(value: Offset): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nativeEvent")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

