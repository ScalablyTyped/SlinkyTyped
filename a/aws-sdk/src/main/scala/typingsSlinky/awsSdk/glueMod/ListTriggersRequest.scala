package typingsSlinky.awsSdk.glueMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListTriggersRequest extends StObject {
  
  /**
    *  The name of the job for which to retrieve triggers. The trigger that can start this job is returned. If there is no such trigger, all triggers are returned.
    */
  var DependentJobName: js.UndefOr[NameString] = js.native
  
  /**
    * The maximum size of a list to return.
    */
  var MaxResults: js.UndefOr[PageSize] = js.native
  
  /**
    * A continuation token, if this is a continuation request.
    */
  var NextToken: js.UndefOr[GenericString] = js.native
  
  /**
    * Specifies to return only these tagged resources.
    */
  var Tags: js.UndefOr[TagsMap] = js.native
}
object ListTriggersRequest {
  
  @scala.inline
  def apply(): ListTriggersRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListTriggersRequest]
  }
  
  @scala.inline
  implicit class ListTriggersRequestMutableBuilder[Self <: ListTriggersRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDependentJobName(value: NameString): Self = StObject.set(x, "DependentJobName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDependentJobNameUndefined: Self = StObject.set(x, "DependentJobName", js.undefined)
    
    @scala.inline
    def setMaxResults(value: PageSize): Self = StObject.set(x, "MaxResults", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxResultsUndefined: Self = StObject.set(x, "MaxResults", js.undefined)
    
    @scala.inline
    def setNextToken(value: GenericString): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    @scala.inline
    def setTags(value: TagsMap): Self = StObject.set(x, "Tags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTagsUndefined: Self = StObject.set(x, "Tags", js.undefined)
  }
}
