package typingsSlinky.rxjs.timestampMod

import typingsSlinky.rxjs.typesMod.OperatorFunction
import typingsSlinky.rxjs.typesMod.SchedulerLike
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("rxjs/internal/operators/timestamp", "timestamp")
@js.native
object timestamp extends js.Object {
  
  def apply[T](): OperatorFunction[T, Timestamp_[T]] = js.native
  def apply[T](scheduler: SchedulerLike): OperatorFunction[T, Timestamp_[T]] = js.native
}
