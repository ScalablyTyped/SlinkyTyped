package typingsSlinky.promiseAllsettled

import typingsSlinky.promiseAllsettled.implementationMod.PromiseResultTuple
import typingsSlinky.promiseAllsettled.implementationMod.PromiseTuple
import typingsSlinky.promiseAllsettled.typesMod.PromiseResult
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobalScope
@js.native
object anon extends js.Object {
  
  @js.native
  trait FnCall extends js.Object {
    
    def apply(): js.Promise[js.Array[js.Any]] = js.native
    def apply[T /* <: Array[js.Any] */](iterable: PromiseTuple[T]): js.Promise[PromiseResultTuple[T]] = js.native
    def apply[T](iterable: js.Iterable[js.Promise[T] | T]): js.Promise[js.Array[PromiseResult[T, _]]] = js.native
  }
}
