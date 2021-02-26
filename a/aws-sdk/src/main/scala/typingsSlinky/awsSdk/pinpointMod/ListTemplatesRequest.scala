package typingsSlinky.awsSdk.pinpointMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListTemplatesRequest extends StObject {
  
  /**
    * The  string that specifies which page of results to return in a paginated response. This parameter is not supported for application, campaign, and journey metrics.
    */
  var NextToken: js.UndefOr[string] = js.native
  
  /**
    * The maximum number of items to include in each page of a paginated response. This parameter is not supported for application, campaign, and journey metrics.
    */
  var PageSize: js.UndefOr[string] = js.native
  
  /**
    * The substring to match in the names of the message templates to include in the results. If you specify this value, Amazon Pinpoint returns only those templates whose names begin with the value that you specify.
    */
  var Prefix: js.UndefOr[string] = js.native
  
  /**
    * The type of message template to include in the results. Valid values are: EMAIL, PUSH, SMS, and VOICE. To include all types of templates in the results, don't include this parameter in your request.
    */
  var TemplateType: js.UndefOr[string] = js.native
}
object ListTemplatesRequest {
  
  @scala.inline
  def apply(): ListTemplatesRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListTemplatesRequest]
  }
  
  @scala.inline
  implicit class ListTemplatesRequestMutableBuilder[Self <: ListTemplatesRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNextToken(value: string): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    @scala.inline
    def setPageSize(value: string): Self = StObject.set(x, "PageSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPageSizeUndefined: Self = StObject.set(x, "PageSize", js.undefined)
    
    @scala.inline
    def setPrefix(value: string): Self = StObject.set(x, "Prefix", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPrefixUndefined: Self = StObject.set(x, "Prefix", js.undefined)
    
    @scala.inline
    def setTemplateType(value: string): Self = StObject.set(x, "TemplateType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTemplateTypeUndefined: Self = StObject.set(x, "TemplateType", js.undefined)
  }
}
