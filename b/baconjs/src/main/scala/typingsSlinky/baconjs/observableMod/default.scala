package typingsSlinky.baconjs.observableMod

import typingsSlinky.baconjs.describeMod.Desc
import typingsSlinky.baconjs.typesFlatmapMod.SpawnerOrObservable
import typingsSlinky.baconjs.whenMod.ObservableOrSource
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("baconjs/types/observable", JSImport.Default)
@js.native
abstract class default[V] protected ()
  extends Observable[V]
     with ObservableOrSource[V]
     with SpawnerOrObservable[js.Any, V] {
  def this(desc: Desc) = this()
}

