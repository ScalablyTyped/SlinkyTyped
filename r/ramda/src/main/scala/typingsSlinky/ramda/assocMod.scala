package typingsSlinky.ramda

import typingsSlinky.ramda.toolsMod.AssocPartialOne
import typingsSlinky.ramda.toolsMod.Placeholder
import typingsSlinky.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("ramda/src/assoc", JSImport.Namespace)
@js.native
object assocMod extends js.Object {
  
  def default[K /* <: String */](prop: K): AssocPartialOne[K] = js.native
  def default[T, U](__ : Placeholder, `val`: T, obj: U): js.Function1[/* prop */ String, (Record[String, T]) with U] = js.native
  def default[U, K /* <: String */](prop: K, __ : Placeholder, obj: U): js.Function1[/* val */ js.Any, (Record[K, _]) with U] = js.native
  def default[T, K /* <: String */](prop: K, `val`: T): js.Function1[/* obj */ js.Any, (Record[K, T]) with js.Any] = js.native
  def default[T, U, K /* <: String */](prop: K, `val`: T, obj: U): (Record[K, T]) with U = js.native
}
