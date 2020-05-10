package typingsSlinky.googleapis.cloudkmsV1Mod.cloudkmsV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Contains an HSM-generated attestation about a key operation. For more
  * information, see [Verifying attestations]
  * (https://cloud.google.com/kms/docs/attest-key).
  */
@js.native
trait SchemaKeyOperationAttestation extends js.Object {
  /**
    * Output only. The attestation data provided by the HSM when the key
    * operation was performed.
    */
  var content: js.UndefOr[String] = js.native
  /**
    * Output only. The format of the attestation data.
    */
  var format: js.UndefOr[String] = js.native
}

object SchemaKeyOperationAttestation {
  @scala.inline
  def apply(): SchemaKeyOperationAttestation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaKeyOperationAttestation]
  }
  @scala.inline
  implicit class SchemaKeyOperationAttestationOps[Self <: SchemaKeyOperationAttestation] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withContent(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("content")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutContent: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("content")(js.undefined)
        ret
    }
    @scala.inline
    def withFormat(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("format")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFormat: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("format")(js.undefined)
        ret
    }
  }
  
}

