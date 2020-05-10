package typingsSlinky.gapiClientSqladmin.gapi.client.sqladmin

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SslCertsCreateEphemeralRequest extends js.Object {
  /** PEM encoded public key to include in the signed certificate. */
  var public_key: js.UndefOr[String] = js.native
}

object SslCertsCreateEphemeralRequest {
  @scala.inline
  def apply(): SslCertsCreateEphemeralRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SslCertsCreateEphemeralRequest]
  }
  @scala.inline
  implicit class SslCertsCreateEphemeralRequestOps[Self <: SslCertsCreateEphemeralRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withPublic_key(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("public_key")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPublic_key: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("public_key")(js.undefined)
        ret
    }
  }
  
}

