package typingsSlinky.rxjs

import typingsSlinky.rxjs.connectableObservableMod.ConnectableObservable
import typingsSlinky.rxjs.internalObservableMod.Observable
import typingsSlinky.rxjs.typesMod.UnaryFunction
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rxjs/internal/operators/publishLast", JSImport.Namespace)
@js.native
object publishLastMod extends js.Object {
  def publishLast[T](): UnaryFunction[Observable[T], ConnectableObservable[T]] = js.native
}

