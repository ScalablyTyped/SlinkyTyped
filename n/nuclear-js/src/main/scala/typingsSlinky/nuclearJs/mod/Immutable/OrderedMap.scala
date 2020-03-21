package typingsSlinky.nuclearJs.mod.Immutable

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.std.Iterable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("nuclear-js", "Immutable.OrderedMap")
@js.native
object OrderedMap extends js.Object {
  def apply(): typingsSlinky.immutable.Immutable.OrderedMap[_, _] = js.native
  def apply[V](obj: StringDictionary[V]): typingsSlinky.immutable.Immutable.OrderedMap[String, V] = js.native
  def apply[K, V](collection: Iterable[js.Tuple2[K, V]]): typingsSlinky.immutable.Immutable.OrderedMap[K, V] = js.native
  /**
    * True if the provided value is an OrderedMap.
    */
  def isOrderedMap(maybeOrderedMap: js.Any): /* is immutable.Immutable.OrderedMap<any, any> */ Boolean = js.native
}

