package typingsSlinky.awsSdk.guarddutyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait StopMonitoringMembersResponse extends js.Object {
  
  /**
    * A list of objects that contain an accountId for each account that could not be processed, and a result string that indicates why the account was not processed. 
    */
  var UnprocessedAccounts: typingsSlinky.awsSdk.guarddutyMod.UnprocessedAccounts = js.native
}
object StopMonitoringMembersResponse {
  
  @scala.inline
  def apply(UnprocessedAccounts: UnprocessedAccounts): StopMonitoringMembersResponse = {
    val __obj = js.Dynamic.literal(UnprocessedAccounts = UnprocessedAccounts.asInstanceOf[js.Any])
    __obj.asInstanceOf[StopMonitoringMembersResponse]
  }
  
  @scala.inline
  implicit class StopMonitoringMembersResponseOps[Self <: StopMonitoringMembersResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setUnprocessedAccountsVarargs(value: UnprocessedAccount*): Self = this.set("UnprocessedAccounts", js.Array(value :_*))
    
    @scala.inline
    def setUnprocessedAccounts(value: UnprocessedAccounts): Self = this.set("UnprocessedAccounts", value.asInstanceOf[js.Any])
  }
}
