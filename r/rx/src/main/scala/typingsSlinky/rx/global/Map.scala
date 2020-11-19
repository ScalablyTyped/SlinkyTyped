package typingsSlinky.rx.global

import org.scalablytyped.runtime.TopLevel
import typingsSlinky.rx.Iterable
import typingsSlinky.rx.MapConstructor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("Map")
@js.native
class Map[K, V] ()
  extends typingsSlinky.rx.Map[K, V] {
  def this(iterable: Iterable[js.Tuple2[K, V]]) = this()
}
@JSGlobal("Map")
@js.native
object Map extends TopLevel[MapConstructor]
