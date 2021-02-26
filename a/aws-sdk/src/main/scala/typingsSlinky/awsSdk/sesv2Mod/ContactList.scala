package typingsSlinky.awsSdk.sesv2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ContactList extends StObject {
  
  /**
    * The name of the contact list.
    */
  var ContactListName: js.UndefOr[typingsSlinky.awsSdk.sesv2Mod.ContactListName] = js.native
  
  /**
    * A timestamp noting the last time the contact list was updated.
    */
  var LastUpdatedTimestamp: js.UndefOr[js.Date] = js.native
}
object ContactList {
  
  @scala.inline
  def apply(): ContactList = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ContactList]
  }
  
  @scala.inline
  implicit class ContactListMutableBuilder[Self <: ContactList] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setContactListName(value: ContactListName): Self = StObject.set(x, "ContactListName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContactListNameUndefined: Self = StObject.set(x, "ContactListName", js.undefined)
    
    @scala.inline
    def setLastUpdatedTimestamp(value: js.Date): Self = StObject.set(x, "LastUpdatedTimestamp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLastUpdatedTimestampUndefined: Self = StObject.set(x, "LastUpdatedTimestamp", js.undefined)
  }
}
