package typingsSlinky.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ClientCertificateRevocationListStatus extends js.Object {
  /**
    * The state of the client certificate revocation list.
    */
  var Code: js.UndefOr[ClientCertificateRevocationListStatusCode] = js.native
  /**
    * A message about the status of the client certificate revocation list, if applicable.
    */
  var Message: js.UndefOr[String] = js.native
}

object ClientCertificateRevocationListStatus {
  @scala.inline
  def apply(): ClientCertificateRevocationListStatus = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ClientCertificateRevocationListStatus]
  }
  @scala.inline
  implicit class ClientCertificateRevocationListStatusOps[Self <: ClientCertificateRevocationListStatus] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCode(value: ClientCertificateRevocationListStatusCode): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Code")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Code")(js.undefined)
        ret
    }
    @scala.inline
    def withMessage(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Message")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMessage: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Message")(js.undefined)
        ret
    }
  }
  
}

