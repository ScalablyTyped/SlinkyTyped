package typingsSlinky.activexLibreoffice.com_.sun.star.i18n

import typingsSlinky.activexLibreoffice.`type`
import typingsSlinky.activexLibreoffice.com_.sun.star.lang.Locale
import typingsSlinky.activexLibreoffice.com_.sun.star.uno.XInterface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Methods to convert between strings of ASCII Arabic digits and native numeral strings.
  * @since OOo 1.1.2
  */
@js.native
trait XNativeNumberSupplier extends XInterface {
  /**
    * Convert XML attributes to a NatNum value.
    * @returns One of {@link NativeNumberMode}
    */
  def convertFromXmlAttributes(aAttr: NativeNumberXmlAttributes): Double = js.native
  /**
    * Convert a specific NatNum/Locale combination to attributes used in the XML file format.
    * @param nNativeNumberMode One of {@link NativeNumberMode} values.
    * @param aLocale The locale.
    */
  def convertToXmlAttributes(aLocale: Locale, nNativeNumberMode: Double): NativeNumberXmlAttributes = js.native
  /**
    * Returns native number string for given number string.
    * @param aNumberString The input string.
    * @param nNativeNumberMode One of {@link NativeNumberMode} values.
    * @param aLocale The locale.
    */
  def getNativeNumberString(aNumberString: String, aLocale: Locale, nNativeNumberMode: Double): String = js.native
  /**
    * Check if the NatNum is valid for the given locale.
    * @param nNativeNumberMode One of {@link NativeNumberMode} values.
    * @param aLocale The locale.
    */
  def isValidNatNum(aLocale: Locale, nNativeNumberMode: Double): Boolean = js.native
}

object XNativeNumberSupplier {
  @scala.inline
  def apply(
    acquire: () => Unit,
    convertFromXmlAttributes: NativeNumberXmlAttributes => Double,
    convertToXmlAttributes: (Locale, Double) => NativeNumberXmlAttributes,
    getNativeNumberString: (String, Locale, Double) => String,
    isValidNatNum: (Locale, Double) => Boolean,
    queryInterface: `type` => js.Any,
    release: () => Unit
  ): XNativeNumberSupplier = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), convertFromXmlAttributes = js.Any.fromFunction1(convertFromXmlAttributes), convertToXmlAttributes = js.Any.fromFunction2(convertToXmlAttributes), getNativeNumberString = js.Any.fromFunction3(getNativeNumberString), isValidNatNum = js.Any.fromFunction2(isValidNatNum), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
    __obj.asInstanceOf[XNativeNumberSupplier]
  }
  @scala.inline
  implicit class XNativeNumberSupplierOps[Self <: XNativeNumberSupplier] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withConvertFromXmlAttributes(value: NativeNumberXmlAttributes => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("convertFromXmlAttributes")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withConvertToXmlAttributes(value: (Locale, Double) => NativeNumberXmlAttributes): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("convertToXmlAttributes")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withGetNativeNumberString(value: (String, Locale, Double) => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getNativeNumberString")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withIsValidNatNum(value: (Locale, Double) => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isValidNatNum")(js.Any.fromFunction2(value))
        ret
    }
  }
  
}

