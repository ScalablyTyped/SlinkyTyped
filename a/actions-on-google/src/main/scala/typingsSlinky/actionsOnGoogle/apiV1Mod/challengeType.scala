package typingsSlinky.actionsOnGoogle.apiV1Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.actionsOnGoogle.actionsOnGoogleStrings.ackNeeded
  - typingsSlinky.actionsOnGoogle.actionsOnGoogleStrings.pinNeeded
  - typingsSlinky.actionsOnGoogle.actionsOnGoogleStrings.challengeFailedPinNeeded
*/
trait challengeType extends js.Object

object challengeType {
  @scala.inline
  def ackNeeded: typingsSlinky.actionsOnGoogle.actionsOnGoogleStrings.ackNeeded = this.cast("ackNeeded")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def challengeFailedPinNeeded: typingsSlinky.actionsOnGoogle.actionsOnGoogleStrings.challengeFailedPinNeeded = this.cast("challengeFailedPinNeeded")
  @scala.inline
  def pinNeeded: typingsSlinky.actionsOnGoogle.actionsOnGoogleStrings.pinNeeded = this.cast("pinNeeded")
}

