package typingsSlinky.minappEnv.global

import org.scalablytyped.runtime.TopLevel
import typingsSlinky.minappEnv.Iterable
import typingsSlinky.minappEnv.MapConstructor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Map")
@js.native
class Map[K, V] ()
  extends typingsSlinky.minappEnv.Map[K, V] {
  def this(entries: typingsSlinky.minappEnv.Array[js.Tuple2[K, V]]) = this()
  def this(iterable: Iterable[js.Tuple2[K, V]]) = this()
}

@JSGlobal("Map")
@js.native
object Map extends TopLevel[MapConstructor]

