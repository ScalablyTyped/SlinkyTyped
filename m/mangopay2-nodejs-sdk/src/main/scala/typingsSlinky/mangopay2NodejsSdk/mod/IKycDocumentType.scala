package typingsSlinky.mangopay2NodejsSdk.mod

import typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.ADDRESS_PROOF
import typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.ARTICLES_OF_ASSOCIATION
import typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.IDENTITY_PROOF
import typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.REGISTRATION_PROOF
import typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.SHAREHOLDER_DECLARATION
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IKycDocumentType extends js.Object {
  var AddressProof: ADDRESS_PROOF = js.native
  var ArticlesOfAssociation: ARTICLES_OF_ASSOCIATION = js.native
  var IdentityProof: IDENTITY_PROOF = js.native
  var RegistrationProof: REGISTRATION_PROOF = js.native
  var ShareholderDeclaration: SHAREHOLDER_DECLARATION = js.native
}

object IKycDocumentType {
  @scala.inline
  def apply(
    AddressProof: ADDRESS_PROOF,
    ArticlesOfAssociation: ARTICLES_OF_ASSOCIATION,
    IdentityProof: IDENTITY_PROOF,
    RegistrationProof: REGISTRATION_PROOF,
    ShareholderDeclaration: SHAREHOLDER_DECLARATION
  ): IKycDocumentType = {
    val __obj = js.Dynamic.literal(AddressProof = AddressProof.asInstanceOf[js.Any], ArticlesOfAssociation = ArticlesOfAssociation.asInstanceOf[js.Any], IdentityProof = IdentityProof.asInstanceOf[js.Any], RegistrationProof = RegistrationProof.asInstanceOf[js.Any], ShareholderDeclaration = ShareholderDeclaration.asInstanceOf[js.Any])
    __obj.asInstanceOf[IKycDocumentType]
  }
  @scala.inline
  implicit class IKycDocumentTypeOps[Self <: IKycDocumentType] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAddressProof(value: ADDRESS_PROOF): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AddressProof")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withArticlesOfAssociation(value: ARTICLES_OF_ASSOCIATION): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ArticlesOfAssociation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIdentityProof(value: IDENTITY_PROOF): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("IdentityProof")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRegistrationProof(value: REGISTRATION_PROOF): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RegistrationProof")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withShareholderDeclaration(value: SHAREHOLDER_DECLARATION): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ShareholderDeclaration")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

