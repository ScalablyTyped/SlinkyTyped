package typingsSlinky.mobservable.coreMod

import typingsSlinky.mobservable.observablemapMod.KeyValueMap
import typingsSlinky.mobservable.observablemapMod.ObservableMap
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("mobservable/lib/core", "map")
@js.native
object map extends js.Object {
  
  def apply[V](): ObservableMap[V] = js.native
  def apply[V](initialValues: js.UndefOr[scala.Nothing], valueModifier: js.Function): ObservableMap[V] = js.native
  def apply[V](initialValues: KeyValueMap[V]): ObservableMap[V] = js.native
  def apply[V](initialValues: KeyValueMap[V], valueModifier: js.Function): ObservableMap[V] = js.native
}
