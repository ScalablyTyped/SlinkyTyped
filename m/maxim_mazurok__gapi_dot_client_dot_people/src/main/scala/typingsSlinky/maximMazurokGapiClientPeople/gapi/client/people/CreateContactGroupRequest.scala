package typingsSlinky.maximMazurokGapiClientPeople.gapi.client.people

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreateContactGroupRequest extends StObject {
  
  /** Required. The contact group to create. */
  var contactGroup: js.UndefOr[ContactGroup] = js.native
}
object CreateContactGroupRequest {
  
  @scala.inline
  def apply(): CreateContactGroupRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateContactGroupRequest]
  }
  
  @scala.inline
  implicit class CreateContactGroupRequestMutableBuilder[Self <: CreateContactGroupRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setContactGroup(value: ContactGroup): Self = StObject.set(x, "contactGroup", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContactGroupUndefined: Self = StObject.set(x, "contactGroup", js.undefined)
  }
}
