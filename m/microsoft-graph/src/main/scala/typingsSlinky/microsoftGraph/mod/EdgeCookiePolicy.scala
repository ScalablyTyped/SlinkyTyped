package typingsSlinky.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.microsoftGraph.microsoftGraphStrings.userDefined
  - typingsSlinky.microsoftGraph.microsoftGraphStrings.allow
  - typingsSlinky.microsoftGraph.microsoftGraphStrings.blockThirdParty
  - typingsSlinky.microsoftGraph.microsoftGraphStrings.blockAll
*/
trait EdgeCookiePolicy extends js.Object

object EdgeCookiePolicy {
  @scala.inline
  def allow: typingsSlinky.microsoftGraph.microsoftGraphStrings.allow = this.cast("allow")
  @scala.inline
  def blockAll: typingsSlinky.microsoftGraph.microsoftGraphStrings.blockAll = this.cast("blockAll")
  @scala.inline
  def blockThirdParty: typingsSlinky.microsoftGraph.microsoftGraphStrings.blockThirdParty = this.cast("blockThirdParty")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def userDefined: typingsSlinky.microsoftGraph.microsoftGraphStrings.userDefined = this.cast("userDefined")
}

