package typingsSlinky.firebaseRemoteConfig.errorsMod

import typingsSlinky.firebaseRemoteConfig.firebaseRemoteConfigStrings.`fetch-client-network`
import typingsSlinky.firebaseRemoteConfig.firebaseRemoteConfigStrings.`fetch-client-parse`
import typingsSlinky.firebaseRemoteConfig.firebaseRemoteConfigStrings.`fetch-status`
import typingsSlinky.firebaseRemoteConfig.firebaseRemoteConfigStrings.`fetch-throttle`
import typingsSlinky.firebaseRemoteConfig.firebaseRemoteConfigStrings.`fetch-timeout`
import typingsSlinky.firebaseRemoteConfig.firebaseRemoteConfigStrings.`registration-api-key`
import typingsSlinky.firebaseRemoteConfig.firebaseRemoteConfigStrings.`registration-app-id`
import typingsSlinky.firebaseRemoteConfig.firebaseRemoteConfigStrings.`registration-project-id`
import typingsSlinky.firebaseRemoteConfig.firebaseRemoteConfigStrings.`registration-window`
import typingsSlinky.firebaseRemoteConfig.firebaseRemoteConfigStrings.`storage-delete`
import typingsSlinky.firebaseRemoteConfig.firebaseRemoteConfigStrings.`storage-get`
import typingsSlinky.firebaseRemoteConfig.firebaseRemoteConfigStrings.`storage-open`
import typingsSlinky.firebaseRemoteConfig.firebaseRemoteConfigStrings.`storage-set`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.firebaseRemoteConfig.firebaseRemoteConfigStrings.`registration-window`
  - typingsSlinky.firebaseRemoteConfig.firebaseRemoteConfigStrings.`registration-project-id`
  - typingsSlinky.firebaseRemoteConfig.firebaseRemoteConfigStrings.`registration-api-key`
  - typingsSlinky.firebaseRemoteConfig.firebaseRemoteConfigStrings.`registration-app-id`
  - typingsSlinky.firebaseRemoteConfig.firebaseRemoteConfigStrings.`storage-open`
  - typingsSlinky.firebaseRemoteConfig.firebaseRemoteConfigStrings.`storage-get`
  - typingsSlinky.firebaseRemoteConfig.firebaseRemoteConfigStrings.`storage-set`
  - typingsSlinky.firebaseRemoteConfig.firebaseRemoteConfigStrings.`storage-delete`
  - typingsSlinky.firebaseRemoteConfig.firebaseRemoteConfigStrings.`fetch-client-network`
  - typingsSlinky.firebaseRemoteConfig.firebaseRemoteConfigStrings.`fetch-timeout`
  - typingsSlinky.firebaseRemoteConfig.firebaseRemoteConfigStrings.`fetch-throttle`
  - typingsSlinky.firebaseRemoteConfig.firebaseRemoteConfigStrings.`fetch-client-parse`
  - typingsSlinky.firebaseRemoteConfig.firebaseRemoteConfigStrings.`fetch-status`
*/
trait ErrorCode extends js.Object

object ErrorCode {
  @scala.inline
  def FETCH_NETWORK: `fetch-client-network` = this.cast("fetch-client-network")
  @scala.inline
  def FETCH_PARSE: `fetch-client-parse` = this.cast("fetch-client-parse")
  @scala.inline
  def FETCH_STATUS: `fetch-status` = this.cast("fetch-status")
  @scala.inline
  def FETCH_THROTTLE: `fetch-throttle` = this.cast("fetch-throttle")
  @scala.inline
  def FETCH_TIMEOUT: `fetch-timeout` = this.cast("fetch-timeout")
  @scala.inline
  def REGISTRATION_API_KEY: `registration-api-key` = this.cast("registration-api-key")
  @scala.inline
  def REGISTRATION_APP_ID: `registration-app-id` = this.cast("registration-app-id")
  @scala.inline
  def REGISTRATION_PROJECT_ID: `registration-project-id` = this.cast("registration-project-id")
  @scala.inline
  def REGISTRATION_WINDOW: `registration-window` = this.cast("registration-window")
  @scala.inline
  def STORAGE_DELETE: `storage-delete` = this.cast("storage-delete")
  @scala.inline
  def STORAGE_GET: `storage-get` = this.cast("storage-get")
  @scala.inline
  def STORAGE_OPEN: `storage-open` = this.cast("storage-open")
  @scala.inline
  def STORAGE_SET: `storage-set` = this.cast("storage-set")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

