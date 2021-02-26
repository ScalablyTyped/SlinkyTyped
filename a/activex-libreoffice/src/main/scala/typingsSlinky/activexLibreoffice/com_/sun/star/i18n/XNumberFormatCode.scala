package typingsSlinky.activexLibreoffice.com_.sun.star.i18n

import typingsSlinky.activexLibreoffice.`type`
import typingsSlinky.activexLibreoffice.com_.sun.star.lang.Locale
import typingsSlinky.activexLibreoffice.com_.sun.star.uno.XInterface
import typingsSlinky.std.SafeArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Access number format codes defined in locale data. */
@js.native
trait XNumberFormatCode extends XInterface {
  
  /**
    * returns all format codes for a given **nFormatUsage** and locale.
    * @param nFormatUsage one of {@link KNumberFormatUsage} values
    * @param rLocale The locale for which the format codes are requested.
    */
  def getAllFormatCode(nFormatUsage: Double, rLocale: Locale): SafeArray[NumberFormatCode] = js.native
  
  /**
    * returns all format codes for a given locale.
    * @param rLocale The locale for which the format codes are requested.
    */
  def getAllFormatCodes(rLocale: Locale): SafeArray[NumberFormatCode] = js.native
  
  /**
    * returns the default number format code of a specific category (usage group) for a given locale and format length type.
    * @param nFormatType one of the constants listed in {@link KNumberFormatType}
    * @param nFormatUsage one of {@link KNumberFormatUsage} values
    * @param rLocale The locale for which the format code is requested.
    */
  def getDefault(nFormatType: Double, nFormatUsage: Double, rLocale: Locale): NumberFormatCode = js.native
  
  /**
    * returns the number format pointed to by **nFormatIndex** for a given locale.
    * @param nFormatIndex one of {@link NumberFormatIndex} values
    * @param rLocale The locale for which the format code is requested.
    */
  def getFormatCode(nFormatIndex: Double, rLocale: Locale): NumberFormatCode = js.native
}
object XNumberFormatCode {
  
  @scala.inline
  def apply(
    acquire: () => Unit,
    getAllFormatCode: (Double, Locale) => SafeArray[NumberFormatCode],
    getAllFormatCodes: Locale => SafeArray[NumberFormatCode],
    getDefault: (Double, Double, Locale) => NumberFormatCode,
    getFormatCode: (Double, Locale) => NumberFormatCode,
    queryInterface: `type` => js.Any,
    release: () => Unit
  ): XNumberFormatCode = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), getAllFormatCode = js.Any.fromFunction2(getAllFormatCode), getAllFormatCodes = js.Any.fromFunction1(getAllFormatCodes), getDefault = js.Any.fromFunction3(getDefault), getFormatCode = js.Any.fromFunction2(getFormatCode), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
    __obj.asInstanceOf[XNumberFormatCode]
  }
  
  @scala.inline
  implicit class XNumberFormatCodeMutableBuilder[Self <: XNumberFormatCode] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGetAllFormatCode(value: (Double, Locale) => SafeArray[NumberFormatCode]): Self = StObject.set(x, "getAllFormatCode", js.Any.fromFunction2(value))
    
    @scala.inline
    def setGetAllFormatCodes(value: Locale => SafeArray[NumberFormatCode]): Self = StObject.set(x, "getAllFormatCodes", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetDefault(value: (Double, Double, Locale) => NumberFormatCode): Self = StObject.set(x, "getDefault", js.Any.fromFunction3(value))
    
    @scala.inline
    def setGetFormatCode(value: (Double, Locale) => NumberFormatCode): Self = StObject.set(x, "getFormatCode", js.Any.fromFunction2(value))
  }
}
