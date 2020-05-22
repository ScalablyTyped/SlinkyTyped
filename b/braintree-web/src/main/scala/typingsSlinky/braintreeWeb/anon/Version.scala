package typingsSlinky.braintreeWeb.anon

import typingsSlinky.braintreeWeb.braintreeWebNumbers.`1`
import typingsSlinky.braintreeWeb.braintreeWebNumbers.`2`
import typingsSlinky.braintreeWeb.braintreeWebStrings.`2-bootstrap3-modal`
import typingsSlinky.braintreeWeb.braintreeWebStrings.`2-inline-iframe`
import typingsSlinky.braintreeWeb.mod.Client_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Version extends js.Object {
  var authorization: js.UndefOr[String] = js.undefined
  var client: js.UndefOr[Client_] = js.undefined
  var version: js.UndefOr[
    `1` | typingsSlinky.braintreeWeb.braintreeWebStrings.`1` | `2` | typingsSlinky.braintreeWeb.braintreeWebStrings.`2` | `2-bootstrap3-modal` | `2-inline-iframe`
  ] = js.undefined
}

object Version {
  @scala.inline
  def apply(
    authorization: String = null,
    client: Client_ = null,
    version: `1` | typingsSlinky.braintreeWeb.braintreeWebStrings.`1` | `2` | typingsSlinky.braintreeWeb.braintreeWebStrings.`2` | `2-bootstrap3-modal` | `2-inline-iframe` = null
  ): Version = {
    val __obj = js.Dynamic.literal()
    if (authorization != null) __obj.updateDynamic("authorization")(authorization.asInstanceOf[js.Any])
    if (client != null) __obj.updateDynamic("client")(client.asInstanceOf[js.Any])
    if (version != null) __obj.updateDynamic("version")(version.asInstanceOf[js.Any])
    __obj.asInstanceOf[Version]
  }
}

