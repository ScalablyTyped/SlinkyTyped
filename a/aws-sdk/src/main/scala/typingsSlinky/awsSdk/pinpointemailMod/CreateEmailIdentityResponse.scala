package typingsSlinky.awsSdk.pinpointemailMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreateEmailIdentityResponse extends StObject {
  
  /**
    * An object that contains information about the DKIM attributes for the identity. This object includes the tokens that you use to create the CNAME records that are required to complete the DKIM verification process.
    */
  var DkimAttributes: js.UndefOr[typingsSlinky.awsSdk.pinpointemailMod.DkimAttributes] = js.native
  
  /**
    * The email identity type.
    */
  var IdentityType: js.UndefOr[typingsSlinky.awsSdk.pinpointemailMod.IdentityType] = js.native
  
  /**
    * Specifies whether or not the identity is verified. In Amazon Pinpoint, you can only send email from verified email addresses or domains. For more information about verifying identities, see the Amazon Pinpoint User Guide.
    */
  var VerifiedForSendingStatus: js.UndefOr[Enabled] = js.native
}
object CreateEmailIdentityResponse {
  
  @scala.inline
  def apply(): CreateEmailIdentityResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateEmailIdentityResponse]
  }
  
  @scala.inline
  implicit class CreateEmailIdentityResponseMutableBuilder[Self <: CreateEmailIdentityResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDkimAttributes(value: DkimAttributes): Self = StObject.set(x, "DkimAttributes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDkimAttributesUndefined: Self = StObject.set(x, "DkimAttributes", js.undefined)
    
    @scala.inline
    def setIdentityType(value: IdentityType): Self = StObject.set(x, "IdentityType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdentityTypeUndefined: Self = StObject.set(x, "IdentityType", js.undefined)
    
    @scala.inline
    def setVerifiedForSendingStatus(value: Enabled): Self = StObject.set(x, "VerifiedForSendingStatus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVerifiedForSendingStatusUndefined: Self = StObject.set(x, "VerifiedForSendingStatus", js.undefined)
  }
}
