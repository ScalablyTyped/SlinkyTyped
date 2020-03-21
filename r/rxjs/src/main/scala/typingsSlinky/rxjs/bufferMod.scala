package typingsSlinky.rxjs

import typingsSlinky.rxjs.internalObservableMod.Observable
import typingsSlinky.rxjs.typesMod.OperatorFunction
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rxjs/internal/operators/buffer", JSImport.Namespace)
@js.native
object bufferMod extends js.Object {
  def buffer[T](closingNotifier: Observable[_]): OperatorFunction[T, js.Array[T]] = js.native
}

