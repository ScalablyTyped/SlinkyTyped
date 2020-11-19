package typingsSlinky.activexLibreoffice.com_.sun.star.linguistic2

import typingsSlinky.activexLibreoffice.LibreOffice.SeqEquiv
import typingsSlinky.activexLibreoffice.`type`
import typingsSlinky.activexLibreoffice.com_.sun.star.lang.Locale
import typingsSlinky.activexLibreoffice.com_.sun.star.lang.XEventListener
import typingsSlinky.activexLibreoffice.com_.sun.star.uno.XInterface
import typingsSlinky.std.SafeArray
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * the basic interface to be used to access linguistic functionality.
  *
  * This interface is used to access spell checker, hyphenator, and thesaurus functionality. Additionally, it can query what implementations of those
  * services are available (for specific languages or in general). It can select and query which of those implementations should be used for a specific
  * language.
  *
  * For spell checking and thesaurus, the order in the list defines the order of creation/usage of those services. That is, if the first spell checker
  * implementation does not recognize the given word as correct, the second service implementation for that language is created and gets queried. If that
  * one fails, the third one gets created and queried and so on. This chain stops if an implementation reports the word as correct or the end of the list
  * is reached, in which case the word is reported as incorrect.
  *
  * For the thesaurus, the behavior is the same when no meaning was found.
  * @see com.sun.star.linguistic2.SpellChecker
  * @see com.sun.star.linguistic2.Hyphenator
  * @see com.sun.star.linguistic2.Thesaurus
  */
@js.native
trait XLinguServiceManager extends XInterface {
  
  /** @returns the {@link com.sun.star.linguistic2.XHyphenator} interface to be used for hyphenation. */
  val Hyphenator: XHyphenator = js.native
  
  /** @returns the {@link com.sun.star.linguistic2.XSpellChecker} interface to be used for spell checking. */
  val SpellChecker: XSpellChecker = js.native
  
  /** @returns the {@link com.sun.star.linguistic2.XThesaurus} interface to be used for thesaurus functionality. */
  val Thesaurus: XThesaurus = js.native
  
  /**
    * adds a listener to the list of event listeners.
    *
    * The listeners may support one or both of {@link com.sun.star.linguistic2.XDictionaryEventListener} and {@link
    * com.sun.star.linguistic2.XLinguServiceEventListener} interfaces.
    * @param xListener the listener to be added.
    * @returns `TRUE` if the listener was successfully added, `FALSE` otherwise.
    */
  def addLinguServiceManagerListener(xListener: XEventListener): Boolean = js.native
  
  /**
    * @param aServiceName the name of the service requesting the list of available implementations.
    * @param aLocale the language used to query the list of available implementations.
    * @returns the list of implementation names of the available services.
    */
  def getAvailableServices(aServiceName: String, aLocale: Locale): SafeArray[String] = js.native
  
  /**
    * queries the list of service implementations to be used for a given service and language.
    * @param aServiceName the name of the service to get queried.
    * @param aLocale the language to get queried.
    * @returns the list of implementation names of the services to be used.
    */
  def getConfiguredServices(aServiceName: String, aLocale: Locale): SafeArray[String] = js.native
  
  /** @returns the {@link com.sun.star.linguistic2.XHyphenator} interface to be used for hyphenation. */
  def getHyphenator(): XHyphenator = js.native
  
  /** @returns the {@link com.sun.star.linguistic2.XSpellChecker} interface to be used for spell checking. */
  def getSpellChecker(): XSpellChecker = js.native
  
  /** @returns the {@link com.sun.star.linguistic2.XThesaurus} interface to be used for thesaurus functionality. */
  def getThesaurus(): XThesaurus = js.native
  
  /**
    * removes a listener from the list of event listeners.
    * @param xListener the listener to be removed.
    * @returns `TRUE` if the listener was successfully removed, `FALSE` otherwise.
    */
  def removeLinguServiceManagerListener(xListener: XEventListener): Boolean = js.native
  
  /**
    * sets the list of service implementations to be used for a given service and language.
    * @param aServiceName the name of the service to set the list of implementations to be used.
    * @param aLocale the language to set the list.
    * @param aServiceImplNames the name of the service to set the list.
    */
  def setConfiguredServices(aServiceName: String, aLocale: Locale, aServiceImplNames: SeqEquiv[String]): Unit = js.native
}
object XLinguServiceManager {
  
  @scala.inline
  def apply(
    Hyphenator: XHyphenator,
    SpellChecker: XSpellChecker,
    Thesaurus: XThesaurus,
    acquire: () => Unit,
    addLinguServiceManagerListener: XEventListener => Boolean,
    getAvailableServices: (String, Locale) => SafeArray[String],
    getConfiguredServices: (String, Locale) => SafeArray[String],
    getHyphenator: () => XHyphenator,
    getSpellChecker: () => XSpellChecker,
    getThesaurus: () => XThesaurus,
    queryInterface: `type` => js.Any,
    release: () => Unit,
    removeLinguServiceManagerListener: XEventListener => Boolean,
    setConfiguredServices: (String, Locale, SeqEquiv[String]) => Unit
  ): XLinguServiceManager = {
    val __obj = js.Dynamic.literal(Hyphenator = Hyphenator.asInstanceOf[js.Any], SpellChecker = SpellChecker.asInstanceOf[js.Any], Thesaurus = Thesaurus.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), addLinguServiceManagerListener = js.Any.fromFunction1(addLinguServiceManagerListener), getAvailableServices = js.Any.fromFunction2(getAvailableServices), getConfiguredServices = js.Any.fromFunction2(getConfiguredServices), getHyphenator = js.Any.fromFunction0(getHyphenator), getSpellChecker = js.Any.fromFunction0(getSpellChecker), getThesaurus = js.Any.fromFunction0(getThesaurus), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), removeLinguServiceManagerListener = js.Any.fromFunction1(removeLinguServiceManagerListener), setConfiguredServices = js.Any.fromFunction3(setConfiguredServices))
    __obj.asInstanceOf[XLinguServiceManager]
  }
  
  @scala.inline
  implicit class XLinguServiceManagerOps[Self <: XLinguServiceManager] (val x: Self) extends AnyVal {
    
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
    def setHyphenator(value: XHyphenator): Self = this.set("Hyphenator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSpellChecker(value: XSpellChecker): Self = this.set("SpellChecker", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setThesaurus(value: XThesaurus): Self = this.set("Thesaurus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAddLinguServiceManagerListener(value: XEventListener => Boolean): Self = this.set("addLinguServiceManagerListener", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetAvailableServices(value: (String, Locale) => SafeArray[String]): Self = this.set("getAvailableServices", js.Any.fromFunction2(value))
    
    @scala.inline
    def setGetConfiguredServices(value: (String, Locale) => SafeArray[String]): Self = this.set("getConfiguredServices", js.Any.fromFunction2(value))
    
    @scala.inline
    def setGetHyphenator(value: () => XHyphenator): Self = this.set("getHyphenator", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetSpellChecker(value: () => XSpellChecker): Self = this.set("getSpellChecker", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetThesaurus(value: () => XThesaurus): Self = this.set("getThesaurus", js.Any.fromFunction0(value))
    
    @scala.inline
    def setRemoveLinguServiceManagerListener(value: XEventListener => Boolean): Self = this.set("removeLinguServiceManagerListener", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetConfiguredServices(value: (String, Locale, SeqEquiv[String]) => Unit): Self = this.set("setConfiguredServices", js.Any.fromFunction3(value))
  }
}
