package typingsSlinky.omitJs

import typingsSlinky.std.Exclude
import typingsSlinky.std.Pick
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("omit.js", JSImport.Namespace)
@js.native
object mod extends js.Object {
  
  def default[T, K /* <: /* keyof T */ String */](obj: T, keys: js.Array[K]): Pick[T, Exclude[/* keyof T */ String, K]] = js.native
}
