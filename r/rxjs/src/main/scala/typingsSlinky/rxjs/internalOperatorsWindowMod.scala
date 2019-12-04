package typingsSlinky.rxjs

import typingsSlinky.rxjs.internalObservableMod.Observable
import typingsSlinky.rxjs.internalTypesMod.OperatorFunction
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rxjs/internal/operators/window", JSImport.Namespace)
@js.native
object internalOperatorsWindowMod extends js.Object {
  def window[T](windowBoundaries: Observable[_]): OperatorFunction[T, Observable[T]] = js.native
}

