package typingsSlinky.jupyterlabObservables.observablemapMod

import typingsSlinky.jupyterlabObservables.observablemapMod.ObservableMap.IOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@jupyterlab/observables/lib/observablemap", "ObservableMap")
@js.native
/**
  * Construct a new observable map.
  */
class ObservableMap_[T] () extends IObservableMap[T] {
  def this(options: IOptions[T]) = this()
  var _changed: js.Any = js.native
  var _isDisposed: js.Any = js.native
  var _itemCmp: js.Any = js.native
  var _map: js.Any = js.native
}

