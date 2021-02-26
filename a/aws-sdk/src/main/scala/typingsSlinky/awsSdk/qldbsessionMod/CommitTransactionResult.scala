package typingsSlinky.awsSdk.qldbsessionMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CommitTransactionResult extends StObject {
  
  /**
    * The commit digest of the committed transaction.
    */
  var CommitDigest: js.UndefOr[typingsSlinky.awsSdk.qldbsessionMod.CommitDigest] = js.native
  
  /**
    * The transaction ID of the committed transaction.
    */
  var TransactionId: js.UndefOr[typingsSlinky.awsSdk.qldbsessionMod.TransactionId] = js.native
}
object CommitTransactionResult {
  
  @scala.inline
  def apply(): CommitTransactionResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CommitTransactionResult]
  }
  
  @scala.inline
  implicit class CommitTransactionResultMutableBuilder[Self <: CommitTransactionResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCommitDigest(value: CommitDigest): Self = StObject.set(x, "CommitDigest", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCommitDigestUint8Array(value: js.typedarray.Uint8Array): Self = StObject.set(x, "CommitDigest", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCommitDigestUndefined: Self = StObject.set(x, "CommitDigest", js.undefined)
    
    @scala.inline
    def setTransactionId(value: TransactionId): Self = StObject.set(x, "TransactionId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTransactionIdUndefined: Self = StObject.set(x, "TransactionId", js.undefined)
  }
}
