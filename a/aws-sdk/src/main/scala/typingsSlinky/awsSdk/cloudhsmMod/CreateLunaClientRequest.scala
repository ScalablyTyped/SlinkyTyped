package typingsSlinky.awsSdk.cloudhsmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateLunaClientRequest extends js.Object {
  /**
    * The contents of a Base64-Encoded X.509 v3 certificate to be installed on the HSMs used by this client.
    */
  var Certificate: typingsSlinky.awsSdk.cloudhsmMod.Certificate = js.native
  /**
    * The label for the client.
    */
  var Label: js.UndefOr[ClientLabel] = js.native
}

object CreateLunaClientRequest {
  @scala.inline
  def apply(Certificate: Certificate): CreateLunaClientRequest = {
    val __obj = js.Dynamic.literal(Certificate = Certificate.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateLunaClientRequest]
  }
  @scala.inline
  implicit class CreateLunaClientRequestOps[Self <: CreateLunaClientRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCertificate(value: Certificate): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Certificate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLabel(value: ClientLabel): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Label")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLabel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Label")(js.undefined)
        ret
    }
  }
  
}

