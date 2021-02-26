package typingsSlinky.awsSdk.budgetsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DeleteNotificationRequest extends StObject {
  
  /**
    * The accountId that is associated with the budget whose notification you want to delete.
    */
  var AccountId: typingsSlinky.awsSdk.budgetsMod.AccountId = js.native
  
  /**
    * The name of the budget whose notification you want to delete.
    */
  var BudgetName: typingsSlinky.awsSdk.budgetsMod.BudgetName = js.native
  
  /**
    * The notification that you want to delete.
    */
  var Notification: typingsSlinky.awsSdk.budgetsMod.Notification = js.native
}
object DeleteNotificationRequest {
  
  @scala.inline
  def apply(AccountId: AccountId, BudgetName: BudgetName, Notification: Notification): DeleteNotificationRequest = {
    val __obj = js.Dynamic.literal(AccountId = AccountId.asInstanceOf[js.Any], BudgetName = BudgetName.asInstanceOf[js.Any], Notification = Notification.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteNotificationRequest]
  }
  
  @scala.inline
  implicit class DeleteNotificationRequestMutableBuilder[Self <: DeleteNotificationRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAccountId(value: AccountId): Self = StObject.set(x, "AccountId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBudgetName(value: BudgetName): Self = StObject.set(x, "BudgetName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNotification(value: Notification): Self = StObject.set(x, "Notification", value.asInstanceOf[js.Any])
  }
}
