package typingsSlinky.gapiClientPlusdomains

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonAdHocVerified extends js.Object {
  /** Verification for one-time or manual processes. */
  var adHocVerified: js.UndefOr[String] = js.native
}

object AnonAdHocVerified {
  @scala.inline
  def apply(): AnonAdHocVerified = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnonAdHocVerified]
  }
  @scala.inline
  implicit class AnonAdHocVerifiedOps[Self <: AnonAdHocVerified] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAdHocVerified(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("adHocVerified")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAdHocVerified: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("adHocVerified")(js.undefined)
        ret
    }
  }
  
}

