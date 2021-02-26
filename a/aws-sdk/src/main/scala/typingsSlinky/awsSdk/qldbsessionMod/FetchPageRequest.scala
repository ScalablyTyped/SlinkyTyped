package typingsSlinky.awsSdk.qldbsessionMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FetchPageRequest extends StObject {
  
  /**
    * Specifies the next page token of the page to be fetched.
    */
  var NextPageToken: PageToken = js.native
  
  /**
    * Specifies the transaction ID of the page to be fetched.
    */
  var TransactionId: typingsSlinky.awsSdk.qldbsessionMod.TransactionId = js.native
}
object FetchPageRequest {
  
  @scala.inline
  def apply(NextPageToken: PageToken, TransactionId: TransactionId): FetchPageRequest = {
    val __obj = js.Dynamic.literal(NextPageToken = NextPageToken.asInstanceOf[js.Any], TransactionId = TransactionId.asInstanceOf[js.Any])
    __obj.asInstanceOf[FetchPageRequest]
  }
  
  @scala.inline
  implicit class FetchPageRequestMutableBuilder[Self <: FetchPageRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNextPageToken(value: PageToken): Self = StObject.set(x, "NextPageToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTransactionId(value: TransactionId): Self = StObject.set(x, "TransactionId", value.asInstanceOf[js.Any])
  }
}
