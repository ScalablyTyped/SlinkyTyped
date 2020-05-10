package typingsSlinky.awsSdk.apigatewayv2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TlsConfigInput extends js.Object {
  /**
    * If you specify a server name, API Gateway uses it to verify the hostname on the integration's certificate. The server name is also included in the TLS handshake to support Server Name Indication (SNI) or virtual hosting.
    */
  var ServerNameToVerify: js.UndefOr[StringWithLengthBetween1And512] = js.native
}

object TlsConfigInput {
  @scala.inline
  def apply(): TlsConfigInput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TlsConfigInput]
  }
  @scala.inline
  implicit class TlsConfigInputOps[Self <: TlsConfigInput] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withServerNameToVerify(value: StringWithLengthBetween1And512): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ServerNameToVerify")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutServerNameToVerify: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ServerNameToVerify")(js.undefined)
        ret
    }
  }
  
}

