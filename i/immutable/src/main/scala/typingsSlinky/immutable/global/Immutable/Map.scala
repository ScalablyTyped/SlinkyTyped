package typingsSlinky.immutable.global.Immutable

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Immutable.Map")
@js.native
object Map extends js.Object {
  def apply(): typingsSlinky.immutable.Immutable.Map[_, _] = js.native
  def apply[V](obj: StringDictionary[V]): typingsSlinky.immutable.Immutable.Map[String, V] = js.native
  def apply[K, V](collection: js.Iterable[js.Tuple2[K, V]]): typingsSlinky.immutable.Immutable.Map[K, V] = js.native
  /**
    * True if the provided value is a Map
    *
    * <!-- runkit:activate -->
    * ```js
    * const { Map } = require('immutable')
    * Map.isMap({}) // false
    * Map.isMap(Map()) // true
    * ```
    */
  def isMap(maybeMap: js.Any): /* is immutable.Immutable.Map<any, any> */ Boolean = js.native
  /**
    * Creates a new Map from alternating keys and values
    *
    * <!-- runkit:activate -->
    * ```js
    * const { Map } = require('immutable')
    * Map.of(
    *   'key', 'value',
    *   'numerical value', 3,
    *    0, 'numerical key'
    * )
    * // Map { 0: "numerical key", "key": "value", "numerical value": 3 }
    * ```
    *
    * @deprecated Use Map([ [ 'k', 'v' ] ]) or Map({ k: 'v' })
    */
  def of(keyValues: js.Any*): typingsSlinky.immutable.Immutable.Map[_, _] = js.native
}

