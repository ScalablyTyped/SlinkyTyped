package typingsSlinky.awsSdk.dataexchangeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetRevisionRequest extends StObject {
  
  /**
    * The unique identifier for a data set.
    */
  var DataSetId: string = js.native
  
  /**
    * The unique identifier for a revision.
    */
  var RevisionId: string = js.native
}
object GetRevisionRequest {
  
  @scala.inline
  def apply(DataSetId: string, RevisionId: string): GetRevisionRequest = {
    val __obj = js.Dynamic.literal(DataSetId = DataSetId.asInstanceOf[js.Any], RevisionId = RevisionId.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetRevisionRequest]
  }
  
  @scala.inline
  implicit class GetRevisionRequestMutableBuilder[Self <: GetRevisionRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDataSetId(value: string): Self = StObject.set(x, "DataSetId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRevisionId(value: string): Self = StObject.set(x, "RevisionId", value.asInstanceOf[js.Any])
  }
}
