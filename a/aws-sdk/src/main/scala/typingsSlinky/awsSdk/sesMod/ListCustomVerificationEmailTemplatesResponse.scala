package typingsSlinky.awsSdk.sesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListCustomVerificationEmailTemplatesResponse extends StObject {
  
  /**
    * A list of the custom verification email templates that exist in your account.
    */
  var CustomVerificationEmailTemplates: js.UndefOr[typingsSlinky.awsSdk.sesMod.CustomVerificationEmailTemplates] = js.native
  
  /**
    * A token indicating that there are additional custom verification email templates available to be listed. Pass this token to a subsequent call to ListTemplates to retrieve the next 50 custom verification email templates.
    */
  var NextToken: js.UndefOr[typingsSlinky.awsSdk.sesMod.NextToken] = js.native
}
object ListCustomVerificationEmailTemplatesResponse {
  
  @scala.inline
  def apply(): ListCustomVerificationEmailTemplatesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListCustomVerificationEmailTemplatesResponse]
  }
  
  @scala.inline
  implicit class ListCustomVerificationEmailTemplatesResponseMutableBuilder[Self <: ListCustomVerificationEmailTemplatesResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCustomVerificationEmailTemplates(value: CustomVerificationEmailTemplates): Self = StObject.set(x, "CustomVerificationEmailTemplates", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCustomVerificationEmailTemplatesUndefined: Self = StObject.set(x, "CustomVerificationEmailTemplates", js.undefined)
    
    @scala.inline
    def setCustomVerificationEmailTemplatesVarargs(value: CustomVerificationEmailTemplate*): Self = StObject.set(x, "CustomVerificationEmailTemplates", js.Array(value :_*))
    
    @scala.inline
    def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
