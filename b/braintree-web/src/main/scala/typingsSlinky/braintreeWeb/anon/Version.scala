package typingsSlinky.braintreeWeb.anon

import typingsSlinky.braintreeWeb.braintreeWebNumbers.`1`
import typingsSlinky.braintreeWeb.braintreeWebNumbers.`2`
import typingsSlinky.braintreeWeb.braintreeWebStrings.`2-bootstrap3-modal`
import typingsSlinky.braintreeWeb.braintreeWebStrings.`2-inline-iframe`
import typingsSlinky.braintreeWeb.mod.Client_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Version extends js.Object {
  var authorization: js.UndefOr[String] = js.native
  var client: js.UndefOr[Client_] = js.native
  var version: js.UndefOr[
    `1` | typingsSlinky.braintreeWeb.braintreeWebStrings.`1` | `2` | typingsSlinky.braintreeWeb.braintreeWebStrings.`2` | `2-bootstrap3-modal` | `2-inline-iframe`
  ] = js.native
}

object Version {
  @scala.inline
  def apply(): Version = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Version]
  }
  @scala.inline
  implicit class VersionOps[Self <: Version] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAuthorization(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("authorization")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAuthorization: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("authorization")(js.undefined)
        ret
    }
    @scala.inline
    def withClient(value: Client_): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("client")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutClient: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("client")(js.undefined)
        ret
    }
    @scala.inline
    def withVersion(
      value: `1` | typingsSlinky.braintreeWeb.braintreeWebStrings.`1` | `2` | typingsSlinky.braintreeWeb.braintreeWebStrings.`2` | `2-bootstrap3-modal` | `2-inline-iframe`
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("version")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVersion: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("version")(js.undefined)
        ret
    }
  }
  
}

