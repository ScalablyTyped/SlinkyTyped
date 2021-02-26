package typingsSlinky.maximMazurokGapiClientClassroom.gapi.client.classroom

import typingsSlinky.gapiClient.gapi.client.Request
import typingsSlinky.maximMazurokGapiClientClassroom.anon.Alt
import typingsSlinky.maximMazurokGapiClientClassroom.anon.Callback
import typingsSlinky.maximMazurokGapiClientClassroom.anon.Fields
import typingsSlinky.maximMazurokGapiClientClassroom.anon.FieldsId
import typingsSlinky.maximMazurokGapiClientClassroom.anon.KeyOauthtoken
import typingsSlinky.maximMazurokGapiClientClassroom.anon.Oauthtoken
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TopicsResource extends StObject {
  
  def create(request: Alt, body: Topic): Request[Topic] = js.native
  /**
    * Creates a topic. This method returns the following error codes: * `PERMISSION_DENIED` if the requesting user is not permitted to access the requested course, create a topic in the
    * requested course, or for access errors. * `INVALID_ARGUMENT` if the request is malformed. * `NOT_FOUND` if the requested course does not exist.
    */
  def create(request: KeyOauthtoken): Request[Topic] = js.native
  
  /**
    * Deletes a topic. This method returns the following error codes: * `PERMISSION_DENIED` if the requesting user is not allowed to delete the requested topic or for access errors. *
    * `FAILED_PRECONDITION` if the requested topic has already been deleted. * `NOT_FOUND` if no course or topic exists with the requested ID.
    */
  def delete(): Request[js.Object] = js.native
  def delete(request: Fields): Request[js.Object] = js.native
  
  /**
    * Returns a topic. This method returns the following error codes: * `PERMISSION_DENIED` if the requesting user is not permitted to access the requested course or topic, or for access
    * errors. * `INVALID_ARGUMENT` if the request is malformed. * `NOT_FOUND` if the requested course or topic does not exist.
    */
  def get(): Request[Topic] = js.native
  def get(request: Fields): Request[Topic] = js.native
  
  /**
    * Returns the list of topics that the requester is permitted to view. This method returns the following error codes: * `PERMISSION_DENIED` if the requesting user is not permitted to
    * access the requested course or for access errors. * `INVALID_ARGUMENT` if the request is malformed. * `NOT_FOUND` if the requested course does not exist.
    */
  def list(): Request[ListTopicResponse] = js.native
  def list(request: Callback): Request[ListTopicResponse] = js.native
  
  /**
    * Updates one or more fields of a topic. This method returns the following error codes: * `PERMISSION_DENIED` if the requesting developer project did not create the corresponding
    * topic or for access errors. * `INVALID_ARGUMENT` if the request is malformed. * `NOT_FOUND` if the requested course or topic does not exist
    */
  def patch(request: FieldsId): Request[Topic] = js.native
  def patch(request: Oauthtoken, body: Topic): Request[Topic] = js.native
}
