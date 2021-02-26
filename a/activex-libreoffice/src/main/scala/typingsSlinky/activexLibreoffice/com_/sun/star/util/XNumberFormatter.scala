package typingsSlinky.activexLibreoffice.com_.sun.star.util

import typingsSlinky.activexLibreoffice.`type`
import typingsSlinky.activexLibreoffice.com_.sun.star.uno.XInterface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** represents a number formatter. */
@js.native
trait XNumberFormatter extends XInterface {
  
  /** @returns the attached {@link XNumberFormatsSupplier} . */
  val NumberFormatsSupplier: XNumberFormatsSupplier = js.native
  
  /**
    * attaches an {@link XNumberFormatsSupplier} to this {@link NumberFormatter} .
    *
    * This {@link NumberFormatter} will only use the {@link NumberFormats} specified in the attached {@link XNumberFormatsSupplier} . Without an attached
    * {@link XNumberFormatsSupplier} , no formatting is possible.
    */
  def attachNumberFormatsSupplier(xSupplier: XNumberFormatsSupplier): Unit = js.native
  
  /** converts a number into a string. */
  def convertNumberToString(nKey: Double, fValue: Double): String = js.native
  
  /**
    * converts a string which contains a formatted number into a number.
    *
    * If this is a text format, the string will not be converted.
    */
  def convertStringToNumber(nKey: Double, aString: String): Double = js.native
  
  /** detects the number format in a string which contains a formatted number. */
  def detectNumberFormat(nKey: Double, aString: String): Double = js.native
  
  /** converts a string into another string. */
  def formatString(nKey: Double, aString: String): String = js.native
  
  /**
    * converts a number into a string with the specified format.
    *
    * This string can always be converted back to a number using the same format.
    */
  def getInputString(nKey: Double, fValue: Double): String = js.native
  
  /** @returns the attached {@link XNumberFormatsSupplier} . */
  def getNumberFormatsSupplier(): XNumberFormatsSupplier = js.native
  
  /** @returns the color which is specified for the given value in the number format, which is otherwise the value of **aDefaultColor** . */
  def queryColorForNumber(nKey: Double, fValue: Double, aDefaultColor: Color): Color = js.native
  
  /** @returns the color which is specified for the given string in the number format, which is otherwise the value of **aDefaultColor** . */
  def queryColorForString(nKey: Double, aString: String, aDefaultColor: Color): Color = js.native
}
object XNumberFormatter {
  
  @scala.inline
  def apply(
    NumberFormatsSupplier: XNumberFormatsSupplier,
    acquire: () => Unit,
    attachNumberFormatsSupplier: XNumberFormatsSupplier => Unit,
    convertNumberToString: (Double, Double) => String,
    convertStringToNumber: (Double, String) => Double,
    detectNumberFormat: (Double, String) => Double,
    formatString: (Double, String) => String,
    getInputString: (Double, Double) => String,
    getNumberFormatsSupplier: () => XNumberFormatsSupplier,
    queryColorForNumber: (Double, Double, Color) => Color,
    queryColorForString: (Double, String, Color) => Color,
    queryInterface: `type` => js.Any,
    release: () => Unit
  ): XNumberFormatter = {
    val __obj = js.Dynamic.literal(NumberFormatsSupplier = NumberFormatsSupplier.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), attachNumberFormatsSupplier = js.Any.fromFunction1(attachNumberFormatsSupplier), convertNumberToString = js.Any.fromFunction2(convertNumberToString), convertStringToNumber = js.Any.fromFunction2(convertStringToNumber), detectNumberFormat = js.Any.fromFunction2(detectNumberFormat), formatString = js.Any.fromFunction2(formatString), getInputString = js.Any.fromFunction2(getInputString), getNumberFormatsSupplier = js.Any.fromFunction0(getNumberFormatsSupplier), queryColorForNumber = js.Any.fromFunction3(queryColorForNumber), queryColorForString = js.Any.fromFunction3(queryColorForString), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
    __obj.asInstanceOf[XNumberFormatter]
  }
  
  @scala.inline
  implicit class XNumberFormatterMutableBuilder[Self <: XNumberFormatter] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAttachNumberFormatsSupplier(value: XNumberFormatsSupplier => Unit): Self = StObject.set(x, "attachNumberFormatsSupplier", js.Any.fromFunction1(value))
    
    @scala.inline
    def setConvertNumberToString(value: (Double, Double) => String): Self = StObject.set(x, "convertNumberToString", js.Any.fromFunction2(value))
    
    @scala.inline
    def setConvertStringToNumber(value: (Double, String) => Double): Self = StObject.set(x, "convertStringToNumber", js.Any.fromFunction2(value))
    
    @scala.inline
    def setDetectNumberFormat(value: (Double, String) => Double): Self = StObject.set(x, "detectNumberFormat", js.Any.fromFunction2(value))
    
    @scala.inline
    def setFormatString(value: (Double, String) => String): Self = StObject.set(x, "formatString", js.Any.fromFunction2(value))
    
    @scala.inline
    def setGetInputString(value: (Double, Double) => String): Self = StObject.set(x, "getInputString", js.Any.fromFunction2(value))
    
    @scala.inline
    def setGetNumberFormatsSupplier(value: () => XNumberFormatsSupplier): Self = StObject.set(x, "getNumberFormatsSupplier", js.Any.fromFunction0(value))
    
    @scala.inline
    def setNumberFormatsSupplier(value: XNumberFormatsSupplier): Self = StObject.set(x, "NumberFormatsSupplier", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQueryColorForNumber(value: (Double, Double, Color) => Color): Self = StObject.set(x, "queryColorForNumber", js.Any.fromFunction3(value))
    
    @scala.inline
    def setQueryColorForString(value: (Double, String, Color) => Color): Self = StObject.set(x, "queryColorForString", js.Any.fromFunction3(value))
  }
}
