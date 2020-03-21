package typingsSlinky.firebaseAnalyticsTypes.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.firebaseAnalyticsTypes.firebaseAnalyticsTypesStrings.event
  - typingsSlinky.firebaseAnalyticsTypes.firebaseAnalyticsTypesStrings.set
  - typingsSlinky.firebaseAnalyticsTypes.firebaseAnalyticsTypesStrings.config
*/
trait GtagCommand extends js.Object

object GtagCommand {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def config: typingsSlinky.firebaseAnalyticsTypes.firebaseAnalyticsTypesStrings.config = this.cast("config")
  @scala.inline
  def event: typingsSlinky.firebaseAnalyticsTypes.firebaseAnalyticsTypesStrings.event = this.cast("event")
  @scala.inline
  def set: typingsSlinky.firebaseAnalyticsTypes.firebaseAnalyticsTypesStrings.set = this.cast("set")
}

