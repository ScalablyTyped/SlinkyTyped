package typingsSlinky.gapiClientClassroom.gapi.client.classroom

import typingsSlinky.gapiClient.gapi.client.Request_
import typingsSlinky.gapiClientClassroom.AnonAlt
import typingsSlinky.gapiClientClassroom.AnonCallback
import typingsSlinky.gapiClientClassroom.AnonCourseIdFields
import typingsSlinky.gapiClientClassroom.AnonUserId
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TeachersResource extends js.Object {
  def create(request: AnonAlt, body: Teacher): Request_[Teacher] = js.native
  /**
    * Creates a teacher of a course.
    *
    * This method returns the following error codes:
    *
    * &#42; `PERMISSION_DENIED` if the requesting user is not  permitted to create
    * teachers in this course or for access errors.
    * &#42; `NOT_FOUND` if the requested course ID does not exist.
    * &#42; `FAILED_PRECONDITION` if the requested user's account is disabled,
    * for the following request errors:
    * &#42; CourseMemberLimitReached
    * &#42; CourseNotModifiable
    * &#42; CourseTeacherLimitReached
    * &#42; UserGroupsMembershipLimitReached
    * &#42; `ALREADY_EXISTS` if the user is already a teacher or student in the
    * course.
    */
  def create(request: AnonCourseIdFields): Request_[Teacher] = js.native
  /**
    * Deletes a teacher of a course.
    *
    * This method returns the following error codes:
    *
    * &#42; `PERMISSION_DENIED` if the requesting user is not permitted to delete
    * teachers of this course or for access errors.
    * &#42; `NOT_FOUND` if no teacher of this course has the requested ID or if the
    * course does not exist.
    * &#42; `FAILED_PRECONDITION` if the requested ID belongs to the primary teacher
    * of this course.
    */
  def delete(): Request_[js.Object] = js.native
  def delete(request: AnonUserId): Request_[js.Object] = js.native
  /**
    * Returns a teacher of a course.
    *
    * This method returns the following error codes:
    *
    * &#42; `PERMISSION_DENIED` if the requesting user is not permitted to view
    * teachers of this course or for access errors.
    * &#42; `NOT_FOUND` if no teacher of this course has the requested ID or if the
    * course does not exist.
    */
  def get(): Request_[Teacher] = js.native
  def get(request: AnonUserId): Request_[Teacher] = js.native
  /**
    * Returns a list of teachers of this course that the requester
    * is permitted to view.
    *
    * This method returns the following error codes:
    *
    * &#42; `NOT_FOUND` if the course does not exist.
    * &#42; `PERMISSION_DENIED` for access errors.
    */
  def list(): Request_[ListTeachersResponse] = js.native
  def list(request: AnonCallback): Request_[ListTeachersResponse] = js.native
}

