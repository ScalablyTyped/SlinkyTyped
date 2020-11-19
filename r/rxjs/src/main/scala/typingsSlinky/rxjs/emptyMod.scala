package typingsSlinky.rxjs

import typingsSlinky.rxjs.internalObservableMod.Observable
import typingsSlinky.rxjs.typesMod.SchedulerLike
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("rxjs/internal/observable/empty", JSImport.Namespace)
@js.native
object emptyMod extends js.Object {
  
  @JSName("EMPTY")
  val EMPTY_ : Observable[scala.Nothing] = js.native
  
  def empty(): Observable[scala.Nothing] = js.native
  def empty(scheduler: SchedulerLike): Observable[scala.Nothing] = js.native
}
