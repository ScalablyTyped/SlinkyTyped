package typingsSlinky.maximMazurokGapiClientContaineranalysis.gapi.client.containeranalysis

import org.scalablytyped.runtime.TopLevel
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BatchCreateNotesRequest extends StObject {
  
  /** Required. The notes to create, the key is expected to be the note ID. Max allowed length is 1000. */
  var notes: js.UndefOr[
    /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in string ]: @maxim_mazurok/gapi.client.containeranalysis.gapi.client.containeranalysis.Note}
    */ typingsSlinky.maximMazurokGapiClientContaineranalysis.maximMazurokGapiClientContaineranalysisStrings.BatchCreateNotesRequest with TopLevel[js.Any]
  ] = js.native
}
object BatchCreateNotesRequest {
  
  @scala.inline
  def apply(): BatchCreateNotesRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BatchCreateNotesRequest]
  }
  
  @scala.inline
  implicit class BatchCreateNotesRequestMutableBuilder[Self <: BatchCreateNotesRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNotes(
      value: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ P in string ]: @maxim_mazurok/gapi.client.containeranalysis.gapi.client.containeranalysis.Note}
      */ typingsSlinky.maximMazurokGapiClientContaineranalysis.maximMazurokGapiClientContaineranalysisStrings.BatchCreateNotesRequest with TopLevel[js.Any]
    ): Self = StObject.set(x, "notes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNotesUndefined: Self = StObject.set(x, "notes", js.undefined)
  }
}
