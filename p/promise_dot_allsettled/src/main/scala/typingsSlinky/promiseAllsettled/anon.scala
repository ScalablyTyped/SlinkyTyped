package typingsSlinky.promiseAllsettled

import typingsSlinky.promiseAllsettled.implementationMod.PromiseResultTuple
import typingsSlinky.promiseAllsettled.implementationMod.PromiseTuple
import typingsSlinky.promiseAllsettled.typesMod.PromiseResult
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait FnCall extends StObject {
    
    def apply(): js.Promise[js.Array[js.Any]] = js.native
    def apply[T](iterable: js.Iterable[js.Promise[T] | T]): js.Promise[js.Array[PromiseResult[T, _]]] = js.native
    def apply[T /* <: Array[js.Any] */](iterable: PromiseTuple[T]): js.Promise[PromiseResultTuple[T]] = js.native
  }
}
