package typingsSlinky.googleapis

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonEnabled extends js.Object {
  var enabled: js.UndefOr[Boolean] = js.native
  var lockedTime: js.UndefOr[String] = js.native
}

object AnonEnabled {
  @scala.inline
  def apply(): AnonEnabled = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnonEnabled]
  }
  @scala.inline
  implicit class AnonEnabledOps[Self <: AnonEnabled] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEnabled(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnabled: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enabled")(js.undefined)
        ret
    }
    @scala.inline
    def withLockedTime(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lockedTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLockedTime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lockedTime")(js.undefined)
        ret
    }
  }
  
}

