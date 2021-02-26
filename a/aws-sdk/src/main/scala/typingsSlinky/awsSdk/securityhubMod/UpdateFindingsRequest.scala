package typingsSlinky.awsSdk.securityhubMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UpdateFindingsRequest extends StObject {
  
  /**
    * A collection of attributes that specify which findings you want to update.
    */
  var Filters: AwsSecurityFindingFilters = js.native
  
  /**
    * The updated note for the finding.
    */
  var Note: js.UndefOr[NoteUpdate] = js.native
  
  /**
    * The updated record state for the finding.
    */
  var RecordState: js.UndefOr[typingsSlinky.awsSdk.securityhubMod.RecordState] = js.native
}
object UpdateFindingsRequest {
  
  @scala.inline
  def apply(Filters: AwsSecurityFindingFilters): UpdateFindingsRequest = {
    val __obj = js.Dynamic.literal(Filters = Filters.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateFindingsRequest]
  }
  
  @scala.inline
  implicit class UpdateFindingsRequestMutableBuilder[Self <: UpdateFindingsRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFilters(value: AwsSecurityFindingFilters): Self = StObject.set(x, "Filters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNote(value: NoteUpdate): Self = StObject.set(x, "Note", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNoteUndefined: Self = StObject.set(x, "Note", js.undefined)
    
    @scala.inline
    def setRecordState(value: RecordState): Self = StObject.set(x, "RecordState", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRecordStateUndefined: Self = StObject.set(x, "RecordState", js.undefined)
  }
}
