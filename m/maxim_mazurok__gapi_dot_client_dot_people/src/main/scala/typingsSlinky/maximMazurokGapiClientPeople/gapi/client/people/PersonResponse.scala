package typingsSlinky.maximMazurokGapiClientPeople.gapi.client.people

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PersonResponse extends js.Object {
  
  /** **DEPRECATED** (Please use status instead) [HTTP 1.1 status code] (http://www.w3.org/Protocols/rfc2616/rfc2616-sec10.html). */
  var httpStatusCode: js.UndefOr[Double] = js.native
  
  /** The person. */
  var person: js.UndefOr[Person] = js.native
  
  /**
    * The original requested resource name. May be different than the resource name on the returned person. The resource name can change when adding or removing fields that link a contact
    * and profile such as a verified email, verified phone number, or a profile URL.
    */
  var requestedResourceName: js.UndefOr[String] = js.native
  
  /** The status of the response. */
  var status: js.UndefOr[Status] = js.native
}
object PersonResponse {
  
  @scala.inline
  def apply(): PersonResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PersonResponse]
  }
  
  @scala.inline
  implicit class PersonResponseOps[Self <: PersonResponse] (val x: Self) extends AnyVal {
    
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
    def setHttpStatusCode(value: Double): Self = this.set("httpStatusCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHttpStatusCode: Self = this.set("httpStatusCode", js.undefined)
    
    @scala.inline
    def setPerson(value: Person): Self = this.set("person", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePerson: Self = this.set("person", js.undefined)
    
    @scala.inline
    def setRequestedResourceName(value: String): Self = this.set("requestedResourceName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRequestedResourceName: Self = this.set("requestedResourceName", js.undefined)
    
    @scala.inline
    def setStatus(value: Status): Self = this.set("status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStatus: Self = this.set("status", js.undefined)
  }
}
