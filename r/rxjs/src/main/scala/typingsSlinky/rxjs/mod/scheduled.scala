package typingsSlinky.rxjs.mod

import typingsSlinky.rxjs.typesMod.ObservableInput
import typingsSlinky.rxjs.typesMod.SchedulerLike
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("rxjs", "scheduled")
@js.native
object scheduled extends js.Object {
  
  def apply[T](input: ObservableInput[T], scheduler: SchedulerLike): Observable_[T] = js.native
}
