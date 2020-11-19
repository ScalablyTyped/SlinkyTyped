package typingsSlinky.gapiClientPeople.gapi.client.people

import typingsSlinky.gapiClient.gapi.client.Request
import typingsSlinky.gapiClientPeople.anon.Alt
import typingsSlinky.gapiClientPeople.anon.Callback
import typingsSlinky.gapiClientPeople.anon.DeleteContacts
import typingsSlinky.gapiClientPeople.anon.Fields
import typingsSlinky.gapiClientPeople.anon.Key
import typingsSlinky.gapiClientPeople.anon.MaxMembers
import typingsSlinky.gapiClientPeople.anon.Oauthtoken
import typingsSlinky.gapiClientPeople.anon.PrettyPrint
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ContactGroupsResource extends js.Object {
  
  /**
    * Get a list of contact groups owned by the authenticated user by specifying
    * a list of contact group resource names.
    */
  def batchGet(): Request[BatchGetContactGroupsResponse] = js.native
  def batchGet(request: Callback): Request[BatchGetContactGroupsResponse] = js.native
  
  /** Create a new contact group owned by the authenticated user. */
  def create(request: Fields): Request[ContactGroup] = js.native
  def create(request: Key, body: CreateContactGroupRequest): Request[ContactGroup] = js.native
  
  /**
    * Delete an existing contact group owned by the authenticated user by
    * specifying a contact group resource name.
    */
  def delete(): Request[js.Object] = js.native
  def delete(request: DeleteContacts): Request[js.Object] = js.native
  
  /**
    * Get a specific contact group owned by the authenticated user by specifying
    * a contact group resource name.
    */
  def get(): Request[ContactGroup] = js.native
  def get(request: MaxMembers): Request[ContactGroup] = js.native
  
  /**
    * List all contact groups owned by the authenticated user. Members of the
    * contact groups are not populated.
    */
  def list(): Request[ListContactGroupsResponse] = js.native
  def list(request: Oauthtoken): Request[ListContactGroupsResponse] = js.native
  
  var members: MembersResource = js.native
  
  def update(request: Alt, body: UpdateContactGroupRequest): Request[ContactGroup] = js.native
  /**
    * Update the name of an existing contact group owned by the authenticated
    * user.
    */
  def update(request: PrettyPrint): Request[ContactGroup] = js.native
}
