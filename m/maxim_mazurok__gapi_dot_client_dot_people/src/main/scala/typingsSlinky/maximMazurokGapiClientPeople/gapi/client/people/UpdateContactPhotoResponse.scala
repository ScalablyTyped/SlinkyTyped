package typingsSlinky.maximMazurokGapiClientPeople.gapi.client.people

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UpdateContactPhotoResponse extends StObject {
  
  /** The updated person, if person_fields is set in the UpdateContactPhotoRequest; otherwise this will be unset. */
  var person: js.UndefOr[Person] = js.native
}
object UpdateContactPhotoResponse {
  
  @scala.inline
  def apply(): UpdateContactPhotoResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdateContactPhotoResponse]
  }
  
  @scala.inline
  implicit class UpdateContactPhotoResponseMutableBuilder[Self <: UpdateContactPhotoResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPerson(value: Person): Self = StObject.set(x, "person", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPersonUndefined: Self = StObject.set(x, "person", js.undefined)
  }
}
