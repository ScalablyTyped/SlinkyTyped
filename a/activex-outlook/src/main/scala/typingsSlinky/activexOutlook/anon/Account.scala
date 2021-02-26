package typingsSlinky.activexOutlook.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Account extends StObject {
  
  val Account: typingsSlinky.activexOutlook.Outlook.Account = js.native
}
object Account {
  
  @scala.inline
  def apply(Account: typingsSlinky.activexOutlook.Outlook.Account): Account = {
    val __obj = js.Dynamic.literal(Account = Account.asInstanceOf[js.Any])
    __obj.asInstanceOf[Account]
  }
  
  @scala.inline
  implicit class AccountMutableBuilder[Self <: Account] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAccount(value: typingsSlinky.activexOutlook.Outlook.Account): Self = StObject.set(x, "Account", value.asInstanceOf[js.Any])
  }
}
