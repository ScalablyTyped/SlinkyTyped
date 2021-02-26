package typingsSlinky.awsSdk.guarddutyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UpdateMemberDetectorsResponse extends StObject {
  
  /**
    * A list of member account IDs that were unable to be processed along with an explanation for why they were not processed.
    */
  var UnprocessedAccounts: typingsSlinky.awsSdk.guarddutyMod.UnprocessedAccounts = js.native
}
object UpdateMemberDetectorsResponse {
  
  @scala.inline
  def apply(UnprocessedAccounts: UnprocessedAccounts): UpdateMemberDetectorsResponse = {
    val __obj = js.Dynamic.literal(UnprocessedAccounts = UnprocessedAccounts.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateMemberDetectorsResponse]
  }
  
  @scala.inline
  implicit class UpdateMemberDetectorsResponseMutableBuilder[Self <: UpdateMemberDetectorsResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setUnprocessedAccounts(value: UnprocessedAccounts): Self = StObject.set(x, "UnprocessedAccounts", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUnprocessedAccountsVarargs(value: UnprocessedAccount*): Self = StObject.set(x, "UnprocessedAccounts", js.Array(value :_*))
  }
}
