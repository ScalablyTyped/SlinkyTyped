package typingsSlinky.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Recipient extends StObject {
  
  // The recipient's email address.
  var emailAddress: js.UndefOr[NullableOption[EmailAddress]] = js.native
}
object Recipient {
  
  @scala.inline
  def apply(): Recipient = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Recipient]
  }
  
  @scala.inline
  implicit class RecipientMutableBuilder[Self <: Recipient] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEmailAddress(value: NullableOption[EmailAddress]): Self = StObject.set(x, "emailAddress", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEmailAddressNull: Self = StObject.set(x, "emailAddress", null)
    
    @scala.inline
    def setEmailAddressUndefined: Self = StObject.set(x, "emailAddress", js.undefined)
  }
}
