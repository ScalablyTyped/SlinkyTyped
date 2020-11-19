package typingsSlinky.ramda.toolsMod

import typingsSlinky.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AssocPartialOne[K /* <: /* keyof any */ String */] extends js.Object {
  
  def apply[T](`val`: T): js.Function1[/* obj */ js.Any, (Record[K, T]) with js.Any] = js.native
  def apply[T, U](`val`: T, obj: U): (Record[K, T]) with U = js.native
}
