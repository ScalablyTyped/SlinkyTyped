package typingsSlinky.activexLibreoffice.com_.sun.star.util

import typingsSlinky.activexLibreoffice.`type`
import typingsSlinky.activexLibreoffice.com_.sun.star.lang.Locale
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Provides a unified interface for the {@link NumberFormatter} service to implement.
  * @since LibreOffice 4.0
  */
@js.native
trait XNumberFormatter2
  extends XNumberFormatter
     with XNumberFormatPreviewer
object XNumberFormatter2 {
  
  @scala.inline
  def apply(
    NumberFormatsSupplier: XNumberFormatsSupplier,
    acquire: () => Unit,
    attachNumberFormatsSupplier: XNumberFormatsSupplier => Unit,
    convertNumberToPreviewString: (String, Double, Locale, Boolean) => String,
    convertNumberToString: (Double, Double) => String,
    convertStringToNumber: (Double, String) => Double,
    detectNumberFormat: (Double, String) => Double,
    formatString: (Double, String) => String,
    getInputString: (Double, Double) => String,
    getNumberFormatsSupplier: () => XNumberFormatsSupplier,
    queryColorForNumber: (Double, Double, Color) => Color,
    queryColorForString: (Double, String, Color) => Color,
    queryInterface: `type` => js.Any,
    queryPreviewColorForNumber: (String, Double, Locale, Boolean, Color) => Color,
    release: () => Unit
  ): XNumberFormatter2 = {
    val __obj = js.Dynamic.literal(NumberFormatsSupplier = NumberFormatsSupplier.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), attachNumberFormatsSupplier = js.Any.fromFunction1(attachNumberFormatsSupplier), convertNumberToPreviewString = js.Any.fromFunction4(convertNumberToPreviewString), convertNumberToString = js.Any.fromFunction2(convertNumberToString), convertStringToNumber = js.Any.fromFunction2(convertStringToNumber), detectNumberFormat = js.Any.fromFunction2(detectNumberFormat), formatString = js.Any.fromFunction2(formatString), getInputString = js.Any.fromFunction2(getInputString), getNumberFormatsSupplier = js.Any.fromFunction0(getNumberFormatsSupplier), queryColorForNumber = js.Any.fromFunction3(queryColorForNumber), queryColorForString = js.Any.fromFunction3(queryColorForString), queryInterface = js.Any.fromFunction1(queryInterface), queryPreviewColorForNumber = js.Any.fromFunction5(queryPreviewColorForNumber), release = js.Any.fromFunction0(release))
    __obj.asInstanceOf[XNumberFormatter2]
  }
}
