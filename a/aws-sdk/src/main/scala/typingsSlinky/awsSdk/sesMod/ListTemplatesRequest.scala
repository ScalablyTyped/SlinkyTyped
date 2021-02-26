package typingsSlinky.awsSdk.sesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListTemplatesRequest extends StObject {
  
  /**
    * The maximum number of templates to return. This value must be at least 1 and less than or equal to 10. If you do not specify a value, or if you specify a value less than 1 or greater than 10, the operation will return up to 10 results.
    */
  var MaxItems: js.UndefOr[typingsSlinky.awsSdk.sesMod.MaxItems] = js.native
  
  /**
    * A token returned from a previous call to ListTemplates to indicate the position in the list of email templates.
    */
  var NextToken: js.UndefOr[typingsSlinky.awsSdk.sesMod.NextToken] = js.native
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
    def setMaxItems(value: MaxItems): Self = StObject.set(x, "MaxItems", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxItemsUndefined: Self = StObject.set(x, "MaxItems", js.undefined)
    
    @scala.inline
    def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
