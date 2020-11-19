package typingsSlinky.rxjs

import typingsSlinky.rxjs.mod.Observable_
import typingsSlinky.rxjs.typesMod.ObservableInput
import typingsSlinky.rxjs.typesMod.SchedulerLike
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("rxjs/internal/scheduled/scheduled", JSImport.Namespace)
@js.native
object scheduledMod extends js.Object {
  
  def scheduled[T](input: ObservableInput[T], scheduler: SchedulerLike): Observable_[T] = js.native
}
