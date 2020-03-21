package typingsSlinky.firebaseRemoteConfigTypes.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.firebaseRemoteConfigTypes.firebaseRemoteConfigTypesStrings.`no-fetch-yet`
  - typingsSlinky.firebaseRemoteConfigTypes.firebaseRemoteConfigTypesStrings.success
  - typingsSlinky.firebaseRemoteConfigTypes.firebaseRemoteConfigTypesStrings.failure
  - typingsSlinky.firebaseRemoteConfigTypes.firebaseRemoteConfigTypesStrings.throttle
*/
trait FetchStatus extends js.Object

object FetchStatus {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def failure: typingsSlinky.firebaseRemoteConfigTypes.firebaseRemoteConfigTypesStrings.failure = this.cast("failure")
  @scala.inline
  def `no-fetch-yet`: typingsSlinky.firebaseRemoteConfigTypes.firebaseRemoteConfigTypesStrings.`no-fetch-yet` = this.cast("no-fetch-yet")
  @scala.inline
  def success: typingsSlinky.firebaseRemoteConfigTypes.firebaseRemoteConfigTypesStrings.success = this.cast("success")
  @scala.inline
  def throttle: typingsSlinky.firebaseRemoteConfigTypes.firebaseRemoteConfigTypesStrings.throttle = this.cast("throttle")
}

