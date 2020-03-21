package typingsSlinky.jupyterlabObservables.modeldbMod

import typingsSlinky.jupyterlabObservables.jupyterlabObservablesStrings.Value
import typingsSlinky.jupyterlabObservables.modeldbMod.ObservableValue.IChangedArgs
import typingsSlinky.phosphorCoreutils.jsonMod.JSONValue
import typingsSlinky.phosphorSignaling.mod.ISignal
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IObservableValue extends IObservable {
  /**
    * The changed signal.
    */
  val changed: ISignal[IObservableValue, IChangedArgs]
  /**
    * The type of this object.
    */
  @JSName("type")
  val type_IObservableValue: Value
  /**
    * Get the current value, or `undefined` if it has not been set.
    */
  def get(): js.UndefOr[JSONValue]
  /**
    * Set the value.
    */
  def set(value: JSONValue): Unit
}

object IObservableValue {
  @scala.inline
  def apply(
    changed: ISignal[IObservableValue, IChangedArgs],
    dispose: () => Unit,
    get: () => js.UndefOr[JSONValue],
    isDisposed: Boolean,
    set: JSONValue => Unit,
    `type`: Value
  ): IObservableValue = {
    val __obj = js.Dynamic.literal(changed = changed.asInstanceOf[js.Any], dispose = js.Any.fromFunction0(dispose), get = js.Any.fromFunction0(get), isDisposed = isDisposed.asInstanceOf[js.Any], set = js.Any.fromFunction1(set))
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[IObservableValue]
  }
}

