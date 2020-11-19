package typingsSlinky.justPick

import typingsSlinky.std.Pick
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("just-pick", JSImport.Namespace)
@js.native
object mod extends js.Object {
  
  def apply[T, U /* <: /* keyof T */ String */](obj: T, select1: U, selectn: U*): Pick[T, U] = js.native
  def apply[T, U /* <: /* keyof T */ String */](obj: T, select: js.Array[U]): Pick[T, U] = js.native
}
