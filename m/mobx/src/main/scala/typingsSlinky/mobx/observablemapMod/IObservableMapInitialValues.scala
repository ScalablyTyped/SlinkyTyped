package typingsSlinky.mobx.observablemapMod

import typingsSlinky.std.Map
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.mobx.observablemapMod.IMapEntries[K, V]
  - typingsSlinky.mobx.observablemapMod.IKeyValueMap[V]
  - typingsSlinky.std.Map[K, V]
*/
trait IObservableMapInitialValues[K, V] extends js.Object

object IObservableMapInitialValues {
  @scala.inline
  implicit def apply[K, V](value: IKeyValueMap[V]): IObservableMapInitialValues[K, V] = value.asInstanceOf[IObservableMapInitialValues[K, V]]
  @scala.inline
  implicit def apply[K, V](value: IMapEntries[K, V]): IObservableMapInitialValues[K, V] = value.asInstanceOf[IObservableMapInitialValues[K, V]]
  @scala.inline
  implicit def apply[K, V](value: Map[K, V]): IObservableMapInitialValues[K, V] = value.asInstanceOf[IObservableMapInitialValues[K, V]]
}

