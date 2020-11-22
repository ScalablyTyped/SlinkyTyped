package typingsSlinky.maximMazurokGapiClientPeople.gapi.client.people

import typingsSlinky.gapiClient.gapi.client.Request
import typingsSlinky.maximMazurokGapiClientPeople.anon.Alt
import typingsSlinky.maximMazurokGapiClientPeople.anon.PageSize
import typingsSlinky.maximMazurokGapiClientPeople.anon.QuotaUser
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OtherContactsResource extends js.Object {
  
  def copyOtherContactToMyContactsGroup(request: Alt, body: CopyOtherContactToMyContactsGroupRequest): Request[Person] = js.native
  /** Copies an "Other contact" to a new contact in the user's "myContacts" group */
  def copyOtherContactToMyContactsGroup(request: QuotaUser): Request[Person] = js.native
  
  /** List all "Other contacts", that is contacts that are not in a contact group. "Other contacts" are typically auto created contacts from interactions. */
  def list(): Request[ListOtherContactsResponse] = js.native
  def list(request: PageSize): Request[ListOtherContactsResponse] = js.native
}
