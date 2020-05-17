package typingsSlinky.braintree.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ProfileId extends js.Object {
  var profileId: js.UndefOr[String] = js.native
}

object ProfileId {
  @scala.inline
  def apply(): ProfileId = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ProfileId]
  }
  @scala.inline
  implicit class ProfileIdOps[Self <: ProfileId] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withProfileId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("profileId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutProfileId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("profileId")(js.undefined)
        ret
    }
  }
  
}

