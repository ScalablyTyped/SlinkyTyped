package typingsSlinky.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.microsoftGraph.microsoftGraphStrings.guest
  - typingsSlinky.microsoftGraph.microsoftGraphStrings.domain
*/
trait SharedPCAllowedAccountType extends js.Object

object SharedPCAllowedAccountType {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def domain: typingsSlinky.microsoftGraph.microsoftGraphStrings.domain = this.cast("domain")
  @scala.inline
  def guest: typingsSlinky.microsoftGraph.microsoftGraphStrings.guest = this.cast("guest")
}

