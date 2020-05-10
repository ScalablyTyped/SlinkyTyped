package typingsSlinky.jupyterlabObservables.observablestringMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@jupyterlab/observables/lib/observablestring", "ObservableString")
@js.native
/**
  * Construct a new observable string.
  */
class ObservableString () extends IObservableString {
  def this(initialText: String) = this()
  var _changed: js.Any = js.native
  var _isDisposed: js.Any = js.native
  var _text: js.Any = js.native
}

