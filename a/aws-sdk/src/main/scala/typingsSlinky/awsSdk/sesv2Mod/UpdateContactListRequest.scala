package typingsSlinky.awsSdk.sesv2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UpdateContactListRequest extends StObject {
  
  /**
    * The name of the contact list.
    */
  var ContactListName: typingsSlinky.awsSdk.sesv2Mod.ContactListName = js.native
  
  /**
    * A description of what the contact list is about.
    */
  var Description: js.UndefOr[typingsSlinky.awsSdk.sesv2Mod.Description] = js.native
  
  /**
    * An interest group, theme, or label within a list. A contact list can have multiple topics.
    */
  var Topics: js.UndefOr[typingsSlinky.awsSdk.sesv2Mod.Topics] = js.native
}
object UpdateContactListRequest {
  
  @scala.inline
  def apply(ContactListName: ContactListName): UpdateContactListRequest = {
    val __obj = js.Dynamic.literal(ContactListName = ContactListName.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateContactListRequest]
  }
  
  @scala.inline
  implicit class UpdateContactListRequestMutableBuilder[Self <: UpdateContactListRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setContactListName(value: ContactListName): Self = StObject.set(x, "ContactListName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescription(value: Description): Self = StObject.set(x, "Description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescriptionUndefined: Self = StObject.set(x, "Description", js.undefined)
    
    @scala.inline
    def setTopics(value: Topics): Self = StObject.set(x, "Topics", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTopicsUndefined: Self = StObject.set(x, "Topics", js.undefined)
    
    @scala.inline
    def setTopicsVarargs(value: Topic*): Self = StObject.set(x, "Topics", js.Array(value :_*))
  }
}
