package typingsSlinky.activexLibreoffice.com_.sun.star.awt

import typingsSlinky.activexLibreoffice.`type`
import typingsSlinky.activexLibreoffice.com_.sun.star.uno.XInterface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** gives access to the value and formatting of a metric field. */
@js.native
trait XMetricField extends XInterface {
  /** returns the currently set number of decimals. */
  var DecimalDigits: Double = js.native
  /** returns the currently set increment value for the spin button. */
  var SpinSize: Double = js.native
  /** returns the corrected value which is displayed in the metric field. */
  def getCorrectedValue(FieldUnit: Double): Double = js.native
  /** returns the currently set number of decimals. */
  def getDecimalDigits(): Double = js.native
  /** returns the currently set first value which is set on POS1 key. */
  def getFirst(FieldUnit: Double): Double = js.native
  /** returns the currently set last value which is set on END key. */
  def getLast(FieldUnit: Double): Double = js.native
  /** returns the currently set maximum value that can be entered by the user. */
  def getMax(FieldUnit: Double): Double = js.native
  /** returns the currently set minimum value that can be entered by the user. */
  def getMin(FieldUnit: Double): Double = js.native
  /** returns the currently set increment value for the spin button. */
  def getSpinSize(): Double = js.native
  /** returns the value which is currently displayed in the metric field. */
  def getValue(FieldUnit: Double): Double = js.native
  /** returns whether the format is currently checked during user input. */
  def isStrictFormat(): Boolean = js.native
  /** sets the number of decimals. */
  def setDecimalDigits(nDigits: Double): Unit = js.native
  /** sets the first value to be set on POS1 key. */
  def setFirst(Value: Double, FieldUnit: Double): Unit = js.native
  /** sets the last value to be set on END key. */
  def setLast(Value: Double, FieldUnit: Double): Unit = js.native
  /** sets the maximum value that can be entered by the user. */
  def setMax(Value: Double, FieldUnit: Double): Unit = js.native
  /** sets the minimum value that can be entered by the user. */
  def setMin(Value: Double, FieldUnit: Double): Unit = js.native
  /** sets the increment value for the spin button. */
  def setSpinSize(Value: Double): Unit = js.native
  /** determines if the format is checked during user input. */
  def setStrictFormat(bStrict: Boolean): Unit = js.native
  /** sets the user value which is displayed in the metric field. */
  def setUserValue(Value: Double, FieldUnit: Double): Unit = js.native
  /** sets the value which is displayed in the metric field. */
  def setValue(Value: Double, FieldUnit: Double): Unit = js.native
}

object XMetricField {
  @scala.inline
  def apply(
    DecimalDigits: Double,
    SpinSize: Double,
    acquire: () => Unit,
    getCorrectedValue: Double => Double,
    getDecimalDigits: () => Double,
    getFirst: Double => Double,
    getLast: Double => Double,
    getMax: Double => Double,
    getMin: Double => Double,
    getSpinSize: () => Double,
    getValue: Double => Double,
    isStrictFormat: () => Boolean,
    queryInterface: `type` => js.Any,
    release: () => Unit,
    setDecimalDigits: Double => Unit,
    setFirst: (Double, Double) => Unit,
    setLast: (Double, Double) => Unit,
    setMax: (Double, Double) => Unit,
    setMin: (Double, Double) => Unit,
    setSpinSize: Double => Unit,
    setStrictFormat: Boolean => Unit,
    setUserValue: (Double, Double) => Unit,
    setValue: (Double, Double) => Unit
  ): XMetricField = {
    val __obj = js.Dynamic.literal(DecimalDigits = DecimalDigits.asInstanceOf[js.Any], SpinSize = SpinSize.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), getCorrectedValue = js.Any.fromFunction1(getCorrectedValue), getDecimalDigits = js.Any.fromFunction0(getDecimalDigits), getFirst = js.Any.fromFunction1(getFirst), getLast = js.Any.fromFunction1(getLast), getMax = js.Any.fromFunction1(getMax), getMin = js.Any.fromFunction1(getMin), getSpinSize = js.Any.fromFunction0(getSpinSize), getValue = js.Any.fromFunction1(getValue), isStrictFormat = js.Any.fromFunction0(isStrictFormat), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), setDecimalDigits = js.Any.fromFunction1(setDecimalDigits), setFirst = js.Any.fromFunction2(setFirst), setLast = js.Any.fromFunction2(setLast), setMax = js.Any.fromFunction2(setMax), setMin = js.Any.fromFunction2(setMin), setSpinSize = js.Any.fromFunction1(setSpinSize), setStrictFormat = js.Any.fromFunction1(setStrictFormat), setUserValue = js.Any.fromFunction2(setUserValue), setValue = js.Any.fromFunction2(setValue))
    __obj.asInstanceOf[XMetricField]
  }
  @scala.inline
  implicit class XMetricFieldOps[Self <: XMetricField] (val x: Self) extends AnyVal {
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
    def withSpinSize(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SpinSize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGetCorrectedValue(value: Double => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getCorrectedValue")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGetDecimalDigits(value: () => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getDecimalDigits")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetFirst(value: Double => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getFirst")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGetLast(value: Double => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getLast")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGetMax(value: Double => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getMax")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGetMin(value: Double => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getMin")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGetSpinSize(value: () => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getSpinSize")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetValue(value: Double => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getValue")(js.Any.fromFunction1(value))
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
    def withSetFirst(value: (Double, Double) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setFirst")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withSetLast(value: (Double, Double) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setLast")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withSetMax(value: (Double, Double) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setMax")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withSetMin(value: (Double, Double) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setMin")(js.Any.fromFunction2(value))
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
    def withSetUserValue(value: (Double, Double) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setUserValue")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withSetValue(value: (Double, Double) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setValue")(js.Any.fromFunction2(value))
        ret
    }
  }
  
}

