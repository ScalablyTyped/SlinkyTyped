package typingsSlinky.activexLibreoffice.com_.sun.star.reflection

import typingsSlinky.activexLibreoffice.LibreOffice.SeqEquiv
import typingsSlinky.activexLibreoffice.`type`
import typingsSlinky.activexLibreoffice.com_.sun.star.container.XHierarchicalNameAccess
import typingsSlinky.activexLibreoffice.com_.sun.star.lang.XComponent
import typingsSlinky.activexLibreoffice.com_.sun.star.lang.XEventListener
import typingsSlinky.activexLibreoffice.com_.sun.star.uno.TypeClass
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * This service provides type descriptions, i.e. concrete service implementations read from source like the persistent registry database format. ;
  *
  * This old-style service definition mostly serves documentation purposes. It is not intended that an implementation of this service can be obtained at
  * the global service manager using this service identifier.
  * @see com.sun.star.reflection.TypeDescriptionManager
  * @see com.sun.star.reflection.XTypeDescription
  */
@js.native
trait TypeDescriptionProvider
  extends XHierarchicalNameAccess
     with XComponent
     with XTypeDescriptionEnumerationAccess
object TypeDescriptionProvider {
  
  @scala.inline
  def apply(
    acquire: () => Unit,
    addEventListener: XEventListener => Unit,
    createTypeDescriptionEnumeration: (String, SeqEquiv[TypeClass], TypeDescriptionSearchDepth) => XTypeDescriptionEnumeration,
    dispose: () => Unit,
    getByHierarchicalName: String => js.Any,
    hasByHierarchicalName: String => Boolean,
    queryInterface: `type` => js.Any,
    release: () => Unit,
    removeEventListener: XEventListener => Unit
  ): TypeDescriptionProvider = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), addEventListener = js.Any.fromFunction1(addEventListener), createTypeDescriptionEnumeration = js.Any.fromFunction3(createTypeDescriptionEnumeration), dispose = js.Any.fromFunction0(dispose), getByHierarchicalName = js.Any.fromFunction1(getByHierarchicalName), hasByHierarchicalName = js.Any.fromFunction1(hasByHierarchicalName), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), removeEventListener = js.Any.fromFunction1(removeEventListener))
    __obj.asInstanceOf[TypeDescriptionProvider]
  }
}
