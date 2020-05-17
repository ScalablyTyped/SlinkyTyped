package typingsSlinky.angularCompiler.srcUtilMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - T
  - js.Promise[T]
*/
trait SyncAsync[T] extends js.Object

@JSImport("@angular/compiler/src/util", "SyncAsync")
@js.native
object SyncAsync extends js.Object {
  def all[T](syncAsyncValues: js.Array[SyncAsync[T]]): SyncAsync[js.Array[T]] = js.native
  def assertSync[T](value: SyncAsync[T]): T = js.native
  def `then`[T, R](value: SyncAsync[T], cb: js.Function1[/* value */ T, SyncAsync[R]]): SyncAsync[R] = js.native
}

