package typingsSlinky.rxjs

import typingsSlinky.rxjs.anon.Index
import typingsSlinky.rxjs.internalObservableMod.Observable
import typingsSlinky.rxjs.typesMod.SchedulerLike
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object pairsMod {
  
  @JSImport("rxjs/internal/observable/pairs", "dispatch")
  @js.native
  def dispatch[T](state: Index[T]): Unit = js.native
  
  @JSImport("rxjs/internal/observable/pairs", "pairs")
  @js.native
  def pairs[T](obj: js.Object): Observable[js.Tuple2[String, T]] = js.native
  @JSImport("rxjs/internal/observable/pairs", "pairs")
  @js.native
  def pairs[T](obj: js.Object, scheduler: SchedulerLike): Observable[js.Tuple2[String, T]] = js.native
}
