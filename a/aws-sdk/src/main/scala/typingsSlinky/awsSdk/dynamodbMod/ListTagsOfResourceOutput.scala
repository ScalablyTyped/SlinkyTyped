package typingsSlinky.awsSdk.dynamodbMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListTagsOfResourceOutput extends StObject {
  
  /**
    * If this value is returned, there are additional results to be displayed. To retrieve them, call ListTagsOfResource again, with NextToken set to this value.
    */
  var NextToken: js.UndefOr[NextTokenString] = js.native
  
  /**
    * The tags currently associated with the Amazon DynamoDB resource.
    */
  var Tags: js.UndefOr[TagList] = js.native
}
object ListTagsOfResourceOutput {
  
  @scala.inline
  def apply(): ListTagsOfResourceOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListTagsOfResourceOutput]
  }
  
  @scala.inline
  implicit class ListTagsOfResourceOutputMutableBuilder[Self <: ListTagsOfResourceOutput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNextToken(value: NextTokenString): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
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
