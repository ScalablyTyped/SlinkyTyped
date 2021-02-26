package typingsSlinky.docusignEsign.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SignatureType extends StObject {
  
  /**
    * When **true**, the signature type is the default type.
    */
  var isDefault: js.UndefOr[String] = js.native
  
  /**
    * The type of signature. Valid values are:
    *
    * - `electronic`: Indicates an **electronic** signature that is used by common law countries such as the United States, United Kingdom, and Australia.
    * This is the default signature type that DocuSign uses.
    * - `universal`: Indicates a **digital** signature that is accepted by both common law and civil law countries. To use digital signatures,
    * you must use the [DocuSign Signature Appliance](https://developers.docusign.com/dsa-api).
    *
    * For more information, see [Standards Based Signatures](https://developers.docusign.com/esign-rest-api/guides/standards-based-signatures).
    */
  var `type`: js.UndefOr[String] = js.native
}
object SignatureType {
  
  @scala.inline
  def apply(): SignatureType = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SignatureType]
  }
  
  @scala.inline
  implicit class SignatureTypeMutableBuilder[Self <: SignatureType] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setIsDefault(value: String): Self = StObject.set(x, "isDefault", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsDefaultUndefined: Self = StObject.set(x, "isDefault", js.undefined)
    
    @scala.inline
    def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
