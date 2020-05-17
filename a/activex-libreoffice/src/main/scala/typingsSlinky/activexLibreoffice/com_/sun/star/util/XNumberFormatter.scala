package typingsSlinky.activexLibreoffice.com_.sun.star.util

import typingsSlinky.activexLibreoffice.`type`
import typingsSlinky.activexLibreoffice.com_.sun.star.uno.XInterface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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
  implicit class XNumberFormatterOps[Self <: XNumberFormatter] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withNumberFormatsSupplier(value: XNumberFormatsSupplier): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NumberFormatsSupplier")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAttachNumberFormatsSupplier(value: XNumberFormatsSupplier => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("attachNumberFormatsSupplier")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withConvertNumberToString(value: (Double, Double) => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("convertNumberToString")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withConvertStringToNumber(value: (Double, String) => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("convertStringToNumber")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withDetectNumberFormat(value: (Double, String) => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("detectNumberFormat")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withFormatString(value: (Double, String) => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("formatString")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withGetInputString(value: (Double, Double) => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getInputString")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withGetNumberFormatsSupplier(value: () => XNumberFormatsSupplier): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getNumberFormatsSupplier")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withQueryColorForNumber(value: (Double, Double, Color) => Color): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("queryColorForNumber")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withQueryColorForString(value: (Double, String, Color) => Color): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("queryColorForString")(js.Any.fromFunction3(value))
        ret
    }
  }
  
}

