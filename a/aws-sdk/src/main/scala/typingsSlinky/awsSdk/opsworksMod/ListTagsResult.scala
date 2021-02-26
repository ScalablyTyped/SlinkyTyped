package typingsSlinky.awsSdk.opsworksMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListTagsResult extends StObject {
  
  /**
    * If a paginated request does not return all of the remaining results, this parameter is set to a token that you can assign to the request object's NextToken parameter to get the next set of results. If the previous paginated request returned all of the remaining results, this parameter is set to null. 
    */
  var NextToken: js.UndefOr[typingsSlinky.awsSdk.opsworksMod.NextToken] = js.native
  
  /**
    * A set of key-value pairs that contain tag keys and tag values that are attached to a stack or layer.
    */
  var Tags: js.UndefOr[typingsSlinky.awsSdk.opsworksMod.Tags] = js.native
}
object ListTagsResult {
  
  @scala.inline
  def apply(): ListTagsResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListTagsResult]
  }
  
  @scala.inline
  implicit class ListTagsResultMutableBuilder[Self <: ListTagsResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    @scala.inline
    def setTags(value: Tags): Self = StObject.set(x, "Tags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTagsUndefined: Self = StObject.set(x, "Tags", js.undefined)
  }
}
