package typingsSlinky.coreDashJs.core

import org.scalablytyped.runtime.TopLevel
import typingsSlinky.std.MapConstructor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("core.Map")
@js.native
class Map[K, V] ()
  extends typingsSlinky.std.Map[K, V] {
  def this(entries: js.Array[js.Tuple2[K, V]]) = this()
  def this(iterable: js.Iterable[js.Tuple2[K, V]]) = this()
}

@JSGlobal("core.Map")
@js.native
object Map extends TopLevel[MapConstructor]

