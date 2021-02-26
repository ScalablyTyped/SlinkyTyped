package typingsSlinky.openpgp.anon

import typingsSlinky.openpgp.mod.key.User
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SelfCertification extends StObject {
  
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
  implicit class SelfCertificationMutableBuilder[Self <: SelfCertification] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setSelfCertification(value: typingsSlinky.openpgp.mod.packet.Signature): Self = StObject.set(x, "selfCertification", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUser(value: User): Self = StObject.set(x, "user", value.asInstanceOf[js.Any])
  }
}
