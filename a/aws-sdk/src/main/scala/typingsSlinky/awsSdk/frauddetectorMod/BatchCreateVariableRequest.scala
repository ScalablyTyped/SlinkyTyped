package typingsSlinky.awsSdk.frauddetectorMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BatchCreateVariableRequest extends StObject {
  
  /**
    * A collection of key and value pairs.
    */
  var tags: js.UndefOr[tagList] = js.native
  
  /**
    * The list of variables for the batch create variable request.
    */
  var variableEntries: VariableEntryList = js.native
}
object BatchCreateVariableRequest {
  
  @scala.inline
  def apply(variableEntries: VariableEntryList): BatchCreateVariableRequest = {
    val __obj = js.Dynamic.literal(variableEntries = variableEntries.asInstanceOf[js.Any])
    __obj.asInstanceOf[BatchCreateVariableRequest]
  }
  
  @scala.inline
  implicit class BatchCreateVariableRequestMutableBuilder[Self <: BatchCreateVariableRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setTags(value: tagList): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
    
    @scala.inline
    def setTagsVarargs(value: Tag*): Self = StObject.set(x, "tags", js.Array(value :_*))
    
    @scala.inline
    def setVariableEntries(value: VariableEntryList): Self = StObject.set(x, "variableEntries", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVariableEntriesVarargs(value: VariableEntry*): Self = StObject.set(x, "variableEntries", js.Array(value :_*))
  }
}
