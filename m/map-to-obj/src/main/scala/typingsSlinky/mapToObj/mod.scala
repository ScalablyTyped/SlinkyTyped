package typingsSlinky.mapToObj

import typingsSlinky.std.Map
import typingsSlinky.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("map-to-obj", JSImport.Namespace)
@js.native
object mod extends js.Object {
  def apply[K /* <: String | Double | js.Symbol */, V](map: Map[K, V]): Record[K, V] = js.native
}

