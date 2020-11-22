package typingsSlinky.maximMazurokGapiClientPeople.gapi.client.people

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UpdateContactPhotoRequest extends js.Object {
  
  /**
    * Optional. A field mask to restrict which fields on the person are returned. Multiple fields can be specified by separating them with commas. Defaults to empty if not set, which will
    * skip the post mutate get. Valid values are: * addresses * ageRanges * biographies * birthdays * calendarUrls * clientData * coverPhotos * emailAddresses * events * externalIds *
    * genders * imClients * interests * locales * locations * memberships * metadata * miscKeywords * names * nicknames * occupations * organizations * phoneNumbers * photos * relations *
    * sipAddresses * skills * urls * userDefined
    */
  var personFields: js.UndefOr[String] = js.native
  
  /** Required. Raw photo bytes */
  var photoBytes: js.UndefOr[String] = js.native
  
  /** Optional. A mask of what source types to return. Defaults to READ_SOURCE_TYPE_CONTACT and READ_SOURCE_TYPE_PROFILE if not set. */
  var sources: js.UndefOr[js.Array[String]] = js.native
}
object UpdateContactPhotoRequest {
  
  @scala.inline
  def apply(): UpdateContactPhotoRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdateContactPhotoRequest]
  }
  
  @scala.inline
  implicit class UpdateContactPhotoRequestOps[Self <: UpdateContactPhotoRequest] (val x: Self) extends AnyVal {
    
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
    def setPersonFields(value: String): Self = this.set("personFields", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePersonFields: Self = this.set("personFields", js.undefined)
    
    @scala.inline
    def setPhotoBytes(value: String): Self = this.set("photoBytes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePhotoBytes: Self = this.set("photoBytes", js.undefined)
    
    @scala.inline
    def setSourcesVarargs(value: String*): Self = this.set("sources", js.Array(value :_*))
    
    @scala.inline
    def setSources(value: js.Array[String]): Self = this.set("sources", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSources: Self = this.set("sources", js.undefined)
  }
}
