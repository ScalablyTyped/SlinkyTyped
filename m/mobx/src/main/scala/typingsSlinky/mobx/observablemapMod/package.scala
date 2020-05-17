package typingsSlinky.mobx

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object observablemapMod {
  type IKeyValueMap[V] = org.scalablytyped.runtime.StringDictionary[V]
  type IMapEntries[K, V] = js.Array[typingsSlinky.mobx.observablemapMod.IMapEntry[K, V]]
  type IMapEntry[K, V] = js.Tuple2[K, V]
}
