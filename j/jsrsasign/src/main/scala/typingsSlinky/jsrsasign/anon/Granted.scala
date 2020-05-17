package typingsSlinky.jsrsasign.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Granted extends js.Object {
  var granted: Double = js.native
  var grantedWithMods: Double = js.native
  var rejection: Double = js.native
  var revocationNotification: Double = js.native
  var revocationWarning: Double = js.native
  var waiting: Double = js.native
}

object Granted {
  @scala.inline
  def apply(
    granted: Double,
    grantedWithMods: Double,
    rejection: Double,
    revocationNotification: Double,
    revocationWarning: Double,
    waiting: Double
  ): Granted = {
    val __obj = js.Dynamic.literal(granted = granted.asInstanceOf[js.Any], grantedWithMods = grantedWithMods.asInstanceOf[js.Any], rejection = rejection.asInstanceOf[js.Any], revocationNotification = revocationNotification.asInstanceOf[js.Any], revocationWarning = revocationWarning.asInstanceOf[js.Any], waiting = waiting.asInstanceOf[js.Any])
    __obj.asInstanceOf[Granted]
  }
  @scala.inline
  implicit class GrantedOps[Self <: Granted] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withGranted(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("granted")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGrantedWithMods(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("grantedWithMods")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRejection(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rejection")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRevocationNotification(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("revocationNotification")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRevocationWarning(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("revocationWarning")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withWaiting(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("waiting")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

