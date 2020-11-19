package typingsSlinky.rxjs

import typingsSlinky.rxjs.internalObservableMod.Observable
import typingsSlinky.rxjs.typesMod.SchedulerLike
import typingsSlinky.std.ArrayLike
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("rxjs/internal/scheduled/scheduleArray", JSImport.Namespace)
@js.native
object scheduleArrayMod extends js.Object {
  
  def scheduleArray[T](input: ArrayLike[T], scheduler: SchedulerLike): Observable[T] = js.native
}
