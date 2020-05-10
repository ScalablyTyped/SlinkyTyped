package typingsSlinky.jupyterlabObservables.observablelistMod

import typingsSlinky.jupyterlabObservables.observablelistMod.ObservableList.IOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@jupyterlab/observables/lib/observablelist", "ObservableList")
@js.native
/**
  * Construct a new observable map.
  */
class ObservableList_[T] () extends IObservableList[T] {
  def this(options: IOptions[T]) = this()
  var _array: js.Any = js.native
  var _changed: js.Any = js.native
  var _isDisposed: js.Any = js.native
  var _itemCmp: js.Any = js.native
}

