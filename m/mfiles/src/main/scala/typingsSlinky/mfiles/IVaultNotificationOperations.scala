package typingsSlinky.mfiles

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IVaultNotificationOperations extends StObject {
  
  def SendCustomNotification(
    UserOrUserGroupIDs: IUserOrUserGroupIDs,
    IncludeSubstituteUsers: Boolean,
    ExternalRecipients: IStrings,
    SendWithServerEmailIdentity: Boolean,
    Subject: String,
    Body: String
  ): Unit = js.native
}
object IVaultNotificationOperations {
  
  @scala.inline
  def apply(SendCustomNotification: (IUserOrUserGroupIDs, Boolean, IStrings, Boolean, String, String) => Unit): IVaultNotificationOperations = {
    val __obj = js.Dynamic.literal(SendCustomNotification = js.Any.fromFunction6(SendCustomNotification))
    __obj.asInstanceOf[IVaultNotificationOperations]
  }
  
  @scala.inline
  implicit class IVaultNotificationOperationsMutableBuilder[Self <: IVaultNotificationOperations] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setSendCustomNotification(value: (IUserOrUserGroupIDs, Boolean, IStrings, Boolean, String, String) => Unit): Self = StObject.set(x, "SendCustomNotification", js.Any.fromFunction6(value))
  }
}
