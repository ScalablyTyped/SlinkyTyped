package typingsSlinky.activexLibreoffice.com_.sun.star.util

import typingsSlinky.activexLibreoffice.`type`
import typingsSlinky.activexLibreoffice.com_.sun.star.lang.Locale
import typingsSlinky.activexLibreoffice.com_.sun.star.uno.XInterface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * represents a number formatter which can preview number formats without inserting them.
  * @see NumberFormatter
  */
@js.native
trait XNumberFormatPreviewer extends XInterface {
  
  /**
    * formats a value using a format string, without inserting a number format into the list.
    * @param aFormat is the format string that is used for formatting.
    * @param fValue is the value that is formatted.
    * @param nLocale is the locale that is used to interpret the format string.
    * @param bAllowEnglish specifies if English language number format strings are accepted in addition to those from the selected locale.
    * @returns the formatted string.
    * @throws com::sun::star::util::MalformedNumberFormatException if the format string is invalid.
    */
  def convertNumberToPreviewString(aFormat: String, fValue: Double, nLocale: Locale, bAllowEnglish: Boolean): String = js.native
  
  /**
    * returns the color which is to be used for a number.
    * @param aFormat is the format string that is used for formatting.
    * @param fValue is the value that is formatted.
    * @param nLocale is the locale that is used to interpret the format string.
    * @param bAllowEnglish specifies if English language number format strings are accepted in addition to those from the selected locale.
    * @param aDefaultColor is the color that should be returned if no color is set by the number format.
    * @returns the color that should used to output the formatted string.
    * @throws com::sun::star::util::MalformedNumberFormatException if the format string is invalid.
    */
  def queryPreviewColorForNumber(aFormat: String, fValue: Double, nLocale: Locale, bAllowEnglish: Boolean, aDefaultColor: Color): Color = js.native
}
object XNumberFormatPreviewer {
  
  @scala.inline
  def apply(
    acquire: () => Unit,
    convertNumberToPreviewString: (String, Double, Locale, Boolean) => String,
    queryInterface: `type` => js.Any,
    queryPreviewColorForNumber: (String, Double, Locale, Boolean, Color) => Color,
    release: () => Unit
  ): XNumberFormatPreviewer = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), convertNumberToPreviewString = js.Any.fromFunction4(convertNumberToPreviewString), queryInterface = js.Any.fromFunction1(queryInterface), queryPreviewColorForNumber = js.Any.fromFunction5(queryPreviewColorForNumber), release = js.Any.fromFunction0(release))
    __obj.asInstanceOf[XNumberFormatPreviewer]
  }
  
  @scala.inline
  implicit class XNumberFormatPreviewerOps[Self <: XNumberFormatPreviewer] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setConvertNumberToPreviewString(value: (String, Double, Locale, Boolean) => String): Self = this.set("convertNumberToPreviewString", js.Any.fromFunction4(value))
    
    @scala.inline
    def setQueryPreviewColorForNumber(value: (String, Double, Locale, Boolean, Color) => Color): Self = this.set("queryPreviewColorForNumber", js.Any.fromFunction5(value))
  }
}
