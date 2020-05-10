package typingsSlinky.firebaseApp.errorsMod

import typingsSlinky.firebaseApp.firebaseAppStrings.`app-deleted`
import typingsSlinky.firebaseApp.firebaseAppStrings.`bad-app-name`
import typingsSlinky.firebaseApp.firebaseAppStrings.`duplicate-app`
import typingsSlinky.firebaseApp.firebaseAppStrings.`invalid-app-argument`
import typingsSlinky.firebaseApp.firebaseAppStrings.`invalid-log-argument`
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
  - typingsSlinky.firebaseApp.firebaseAppStrings.`invalid-log-argument`
*/
trait AppError extends js.Object

object AppError {
  @scala.inline
  def APP_DELETED: `app-deleted` = "app-deleted".asInstanceOf[`app-deleted`]
  @scala.inline
  def BAD_APP_NAME: `bad-app-name` = "bad-app-name".asInstanceOf[`bad-app-name`]
  @scala.inline
  def DUPLICATE_APP: `duplicate-app` = "duplicate-app".asInstanceOf[`duplicate-app`]
  @scala.inline
  def INVALID_APP_ARGUMENT: `invalid-app-argument` = "invalid-app-argument".asInstanceOf[`invalid-app-argument`]
  @scala.inline
  def INVALID_LOG_ARGUMENT: `invalid-log-argument` = "invalid-log-argument".asInstanceOf[`invalid-log-argument`]
  @scala.inline
  def NO_APP: `no-app` = "no-app".asInstanceOf[`no-app`]
}

