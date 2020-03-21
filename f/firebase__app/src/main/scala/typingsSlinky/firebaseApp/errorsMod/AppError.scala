package typingsSlinky.firebaseApp.errorsMod

import typingsSlinky.firebaseApp.firebaseAppStrings.`app-deleted`
import typingsSlinky.firebaseApp.firebaseAppStrings.`bad-app-name`
import typingsSlinky.firebaseApp.firebaseAppStrings.`duplicate-app`
import typingsSlinky.firebaseApp.firebaseAppStrings.`invalid-app-argument`
import typingsSlinky.firebaseApp.firebaseAppStrings.`no-app`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.firebaseApp.firebaseAppStrings.`no-app`
  - typingsSlinky.firebaseApp.firebaseAppStrings.`bad-app-name`
  - typingsSlinky.firebaseApp.firebaseAppStrings.`duplicate-app`
  - typingsSlinky.firebaseApp.firebaseAppStrings.`app-deleted`
  - typingsSlinky.firebaseApp.firebaseAppStrings.`invalid-app-argument`
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

