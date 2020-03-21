package typingsSlinky.actionsOnGoogle.apiV1Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.actionsOnGoogle.actionsOnGoogleStrings.SUCCESS
  - typingsSlinky.actionsOnGoogle.actionsOnGoogleStrings.PENDING
  - typingsSlinky.actionsOnGoogle.actionsOnGoogleStrings.OFFLINE
  - typingsSlinky.actionsOnGoogle.actionsOnGoogleStrings.ERROR
*/
trait SmartHomeV1ExecuteStatus extends js.Object

object SmartHomeV1ExecuteStatus {
  @scala.inline
  def ERROR: typingsSlinky.actionsOnGoogle.actionsOnGoogleStrings.ERROR = this.cast("ERROR")
  @scala.inline
  def OFFLINE: typingsSlinky.actionsOnGoogle.actionsOnGoogleStrings.OFFLINE = this.cast("OFFLINE")
  @scala.inline
  def PENDING: typingsSlinky.actionsOnGoogle.actionsOnGoogleStrings.PENDING = this.cast("PENDING")
  @scala.inline
  def SUCCESS: typingsSlinky.actionsOnGoogle.actionsOnGoogleStrings.SUCCESS = this.cast("SUCCESS")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

