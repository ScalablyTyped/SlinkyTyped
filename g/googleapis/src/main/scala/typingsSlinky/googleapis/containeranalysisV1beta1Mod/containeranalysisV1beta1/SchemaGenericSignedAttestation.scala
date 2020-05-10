package typingsSlinky.googleapis.containeranalysisV1beta1Mod.containeranalysisV1beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * An attestation wrapper that uses the Grafeas `Signature` message. This
  * attestation must define the `serialized_payload` that the `signatures`
  * verify and any metadata necessary to interpret that plaintext.  The
  * signatures should always be over the `serialized_payload` bytestring.
  */
@js.native
trait SchemaGenericSignedAttestation extends js.Object {
  /**
    * Type (for example schema) of the attestation payload that was signed. The
    * verifier must ensure that the provided type is one that the verifier
    * supports, and that the attestation payload is a valid instantiation of
    * that type (for example by validating a JSON schema).
    */
  var contentType: js.UndefOr[String] = js.native
  /**
    * The serialized payload that is verified by one or more `signatures`. The
    * encoding and semantic meaning of this payload must match what is set in
    * `content_type`.
    */
  var serializedPayload: js.UndefOr[String] = js.native
  /**
    * One or more signatures over `serialized_payload`.  Verifier
    * implementations should consider this attestation message verified if at
    * least one `signature` verifies `serialized_payload`.  See `Signature` in
    * common.proto for more details on signature structure and verification.
    */
  var signatures: js.UndefOr[js.Array[SchemaSignature]] = js.native
}

object SchemaGenericSignedAttestation {
  @scala.inline
  def apply(): SchemaGenericSignedAttestation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGenericSignedAttestation]
  }
  @scala.inline
  implicit class SchemaGenericSignedAttestationOps[Self <: SchemaGenericSignedAttestation] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withContentType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contentType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutContentType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contentType")(js.undefined)
        ret
    }
    @scala.inline
    def withSerializedPayload(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("serializedPayload")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSerializedPayload: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("serializedPayload")(js.undefined)
        ret
    }
    @scala.inline
    def withSignatures(value: js.Array[SchemaSignature]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("signatures")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSignatures: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("signatures")(js.undefined)
        ret
    }
  }
  
}

