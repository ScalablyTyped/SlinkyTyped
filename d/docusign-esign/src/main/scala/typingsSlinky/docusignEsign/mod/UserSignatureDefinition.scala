package typingsSlinky.docusignEsign.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UserSignatureDefinition extends StObject {
  
  /**
    * Specifies the area in which a date stamp is placed. This parameter uses pixel positioning to draw a rectangle at the center of the stamp area.
    * The stamp is superimposed on top of this central area.
    *
    * This property contains the following information about the central rectangle:
    *
    * - `DateAreaX`: The X axis position of the top-left corner.
    * - `DateAreaY`: The Y axis position of the top-left corner.
    * - `DateAreaWidth`: The width of the rectangle.
    * - `DateAreaHeight`: The height of the rectangle.
    */
  var dateStampProperties: js.UndefOr[DateStampProperties] = js.native
  
  /**
    * When set to **true**, users may not resize the stamp.
    */
  var disallowUserResizeStamp: js.UndefOr[String] = js.native
  
  /**
    * Optionally specify an external identifier for the user's signature.
    */
  var externalID: js.UndefOr[String] = js.native
  
  /**
    * Specificies the type of image. Valid values are:
    *
    * - `signature_image`
    * - `initials_image`
    */
  var imageType: js.UndefOr[String] = js.native
  
  /**
    * Boolean that specifies whether the signature is the default signature for the user.
    */
  var isDefault: js.UndefOr[String] = js.native
  
  /**
    * The National Association of Realtors (NAR) membership ID for a user who is a realtor.
    */
  var nrdsId: js.UndefOr[String] = js.native
  
  /**
    * The realtor's last name.
    */
  var nrdsLastName: js.UndefOr[String] = js.native
  
  /**
    * The phonetic spelling of the `signatureName`.
    */
  var phoneticName: js.UndefOr[String] = js.native
  
  /**
    * The font to use for the signature.
    */
  var signatureFont: js.UndefOr[String] = js.native
  
  /**
    * Specifies the signature ID associated with the signature name. You can use the signature ID in the URI in place of the signature name,
    * and the value stored in the `signatureName` property in the body is used. This allows the use of special characters (such as "&", "<", ">") in a the signature name.
    * Note that with each update to signatures, the returned signature ID might change, so the caller will need to trigger off the signature name to get the new signature ID.
    */
  var signatureId: js.UndefOr[String] = js.native
  
  /**
    * Specifies the user's signature in initials format.
    */
  var signatureInitials: js.UndefOr[String] = js.native
  
  /**
    * Specifies the user's signature name.
    */
  var signatureName: js.UndefOr[String] = js.native
  
  /**
    * The format of a stamp. Valid values are:
    *
    * - `NameHanko`: The stamp represents only the signer's name.
    * - `NameDateHanko`: The stamp represents the signer's name and the date.
    */
  var stampFormat: js.UndefOr[String] = js.native
  
  /**
    * The physical height of the stamp image (in millimeters) that the stamp vendor recommends for displaying the image in PDF documents.
    */
  var stampSizeMM: js.UndefOr[String] = js.native
}
object UserSignatureDefinition {
  
  @scala.inline
  def apply(): UserSignatureDefinition = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UserSignatureDefinition]
  }
  
  @scala.inline
  implicit class UserSignatureDefinitionMutableBuilder[Self <: UserSignatureDefinition] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDateStampProperties(value: DateStampProperties): Self = StObject.set(x, "dateStampProperties", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDateStampPropertiesUndefined: Self = StObject.set(x, "dateStampProperties", js.undefined)
    
    @scala.inline
    def setDisallowUserResizeStamp(value: String): Self = StObject.set(x, "disallowUserResizeStamp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisallowUserResizeStampUndefined: Self = StObject.set(x, "disallowUserResizeStamp", js.undefined)
    
    @scala.inline
    def setExternalID(value: String): Self = StObject.set(x, "externalID", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExternalIDUndefined: Self = StObject.set(x, "externalID", js.undefined)
    
    @scala.inline
    def setImageType(value: String): Self = StObject.set(x, "imageType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setImageTypeUndefined: Self = StObject.set(x, "imageType", js.undefined)
    
    @scala.inline
    def setIsDefault(value: String): Self = StObject.set(x, "isDefault", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsDefaultUndefined: Self = StObject.set(x, "isDefault", js.undefined)
    
    @scala.inline
    def setNrdsId(value: String): Self = StObject.set(x, "nrdsId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNrdsIdUndefined: Self = StObject.set(x, "nrdsId", js.undefined)
    
    @scala.inline
    def setNrdsLastName(value: String): Self = StObject.set(x, "nrdsLastName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNrdsLastNameUndefined: Self = StObject.set(x, "nrdsLastName", js.undefined)
    
    @scala.inline
    def setPhoneticName(value: String): Self = StObject.set(x, "phoneticName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPhoneticNameUndefined: Self = StObject.set(x, "phoneticName", js.undefined)
    
    @scala.inline
    def setSignatureFont(value: String): Self = StObject.set(x, "signatureFont", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSignatureFontUndefined: Self = StObject.set(x, "signatureFont", js.undefined)
    
    @scala.inline
    def setSignatureId(value: String): Self = StObject.set(x, "signatureId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSignatureIdUndefined: Self = StObject.set(x, "signatureId", js.undefined)
    
    @scala.inline
    def setSignatureInitials(value: String): Self = StObject.set(x, "signatureInitials", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSignatureInitialsUndefined: Self = StObject.set(x, "signatureInitials", js.undefined)
    
    @scala.inline
    def setSignatureName(value: String): Self = StObject.set(x, "signatureName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSignatureNameUndefined: Self = StObject.set(x, "signatureName", js.undefined)
    
    @scala.inline
    def setStampFormat(value: String): Self = StObject.set(x, "stampFormat", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStampFormatUndefined: Self = StObject.set(x, "stampFormat", js.undefined)
    
    @scala.inline
    def setStampSizeMM(value: String): Self = StObject.set(x, "stampSizeMM", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStampSizeMMUndefined: Self = StObject.set(x, "stampSizeMM", js.undefined)
  }
}
