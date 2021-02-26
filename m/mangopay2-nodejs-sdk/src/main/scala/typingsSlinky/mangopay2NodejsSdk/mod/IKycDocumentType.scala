package typingsSlinky.mangopay2NodejsSdk.mod

import typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.ADDRESS_PROOF
import typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.ARTICLES_OF_ASSOCIATION
import typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.IDENTITY_PROOF
import typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.REGISTRATION_PROOF
import typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.SHAREHOLDER_DECLARATION
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IKycDocumentType extends StObject {
  
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
  implicit class IKycDocumentTypeMutableBuilder[Self <: IKycDocumentType] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAddressProof(value: ADDRESS_PROOF): Self = StObject.set(x, "AddressProof", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setArticlesOfAssociation(value: ARTICLES_OF_ASSOCIATION): Self = StObject.set(x, "ArticlesOfAssociation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdentityProof(value: IDENTITY_PROOF): Self = StObject.set(x, "IdentityProof", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRegistrationProof(value: REGISTRATION_PROOF): Self = StObject.set(x, "RegistrationProof", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShareholderDeclaration(value: SHAREHOLDER_DECLARATION): Self = StObject.set(x, "ShareholderDeclaration", value.asInstanceOf[js.Any])
  }
}
