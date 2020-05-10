package typingsSlinky.gapiClientClassroom.gapi.client.classroom

import typingsSlinky.gapiClient.gapi.client.Request_
import typingsSlinky.gapiClientClassroom.AnonAlt
import typingsSlinky.gapiClientClassroom.AnonCallback
import typingsSlinky.gapiClientClassroom.AnonFields
import typingsSlinky.gapiClientClassroom.AnonFieldsId
import typingsSlinky.gapiClientClassroom.AnonFieldsKey
import typingsSlinky.gapiClientClassroom.AnonOauthtoken
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TopicsResource extends js.Object {
  def create(request: AnonAlt, body: Topic): Request_[Topic] = js.native
  /**
    * Creates a topic.
    *
    * This method returns the following error codes:
    *
    * &#42; `PERMISSION_DENIED` if the requesting user is not permitted to access the
    * requested course, create a topic in the requested course,
    * or for access errors.
    * &#42; `INVALID_ARGUMENT` if the request is malformed.
    * &#42; `NOT_FOUND` if the requested course does not exist.
    */
  def create(request: AnonFieldsKey): Request_[Topic] = js.native
  /**
    * Deletes a topic.
    *
    * This method returns the following error codes:
    *
    * &#42; `PERMISSION_DENIED` if the requesting user is not allowed to delete the
    * requested topic or for access errors.
    * &#42; `FAILED_PRECONDITION` if the requested topic has already been
    * deleted.
    * &#42; `NOT_FOUND` if no course or topic exists with the requested ID.
    */
  def delete(): Request_[js.Object] = js.native
  def delete(request: AnonFields): Request_[js.Object] = js.native
  /**
    * Returns a topic.
    *
    * This method returns the following error codes:
    *
    * &#42; `PERMISSION_DENIED` if the requesting user is not permitted to access the
    * requested course or topic, or for access errors.
    * &#42; `INVALID_ARGUMENT` if the request is malformed.
    * &#42; `NOT_FOUND` if the requested course or topic does not exist.
    */
  def get(): Request_[Topic] = js.native
  def get(request: AnonFields): Request_[Topic] = js.native
  /**
    * Returns the list of topics that the requester is permitted to view.
    *
    * This method returns the following error codes:
    *
    * &#42; `PERMISSION_DENIED` if the requesting user is not permitted to access
    * the requested course or for access errors.
    * &#42; `INVALID_ARGUMENT` if the request is malformed.
    * &#42; `NOT_FOUND` if the requested course does not exist.
    */
  def list(): Request_[ListTopicResponse] = js.native
  def list(request: AnonCallback): Request_[ListTopicResponse] = js.native
  /**
    * Updates one or more fields of a topic.
    *
    * This method returns the following error codes:
    *
    * &#42; `PERMISSION_DENIED` if the requesting developer project did not create
    * the corresponding topic or for access errors.
    * &#42; `INVALID_ARGUMENT` if the request is malformed.
    * &#42; `NOT_FOUND` if the requested course or topic does not exist
    */
  def patch(request: AnonFieldsId): Request_[Topic] = js.native
  def patch(request: AnonOauthtoken, body: Topic): Request_[Topic] = js.native
}

