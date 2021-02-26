package typingsSlinky.rxjs

import typingsSlinky.rxjs.internalObservableMod.Observable
import typingsSlinky.rxjs.typesMod.InteropObservable
import typingsSlinky.rxjs.typesMod.SchedulerLike
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object scheduleObservableMod {
  
  @JSImport("rxjs/internal/scheduled/scheduleObservable", "scheduleObservable")
  @js.native
  def scheduleObservable[T](input: InteropObservable[T], scheduler: SchedulerLike): Observable[T] = js.native
}
