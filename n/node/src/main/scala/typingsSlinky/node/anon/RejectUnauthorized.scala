package typingsSlinky.node.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RejectUnauthorized extends js.Object {
  var rejectUnauthorized: js.UndefOr[Boolean] = js.native
  var requestCert: js.UndefOr[Boolean] = js.native
}

object RejectUnauthorized {
  @scala.inline
  def apply(): RejectUnauthorized = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RejectUnauthorized]
  }
  @scala.inline
  implicit class RejectUnauthorizedOps[Self <: RejectUnauthorized] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withRejectUnauthorized(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rejectUnauthorized")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRejectUnauthorized: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rejectUnauthorized")(js.undefined)
        ret
    }
    @scala.inline
    def withRequestCert(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("requestCert")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRequestCert: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("requestCert")(js.undefined)
        ret
    }
  }
  
}

