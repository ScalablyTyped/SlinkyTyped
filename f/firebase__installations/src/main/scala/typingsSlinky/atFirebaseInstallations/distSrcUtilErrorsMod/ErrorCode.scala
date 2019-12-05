package typingsSlinky.atFirebaseInstallations.distSrcUtilErrorsMod

import typingsSlinky.atFirebaseInstallations.atFirebaseInstallationsStrings.`app-offline`
import typingsSlinky.atFirebaseInstallations.atFirebaseInstallationsStrings.`delete-pending-registration`
import typingsSlinky.atFirebaseInstallations.atFirebaseInstallationsStrings.`installation-not-found`
import typingsSlinky.atFirebaseInstallations.atFirebaseInstallationsStrings.`missing-app-config-values`
import typingsSlinky.atFirebaseInstallations.atFirebaseInstallationsStrings.`not-registered`
import typingsSlinky.atFirebaseInstallations.atFirebaseInstallationsStrings.`request-failed`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.atFirebaseInstallations.atFirebaseInstallationsStrings.`missing-app-config-values`
  - typings.atFirebaseInstallations.atFirebaseInstallationsStrings.`not-registered`
  - typings.atFirebaseInstallations.atFirebaseInstallationsStrings.`installation-not-found`
  - typings.atFirebaseInstallations.atFirebaseInstallationsStrings.`request-failed`
  - typings.atFirebaseInstallations.atFirebaseInstallationsStrings.`app-offline`
  - typings.atFirebaseInstallations.atFirebaseInstallationsStrings.`delete-pending-registration`
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

