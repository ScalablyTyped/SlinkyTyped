package typingsSlinky.ramda

import typingsSlinky.std.Exclude
import typingsSlinky.std.Pick
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ramda/src/pick", JSImport.Namespace)
@js.native
object pickMod extends js.Object {
  def default[K /* <: String */](names: js.Array[K]): js.Function1[/* obj */ js.Any, Pick[_, Exclude[String, Exclude[String, K]]]] = js.native
  def default[T, K /* <: String */](names: js.Array[K], obj: T): Pick[T, Exclude[String, Exclude[String, K]]] = js.native
}

