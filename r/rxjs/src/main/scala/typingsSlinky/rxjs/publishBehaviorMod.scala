package typingsSlinky.rxjs

import typingsSlinky.rxjs.connectableObservableMod.ConnectableObservable
import typingsSlinky.rxjs.internalObservableMod.Observable
import typingsSlinky.rxjs.typesMod.UnaryFunction
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("rxjs/internal/operators/publishBehavior", JSImport.Namespace)
@js.native
object publishBehaviorMod extends js.Object {
  
  def publishBehavior[T](value: T): UnaryFunction[Observable[T], ConnectableObservable[T]] = js.native
}
