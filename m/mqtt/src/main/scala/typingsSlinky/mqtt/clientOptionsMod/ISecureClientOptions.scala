package typingsSlinky.mqtt.clientOptionsMod

import typingsSlinky.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ISecureClientOptions extends js.Object {
  /**
    * Optionally override the trusted CA certificates in PEM format
    */
  var ca: js.UndefOr[String | (js.Array[Buffer | String]) | Buffer] = js.native
  /**
    * optional cert chains in PEM format
    */
  var cert: js.UndefOr[String | (js.Array[Buffer | String]) | Buffer] = js.native
  /**
    * optional private keys in PEM format
    */
  var key: js.UndefOr[String | (js.Array[Buffer | js.Object | String]) | Buffer] = js.native
  var rejectUnauthorized: js.UndefOr[Boolean] = js.native
}

object ISecureClientOptions {
  @scala.inline
  def apply(): ISecureClientOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ISecureClientOptions]
  }
  @scala.inline
  implicit class ISecureClientOptionsOps[Self <: ISecureClientOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCa(value: String | (js.Array[Buffer | String]) | Buffer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ca")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCa: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ca")(js.undefined)
        ret
    }
    @scala.inline
    def withCert(value: String | (js.Array[Buffer | String]) | Buffer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cert")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCert: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cert")(js.undefined)
        ret
    }
    @scala.inline
    def withKey(value: String | (js.Array[Buffer | js.Object | String]) | Buffer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("key")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutKey: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("key")(js.undefined)
        ret
    }
    @scala.inline
    def withRejectUnauthorized(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rejectUnauthorized")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRejectUnauthorized: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rejectUnauthorized")(js.undefined)
        ret
    }
  }
  
}

