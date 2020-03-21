package typingsSlinky.acmeClient.rfc8555Mod

import typingsSlinky.acmeClient.acmeClientStrings.`dns-01`
import typingsSlinky.acmeClient.acmeClientStrings.`http-01`
import typingsSlinky.acmeClient.acmeClientStrings.invalid
import typingsSlinky.acmeClient.acmeClientStrings.pending
import typingsSlinky.acmeClient.acmeClientStrings.processing
import typingsSlinky.acmeClient.acmeClientStrings.valid
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.acmeClient.rfc8555Mod.HttpChallenge
  - typingsSlinky.acmeClient.rfc8555Mod.DnsChallenge
*/
trait Challenge extends js.Object

object Challenge {
  @scala.inline
  def HttpChallenge(
    status: pending | processing | valid | invalid,
    token: String,
    `type`: `http-01`,
    url: String,
    error: js.Object = null,
    validated: String = null
  ): Challenge = {
    val __obj = js.Dynamic.literal(status = status.asInstanceOf[js.Any], token = token.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (error != null) __obj.updateDynamic("error")(error.asInstanceOf[js.Any])
    if (validated != null) __obj.updateDynamic("validated")(validated.asInstanceOf[js.Any])
    __obj.asInstanceOf[Challenge]
  }
  @scala.inline
  def DnsChallenge(
    status: pending | processing | valid | invalid,
    token: String,
    `type`: `dns-01`,
    url: String,
    error: js.Object = null,
    validated: String = null
  ): Challenge = {
    val __obj = js.Dynamic.literal(status = status.asInstanceOf[js.Any], token = token.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (error != null) __obj.updateDynamic("error")(error.asInstanceOf[js.Any])
    if (validated != null) __obj.updateDynamic("validated")(validated.asInstanceOf[js.Any])
    __obj.asInstanceOf[Challenge]
  }
}

