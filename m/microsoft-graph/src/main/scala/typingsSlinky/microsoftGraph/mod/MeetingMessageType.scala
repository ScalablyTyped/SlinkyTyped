package typingsSlinky.microsoftGraph.mod

import typingsSlinky.microsoftGraph.microsoftGraphStrings.none_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.microsoftGraph.microsoftGraphStrings.none_
  - typingsSlinky.microsoftGraph.microsoftGraphStrings.meetingRequest
  - typingsSlinky.microsoftGraph.microsoftGraphStrings.meetingCancelled
  - typingsSlinky.microsoftGraph.microsoftGraphStrings.meetingAccepted
  - typingsSlinky.microsoftGraph.microsoftGraphStrings.meetingTenativelyAccepted
  - typingsSlinky.microsoftGraph.microsoftGraphStrings.meetingDeclined
*/
trait MeetingMessageType extends js.Object

object MeetingMessageType {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def meetingAccepted: typingsSlinky.microsoftGraph.microsoftGraphStrings.meetingAccepted = this.cast("meetingAccepted")
  @scala.inline
  def meetingCancelled: typingsSlinky.microsoftGraph.microsoftGraphStrings.meetingCancelled = this.cast("meetingCancelled")
  @scala.inline
  def meetingDeclined: typingsSlinky.microsoftGraph.microsoftGraphStrings.meetingDeclined = this.cast("meetingDeclined")
  @scala.inline
  def meetingRequest: typingsSlinky.microsoftGraph.microsoftGraphStrings.meetingRequest = this.cast("meetingRequest")
  @scala.inline
  def meetingTenativelyAccepted: typingsSlinky.microsoftGraph.microsoftGraphStrings.meetingTenativelyAccepted = this.cast("meetingTenativelyAccepted")
  @scala.inline
  def none: none_ = this.cast("none")
}

