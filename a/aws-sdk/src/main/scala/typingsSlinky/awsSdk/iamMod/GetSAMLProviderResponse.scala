package typingsSlinky.awsSdk.iamMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetSAMLProviderResponse extends js.Object {
  /**
    * The date and time when the SAML provider was created.
    */
  var CreateDate: js.UndefOr[js.Date] = js.native
  /**
    * The XML metadata document that includes information about an identity provider.
    */
  var SAMLMetadataDocument: js.UndefOr[SAMLMetadataDocumentType] = js.native
  /**
    * The expiration date and time for the SAML provider.
    */
  var ValidUntil: js.UndefOr[js.Date] = js.native
}

object GetSAMLProviderResponse {
  @scala.inline
  def apply(): GetSAMLProviderResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetSAMLProviderResponse]
  }
  @scala.inline
  implicit class GetSAMLProviderResponseOps[Self <: GetSAMLProviderResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCreateDate(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CreateDate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCreateDate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CreateDate")(js.undefined)
        ret
    }
    @scala.inline
    def withSAMLMetadataDocument(value: SAMLMetadataDocumentType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SAMLMetadataDocument")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSAMLMetadataDocument: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SAMLMetadataDocument")(js.undefined)
        ret
    }
    @scala.inline
    def withValidUntil(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ValidUntil")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutValidUntil: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ValidUntil")(js.undefined)
        ret
    }
  }
  
}

