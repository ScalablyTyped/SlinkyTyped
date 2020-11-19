package typingsSlinky.ramda

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("ramda/src/into", JSImport.Namespace)
@js.native
object intoMod extends js.Object {
  
  def default(acc: js.Any): js.Function2[/* xf */ js.Function1[/* repeated */ js.Any, _], /* list */ js.Array[_], js.Array[_]] = js.native
  def default(acc: js.Any, xf: js.Function1[/* repeated */ js.Any, _]): js.Function1[/* list */ js.Array[_], js.Array[_]] = js.native
  def default[T](acc: js.Any, xf: js.Function1[/* repeated */ js.Any, _], list: js.Array[T]): js.Array[T] = js.native
  @JSName("default")
  def default_TR[T, R](acc: js.Any, xf: js.Function1[/* repeated */ js.Any, js.Array[R]], list: js.Array[T]): js.Array[R] = js.native
}
