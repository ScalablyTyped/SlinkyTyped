package typingsSlinky.scheduler

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object tracingMod {
  /* Rewritten from type alias, can be one of: 
    - js.UndefOr[scala.Nothing]
    - typingsSlinky.scheduler.schedulerBooleans.`true`
    - typingsSlinky.scheduler.schedulerBooleans.`false`
  */
  type EnableSchedulerTracing = js.UndefOr[typingsSlinky.scheduler.tracingMod._EnableSchedulerTracing]
  type IfSchedulerTracing[WhenTrue, WhenFalse] = typingsSlinky.scheduler.tracingMod.TypeByBuildFlag[typingsSlinky.scheduler.tracingMod.EnableSchedulerTracing, WhenTrue, WhenFalse]
  type TypeByBuildFlag[Flag /* <: js.UndefOr[scala.Boolean] */, WhenTrue, WhenFalse] = WhenFalse | WhenTrue
  type WrappedFunction[T /* <: js.Function1[/* repeated */ js.Any, _] */] = T with typingsSlinky.scheduler.AnonCancel
}
