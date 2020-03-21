package typingsSlinky.firebaseRemoteConfig.storageMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides type-safety for the "key" field used by {@link APP_NAMESPACE_STORE}.
  *
  * <p>This seems like a small price to avoid potentially subtle bugs caused by a typo.
  */
/* Rewritten from type alias, can be one of: 
  - typingsSlinky.firebaseRemoteConfig.firebaseRemoteConfigStrings.active_config
  - typingsSlinky.firebaseRemoteConfig.firebaseRemoteConfigStrings.active_config_etag
  - typingsSlinky.firebaseRemoteConfig.firebaseRemoteConfigStrings.last_fetch_status
  - typingsSlinky.firebaseRemoteConfig.firebaseRemoteConfigStrings.last_successful_fetch_timestamp_millis
  - typingsSlinky.firebaseRemoteConfig.firebaseRemoteConfigStrings.last_successful_fetch_response
  - typingsSlinky.firebaseRemoteConfig.firebaseRemoteConfigStrings.settings
  - typingsSlinky.firebaseRemoteConfig.firebaseRemoteConfigStrings.throttle_metadata
*/
trait ProjectNamespaceKeyFieldValue extends js.Object

object ProjectNamespaceKeyFieldValue {
  @scala.inline
  def active_config: typingsSlinky.firebaseRemoteConfig.firebaseRemoteConfigStrings.active_config = this.cast("active_config")
  @scala.inline
  def active_config_etag: typingsSlinky.firebaseRemoteConfig.firebaseRemoteConfigStrings.active_config_etag = this.cast("active_config_etag")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def last_fetch_status: typingsSlinky.firebaseRemoteConfig.firebaseRemoteConfigStrings.last_fetch_status = this.cast("last_fetch_status")
  @scala.inline
  def last_successful_fetch_response: typingsSlinky.firebaseRemoteConfig.firebaseRemoteConfigStrings.last_successful_fetch_response = this.cast("last_successful_fetch_response")
  @scala.inline
  def last_successful_fetch_timestamp_millis: typingsSlinky.firebaseRemoteConfig.firebaseRemoteConfigStrings.last_successful_fetch_timestamp_millis = this.cast("last_successful_fetch_timestamp_millis")
  @scala.inline
  def settings: typingsSlinky.firebaseRemoteConfig.firebaseRemoteConfigStrings.settings = this.cast("settings")
  @scala.inline
  def throttle_metadata: typingsSlinky.firebaseRemoteConfig.firebaseRemoteConfigStrings.throttle_metadata = this.cast("throttle_metadata")
}

