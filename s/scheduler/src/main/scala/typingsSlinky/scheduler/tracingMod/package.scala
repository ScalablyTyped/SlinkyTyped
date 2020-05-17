package typingsSlinky.scheduler

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object tracingMod {
  type IfSchedulerTracing[WhenTrue, WhenFalse] = typingsSlinky.scheduler.tracingMod.TypeByBuildFlag[typingsSlinky.scheduler.tracingMod.EnableSchedulerTracing, WhenTrue, WhenFalse]
  type WrappedFunction[T /* <: js.Function1[/* repeated */ js.Any, _] */] = T with typingsSlinky.scheduler.anon.Cancel
}
