package typingsSlinky.promiseMapLimit

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("promise-map-limit", JSImport.Namespace)
@js.native
object mod extends js.Object {
  
  def apply[T, R](iterable: js.Iterable[T], concurrency: Double, iteratee: IIteratee[T, R]): js.Promise[js.Array[R]] = js.native
  
  type IIteratee[T, R] = js.Function1[/* value */ T, js.Promise[R] | R]
}
