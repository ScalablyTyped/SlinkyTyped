package typingsSlinky.rxjs.mod

import typingsSlinky.rxjs.internalObservableMod.Observable
import typingsSlinky.rxjs.typesMod.SchedulerLike
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("rxjs", "pairs")
@js.native
object pairs extends js.Object {
  
  def apply[T](obj: js.Object): Observable[js.Tuple2[String, T]] = js.native
  def apply[T](obj: js.Object, scheduler: SchedulerLike): Observable[js.Tuple2[String, T]] = js.native
}
