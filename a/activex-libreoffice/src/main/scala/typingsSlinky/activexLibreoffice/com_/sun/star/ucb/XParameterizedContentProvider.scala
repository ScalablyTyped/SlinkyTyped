package typingsSlinky.activexLibreoffice.com_.sun.star.ucb

import typingsSlinky.activexLibreoffice.`type`
import typingsSlinky.activexLibreoffice.com_.sun.star.uno.XInterface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Register specially adjusted instances of content providers on URL templates and supplementary arguments.
  * @author Stephan Bergmann
  * @version 1.0
  */
@js.native
trait XParameterizedContentProvider extends XInterface {
  
  /**
    * Deregisters a content provider.
    * @param Template A URL template. If the input is malformed or too complex, an IllegalArgumentException may be raised.
    * @param Arguments Any supplementary arguments required by this {@link XContentProvider} , represented as a single string. If the input is malformed, an {
    * @returns Either this {@link XContentProvider} , or another, specially adjusted version of this {@link XContentProvider} (this flexibility allows for diffe
    */
  def deregisterInstance(Template: String, Arguments: String): XContentProvider = js.native
  
  /**
    * Register a content provider on a URL template and supplementary arguments.
    * @param Template A URL template. If the input is malformed or too complex, an {@link com.sun.star.lang.IllegalArgumentException} may be raised.
    * @param Arguments Any supplementary arguments required by this {@link XContentProvider} , represented as a single string. If the input is malformed, an {
    * @param ReplaceExisting If true, and if the given Template conflicts with an already registered instance, the old registration is replaced by the new one
    * @returns Either this {@link XContentProvider} , or another, specially adjusted version of this {@link XContentProvider} (this flexibility allows for diffe
    */
  def registerInstance(Template: String, Arguments: String, ReplaceExisting: Boolean): XContentProvider = js.native
}
object XParameterizedContentProvider {
  
  @scala.inline
  def apply(
    acquire: () => Unit,
    deregisterInstance: (String, String) => XContentProvider,
    queryInterface: `type` => js.Any,
    registerInstance: (String, String, Boolean) => XContentProvider,
    release: () => Unit
  ): XParameterizedContentProvider = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), deregisterInstance = js.Any.fromFunction2(deregisterInstance), queryInterface = js.Any.fromFunction1(queryInterface), registerInstance = js.Any.fromFunction3(registerInstance), release = js.Any.fromFunction0(release))
    __obj.asInstanceOf[XParameterizedContentProvider]
  }
  
  @scala.inline
  implicit class XParameterizedContentProviderMutableBuilder[Self <: XParameterizedContentProvider] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDeregisterInstance(value: (String, String) => XContentProvider): Self = StObject.set(x, "deregisterInstance", js.Any.fromFunction2(value))
    
    @scala.inline
    def setRegisterInstance(value: (String, String, Boolean) => XContentProvider): Self = StObject.set(x, "registerInstance", js.Any.fromFunction3(value))
  }
}
