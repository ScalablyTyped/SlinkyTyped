package typingsSlinky.mobservable.mobservableMod

import typingsSlinky.mobservable.libObservablemapMod.KeyValueMap
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mobservable", "map")
@js.native
object map extends js.Object {
  def apply[V](): typingsSlinky.mobservable.libObservablemapMod.ObservableMap[V] = js.native
  def apply[V](initialValues: KeyValueMap[V]): typingsSlinky.mobservable.libObservablemapMod.ObservableMap[V] = js.native
  def apply[V](initialValues: KeyValueMap[V], valueModifier: js.Function): typingsSlinky.mobservable.libObservablemapMod.ObservableMap[V] = js.native
}

