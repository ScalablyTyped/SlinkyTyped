package typingsSlinky.awsSdk.qldbMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListJournalS3ExportsResponse extends StObject {
  
  /**
    * The array of journal export job descriptions for all ledgers that are associated with the current AWS account and Region.
    */
  var JournalS3Exports: js.UndefOr[JournalS3ExportList] = js.native
  
  /**
    *   If NextToken is empty, then the last page of results has been processed and there are no more results to be retrieved.   If NextToken is not empty, then there are more results available. To retrieve the next page of results, use the value of NextToken in a subsequent ListJournalS3Exports call.  
    */
  var NextToken: js.UndefOr[typingsSlinky.awsSdk.qldbMod.NextToken] = js.native
}
object ListJournalS3ExportsResponse {
  
  @scala.inline
  def apply(): ListJournalS3ExportsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListJournalS3ExportsResponse]
  }
  
  @scala.inline
  implicit class ListJournalS3ExportsResponseMutableBuilder[Self <: ListJournalS3ExportsResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setJournalS3Exports(value: JournalS3ExportList): Self = StObject.set(x, "JournalS3Exports", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setJournalS3ExportsUndefined: Self = StObject.set(x, "JournalS3Exports", js.undefined)
    
    @scala.inline
    def setJournalS3ExportsVarargs(value: JournalS3ExportDescription*): Self = StObject.set(x, "JournalS3Exports", js.Array(value :_*))
    
    @scala.inline
    def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
