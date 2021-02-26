package typingsSlinky.activexLibreoffice.com_.sun.star.linguistic2

import typingsSlinky.activexLibreoffice.`type`
import typingsSlinky.activexLibreoffice.com_.sun.star.lang.Locale
import typingsSlinky.activexLibreoffice.com_.sun.star.uno.XInterface
import typingsSlinky.std.SafeArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** retrieves the list of available languages. */
@js.native
trait XAvailableLocales extends XInterface {
  
  /**
    * retrieve the list of supported languages (Locales).
    * @param aServiceName the name of the service to get the list of available Locales for.
    * @returns the list of locales supported by the whole of all registered implementations of that service. The sequence will be empty if there is no such lang
    * @see com.sun.star.linguistic2.XSupportedLocales
    */
  def getAvailableLocales(aServiceName: String): SafeArray[Locale] = js.native
}
object XAvailableLocales {
  
  @scala.inline
  def apply(
    acquire: () => Unit,
    getAvailableLocales: String => SafeArray[Locale],
    queryInterface: `type` => js.Any,
    release: () => Unit
  ): XAvailableLocales = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), getAvailableLocales = js.Any.fromFunction1(getAvailableLocales), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
    __obj.asInstanceOf[XAvailableLocales]
  }
  
  @scala.inline
  implicit class XAvailableLocalesMutableBuilder[Self <: XAvailableLocales] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGetAvailableLocales(value: String => SafeArray[Locale]): Self = StObject.set(x, "getAvailableLocales", js.Any.fromFunction1(value))
  }
}
