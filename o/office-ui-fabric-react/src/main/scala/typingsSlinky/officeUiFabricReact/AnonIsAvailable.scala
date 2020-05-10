package typingsSlinky.officeUiFabricReact

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonIsAvailable extends js.Object {
  var isAvailable: Boolean = js.native
  var isAway: Boolean = js.native
  var isBlocked: Boolean = js.native
  var isBusy: Boolean = js.native
  var isDoNotDisturb: Boolean = js.native
  var isOffline: Boolean = js.native
}

object AnonIsAvailable {
  @scala.inline
  def apply(
    isAvailable: Boolean,
    isAway: Boolean,
    isBlocked: Boolean,
    isBusy: Boolean,
    isDoNotDisturb: Boolean,
    isOffline: Boolean
  ): AnonIsAvailable = {
    val __obj = js.Dynamic.literal(isAvailable = isAvailable.asInstanceOf[js.Any], isAway = isAway.asInstanceOf[js.Any], isBlocked = isBlocked.asInstanceOf[js.Any], isBusy = isBusy.asInstanceOf[js.Any], isDoNotDisturb = isDoNotDisturb.asInstanceOf[js.Any], isOffline = isOffline.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonIsAvailable]
  }
  @scala.inline
  implicit class AnonIsAvailableOps[Self <: AnonIsAvailable] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withIsAvailable(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isAvailable")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsAway(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isAway")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsBlocked(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isBlocked")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsBusy(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isBusy")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsDoNotDisturb(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isDoNotDisturb")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsOffline(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isOffline")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

