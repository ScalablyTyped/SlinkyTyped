package typingsSlinky.handsontable.mod.Handsontable.plugins

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CellValue extends BaseCell {
  var error: String | Unit = js.native
  var precedents: js.Array[_] = js.native
  var state: String = js.native
  var value: js.Any = js.native
  def addPrecedent(cellReference: CellReference): Unit = js.native
  def clearPrecedents(): Unit = js.native
  def getError(): String | Unit = js.native
  def getPrecedents(): js.Array[_] = js.native
  def getValue(): js.Any = js.native
  def hasError(): Boolean = js.native
  def hasPrecedent(cellReference: CellReference): Boolean = js.native
  def hasPrecedents(): Boolean = js.native
  def isState(state: Double): Boolean = js.native
  def removePrecedent(cellReference: CellReference): Unit = js.native
  def setError(error: String): Unit = js.native
  def setState(state: Double): Unit = js.native
  def setValue(value: js.Any): Unit = js.native
}

object CellValue {
  @scala.inline
  def apply(
    addPrecedent: CellReference => Unit,
    clearPrecedents: () => Unit,
    columnAbsolute: Boolean,
    columnOffset: Double,
    error: String | Unit,
    getError: () => String | Unit,
    getPrecedents: () => js.Array[_],
    getValue: () => js.Any,
    hasError: () => Boolean,
    hasPrecedent: CellReference => Boolean,
    hasPrecedents: () => Boolean,
    isEqual: BaseCell => Boolean,
    isState: Double => Boolean,
    precedents: js.Array[_],
    removePrecedent: CellReference => Unit,
    rowAbsolute: Boolean,
    rowOffset: Double,
    setError: String => Unit,
    setState: Double => Unit,
    setValue: js.Any => Unit,
    state: String,
    translateTo: (Double, Double) => Unit,
    value: js.Any
  ): CellValue = {
    val __obj = js.Dynamic.literal(addPrecedent = js.Any.fromFunction1(addPrecedent), clearPrecedents = js.Any.fromFunction0(clearPrecedents), columnAbsolute = columnAbsolute.asInstanceOf[js.Any], columnOffset = columnOffset.asInstanceOf[js.Any], error = error.asInstanceOf[js.Any], getError = js.Any.fromFunction0(getError), getPrecedents = js.Any.fromFunction0(getPrecedents), getValue = js.Any.fromFunction0(getValue), hasError = js.Any.fromFunction0(hasError), hasPrecedent = js.Any.fromFunction1(hasPrecedent), hasPrecedents = js.Any.fromFunction0(hasPrecedents), isEqual = js.Any.fromFunction1(isEqual), isState = js.Any.fromFunction1(isState), precedents = precedents.asInstanceOf[js.Any], removePrecedent = js.Any.fromFunction1(removePrecedent), rowAbsolute = rowAbsolute.asInstanceOf[js.Any], rowOffset = rowOffset.asInstanceOf[js.Any], setError = js.Any.fromFunction1(setError), setState = js.Any.fromFunction1(setState), setValue = js.Any.fromFunction1(setValue), state = state.asInstanceOf[js.Any], translateTo = js.Any.fromFunction2(translateTo), value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[CellValue]
  }
  @scala.inline
  implicit class CellValueOps[Self <: CellValue] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAddPrecedent(value: CellReference => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("addPrecedent")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withClearPrecedents(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clearPrecedents")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withError(value: String | Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("error")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGetError(value: () => String | Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getError")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetPrecedents(value: () => js.Array[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getPrecedents")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetValue(value: () => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getValue")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withHasError(value: () => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hasError")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withHasPrecedent(value: CellReference => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hasPrecedent")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withHasPrecedents(value: () => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hasPrecedents")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withIsState(value: Double => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isState")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withPrecedents(value: js.Array[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("precedents")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRemovePrecedent(value: CellReference => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("removePrecedent")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSetError(value: String => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setError")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSetState(value: Double => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setState")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSetValue(value: js.Any => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setValue")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withState(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("state")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withValue(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("value")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

