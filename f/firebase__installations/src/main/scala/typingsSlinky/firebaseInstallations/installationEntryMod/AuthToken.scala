package typingsSlinky.firebaseInstallations.installationEntryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.firebaseInstallations.installationEntryMod.NotStartedAuthToken
  - typingsSlinky.firebaseInstallations.installationEntryMod.InProgressAuthToken
  - typingsSlinky.firebaseInstallations.installationEntryMod.CompletedAuthToken
*/
trait AuthToken extends js.Object

object AuthToken {
  @scala.inline
  implicit def apply(value: CompletedAuthToken): AuthToken = value.asInstanceOf[AuthToken]
  @scala.inline
  implicit def apply(value: InProgressAuthToken): AuthToken = value.asInstanceOf[AuthToken]
  @scala.inline
  implicit def apply(value: NotStartedAuthToken): AuthToken = value.asInstanceOf[AuthToken]
}

