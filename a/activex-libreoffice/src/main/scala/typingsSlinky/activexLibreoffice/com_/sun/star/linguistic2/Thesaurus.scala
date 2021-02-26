package typingsSlinky.activexLibreoffice.com_.sun.star.linguistic2

import typingsSlinky.activexLibreoffice.LibreOffice.SeqEquiv
import typingsSlinky.activexLibreoffice.`type`
import typingsSlinky.activexLibreoffice.com_.sun.star.beans.PropertyValues
import typingsSlinky.activexLibreoffice.com_.sun.star.lang.Locale
import typingsSlinky.activexLibreoffice.com_.sun.star.lang.XComponent
import typingsSlinky.activexLibreoffice.com_.sun.star.lang.XEventListener
import typingsSlinky.activexLibreoffice.com_.sun.star.lang.XInitialization
import typingsSlinky.activexLibreoffice.com_.sun.star.lang.XServiceDisplayName
import typingsSlinky.std.SafeArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** offers thesaurus functionality. */
@js.native
trait Thesaurus
  extends XThesaurus
     with XInitialization
     with XComponent
     with XServiceDisplayName
object Thesaurus {
  
  @scala.inline
  def apply(
    Locales: SafeArray[Locale],
    acquire: () => Unit,
    addEventListener: XEventListener => Unit,
    dispose: () => Unit,
    getLocales: () => SafeArray[Locale],
    getServiceDisplayName: Locale => String,
    hasLocale: Locale => Boolean,
    initialize: SeqEquiv[_] => Unit,
    queryInterface: `type` => js.Any,
    queryMeanings: (String, Locale, PropertyValues) => SafeArray[XMeaning],
    release: () => Unit,
    removeEventListener: XEventListener => Unit
  ): Thesaurus = {
    val __obj = js.Dynamic.literal(Locales = Locales.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), addEventListener = js.Any.fromFunction1(addEventListener), dispose = js.Any.fromFunction0(dispose), getLocales = js.Any.fromFunction0(getLocales), getServiceDisplayName = js.Any.fromFunction1(getServiceDisplayName), hasLocale = js.Any.fromFunction1(hasLocale), initialize = js.Any.fromFunction1(initialize), queryInterface = js.Any.fromFunction1(queryInterface), queryMeanings = js.Any.fromFunction3(queryMeanings), release = js.Any.fromFunction0(release), removeEventListener = js.Any.fromFunction1(removeEventListener))
    __obj.asInstanceOf[Thesaurus]
  }
}
