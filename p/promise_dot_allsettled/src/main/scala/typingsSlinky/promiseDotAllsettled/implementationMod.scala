package typingsSlinky.promiseDotAllsettled

import typingsSlinky.promiseDotAllsettled.implementationMod.PromiseResultTuple
import typingsSlinky.promiseDotAllsettled.implementationMod.PromiseTuple
import typingsSlinky.promiseDotAllsettled.typesMod.PromiseResult
import typingsSlinky.std.Iterable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("promise.allsettled/implementation", JSImport.Namespace)
@js.native
object implementationMod extends js.Object {
  def apply(): js.Promise[js.Array[js.Any]] = js.native
  def apply[T /* <: js.Array[_] */](iterable: PromiseTuple[T]): js.Promise[PromiseResultTuple[T]] = js.native
  def apply[T](iterable: Iterable[js.Promise[T] | T]): js.Promise[js.Array[PromiseResult[T, _]]] = js.native
  type PromiseResultTuple[T /* <: js.Array[_] */] = /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in keyof T ]: promise.allsettled.promise.allsettled/types.PromiseResult<T[P], unknown>}
    */ typingsSlinky.promiseDotAllsettled.promiseDotAllsettledStrings.PromiseResultTuple with T
  type PromiseTuple[T /* <: js.Array[_] */] = /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in keyof T ]: std.Promise<T[P]> | T[P]}
    */ typingsSlinky.promiseDotAllsettled.promiseDotAllsettledStrings.PromiseTuple with js.Any
}

