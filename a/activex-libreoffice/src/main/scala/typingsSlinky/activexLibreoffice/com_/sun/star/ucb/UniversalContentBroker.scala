package typingsSlinky.activexLibreoffice.com_.sun.star.ucb

import typingsSlinky.activexLibreoffice.`type`
import typingsSlinky.activexLibreoffice.com_.sun.star.lang.XComponent
import typingsSlinky.activexLibreoffice.com_.sun.star.lang.XEventListener
import typingsSlinky.std.SafeArray
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * is a one-instance service that provides access to a set of Contents via ContentProviders.
  *
  * Traditionally, this service implements {@link com.sun.star.lang.XInitialization} and needed to be instantiated once with two arguments via {@link
  * com.sun.star.lang.XMultiComponentFactory.createInstanceWithArgumentsAndContext()} for configuration before it could be obtained via plain {@link
  * com.sun.star.lang.XMultiComponentFactory.createInstanceWithContext()} .
  *
  * However, the only pair of initialization arguments used in practice is `"Local"` / `"Office"` , so this service is simplified now to automatically
  * configure itself with that argument pair upon first instantiation.
  *
  * (For backwards compatibility, the service implementation still supports {@link com.sun.star.lang.XInitialization} and can still explicitly be
  * initialized via {@link com.sun.star.lang.XMultiComponentFactory.createInstanceWithArgumentsAndContext()} with two arguments of type string. These
  * strings are used as a pair of keys to retrieve a set of content provider descriptions from the configuration management (stored at
  * `org.openoffice.ucb.Configuration.ContentProviders.key1.SecondaryKeys.key2.ProviderData` within the configuration management's hierarchy). The
  * retrieved descriptions are in turn used to register the corresponding content provider services at the broker.)
  */
@js.native
trait UniversalContentBroker
  extends XCommandProcessor2
     with XComponent
     with XContentProvider
     with XContentProviderManager
     with XContentIdentifierFactory {
  
  /**
    * The (default) constructor.
    *
    * (This default constructor is only mentioned explicitly for technical reasons, so that its implementation calls the service implementation's {@link
    * com.sun.star.lang.XInitialization.initialize()} .)
    */
  def create(): Unit = js.native
}
object UniversalContentBroker {
  
  @scala.inline
  def apply(
    abort: Double => Unit,
    acquire: () => Unit,
    addEventListener: XEventListener => Unit,
    compareContentIds: (XContentIdentifier, XContentIdentifier) => Double,
    create: () => Unit,
    createCommandIdentifier: () => Double,
    createContentIdentifier: String => XContentIdentifier,
    deregisterContentProvider: (XContentProvider, String) => Unit,
    dispose: () => Unit,
    execute: (Command, Double, XCommandEnvironment) => js.Any,
    queryContent: XContentIdentifier => XContent,
    queryContentProvider: String => XContentProvider,
    queryContentProviders: () => SafeArray[ContentProviderInfo],
    queryInterface: `type` => js.Any,
    registerContentProvider: (XContentProvider, String, Boolean) => XContentProvider,
    release: () => Unit,
    releaseCommandIdentifier: Double => Unit,
    removeEventListener: XEventListener => Unit
  ): UniversalContentBroker = {
    val __obj = js.Dynamic.literal(abort = js.Any.fromFunction1(abort), acquire = js.Any.fromFunction0(acquire), addEventListener = js.Any.fromFunction1(addEventListener), compareContentIds = js.Any.fromFunction2(compareContentIds), create = js.Any.fromFunction0(create), createCommandIdentifier = js.Any.fromFunction0(createCommandIdentifier), createContentIdentifier = js.Any.fromFunction1(createContentIdentifier), deregisterContentProvider = js.Any.fromFunction2(deregisterContentProvider), dispose = js.Any.fromFunction0(dispose), execute = js.Any.fromFunction3(execute), queryContent = js.Any.fromFunction1(queryContent), queryContentProvider = js.Any.fromFunction1(queryContentProvider), queryContentProviders = js.Any.fromFunction0(queryContentProviders), queryInterface = js.Any.fromFunction1(queryInterface), registerContentProvider = js.Any.fromFunction3(registerContentProvider), release = js.Any.fromFunction0(release), releaseCommandIdentifier = js.Any.fromFunction1(releaseCommandIdentifier), removeEventListener = js.Any.fromFunction1(removeEventListener))
    __obj.asInstanceOf[UniversalContentBroker]
  }
  
  @scala.inline
  implicit class UniversalContentBrokerOps[Self <: UniversalContentBroker] (val x: Self) extends AnyVal {
    
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
    def setCreate(value: () => Unit): Self = this.set("create", js.Any.fromFunction0(value))
  }
}
