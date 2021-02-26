package typingsSlinky.awsSdk.kendraMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IndexConfigurationSummary extends StObject {
  
  /**
    * The Unix timestamp when the index was created.
    */
  var CreatedAt: js.Date = js.native
  
  /**
    * Indicates whether the index is a enterprise edition index or a developer edition index. 
    */
  var Edition: js.UndefOr[IndexEdition] = js.native
  
  /**
    * A unique identifier for the index. Use this to identify the index when you are using operations such as Query, DescribeIndex, UpdateIndex, and DeleteIndex.
    */
  var Id: js.UndefOr[IndexId] = js.native
  
  /**
    * The name of the index.
    */
  var Name: js.UndefOr[IndexName] = js.native
  
  /**
    * The current status of the index. When the status is ACTIVE, the index is ready to search.
    */
  var Status: IndexStatus = js.native
  
  /**
    * The Unix timestamp when the index was last updated by the UpdateIndex operation.
    */
  var UpdatedAt: js.Date = js.native
}
object IndexConfigurationSummary {
  
  @scala.inline
  def apply(CreatedAt: js.Date, Status: IndexStatus, UpdatedAt: js.Date): IndexConfigurationSummary = {
    val __obj = js.Dynamic.literal(CreatedAt = CreatedAt.asInstanceOf[js.Any], Status = Status.asInstanceOf[js.Any], UpdatedAt = UpdatedAt.asInstanceOf[js.Any])
    __obj.asInstanceOf[IndexConfigurationSummary]
  }
  
  @scala.inline
  implicit class IndexConfigurationSummaryMutableBuilder[Self <: IndexConfigurationSummary] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCreatedAt(value: js.Date): Self = StObject.set(x, "CreatedAt", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEdition(value: IndexEdition): Self = StObject.set(x, "Edition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEditionUndefined: Self = StObject.set(x, "Edition", js.undefined)
    
    @scala.inline
    def setId(value: IndexId): Self = StObject.set(x, "Id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdUndefined: Self = StObject.set(x, "Id", js.undefined)
    
    @scala.inline
    def setName(value: IndexName): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "Name", js.undefined)
    
    @scala.inline
    def setStatus(value: IndexStatus): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUpdatedAt(value: js.Date): Self = StObject.set(x, "UpdatedAt", value.asInstanceOf[js.Any])
  }
}
