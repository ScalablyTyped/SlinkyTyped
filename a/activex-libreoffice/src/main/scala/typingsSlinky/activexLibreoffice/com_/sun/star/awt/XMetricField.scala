package typingsSlinky.activexLibreoffice.com_.sun.star.awt

import typingsSlinky.activexLibreoffice.`type`
import typingsSlinky.activexLibreoffice.com_.sun.star.uno.XInterface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
  implicit class XMetricFieldMutableBuilder[Self <: XMetricField] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDecimalDigits(value: Double): Self = StObject.set(x, "DecimalDigits", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGetCorrectedValue(value: Double => Double): Self = StObject.set(x, "getCorrectedValue", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetDecimalDigits(value: () => Double): Self = StObject.set(x, "getDecimalDigits", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetFirst(value: Double => Double): Self = StObject.set(x, "getFirst", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetLast(value: Double => Double): Self = StObject.set(x, "getLast", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetMax(value: Double => Double): Self = StObject.set(x, "getMax", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetMin(value: Double => Double): Self = StObject.set(x, "getMin", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetSpinSize(value: () => Double): Self = StObject.set(x, "getSpinSize", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetValue(value: Double => Double): Self = StObject.set(x, "getValue", js.Any.fromFunction1(value))
    
    @scala.inline
    def setIsStrictFormat(value: () => Boolean): Self = StObject.set(x, "isStrictFormat", js.Any.fromFunction0(value))
    
    @scala.inline
    def setSetDecimalDigits(value: Double => Unit): Self = StObject.set(x, "setDecimalDigits", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetFirst(value: (Double, Double) => Unit): Self = StObject.set(x, "setFirst", js.Any.fromFunction2(value))
    
    @scala.inline
    def setSetLast(value: (Double, Double) => Unit): Self = StObject.set(x, "setLast", js.Any.fromFunction2(value))
    
    @scala.inline
    def setSetMax(value: (Double, Double) => Unit): Self = StObject.set(x, "setMax", js.Any.fromFunction2(value))
    
    @scala.inline
    def setSetMin(value: (Double, Double) => Unit): Self = StObject.set(x, "setMin", js.Any.fromFunction2(value))
    
    @scala.inline
    def setSetSpinSize(value: Double => Unit): Self = StObject.set(x, "setSpinSize", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetStrictFormat(value: Boolean => Unit): Self = StObject.set(x, "setStrictFormat", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetUserValue(value: (Double, Double) => Unit): Self = StObject.set(x, "setUserValue", js.Any.fromFunction2(value))
    
    @scala.inline
    def setSetValue(value: (Double, Double) => Unit): Self = StObject.set(x, "setValue", js.Any.fromFunction2(value))
    
    @scala.inline
    def setSpinSize(value: Double): Self = StObject.set(x, "SpinSize", value.asInstanceOf[js.Any])
  }
}
