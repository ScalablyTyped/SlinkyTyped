package typingsSlinky.docusignEsign.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EnvelopesInformation extends StObject {
  
  /**
    * A token returned by an earlier API call that you can use with a new call to resume a search query at the point where it left off.  This token system enhances the performance of the API.
    */
  var continuationToken: js.UndefOr[String] = js.native
  
  /**
    * The last index position in the result set.
    */
  var endPosition: js.UndefOr[String] = js.native
  
  /**
    * Array of envelope statuses and transaction IDs in the result set.
    */
  var envelopeTransactionStatuses: js.UndefOr[js.Array[EnvelopeTransactionStatus]] = js.native
  
  /**
    * Set of envelope information
    */
  var envelopes: js.UndefOr[js.Array[Envelope]] = js.native
  
  /**
    * A list of folder objects.
    */
  var folders: js.UndefOr[js.Array[/* This object contains details about a folder. */ Folder]] = js.native
  
  /**
    * The last time that a query was performed.
    */
  var lastQueriedDateTime: js.UndefOr[String] = js.native
  
  /**
    * The number of results in this response. Because you can filter which entries are included in the response, this value is always less than or equal to the `totalSetSize`.
    */
  var resultSetSize: js.UndefOr[String] = js.native
  
  /**
    * The starting index position of the current result set.
    */
  var startPosition: js.UndefOr[String] = js.native
  
  /**
    * The total number of items in the result set. This value is always greater than or equal to the value of `resultSetSize`.
    */
  var totalSetSize: js.UndefOr[String] = js.native
}
object EnvelopesInformation {
  
  @scala.inline
  def apply(): EnvelopesInformation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EnvelopesInformation]
  }
  
  @scala.inline
  implicit class EnvelopesInformationMutableBuilder[Self <: EnvelopesInformation] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setContinuationToken(value: String): Self = StObject.set(x, "continuationToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContinuationTokenUndefined: Self = StObject.set(x, "continuationToken", js.undefined)
    
    @scala.inline
    def setEndPosition(value: String): Self = StObject.set(x, "endPosition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEndPositionUndefined: Self = StObject.set(x, "endPosition", js.undefined)
    
    @scala.inline
    def setEnvelopeTransactionStatuses(value: js.Array[EnvelopeTransactionStatus]): Self = StObject.set(x, "envelopeTransactionStatuses", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnvelopeTransactionStatusesUndefined: Self = StObject.set(x, "envelopeTransactionStatuses", js.undefined)
    
    @scala.inline
    def setEnvelopeTransactionStatusesVarargs(value: EnvelopeTransactionStatus*): Self = StObject.set(x, "envelopeTransactionStatuses", js.Array(value :_*))
    
    @scala.inline
    def setEnvelopes(value: js.Array[Envelope]): Self = StObject.set(x, "envelopes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnvelopesUndefined: Self = StObject.set(x, "envelopes", js.undefined)
    
    @scala.inline
    def setEnvelopesVarargs(value: Envelope*): Self = StObject.set(x, "envelopes", js.Array(value :_*))
    
    @scala.inline
    def setFolders(value: js.Array[/* This object contains details about a folder. */ Folder]): Self = StObject.set(x, "folders", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFoldersUndefined: Self = StObject.set(x, "folders", js.undefined)
    
    @scala.inline
    def setFoldersVarargs(value: (/* This object contains details about a folder. */ Folder)*): Self = StObject.set(x, "folders", js.Array(value :_*))
    
    @scala.inline
    def setLastQueriedDateTime(value: String): Self = StObject.set(x, "lastQueriedDateTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLastQueriedDateTimeUndefined: Self = StObject.set(x, "lastQueriedDateTime", js.undefined)
    
    @scala.inline
    def setResultSetSize(value: String): Self = StObject.set(x, "resultSetSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResultSetSizeUndefined: Self = StObject.set(x, "resultSetSize", js.undefined)
    
    @scala.inline
    def setStartPosition(value: String): Self = StObject.set(x, "startPosition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStartPositionUndefined: Self = StObject.set(x, "startPosition", js.undefined)
    
    @scala.inline
    def setTotalSetSize(value: String): Self = StObject.set(x, "totalSetSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTotalSetSizeUndefined: Self = StObject.set(x, "totalSetSize", js.undefined)
  }
}
