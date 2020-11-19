package typingsSlinky.awsSdk.budgetsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescribeSubscribersForNotificationRequest extends js.Object {
  
  /**
    * The accountId that is associated with the budget whose subscribers you want descriptions of.
    */
  var AccountId: typingsSlinky.awsSdk.budgetsMod.AccountId = js.native
  
  /**
    * The name of the budget whose subscribers you want descriptions of.
    */
  var BudgetName: typingsSlinky.awsSdk.budgetsMod.BudgetName = js.native
  
  /**
    * An optional integer that represents how many entries a paginated response contains. The maximum is 100.
    */
  var MaxResults: js.UndefOr[typingsSlinky.awsSdk.budgetsMod.MaxResults] = js.native
  
  /**
    * The pagination token that you include in your request to indicate the next set of results that you want to retrieve.
    */
  var NextToken: js.UndefOr[GenericString] = js.native
  
  /**
    * The notification whose subscribers you want to list.
    */
  var Notification: typingsSlinky.awsSdk.budgetsMod.Notification = js.native
}
object DescribeSubscribersForNotificationRequest {
  
  @scala.inline
  def apply(AccountId: AccountId, BudgetName: BudgetName, Notification: Notification): DescribeSubscribersForNotificationRequest = {
    val __obj = js.Dynamic.literal(AccountId = AccountId.asInstanceOf[js.Any], BudgetName = BudgetName.asInstanceOf[js.Any], Notification = Notification.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeSubscribersForNotificationRequest]
  }
  
  @scala.inline
  implicit class DescribeSubscribersForNotificationRequestOps[Self <: DescribeSubscribersForNotificationRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setAccountId(value: AccountId): Self = this.set("AccountId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBudgetName(value: BudgetName): Self = this.set("BudgetName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNotification(value: Notification): Self = this.set("Notification", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxResults(value: MaxResults): Self = this.set("MaxResults", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaxResults: Self = this.set("MaxResults", js.undefined)
    
    @scala.inline
    def setNextToken(value: GenericString): Self = this.set("NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNextToken: Self = this.set("NextToken", js.undefined)
  }
}
