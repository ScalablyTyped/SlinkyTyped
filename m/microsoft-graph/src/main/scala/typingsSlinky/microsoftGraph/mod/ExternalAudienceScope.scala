package typingsSlinky.microsoftGraph.mod

import typingsSlinky.microsoftGraph.microsoftGraphStrings.none_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.microsoftGraph.microsoftGraphStrings.none_
  - typingsSlinky.microsoftGraph.microsoftGraphStrings.contactsOnly
  - typingsSlinky.microsoftGraph.microsoftGraphStrings.all
*/
trait ExternalAudienceScope extends js.Object

object ExternalAudienceScope {
  @scala.inline
  def all: typingsSlinky.microsoftGraph.microsoftGraphStrings.all = this.cast("all")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def contactsOnly: typingsSlinky.microsoftGraph.microsoftGraphStrings.contactsOnly = this.cast("contactsOnly")
  @scala.inline
  def none: none_ = this.cast("none")
}

