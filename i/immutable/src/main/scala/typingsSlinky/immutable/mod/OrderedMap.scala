package typingsSlinky.immutable.mod

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.std.Iterable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OrderedMap[K, V]
  extends typingsSlinky.immutable.Immutable.Map[K, V] {
  /**
    * Returns a new OrderedMap with only the entries for which the `predicate`
    * function returns true.
    *
    * Note: `filter()` always returns a new instance, even if it results in
    * not filtering out any values.
    */
  @JSName("filter")
  def filter_F_V_OrderedMap[F /* <: V */](predicate: js.Function3[/* value */ V, /* key */ K, /* iter */ this.type, /* is F */ Boolean]): typingsSlinky.immutable.Immutable.OrderedMap[K, F] = js.native
  @JSName("filter")
  def filter_F_V_OrderedMap[F /* <: V */](
    predicate: js.Function3[/* value */ V, /* key */ K, /* iter */ this.type, /* is F */ Boolean],
    context: js.Any
  ): typingsSlinky.immutable.Immutable.OrderedMap[K, F] = js.native
}

@JSImport("immutable", "OrderedMap")
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

