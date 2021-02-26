package typingsSlinky.activexLibreoffice.com_.sun.star.ucb

import typingsSlinky.activexLibreoffice.`type`
import typingsSlinky.activexLibreoffice.com_.sun.star.uno.XInterface
import typingsSlinky.std.SafeArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * makes it possible to query/register/deregister content providers.
  * @author Kai Sommerfeld
  * @see XContentProvider
  * @version 1.0
  */
@js.native
trait XContentProviderManager extends XInterface {
  
  /**
    * deregisters a content provider.
    * @param Provider a content provider to deregister.
    * @param Scheme the URL scheme for the provided contents. More generally, this may not only be a URL scheme, but a URL template (see {@link registerConten
    */
  def deregisterContentProvider(Provider: XContentProvider, Scheme: String): Unit = js.native
  
  /**
    * returns the currently active content provider for a content identifier.
    * @param Identifier a content identifier (i.e., a URL).
    * @returns a content provider, or null.
    */
  def queryContentProvider(Identifier: String): XContentProvider = js.native
  
  /**
    * returns a list of information on all registered content providers.
    * @returns a list information on content providers.
    */
  def queryContentProviders(): SafeArray[ContentProviderInfo] = js.native
  
  /**
    * registers a content provider for a specific URL template.
    * @param Provider the content provider to register.  This may be `NULL` , in which case a later {@link XContentProvider.queryContent()} with an {@link XCo
    * @param Scheme the URL scheme for the provided contents. More generally, this may not only be a URL scheme, but a URL template.  A URL template is a regu
    * @param ReplaceExisting `TRUE` : replace the provider possibly registered for the given URL template. The replaced provider will not be deregistered auto
    * @returns the replaced content provider, if there was one.
    * @see XContentIdentifier
    */
  def registerContentProvider(Provider: XContentProvider, Scheme: String, ReplaceExisting: Boolean): XContentProvider = js.native
}
object XContentProviderManager {
  
  @scala.inline
  def apply(
    acquire: () => Unit,
    deregisterContentProvider: (XContentProvider, String) => Unit,
    queryContentProvider: String => XContentProvider,
    queryContentProviders: () => SafeArray[ContentProviderInfo],
    queryInterface: `type` => js.Any,
    registerContentProvider: (XContentProvider, String, Boolean) => XContentProvider,
    release: () => Unit
  ): XContentProviderManager = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), deregisterContentProvider = js.Any.fromFunction2(deregisterContentProvider), queryContentProvider = js.Any.fromFunction1(queryContentProvider), queryContentProviders = js.Any.fromFunction0(queryContentProviders), queryInterface = js.Any.fromFunction1(queryInterface), registerContentProvider = js.Any.fromFunction3(registerContentProvider), release = js.Any.fromFunction0(release))
    __obj.asInstanceOf[XContentProviderManager]
  }
  
  @scala.inline
  implicit class XContentProviderManagerMutableBuilder[Self <: XContentProviderManager] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDeregisterContentProvider(value: (XContentProvider, String) => Unit): Self = StObject.set(x, "deregisterContentProvider", js.Any.fromFunction2(value))
    
    @scala.inline
    def setQueryContentProvider(value: String => XContentProvider): Self = StObject.set(x, "queryContentProvider", js.Any.fromFunction1(value))
    
    @scala.inline
    def setQueryContentProviders(value: () => SafeArray[ContentProviderInfo]): Self = StObject.set(x, "queryContentProviders", js.Any.fromFunction0(value))
    
    @scala.inline
    def setRegisterContentProvider(value: (XContentProvider, String, Boolean) => XContentProvider): Self = StObject.set(x, "registerContentProvider", js.Any.fromFunction3(value))
  }
}
