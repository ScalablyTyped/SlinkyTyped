package typingsSlinky.fastMemoize

import typingsSlinky.fastMemoize.mod.Func
import typingsSlinky.fastMemoize.mod.MemoizeFunc
import typingsSlinky.fastMemoize.mod.Options
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonMonadic extends js.Object {
  @JSName("monadic")
  var monadic_Original: MemoizeFunc = js.native
  @JSName("variadic")
  var variadic_Original: MemoizeFunc = js.native
  def monadic[F /* <: Func */](fn: F): F = js.native
  def monadic[F /* <: Func */](fn: F, options: Options[F]): F = js.native
  def variadic[F /* <: Func */](fn: F): F = js.native
  def variadic[F /* <: Func */](fn: F, options: Options[F]): F = js.native
}

