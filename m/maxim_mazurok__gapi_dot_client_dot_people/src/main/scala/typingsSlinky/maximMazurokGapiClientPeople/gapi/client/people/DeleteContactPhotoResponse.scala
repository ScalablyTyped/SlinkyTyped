package typingsSlinky.maximMazurokGapiClientPeople.gapi.client.people

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DeleteContactPhotoResponse extends StObject {
  
  /** The updated person, if person_fields is set in the DeleteContactPhotoRequest; otherwise this will be unset. */
  var person: js.UndefOr[Person] = js.native
}
object DeleteContactPhotoResponse {
  
  @scala.inline
  def apply(): DeleteContactPhotoResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeleteContactPhotoResponse]
  }
  
  @scala.inline
  implicit class DeleteContactPhotoResponseMutableBuilder[Self <: DeleteContactPhotoResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPerson(value: Person): Self = StObject.set(x, "person", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPersonUndefined: Self = StObject.set(x, "person", js.undefined)
  }
}
