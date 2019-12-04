package typingsSlinky.rxjs

import typingsSlinky.rxjs.internalObservableMod.Observable
import typingsSlinky.rxjs.internalTypesMod.MonoTypeOperatorFunction
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rxjs/internal/operators/single", JSImport.Namespace)
@js.native
object internalOperatorsSingleMod extends js.Object {
  def single[T](): MonoTypeOperatorFunction[T] = js.native
  def single[T](predicate: js.Function3[/* value */ T, /* index */ Double, /* source */ Observable[T], Boolean]): MonoTypeOperatorFunction[T] = js.native
}

