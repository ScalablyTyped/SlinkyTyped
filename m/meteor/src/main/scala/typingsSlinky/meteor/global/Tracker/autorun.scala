package typingsSlinky.meteor.global.Tracker

import typingsSlinky.meteor.anon.OnError
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Tracker.autorun")
@js.native
object autorun extends js.Object {
  def apply(runFunc: js.Function1[/* computation */ typingsSlinky.meteor.Tracker.Computation, Unit]): typingsSlinky.meteor.Tracker.Computation = js.native
  def apply(
    runFunc: js.Function1[/* computation */ typingsSlinky.meteor.Tracker.Computation, Unit],
    options: OnError
  ): typingsSlinky.meteor.Tracker.Computation = js.native
}

