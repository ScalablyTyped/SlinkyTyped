package typingsSlinky.googlemaps.google.maps.visualization

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MouseEvent extends js.Object {
  def stop(): Unit = js.native
}

object MouseEvent {
  @scala.inline
  def apply(stop: () => Unit): MouseEvent = {
    val __obj = js.Dynamic.literal(stop = js.Any.fromFunction0(stop))
    __obj.asInstanceOf[MouseEvent]
  }
  @scala.inline
  implicit class MouseEventOps[Self <: MouseEvent] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withStop(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stop")(js.Any.fromFunction0(value))
        ret
    }
  }
  
}

