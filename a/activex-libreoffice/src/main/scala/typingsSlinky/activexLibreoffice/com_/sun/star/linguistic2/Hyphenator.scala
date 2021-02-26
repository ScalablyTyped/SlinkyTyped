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

/** offers hyphenation functionality. */
@js.native
trait Hyphenator
  extends XHyphenator
     with XLinguServiceEventBroadcaster
     with XInitialization
     with XComponent
     with XServiceDisplayName
object Hyphenator {
  
  @scala.inline
  def apply(
    Locales: SafeArray[Locale],
    acquire: () => Unit,
    addEventListener: XEventListener => Unit,
    addLinguServiceEventListener: XLinguServiceEventListener => Boolean,
    createPossibleHyphens: (String, Locale, PropertyValues) => XPossibleHyphens,
    dispose: () => Unit,
    getLocales: () => SafeArray[Locale],
    getServiceDisplayName: Locale => String,
    hasLocale: Locale => Boolean,
    hyphenate: (String, Locale, Double, PropertyValues) => XHyphenatedWord,
    initialize: SeqEquiv[_] => Unit,
    queryAlternativeSpelling: (String, Locale, Double, PropertyValues) => XHyphenatedWord,
    queryInterface: `type` => js.Any,
    release: () => Unit,
    removeEventListener: XEventListener => Unit,
    removeLinguServiceEventListener: XLinguServiceEventListener => Boolean
  ): Hyphenator = {
    val __obj = js.Dynamic.literal(Locales = Locales.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), addEventListener = js.Any.fromFunction1(addEventListener), addLinguServiceEventListener = js.Any.fromFunction1(addLinguServiceEventListener), createPossibleHyphens = js.Any.fromFunction3(createPossibleHyphens), dispose = js.Any.fromFunction0(dispose), getLocales = js.Any.fromFunction0(getLocales), getServiceDisplayName = js.Any.fromFunction1(getServiceDisplayName), hasLocale = js.Any.fromFunction1(hasLocale), hyphenate = js.Any.fromFunction4(hyphenate), initialize = js.Any.fromFunction1(initialize), queryAlternativeSpelling = js.Any.fromFunction4(queryAlternativeSpelling), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), removeEventListener = js.Any.fromFunction1(removeEventListener), removeLinguServiceEventListener = js.Any.fromFunction1(removeLinguServiceEventListener))
    __obj.asInstanceOf[Hyphenator]
  }
}
