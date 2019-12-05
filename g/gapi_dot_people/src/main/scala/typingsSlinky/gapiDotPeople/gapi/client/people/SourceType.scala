package typingsSlinky.gapiDotPeople.gapi.client.people

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.gapiDotPeople.gapiDotPeopleStrings.SOURCE_TYPE_UNSPECIFIED
  - typings.gapiDotPeople.gapiDotPeopleStrings.ACCOUNT
  - typings.gapiDotPeople.gapiDotPeopleStrings.PROFILE
  - typings.gapiDotPeople.gapiDotPeopleStrings.DOMAIN_PROFILE
  - typings.gapiDotPeople.gapiDotPeopleStrings.CONTACT
*/
trait SourceType extends js.Object

object SourceType {
  @scala.inline
  def ACCOUNT: typingsSlinky.gapiDotPeople.gapiDotPeopleStrings.ACCOUNT = this.cast("ACCOUNT")
  @scala.inline
  def CONTACT: typingsSlinky.gapiDotPeople.gapiDotPeopleStrings.CONTACT = this.cast("CONTACT")
  @scala.inline
  def DOMAIN_PROFILE: typingsSlinky.gapiDotPeople.gapiDotPeopleStrings.DOMAIN_PROFILE = this.cast("DOMAIN_PROFILE")
  @scala.inline
  def PROFILE: typingsSlinky.gapiDotPeople.gapiDotPeopleStrings.PROFILE = this.cast("PROFILE")
  @scala.inline
  def SOURCE_TYPE_UNSPECIFIED: typingsSlinky.gapiDotPeople.gapiDotPeopleStrings.SOURCE_TYPE_UNSPECIFIED = this.cast("SOURCE_TYPE_UNSPECIFIED")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

