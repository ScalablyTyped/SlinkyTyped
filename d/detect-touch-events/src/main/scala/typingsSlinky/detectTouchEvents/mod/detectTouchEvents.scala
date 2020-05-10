package typingsSlinky.detectTouchEvents.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait detectTouchEvents extends js.Object {
  var hasApi: Boolean = js.native
  var maxTouchPoints: Double = js.native
  def update(): Unit = js.native
}

object detectTouchEvents {
  @scala.inline
  def apply(hasApi: Boolean, maxTouchPoints: Double, update: () => Unit): detectTouchEvents = {
    val __obj = js.Dynamic.literal(hasApi = hasApi.asInstanceOf[js.Any], maxTouchPoints = maxTouchPoints.asInstanceOf[js.Any], update = js.Any.fromFunction0(update))
    __obj.asInstanceOf[detectTouchEvents]
  }
  @scala.inline
  implicit class detectTouchEventsOps[Self <: detectTouchEvents] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withHasApi(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hasApi")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMaxTouchPoints(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxTouchPoints")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUpdate(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("update")(js.Any.fromFunction0(value))
        ret
    }
  }
  
}

