package typingsSlinky.activexLibreoffice.com_.sun.star.awt

import typingsSlinky.activexLibreoffice.`type`
import typingsSlinky.activexLibreoffice.com_.sun.star.uno.XInterface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** gives access to the value and formatting of a numeric field. */
@js.native
trait XNumericField extends XInterface {
  /** returns the currently set number of decimals. */
  var DecimalDigits: Double = js.native
  /** returns the currently set first value which is set on POS1 key. */
  var First: Double = js.native
  /** returns the currently set last value which is set on END key. */
  var Last: Double = js.native
  /** returns the currently set maximum value that can be entered by the user. */
  var Max: Double = js.native
  /** returns the currently set minimum value that can be entered by the user. */
  var Min: Double = js.native
  /** returns the currently set increment value for the spin button. */
  var SpinSize: Double = js.native
  /** returns the value which is currently displayed in the numeric field. */
  var Value: Double = js.native
  /** returns the currently set number of decimals. */
  def getDecimalDigits(): Double = js.native
  /** returns the currently set first value which is set on POS1 key. */
  def getFirst(): Double = js.native
  /** returns the currently set last value which is set on END key. */
  def getLast(): Double = js.native
  /** returns the currently set maximum value that can be entered by the user. */
  def getMax(): Double = js.native
  /** returns the currently set minimum value that can be entered by the user. */
  def getMin(): Double = js.native
  /** returns the currently set increment value for the spin button. */
  def getSpinSize(): Double = js.native
  /** returns the value which is currently displayed in the numeric field. */
  def getValue(): Double = js.native
  /** returns whether the format is currently checked during user input. */
  def isStrictFormat(): Boolean = js.native
  /** sets the number of decimals. */
  def setDecimalDigits(nDigits: Double): Unit = js.native
  /** sets the first value to be set on POS1 key. */
  def setFirst(Value: Double): Unit = js.native
  /** sets the last value to be set on END key. */
  def setLast(Value: Double): Unit = js.native
  /** sets the maximum value that can be entered by the user. */
  def setMax(Value: Double): Unit = js.native
  /** sets the minimum value that can be entered by the user. */
  def setMin(Value: Double): Unit = js.native
  /** sets the increment value for the spin button. */
  def setSpinSize(Value: Double): Unit = js.native
  /** determines if the format is checked during user input. */
  def setStrictFormat(bStrict: Boolean): Unit = js.native
  /** sets the value which is displayed in the numeric field. */
  def setValue(Value: Double): Unit = js.native
}

object XNumericField {
  @scala.inline
  def apply(
    DecimalDigits: Double,
    First: Double,
    Last: Double,
    Max: Double,
    Min: Double,
    SpinSize: Double,
    Value: Double,
    acquire: () => Unit,
    getDecimalDigits: () => Double,
    getFirst: () => Double,
    getLast: () => Double,
    getMax: () => Double,
    getMin: () => Double,
    getSpinSize: () => Double,
    getValue: () => Double,
    isStrictFormat: () => Boolean,
    queryInterface: `type` => js.Any,
    release: () => Unit,
    setDecimalDigits: Double => Unit,
    setFirst: Double => Unit,
    setLast: Double => Unit,
    setMax: Double => Unit,
    setMin: Double => Unit,
    setSpinSize: Double => Unit,
    setStrictFormat: Boolean => Unit,
    setValue: Double => Unit
  ): XNumericField = {
    val __obj = js.Dynamic.literal(DecimalDigits = DecimalDigits.asInstanceOf[js.Any], First = First.asInstanceOf[js.Any], Last = Last.asInstanceOf[js.Any], Max = Max.asInstanceOf[js.Any], Min = Min.asInstanceOf[js.Any], SpinSize = SpinSize.asInstanceOf[js.Any], Value = Value.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), getDecimalDigits = js.Any.fromFunction0(getDecimalDigits), getFirst = js.Any.fromFunction0(getFirst), getLast = js.Any.fromFunction0(getLast), getMax = js.Any.fromFunction0(getMax), getMin = js.Any.fromFunction0(getMin), getSpinSize = js.Any.fromFunction0(getSpinSize), getValue = js.Any.fromFunction0(getValue), isStrictFormat = js.Any.fromFunction0(isStrictFormat), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), setDecimalDigits = js.Any.fromFunction1(setDecimalDigits), setFirst = js.Any.fromFunction1(setFirst), setLast = js.Any.fromFunction1(setLast), setMax = js.Any.fromFunction1(setMax), setMin = js.Any.fromFunction1(setMin), setSpinSize = js.Any.fromFunction1(setSpinSize), setStrictFormat = js.Any.fromFunction1(setStrictFormat), setValue = js.Any.fromFunction1(setValue))
    __obj.asInstanceOf[XNumericField]
  }
  @scala.inline
  implicit class XNumericFieldOps[Self <: XNumericField] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDecimalDigits(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DecimalDigits")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFirst(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("First")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLast(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Last")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMax(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Max")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMin(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Min")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSpinSize(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SpinSize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withValue(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Value")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGetDecimalDigits(value: () => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getDecimalDigits")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetFirst(value: () => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getFirst")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetLast(value: () => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getLast")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetMax(value: () => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getMax")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetMin(value: () => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getMin")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetSpinSize(value: () => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getSpinSize")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetValue(value: () => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getValue")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withIsStrictFormat(value: () => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isStrictFormat")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withSetDecimalDigits(value: Double => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setDecimalDigits")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSetFirst(value: Double => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setFirst")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSetLast(value: Double => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setLast")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSetMax(value: Double => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setMax")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSetMin(value: Double => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setMin")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSetSpinSize(value: Double => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setSpinSize")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSetStrictFormat(value: Boolean => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setStrictFormat")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSetValue(value: Double => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setValue")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

