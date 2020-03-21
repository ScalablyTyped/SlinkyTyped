package typingsSlinky.gapiPeople.gapi.client.people

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.gapiPeople.gapiPeopleStrings.SOURCE_TYPE_UNSPECIFIED
  - typingsSlinky.gapiPeople.gapiPeopleStrings.ACCOUNT
  - typingsSlinky.gapiPeople.gapiPeopleStrings.PROFILE
  - typingsSlinky.gapiPeople.gapiPeopleStrings.DOMAIN_PROFILE
  - typingsSlinky.gapiPeople.gapiPeopleStrings.CONTACT
*/
trait SourceType extends js.Object

object SourceType {
  @scala.inline
  def ACCOUNT: typingsSlinky.gapiPeople.gapiPeopleStrings.ACCOUNT = this.cast("ACCOUNT")
  @scala.inline
  def CONTACT: typingsSlinky.gapiPeople.gapiPeopleStrings.CONTACT = this.cast("CONTACT")
  @scala.inline
  def DOMAIN_PROFILE: typingsSlinky.gapiPeople.gapiPeopleStrings.DOMAIN_PROFILE = this.cast("DOMAIN_PROFILE")
  @scala.inline
  def PROFILE: typingsSlinky.gapiPeople.gapiPeopleStrings.PROFILE = this.cast("PROFILE")
  @scala.inline
  def SOURCE_TYPE_UNSPECIFIED: typingsSlinky.gapiPeople.gapiPeopleStrings.SOURCE_TYPE_UNSPECIFIED = this.cast("SOURCE_TYPE_UNSPECIFIED")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

