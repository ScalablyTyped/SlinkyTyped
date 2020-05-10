package typingsSlinky.googleapis.containeranalysisV1alpha1Mod.containeranalysisV1alpha1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Message encapsulating build provenance details.
  */
@js.native
trait SchemaBuildDetails extends js.Object {
  /**
    * The actual provenance
    */
  var provenance: js.UndefOr[SchemaBuildProvenance] = js.native
  /**
    * Serialized JSON representation of the provenance, used in generating the
    * `BuildSignature` in the corresponding Result. After verifying the
    * signature, `provenance_bytes` can be unmarshalled and compared to the
    * provenance to confirm that it is unchanged. A base64-encoded string
    * representation of the provenance bytes is used for the signature in order
    * to interoperate with openssl which expects this format for signature
    * verification.  The serialized form is captured both to avoid ambiguity in
    * how the provenance is marshalled to json as well to prevent
    * incompatibilities with future changes.
    */
  var provenanceBytes: js.UndefOr[String] = js.native
}

object SchemaBuildDetails {
  @scala.inline
  def apply(): SchemaBuildDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaBuildDetails]
  }
  @scala.inline
  implicit class SchemaBuildDetailsOps[Self <: SchemaBuildDetails] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withProvenance(value: SchemaBuildProvenance): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("provenance")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutProvenance: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("provenance")(js.undefined)
        ret
    }
    @scala.inline
    def withProvenanceBytes(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("provenanceBytes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutProvenanceBytes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("provenanceBytes")(js.undefined)
        ret
    }
  }
  
}

