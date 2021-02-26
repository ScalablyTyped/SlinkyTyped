package typingsSlinky.acmeClient.rfc8555Mod

import typingsSlinky.acmeClient.acmeClientStrings.`dns-01`
import typingsSlinky.acmeClient.acmeClientStrings.`http-01`
import typingsSlinky.acmeClient.acmeClientStrings.invalid
import typingsSlinky.acmeClient.acmeClientStrings.pending
import typingsSlinky.acmeClient.acmeClientStrings.processing
import typingsSlinky.acmeClient.acmeClientStrings.valid
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.acmeClient.rfc8555Mod.HttpChallenge
  - typingsSlinky.acmeClient.rfc8555Mod.DnsChallenge
*/
trait Challenge extends StObject
object Challenge {
  
  @scala.inline
  def DnsChallenge(status: pending | processing | valid | invalid, token: String, `type`: `dns-01`, url: String): typingsSlinky.acmeClient.rfc8555Mod.DnsChallenge = {
    val __obj = js.Dynamic.literal(status = status.asInstanceOf[js.Any], token = token.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.acmeClient.rfc8555Mod.DnsChallenge]
  }
  
  @scala.inline
  def HttpChallenge(status: pending | processing | valid | invalid, token: String, `type`: `http-01`, url: String): typingsSlinky.acmeClient.rfc8555Mod.HttpChallenge = {
    val __obj = js.Dynamic.literal(status = status.asInstanceOf[js.Any], token = token.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.acmeClient.rfc8555Mod.HttpChallenge]
  }
}
