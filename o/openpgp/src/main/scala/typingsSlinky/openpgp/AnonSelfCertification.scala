package typingsSlinky.openpgp

import typingsSlinky.openpgp.mod.key.User
import typingsSlinky.openpgp.mod.packet.Signature
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonSelfCertification extends js.Object {
  var selfCertification: Signature = js.native
  var user: User = js.native
}

object AnonSelfCertification {
  @scala.inline
  def apply(selfCertification: Signature, user: User): AnonSelfCertification = {
    val __obj = js.Dynamic.literal(selfCertification = selfCertification.asInstanceOf[js.Any], user = user.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonSelfCertification]
  }
  @scala.inline
  implicit class AnonSelfCertificationOps[Self <: AnonSelfCertification] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withSelfCertification(value: Signature): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selfCertification")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUser(value: User): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("user")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

