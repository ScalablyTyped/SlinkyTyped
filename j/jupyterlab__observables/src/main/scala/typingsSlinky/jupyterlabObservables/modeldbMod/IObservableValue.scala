package typingsSlinky.jupyterlabObservables.modeldbMod

import typingsSlinky.jupyterlabObservables.jupyterlabObservablesStrings.Value
import typingsSlinky.jupyterlabObservables.modeldbMod.ObservableValue.IChangedArgs
import typingsSlinky.phosphorCoreutils.jsonMod.JSONValue
import typingsSlinky.phosphorSignaling.mod.ISignal
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IObservableValue extends IObservable {
  /**
    * The changed signal.
    */
  val changed: ISignal[IObservableValue, IChangedArgs] = js.native
  /**
    * The type of this object.
    */
  @JSName("type")
  val type_IObservableValue: Value = js.native
  /**
    * Get the current value, or `undefined` if it has not been set.
    */
  def get(): js.UndefOr[JSONValue] = js.native
  /**
    * Set the value.
    */
  def set(value: JSONValue): Unit = js.native
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
  @scala.inline
  implicit class IObservableValueOps[Self <: IObservableValue] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withChanged(value: ISignal[IObservableValue, IChangedArgs]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("changed")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGet(value: () => js.UndefOr[JSONValue]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("get")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withSet(value: JSONValue => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("set")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withType(value: Value): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

