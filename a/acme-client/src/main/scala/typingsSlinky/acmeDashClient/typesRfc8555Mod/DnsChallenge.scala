package typingsSlinky.acmeDashClient.typesRfc8555Mod

import typingsSlinky.acmeDashClient.acmeDashClientStrings.`dns-01`
import typingsSlinky.acmeDashClient.acmeDashClientStrings.invalid
import typingsSlinky.acmeDashClient.acmeDashClientStrings.pending
import typingsSlinky.acmeDashClient.acmeDashClientStrings.processing
import typingsSlinky.acmeDashClient.acmeDashClientStrings.valid
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DnsChallenge
  extends ChallengeAbstract
     with Challenge {
  var token: String
  @JSName("type")
  var type_DnsChallenge: `dns-01`
}

object DnsChallenge {
  @scala.inline
  def apply(
    status: pending | processing | valid | invalid,
    token: String,
    `type`: `dns-01`,
    url: String,
    error: js.Object = null,
    validated: String = null
  ): DnsChallenge = {
    val __obj = js.Dynamic.literal(status = status.asInstanceOf[js.Any], token = token.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (error != null) __obj.updateDynamic("error")(error.asInstanceOf[js.Any])
    if (validated != null) __obj.updateDynamic("validated")(validated.asInstanceOf[js.Any])
    __obj.asInstanceOf[DnsChallenge]
  }
}

