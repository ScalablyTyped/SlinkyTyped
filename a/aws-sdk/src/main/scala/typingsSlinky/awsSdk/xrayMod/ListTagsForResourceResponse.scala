package typingsSlinky.awsSdk.xrayMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListTagsForResourceResponse extends StObject {
  
  /**
    * A pagination token. If multiple pages of results are returned, use the NextToken value returned with the current page of results to get the next page of results.
    */
  var NextToken: js.UndefOr[String] = js.native
  
  /**
    * A list of tags, as key and value pairs, that is associated with the specified X-Ray group or sampling rule.
    */
  var Tags: js.UndefOr[TagList] = js.native
}
object ListTagsForResourceResponse {
  
  @scala.inline
  def apply(): ListTagsForResourceResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListTagsForResourceResponse]
  }
  
  @scala.inline
  implicit class ListTagsForResourceResponseMutableBuilder[Self <: ListTagsForResourceResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNextToken(value: String): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    @scala.inline
    def setTags(value: TagList): Self = StObject.set(x, "Tags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTagsUndefined: Self = StObject.set(x, "Tags", js.undefined)
    
    @scala.inline
    def setTagsVarargs(value: Tag*): Self = StObject.set(x, "Tags", js.Array(value :_*))
  }
}
