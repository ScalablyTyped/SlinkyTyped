package typingsSlinky.promiseDotAllsettled

import typingsSlinky.promiseDotAllsettled.implementationMod.PromiseResultTuple
import typingsSlinky.promiseDotAllsettled.implementationMod.PromiseTuple
import typingsSlinky.promiseDotAllsettled.typesMod.PromiseResult
import typingsSlinky.std.Iterable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Fn_Iterable extends js.Object {
  def apply(): js.Promise[js.Array[js.Any]] = js.native
  def apply[T /* <: js.Array[_] */](iterable: PromiseTuple[T]): js.Promise[PromiseResultTuple[T]] = js.native
  def apply[T](iterable: Iterable[js.Promise[T] | T]): js.Promise[js.Array[PromiseResult[T, _]]] = js.native
}

