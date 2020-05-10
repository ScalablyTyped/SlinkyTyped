package typingsSlinky.jupyterlabObservables.modeldbMod

import typingsSlinky.jupyterlabObservables.modeldbMod.ObservableValue.IChangedArgs
import typingsSlinky.phosphorCoreutils.jsonMod.JSONValue
import typingsSlinky.phosphorSignaling.mod.ISignal
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@jupyterlab/observables/lib/modeldb", "ObservableValue")
@js.native
/**
  * Constructor for the value.
  *
  * @param initialValue: the starting value for the `ObservableValue`.
  */
class ObservableValue () extends IObservableValue {
  def this(initialValue: JSONValue) = this()
  var _changed: js.Any = js.native
  var _isDisposed: js.Any = js.native
  var _value: js.Any = js.native
  /**
    * The changed signal.
    */
  @JSName("changed")
  val changed_ObservableValue: ISignal[this.type, IChangedArgs] = js.native
}

@JSImport("@jupyterlab/observables/lib/modeldb", "ObservableValue")
@js.native
object ObservableValue extends js.Object {
  /**
    * The changed args object emitted by the `IObservableValue`.
    */
  @js.native
  class IChangedArgs () extends js.Object {
    /**
      * The new value.
      */
    var newValue: js.UndefOr[JSONValue] = js.native
    /**
      * The old value.
      */
    var oldValue: js.UndefOr[JSONValue] = js.native
  }
  
}

