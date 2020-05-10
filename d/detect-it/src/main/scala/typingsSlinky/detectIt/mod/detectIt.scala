package typingsSlinky.detectIt.mod

import typingsSlinky.detectIt.detectItStrings.coarse
import typingsSlinky.detectIt.detectItStrings.fine
import typingsSlinky.detectIt.detectItStrings.hover
import typingsSlinky.detectIt.detectItStrings.hybrid
import typingsSlinky.detectIt.detectItStrings.mouseOnly
import typingsSlinky.detectIt.detectItStrings.none
import typingsSlinky.detectIt.detectItStrings.touchOnly
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait detectIt extends js.Object {
  var deviceType: hybrid | mouseOnly | touchOnly = js.native
  var hasMouse: Boolean = js.native
  var hasTouch: Boolean = js.native
  var maxTouchPoints: Double = js.native
  var passiveEvents: Boolean = js.native
  var primaryHover: hover | none = js.native
  var primaryPointer: coarse | fine | none = js.native
  var state: typingsSlinky.detectIt.mod.state = js.native
  def update(): Unit = js.native
}

object detectIt {
  @scala.inline
  def apply(
    deviceType: hybrid | mouseOnly | touchOnly,
    hasMouse: Boolean,
    hasTouch: Boolean,
    maxTouchPoints: Double,
    passiveEvents: Boolean,
    primaryHover: hover | none,
    primaryPointer: coarse | fine | none,
    state: state,
    update: () => Unit
  ): detectIt = {
    val __obj = js.Dynamic.literal(deviceType = deviceType.asInstanceOf[js.Any], hasMouse = hasMouse.asInstanceOf[js.Any], hasTouch = hasTouch.asInstanceOf[js.Any], maxTouchPoints = maxTouchPoints.asInstanceOf[js.Any], passiveEvents = passiveEvents.asInstanceOf[js.Any], primaryHover = primaryHover.asInstanceOf[js.Any], primaryPointer = primaryPointer.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any], update = js.Any.fromFunction0(update))
    __obj.asInstanceOf[detectIt]
  }
  @scala.inline
  implicit class detectItOps[Self <: detectIt] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDeviceType(value: hybrid | mouseOnly | touchOnly): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deviceType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHasMouse(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hasMouse")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHasTouch(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hasTouch")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMaxTouchPoints(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxTouchPoints")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPassiveEvents(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("passiveEvents")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPrimaryHover(value: hover | none): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("primaryHover")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPrimaryPointer(value: coarse | fine | none): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("primaryPointer")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withState(value: state): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("state")(value.asInstanceOf[js.Any])
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

