package typingsSlinky.parse

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonForceSecure extends js.Object {
  var forceSecure: js.UndefOr[Boolean] = js.native
}

object AnonForceSecure {
  @scala.inline
  def apply(): AnonForceSecure = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnonForceSecure]
  }
  @scala.inline
  implicit class AnonForceSecureOps[Self <: AnonForceSecure] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withForceSecure(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("forceSecure")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutForceSecure: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("forceSecure")(js.undefined)
        ret
    }
  }
  
}

