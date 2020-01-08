package typingsSlinky.atFirebaseApp.distPackagesAppSrcErrorsMod

import typingsSlinky.atFirebaseApp.atFirebaseAppStrings.`app-deleted`
import typingsSlinky.atFirebaseApp.atFirebaseAppStrings.`bad-app-name`
import typingsSlinky.atFirebaseApp.atFirebaseAppStrings.`duplicate-app`
import typingsSlinky.atFirebaseApp.atFirebaseAppStrings.`invalid-app-argument`
import typingsSlinky.atFirebaseApp.atFirebaseAppStrings.`no-app`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.atFirebaseApp.atFirebaseAppStrings.`no-app`
  - typings.atFirebaseApp.atFirebaseAppStrings.`bad-app-name`
  - typings.atFirebaseApp.atFirebaseAppStrings.`duplicate-app`
  - typings.atFirebaseApp.atFirebaseAppStrings.`app-deleted`
  - typings.atFirebaseApp.atFirebaseAppStrings.`invalid-app-argument`
*/
trait AppError extends js.Object

object AppError {
  @scala.inline
  def APP_DELETED: `app-deleted` = this.cast("app-deleted")
  @scala.inline
  def BAD_APP_NAME: `bad-app-name` = this.cast("bad-app-name")
  @scala.inline
  def DUPLICATE_APP: `duplicate-app` = this.cast("duplicate-app")
  @scala.inline
  def INVALID_APP_ARGUMENT: `invalid-app-argument` = this.cast("invalid-app-argument")
  @scala.inline
  def NO_APP: `no-app` = this.cast("no-app")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

