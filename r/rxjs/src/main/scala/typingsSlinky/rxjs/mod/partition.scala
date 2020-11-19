package typingsSlinky.rxjs.mod

import typingsSlinky.rxjs.internalObservableMod.Observable
import typingsSlinky.rxjs.typesMod.ObservableInput
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("rxjs", "partition")
@js.native
object partition extends js.Object {
  
  def apply[T](source: ObservableInput[T], predicate: js.Function2[/* value */ T, /* index */ Double, Boolean]): js.Tuple2[Observable[T], Observable[T]] = js.native
  def apply[T](
    source: ObservableInput[T],
    predicate: js.Function2[/* value */ T, /* index */ Double, Boolean],
    thisArg: js.Any
  ): js.Tuple2[Observable[T], Observable[T]] = js.native
}
