package typingsSlinky.mobservable.mod

import typingsSlinky.mobservable.observablemapMod.Entries
import typingsSlinky.mobservable.observablemapMod.KeyValueMap
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("mobservable", "ObservableMap")
@js.native
class ObservableMap[V] ()
  extends typingsSlinky.mobservable.observablemapMod.ObservableMap[V] {
  def this(initialData: Entries[V]) = this()
  def this(initialData: KeyValueMap[V]) = this()
  def this(initialData: js.UndefOr[scala.Nothing], valueModeFunc: js.Function) = this()
  def this(initialData: Entries[V], valueModeFunc: js.Function) = this()
  def this(initialData: KeyValueMap[V], valueModeFunc: js.Function) = this()
}
