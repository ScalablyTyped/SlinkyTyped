package typingsSlinky.mobservable.mod

import typingsSlinky.mobservable.observablemapMod.KeyValueMap
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mobservable", "map")
@js.native
object map extends js.Object {
  def apply[V](): typingsSlinky.mobservable.observablemapMod.ObservableMap[V] = js.native
  def apply[V](initialValues: js.UndefOr[scala.Nothing], valueModifier: js.Function): typingsSlinky.mobservable.observablemapMod.ObservableMap[V] = js.native
  def apply[V](initialValues: KeyValueMap[V]): typingsSlinky.mobservable.observablemapMod.ObservableMap[V] = js.native
  def apply[V](initialValues: KeyValueMap[V], valueModifier: js.Function): typingsSlinky.mobservable.observablemapMod.ObservableMap[V] = js.native
}

