package typingsSlinky.sanctuary.anon

import typingsSlinky.sanctuary.mod.Apply
import typingsSlinky.sanctuary.mod.Fn
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Fn0[A, B, C, D] extends js.Object {
  
  def apply(x: Apply[A]): js.Function1[/* y */ Apply[B], js.Function1[/* z */ Apply[C], Apply[D]]] = js.native
  def apply[X](x: Fn[X, A]): js.Function1[/* y */ Fn[X, B], js.Function1[/* z */ Fn[X, C], Fn[X, D]]] = js.native
}
