package typingsSlinky.activexLibreoffice.com_.sun.star.sdb

import typingsSlinky.activexLibreoffice.LibreOffice.SeqEquiv
import typingsSlinky.activexLibreoffice.`type`
import typingsSlinky.activexLibreoffice.com_.sun.star.container.XContainer
import typingsSlinky.activexLibreoffice.com_.sun.star.container.XContainerListener
import typingsSlinky.activexLibreoffice.com_.sun.star.container.XEnumeration
import typingsSlinky.activexLibreoffice.com_.sun.star.container.XEnumerationAccess
import typingsSlinky.activexLibreoffice.com_.sun.star.container.XNameAccess
import typingsSlinky.activexLibreoffice.com_.sun.star.lang.XSingleServiceFactory
import typingsSlinky.activexLibreoffice.com_.sun.star.uno.XInterface
import typingsSlinky.activexLibreoffice.com_.sun.star.uno.XNamingService
import typingsSlinky.std.SafeArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Provides an interface for the new-style {@link DatabaseContext} service to implement.
  * @since LibreOffice 4.0
  */
@js.native
trait XDatabaseContext
  extends XEnumerationAccess
     with XNameAccess
     with XNamingService
     with XContainer
     with XSingleServiceFactory
     with XDatabaseRegistrations
object XDatabaseContext {
  
  @scala.inline
  def apply(
    ElementNames: SafeArray[String],
    ElementType: `type`,
    RegistrationNames: SafeArray[String],
    acquire: () => Unit,
    addContainerListener: XContainerListener => Unit,
    addDatabaseRegistrationsListener: XDatabaseRegistrationsListener => Unit,
    changeDatabaseLocation: (String, String) => Unit,
    createEnumeration: () => XEnumeration,
    createInstance: () => XInterface,
    createInstanceWithArguments: SeqEquiv[_] => XInterface,
    getByName: String => js.Any,
    getDatabaseLocation: String => String,
    getElementNames: () => SafeArray[String],
    getElementType: () => `type`,
    getRegisteredObject: String => XInterface,
    getRegistrationNames: () => SafeArray[String],
    hasByName: String => Boolean,
    hasElements: () => Boolean,
    hasRegisteredDatabase: String => Boolean,
    isDatabaseRegistrationReadOnly: String => Boolean,
    queryInterface: `type` => js.Any,
    registerDatabaseLocation: (String, String) => Unit,
    registerObject: (String, XInterface) => Unit,
    release: () => Unit,
    removeContainerListener: XContainerListener => Unit,
    removeDatabaseRegistrationsListener: XDatabaseRegistrationsListener => Unit,
    revokeDatabaseLocation: String => Unit,
    revokeObject: String => Unit
  ): XDatabaseContext = {
    val __obj = js.Dynamic.literal(ElementNames = ElementNames.asInstanceOf[js.Any], ElementType = ElementType.asInstanceOf[js.Any], RegistrationNames = RegistrationNames.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), addContainerListener = js.Any.fromFunction1(addContainerListener), addDatabaseRegistrationsListener = js.Any.fromFunction1(addDatabaseRegistrationsListener), changeDatabaseLocation = js.Any.fromFunction2(changeDatabaseLocation), createEnumeration = js.Any.fromFunction0(createEnumeration), createInstance = js.Any.fromFunction0(createInstance), createInstanceWithArguments = js.Any.fromFunction1(createInstanceWithArguments), getByName = js.Any.fromFunction1(getByName), getDatabaseLocation = js.Any.fromFunction1(getDatabaseLocation), getElementNames = js.Any.fromFunction0(getElementNames), getElementType = js.Any.fromFunction0(getElementType), getRegisteredObject = js.Any.fromFunction1(getRegisteredObject), getRegistrationNames = js.Any.fromFunction0(getRegistrationNames), hasByName = js.Any.fromFunction1(hasByName), hasElements = js.Any.fromFunction0(hasElements), hasRegisteredDatabase = js.Any.fromFunction1(hasRegisteredDatabase), isDatabaseRegistrationReadOnly = js.Any.fromFunction1(isDatabaseRegistrationReadOnly), queryInterface = js.Any.fromFunction1(queryInterface), registerDatabaseLocation = js.Any.fromFunction2(registerDatabaseLocation), registerObject = js.Any.fromFunction2(registerObject), release = js.Any.fromFunction0(release), removeContainerListener = js.Any.fromFunction1(removeContainerListener), removeDatabaseRegistrationsListener = js.Any.fromFunction1(removeDatabaseRegistrationsListener), revokeDatabaseLocation = js.Any.fromFunction1(revokeDatabaseLocation), revokeObject = js.Any.fromFunction1(revokeObject))
    __obj.asInstanceOf[XDatabaseContext]
  }
}
