package typingsSlinky.firebaseMessaging.errorsMod

import typingsSlinky.firebaseMessaging.firebaseMessagingStrings.`failed-service-worker-registration`
import typingsSlinky.firebaseMessaging.firebaseMessagingStrings.`invalid-bg-handler`
import typingsSlinky.firebaseMessaging.firebaseMessagingStrings.`invalid-sw-registration`
import typingsSlinky.firebaseMessaging.firebaseMessagingStrings.`invalid-vapid-key`
import typingsSlinky.firebaseMessaging.firebaseMessagingStrings.`missing-app-config-values`
import typingsSlinky.firebaseMessaging.firebaseMessagingStrings.`only-available-in-sw`
import typingsSlinky.firebaseMessaging.firebaseMessagingStrings.`only-available-in-window`
import typingsSlinky.firebaseMessaging.firebaseMessagingStrings.`permission-blocked`
import typingsSlinky.firebaseMessaging.firebaseMessagingStrings.`permission-default`
import typingsSlinky.firebaseMessaging.firebaseMessagingStrings.`token-subscribe-failed`
import typingsSlinky.firebaseMessaging.firebaseMessagingStrings.`token-subscribe-no-token`
import typingsSlinky.firebaseMessaging.firebaseMessagingStrings.`token-unsubscribe-failed`
import typingsSlinky.firebaseMessaging.firebaseMessagingStrings.`token-update-failed`
import typingsSlinky.firebaseMessaging.firebaseMessagingStrings.`token-update-no-token`
import typingsSlinky.firebaseMessaging.firebaseMessagingStrings.`unsupported-browser`
import typingsSlinky.firebaseMessaging.firebaseMessagingStrings.`use-sw-after-get-token`
import typingsSlinky.firebaseMessaging.firebaseMessagingStrings.`use-vapid-key-after-get-token`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.firebaseMessaging.firebaseMessagingStrings.`missing-app-config-values`
  - typingsSlinky.firebaseMessaging.firebaseMessagingStrings.`only-available-in-window`
  - typingsSlinky.firebaseMessaging.firebaseMessagingStrings.`only-available-in-sw`
  - typingsSlinky.firebaseMessaging.firebaseMessagingStrings.`permission-default`
  - typingsSlinky.firebaseMessaging.firebaseMessagingStrings.`permission-blocked`
  - typingsSlinky.firebaseMessaging.firebaseMessagingStrings.`unsupported-browser`
  - typingsSlinky.firebaseMessaging.firebaseMessagingStrings.`failed-service-worker-registration`
  - typingsSlinky.firebaseMessaging.firebaseMessagingStrings.`token-subscribe-failed`
  - typingsSlinky.firebaseMessaging.firebaseMessagingStrings.`token-subscribe-no-token`
  - typingsSlinky.firebaseMessaging.firebaseMessagingStrings.`token-unsubscribe-failed`
  - typingsSlinky.firebaseMessaging.firebaseMessagingStrings.`token-update-failed`
  - typingsSlinky.firebaseMessaging.firebaseMessagingStrings.`token-update-no-token`
  - typingsSlinky.firebaseMessaging.firebaseMessagingStrings.`invalid-bg-handler`
  - typingsSlinky.firebaseMessaging.firebaseMessagingStrings.`use-sw-after-get-token`
  - typingsSlinky.firebaseMessaging.firebaseMessagingStrings.`invalid-sw-registration`
  - typingsSlinky.firebaseMessaging.firebaseMessagingStrings.`use-vapid-key-after-get-token`
  - typingsSlinky.firebaseMessaging.firebaseMessagingStrings.`invalid-vapid-key`
*/
trait ErrorCode extends js.Object

object ErrorCode {
  @scala.inline
  def AVAILABLE_IN_SW: `only-available-in-sw` = this.cast("only-available-in-sw")
  @scala.inline
  def AVAILABLE_IN_WINDOW: `only-available-in-window` = this.cast("only-available-in-window")
  @scala.inline
  def FAILED_DEFAULT_REGISTRATION: `failed-service-worker-registration` = this.cast("failed-service-worker-registration")
  @scala.inline
  def INVALID_BG_HANDLER: `invalid-bg-handler` = this.cast("invalid-bg-handler")
  @scala.inline
  def INVALID_SW_REGISTRATION: `invalid-sw-registration` = this.cast("invalid-sw-registration")
  @scala.inline
  def INVALID_VAPID_KEY: `invalid-vapid-key` = this.cast("invalid-vapid-key")
  @scala.inline
  def MISSING_APP_CONFIG_VALUES: `missing-app-config-values` = this.cast("missing-app-config-values")
  @scala.inline
  def PERMISSION_BLOCKED: `permission-blocked` = this.cast("permission-blocked")
  @scala.inline
  def PERMISSION_DEFAULT: `permission-default` = this.cast("permission-default")
  @scala.inline
  def TOKEN_SUBSCRIBE_FAILED: `token-subscribe-failed` = this.cast("token-subscribe-failed")
  @scala.inline
  def TOKEN_SUBSCRIBE_NO_TOKEN: `token-subscribe-no-token` = this.cast("token-subscribe-no-token")
  @scala.inline
  def TOKEN_UNSUBSCRIBE_FAILED: `token-unsubscribe-failed` = this.cast("token-unsubscribe-failed")
  @scala.inline
  def TOKEN_UPDATE_FAILED: `token-update-failed` = this.cast("token-update-failed")
  @scala.inline
  def TOKEN_UPDATE_NO_TOKEN: `token-update-no-token` = this.cast("token-update-no-token")
  @scala.inline
  def UNSUPPORTED_BROWSER: `unsupported-browser` = this.cast("unsupported-browser")
  @scala.inline
  def USE_SW_AFTER_GET_TOKEN: `use-sw-after-get-token` = this.cast("use-sw-after-get-token")
  @scala.inline
  def USE_VAPID_KEY_AFTER_GET_TOKEN: `use-vapid-key-after-get-token` = this.cast("use-vapid-key-after-get-token")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

