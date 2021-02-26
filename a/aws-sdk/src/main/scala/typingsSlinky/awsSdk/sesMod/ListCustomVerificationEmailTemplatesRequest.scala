package typingsSlinky.awsSdk.sesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListCustomVerificationEmailTemplatesRequest extends StObject {
  
  /**
    * The maximum number of custom verification email templates to return. This value must be at least 1 and less than or equal to 50. If you do not specify a value, or if you specify a value less than 1 or greater than 50, the operation will return up to 50 results.
    */
  var MaxResults: js.UndefOr[typingsSlinky.awsSdk.sesMod.MaxResults] = js.native
  
  /**
    * An array the contains the name and creation time stamp for each template in your Amazon SES account.
    */
  var NextToken: js.UndefOr[typingsSlinky.awsSdk.sesMod.NextToken] = js.native
}
object ListCustomVerificationEmailTemplatesRequest {
  
  @scala.inline
  def apply(): ListCustomVerificationEmailTemplatesRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListCustomVerificationEmailTemplatesRequest]
  }
  
  @scala.inline
  implicit class ListCustomVerificationEmailTemplatesRequestMutableBuilder[Self <: ListCustomVerificationEmailTemplatesRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMaxResults(value: MaxResults): Self = StObject.set(x, "MaxResults", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxResultsUndefined: Self = StObject.set(x, "MaxResults", js.undefined)
    
    @scala.inline
    def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
