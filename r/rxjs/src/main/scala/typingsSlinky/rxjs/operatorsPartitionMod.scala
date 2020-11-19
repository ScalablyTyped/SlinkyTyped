package typingsSlinky.rxjs

import typingsSlinky.rxjs.internalObservableMod.Observable
import typingsSlinky.rxjs.typesMod.UnaryFunction
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("rxjs/internal/operators/partition", JSImport.Namespace)
@js.native
object operatorsPartitionMod extends js.Object {
  
  def partition[T](predicate: js.Function2[/* value */ T, /* index */ Double, Boolean]): UnaryFunction[Observable[T], js.Tuple2[Observable[T], Observable[T]]] = js.native
  def partition[T](predicate: js.Function2[/* value */ T, /* index */ Double, Boolean], thisArg: js.Any): UnaryFunction[Observable[T], js.Tuple2[Observable[T], Observable[T]]] = js.native
}
