package typingsSlinky.meteor.trackerMod.Tracker

import typingsSlinky.meteor.anon.OnError
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("meteor/tracker", "Tracker.autorun")
@js.native
object autorun extends js.Object {
  def apply(runFunc: js.Function1[/* computation */ Computation, Unit]): Computation = js.native
  def apply(runFunc: js.Function1[/* computation */ Computation, Unit], options: OnError): Computation = js.native
}

