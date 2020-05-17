package typingsSlinky.mobx.observablemapMod

import typingsSlinky.mobx.anon.Name
import typingsSlinky.mobx.anon.NewValue
import typingsSlinky.mobx.anon.Object
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.mobx.anon.Name[K, V]
  - typingsSlinky.mobx.anon.NewValue[K, V]
  - typingsSlinky.mobx.anon.Object[K, V]
*/
trait IMapDidChange[K, V] extends js.Object

object IMapDidChange {
  @scala.inline
  implicit def apply[K, V](value: Name[K, V]): IMapDidChange[K, V] = value.asInstanceOf[IMapDidChange[K, V]]
  @scala.inline
  implicit def apply[K, V](value: NewValue[K, V]): IMapDidChange[K, V] = value.asInstanceOf[IMapDidChange[K, V]]
  @scala.inline
  implicit def apply[K, V](value: Object[K, V]): IMapDidChange[K, V] = value.asInstanceOf[IMapDidChange[K, V]]
}

