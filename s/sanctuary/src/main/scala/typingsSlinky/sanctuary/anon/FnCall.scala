package typingsSlinky.sanctuary.anon

import typingsSlinky.sanctuary.mod.Fn
import typingsSlinky.sanctuary.mod.Functor
import typingsSlinky.sanctuary.mod.StrMap
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FnCall[A, B] extends js.Object {
  
  def apply(q: js.Array[A]): js.Array[B] = js.native
  def apply(q: Functor[A]): Functor[B] = js.native
  def apply(q: StrMap[A]): StrMap[B] = js.native
  def apply[C](q: Fn[C, A]): Fn[C, B] = js.native
}
