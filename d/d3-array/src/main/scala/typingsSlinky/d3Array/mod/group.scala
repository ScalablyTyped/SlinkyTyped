package typingsSlinky.d3Array.mod

import typingsSlinky.std.Map
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("d3-array", "group")
@js.native
object group extends js.Object {
  def apply[TObject, TKey](a: js.Iterable[TObject], key: js.Function1[/* value */ TObject, TKey]): Map[TKey, js.Array[TObject]] = js.native
}

