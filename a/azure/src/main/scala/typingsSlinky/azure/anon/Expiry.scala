package typingsSlinky.azure.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Expiry extends js.Object {
  var Expiry: js.Date = js.native
  var Permission: js.UndefOr[String] = js.native
  var Start: js.UndefOr[js.Date] = js.native
}

object Expiry {
  @scala.inline
  def apply(Expiry: js.Date): Expiry = {
    val __obj = js.Dynamic.literal(Expiry = Expiry.asInstanceOf[js.Any])
    __obj.asInstanceOf[Expiry]
  }
  @scala.inline
  implicit class ExpiryOps[Self <: Expiry] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withExpiry(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Expiry")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPermission(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Permission")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPermission: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Permission")(js.undefined)
        ret
    }
    @scala.inline
    def withStart(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Start")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStart: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Start")(js.undefined)
        ret
    }
  }
  
}

