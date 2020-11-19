package typingsSlinky.fastMemoize.anon

import typingsSlinky.fastMemoize.mod.Func
import typingsSlinky.fastMemoize.mod.MemoizeFunc
import typingsSlinky.fastMemoize.mod.Options
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Monadic extends js.Object {
  
  def monadic[F /* <: Func */](fn: F): F = js.native
  def monadic[F /* <: Func */](fn: F, options: Options[F]): F = js.native
  @JSName("monadic")
  var monadic_Original: MemoizeFunc = js.native
  
  def variadic[F /* <: Func */](fn: F): F = js.native
  def variadic[F /* <: Func */](fn: F, options: Options[F]): F = js.native
  @JSName("variadic")
  var variadic_Original: MemoizeFunc = js.native
}
