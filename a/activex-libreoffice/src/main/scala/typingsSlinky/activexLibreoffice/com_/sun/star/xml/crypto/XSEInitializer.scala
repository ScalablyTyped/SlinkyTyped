package typingsSlinky.activexLibreoffice.com_.sun.star.xml.crypto

import typingsSlinky.activexLibreoffice.`type`
import typingsSlinky.activexLibreoffice.com_.sun.star.uno.XInterface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Interface to manipulate Security Environment */
@js.native
trait XSEInitializer extends XInterface {
  
  /**
    * Creates a security context.
    * @param aString reserved for internal use.
    * @returns the security context created
    */
  def createSecurityContext(aString: String): XXMLSecurityContext = js.native
  
  /**
    * Frees a security context.
    * @param securityContext the security context to be freed
    */
  def freeSecurityContext(securityContext: XXMLSecurityContext): Unit = js.native
}
object XSEInitializer {
  
  @scala.inline
  def apply(
    acquire: () => Unit,
    createSecurityContext: String => XXMLSecurityContext,
    freeSecurityContext: XXMLSecurityContext => Unit,
    queryInterface: `type` => js.Any,
    release: () => Unit
  ): XSEInitializer = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), createSecurityContext = js.Any.fromFunction1(createSecurityContext), freeSecurityContext = js.Any.fromFunction1(freeSecurityContext), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
    __obj.asInstanceOf[XSEInitializer]
  }
  
  @scala.inline
  implicit class XSEInitializerMutableBuilder[Self <: XSEInitializer] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCreateSecurityContext(value: String => XXMLSecurityContext): Self = StObject.set(x, "createSecurityContext", js.Any.fromFunction1(value))
    
    @scala.inline
    def setFreeSecurityContext(value: XXMLSecurityContext => Unit): Self = StObject.set(x, "freeSecurityContext", js.Any.fromFunction1(value))
  }
}
