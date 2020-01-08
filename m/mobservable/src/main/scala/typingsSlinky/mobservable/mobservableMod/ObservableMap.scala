package typingsSlinky.mobservable.mobservableMod

import typingsSlinky.mobservable.libObservablemapMod.Entries
import typingsSlinky.mobservable.libObservablemapMod.KeyValueMap
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mobservable", "ObservableMap")
@js.native
class ObservableMap[V] ()
  extends typingsSlinky.mobservable.libObservablemapMod.ObservableMap[V] {
  def this(initialData: Entries[V]) = this()
  def this(initialData: KeyValueMap[V]) = this()
  def this(initialData: Entries[V], valueModeFunc: js.Function) = this()
  def this(initialData: KeyValueMap[V], valueModeFunc: js.Function) = this()
}

