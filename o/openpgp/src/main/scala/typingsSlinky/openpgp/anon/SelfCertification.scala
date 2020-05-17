package typingsSlinky.openpgp.anon

import typingsSlinky.openpgp.mod.key.User
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SelfCertification extends js.Object {
  var selfCertification: typingsSlinky.openpgp.mod.packet.Signature = js.native
  var user: User = js.native
}

object SelfCertification {
  @scala.inline
  def apply(selfCertification: typingsSlinky.openpgp.mod.packet.Signature, user: User): SelfCertification = {
    val __obj = js.Dynamic.literal(selfCertification = selfCertification.asInstanceOf[js.Any], user = user.asInstanceOf[js.Any])
    __obj.asInstanceOf[SelfCertification]
  }
  @scala.inline
  implicit class SelfCertificationOps[Self <: SelfCertification] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withSelfCertification(value: typingsSlinky.openpgp.mod.packet.Signature): Self = {
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

