package typingsSlinky.awsSdk.sesv2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreateEmailIdentityRequest extends StObject {
  
  /**
    * If your request includes this object, Amazon SES configures the identity to use Bring Your Own DKIM (BYODKIM) for DKIM authentication purposes, as opposed to the default method, Easy DKIM. You can only specify this object if the email identity is a domain, as opposed to an address.
    */
  var DkimSigningAttributes: js.UndefOr[typingsSlinky.awsSdk.sesv2Mod.DkimSigningAttributes] = js.native
  
  /**
    * The email address or domain that you want to verify.
    */
  var EmailIdentity: Identity = js.native
  
  /**
    * An array of objects that define the tags (keys and values) that you want to associate with the email identity.
    */
  var Tags: js.UndefOr[TagList] = js.native
}
object CreateEmailIdentityRequest {
  
  @scala.inline
  def apply(EmailIdentity: Identity): CreateEmailIdentityRequest = {
    val __obj = js.Dynamic.literal(EmailIdentity = EmailIdentity.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateEmailIdentityRequest]
  }
  
  @scala.inline
  implicit class CreateEmailIdentityRequestMutableBuilder[Self <: CreateEmailIdentityRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDkimSigningAttributes(value: DkimSigningAttributes): Self = StObject.set(x, "DkimSigningAttributes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDkimSigningAttributesUndefined: Self = StObject.set(x, "DkimSigningAttributes", js.undefined)
    
    @scala.inline
    def setEmailIdentity(value: Identity): Self = StObject.set(x, "EmailIdentity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTags(value: TagList): Self = StObject.set(x, "Tags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTagsUndefined: Self = StObject.set(x, "Tags", js.undefined)
    
    @scala.inline
    def setTagsVarargs(value: Tag*): Self = StObject.set(x, "Tags", js.Array(value :_*))
  }
}
