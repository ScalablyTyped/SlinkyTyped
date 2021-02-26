package typingsSlinky.acmeClient.rfc8555Mod

import typingsSlinky.acmeClient.acmeClientStrings.`dns-01`
import typingsSlinky.acmeClient.acmeClientStrings.invalid
import typingsSlinky.acmeClient.acmeClientStrings.pending
import typingsSlinky.acmeClient.acmeClientStrings.processing
import typingsSlinky.acmeClient.acmeClientStrings.valid
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DnsChallenge
  extends ChallengeAbstract
     with Challenge {
  
  var token: String = js.native
  
  @JSName("type")
  var type_DnsChallenge: `dns-01` = js.native
}
object DnsChallenge {
  
  @scala.inline
  def apply(status: pending | processing | valid | invalid, token: String, `type`: `dns-01`, url: String): DnsChallenge = {
    val __obj = js.Dynamic.literal(status = status.asInstanceOf[js.Any], token = token.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[DnsChallenge]
  }
  
  @scala.inline
  implicit class DnsChallengeMutableBuilder[Self <: DnsChallenge] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setToken(value: String): Self = StObject.set(x, "token", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: `dns-01`): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
