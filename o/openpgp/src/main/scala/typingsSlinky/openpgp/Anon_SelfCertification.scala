package typingsSlinky.openpgp

import typingsSlinky.openpgp.openpgpMod.key.User
import typingsSlinky.openpgp.openpgpMod.packet.Signature
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_SelfCertification extends js.Object {
  var selfCertification: Signature
  var user: User
}

object Anon_SelfCertification {
  @scala.inline
  def apply(selfCertification: Signature, user: User): Anon_SelfCertification = {
    val __obj = js.Dynamic.literal(selfCertification = selfCertification.asInstanceOf[js.Any], user = user.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_SelfCertification]
  }
}

