package typingsSlinky.firebase.mod.remoteConfig

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.firebase.firebaseStrings.`no-fetch-yet`
  - typingsSlinky.firebase.firebaseStrings.success
  - typingsSlinky.firebase.firebaseStrings.failure
  - typingsSlinky.firebase.firebaseStrings.throttle
*/
trait FetchStatus extends js.Object

object FetchStatus {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def failure: typingsSlinky.firebase.firebaseStrings.failure = this.cast("failure")
  @scala.inline
  def `no-fetch-yet`: typingsSlinky.firebase.firebaseStrings.`no-fetch-yet` = this.cast("no-fetch-yet")
  @scala.inline
  def success: typingsSlinky.firebase.firebaseStrings.success = this.cast("success")
  @scala.inline
  def throttle: typingsSlinky.firebase.firebaseStrings.throttle = this.cast("throttle")
}

