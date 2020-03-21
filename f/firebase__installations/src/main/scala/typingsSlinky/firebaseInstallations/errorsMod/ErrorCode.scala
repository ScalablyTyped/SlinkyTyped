package typingsSlinky.firebaseInstallations.errorsMod

import typingsSlinky.firebaseInstallations.firebaseInstallationsStrings.`app-offline`
import typingsSlinky.firebaseInstallations.firebaseInstallationsStrings.`delete-pending-registration`
import typingsSlinky.firebaseInstallations.firebaseInstallationsStrings.`installation-not-found`
import typingsSlinky.firebaseInstallations.firebaseInstallationsStrings.`missing-app-config-values`
import typingsSlinky.firebaseInstallations.firebaseInstallationsStrings.`not-registered`
import typingsSlinky.firebaseInstallations.firebaseInstallationsStrings.`request-failed`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.firebaseInstallations.firebaseInstallationsStrings.`missing-app-config-values`
  - typingsSlinky.firebaseInstallations.firebaseInstallationsStrings.`not-registered`
  - typingsSlinky.firebaseInstallations.firebaseInstallationsStrings.`installation-not-found`
  - typingsSlinky.firebaseInstallations.firebaseInstallationsStrings.`request-failed`
  - typingsSlinky.firebaseInstallations.firebaseInstallationsStrings.`app-offline`
  - typingsSlinky.firebaseInstallations.firebaseInstallationsStrings.`delete-pending-registration`
*/
trait ErrorCode extends js.Object

object ErrorCode {
  @scala.inline
  def APP_OFFLINE: `app-offline` = this.cast("app-offline")
  @scala.inline
  def DELETE_PENDING_REGISTRATION: `delete-pending-registration` = this.cast("delete-pending-registration")
  @scala.inline
  def INSTALLATION_NOT_FOUND: `installation-not-found` = this.cast("installation-not-found")
  @scala.inline
  def MISSING_APP_CONFIG_VALUES: `missing-app-config-values` = this.cast("missing-app-config-values")
  @scala.inline
  def NOT_REGISTERED: `not-registered` = this.cast("not-registered")
  @scala.inline
  def REQUEST_FAILED: `request-failed` = this.cast("request-failed")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

