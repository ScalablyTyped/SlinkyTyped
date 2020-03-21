package typingsSlinky.pollyjsCore.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.pollyjsCore.pollyjsCoreStrings.beforeReplay
  - typingsSlinky.pollyjsCore.pollyjsCoreStrings.beforePersist
*/
trait RecordingRouteEvent extends js.Object

object RecordingRouteEvent {
  @scala.inline
  def beforePersist: typingsSlinky.pollyjsCore.pollyjsCoreStrings.beforePersist = this.cast("beforePersist")
  @scala.inline
  def beforeReplay: typingsSlinky.pollyjsCore.pollyjsCoreStrings.beforeReplay = this.cast("beforeReplay")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

