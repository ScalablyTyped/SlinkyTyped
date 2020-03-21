package typingsSlinky.microsoftGraph.mod

import typingsSlinky.microsoftGraph.microsoftGraphStrings.none_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.microsoftGraph.microsoftGraphStrings.none_
  - typingsSlinky.microsoftGraph.microsoftGraphStrings.organizer
  - typingsSlinky.microsoftGraph.microsoftGraphStrings.tentativelyAccepted
  - typingsSlinky.microsoftGraph.microsoftGraphStrings.accepted
  - typingsSlinky.microsoftGraph.microsoftGraphStrings.declined
  - typingsSlinky.microsoftGraph.microsoftGraphStrings.notResponded
*/
trait ResponseType extends js.Object

object ResponseType {
  @scala.inline
  def accepted: typingsSlinky.microsoftGraph.microsoftGraphStrings.accepted = this.cast("accepted")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def declined: typingsSlinky.microsoftGraph.microsoftGraphStrings.declined = this.cast("declined")
  @scala.inline
  def none: none_ = this.cast("none")
  @scala.inline
  def notResponded: typingsSlinky.microsoftGraph.microsoftGraphStrings.notResponded = this.cast("notResponded")
  @scala.inline
  def organizer: typingsSlinky.microsoftGraph.microsoftGraphStrings.organizer = this.cast("organizer")
  @scala.inline
  def tentativelyAccepted: typingsSlinky.microsoftGraph.microsoftGraphStrings.tentativelyAccepted = this.cast("tentativelyAccepted")
}

