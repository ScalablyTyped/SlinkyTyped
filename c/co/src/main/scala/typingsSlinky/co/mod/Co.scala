package typingsSlinky.co.mod

import typingsSlinky.std.Parameters
import typingsSlinky.std.ReturnType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Co extends js.Object {
  @JSName("co")
  var co_Original: Co = js.native
  @JSName("default")
  var default_Original: Co = js.native
  def apply[F /* <: js.Function1[/* repeated */ js.Any, js.Iterator[_]] */](
    fn: F,
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<F> is not an array type */ args: Parameters[F]
  ): js.Promise[ExtractType[ReturnType[F]]] = js.native
  def co[F /* <: js.Function1[/* repeated */ js.Any, js.Iterator[_]] */](
    fn: F,
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<F> is not an array type */ args: Parameters[F]
  ): js.Promise[ExtractType[ReturnType[F]]] = js.native
  def default[F /* <: js.Function1[/* repeated */ js.Any, js.Iterator[_]] */](
    fn: F,
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<F> is not an array type */ args: Parameters[F]
  ): js.Promise[ExtractType[ReturnType[F]]] = js.native
  def wrap[F /* <: js.Function1[/* repeated */ js.Any, js.Iterator[_]] */](fn: F): js.Function1[/* args */ Parameters[F], js.Promise[ExtractType[ReturnType[F]]]] = js.native
}

