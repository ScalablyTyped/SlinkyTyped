package typingsSlinky.jupyterlabObservables.observablestringMod

import typingsSlinky.jupyterlabObservables.modeldbMod.IObservable
import typingsSlinky.jupyterlabObservables.observablestringMod.IObservableString.IChangedArgs
import typingsSlinky.phosphorSignaling.mod.ISignal
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IObservableString_ extends IObservable {
  /**
    * A signal emitted when the string has changed.
    */
  val changed: ISignal[this.type, IChangedArgs] = js.native
  /**
    * The value of the string.
    */
  var text: String = js.native
  /**
    * The type of the Observable.
    */
  @JSName("type")
  var type_IObservableString_ : typingsSlinky.jupyterlabObservables.jupyterlabObservablesStrings.String = js.native
  /**
    * Set the ObservableString to an empty string.
    */
  def clear(): Unit = js.native
  /**
    * Insert a substring.
    *
    * @param index - The starting index.
    *
    * @param text - The substring to insert.
    */
  def insert(index: Double, text: String): Unit = js.native
  /**
    * Remove a substring.
    *
    * @param start - The starting index.
    *
    * @param end - The ending index.
    */
  def remove(start: Double, end: Double): Unit = js.native
}

object IObservableString_ {
  @scala.inline
  def apply(
    changed: ISignal[IObservableString_, IChangedArgs],
    clear: () => Unit,
    dispose: () => Unit,
    insert: (Double, String) => Unit,
    isDisposed: Boolean,
    remove: (Double, Double) => Unit,
    text: String,
    `type`: typingsSlinky.jupyterlabObservables.jupyterlabObservablesStrings.String
  ): IObservableString_ = {
    val __obj = js.Dynamic.literal(changed = changed.asInstanceOf[js.Any], clear = js.Any.fromFunction0(clear), dispose = js.Any.fromFunction0(dispose), insert = js.Any.fromFunction2(insert), isDisposed = isDisposed.asInstanceOf[js.Any], remove = js.Any.fromFunction2(remove), text = text.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[IObservableString_]
  }
  @scala.inline
  implicit class IObservableString_Ops[Self <: IObservableString_] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withChanged(value: ISignal[IObservableString_, IChangedArgs]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("changed")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withClear(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clear")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withInsert(value: (Double, String) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("insert")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withRemove(value: (Double, Double) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("remove")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withText(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("text")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withType(value: typingsSlinky.jupyterlabObservables.jupyterlabObservablesStrings.String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

