package typingsSlinky.activexLibreoffice.com_.sun.star.ucb

import typingsSlinky.activexLibreoffice.LibreOffice.SeqEquiv
import typingsSlinky.activexLibreoffice.`type`
import typingsSlinky.activexLibreoffice.com_.sun.star.beans.XPropertiesChangeListener
import typingsSlinky.activexLibreoffice.com_.sun.star.beans.XPropertiesChangeNotifier
import typingsSlinky.activexLibreoffice.com_.sun.star.beans.XPropertyContainer
import typingsSlinky.activexLibreoffice.com_.sun.star.beans.XPropertySetInfoChangeListener
import typingsSlinky.activexLibreoffice.com_.sun.star.beans.XPropertySetInfoChangeNotifier
import typingsSlinky.activexLibreoffice.com_.sun.star.container.XChild
import typingsSlinky.activexLibreoffice.com_.sun.star.lang.XComponent
import typingsSlinky.activexLibreoffice.com_.sun.star.lang.XEventListener
import typingsSlinky.activexLibreoffice.com_.sun.star.uno.XInterface
import typingsSlinky.std.SafeArray
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** A {@link Content} is a service that provides access to data of a content provided by an implementation of the service {@link ContentProvider} . */
@js.native
trait Content
  extends XCommandProcessor2
     with XContent
     with XComponent
     with XPropertiesChangeNotifier
     with XPropertyContainer
     with XPropertySetInfoChangeNotifier
     with XCommandInfoChangeNotifier
     with XContentCreator
     with XChild
object Content {
  
  @scala.inline
  def apply(
    ContentType: String,
    Identifier: XContentIdentifier,
    Parent: XInterface,
    abort: Double => Unit,
    acquire: () => Unit,
    addCommandInfoChangeListener: XCommandInfoChangeListener => Unit,
    addContentEventListener: XContentEventListener => Unit,
    addEventListener: XEventListener => Unit,
    addPropertiesChangeListener: (SeqEquiv[String], XPropertiesChangeListener) => Unit,
    addProperty: (String, Double, js.Any) => Unit,
    addPropertySetInfoChangeListener: XPropertySetInfoChangeListener => Unit,
    createCommandIdentifier: () => Double,
    createNewContent: ContentInfo => XContent,
    dispose: () => Unit,
    execute: (Command, Double, XCommandEnvironment) => js.Any,
    getContentType: () => String,
    getIdentifier: () => XContentIdentifier,
    getParent: () => XInterface,
    queryCreatableContentsInfo: () => SafeArray[ContentInfo],
    queryInterface: `type` => js.Any,
    release: () => Unit,
    releaseCommandIdentifier: Double => Unit,
    removeCommandInfoChangeListener: XCommandInfoChangeListener => Unit,
    removeContentEventListener: XContentEventListener => Unit,
    removeEventListener: XEventListener => Unit,
    removePropertiesChangeListener: (SeqEquiv[String], XPropertiesChangeListener) => Unit,
    removeProperty: String => Unit,
    removePropertySetInfoChangeListener: XPropertySetInfoChangeListener => Unit,
    setParent: XInterface => Unit
  ): Content = {
    val __obj = js.Dynamic.literal(ContentType = ContentType.asInstanceOf[js.Any], Identifier = Identifier.asInstanceOf[js.Any], Parent = Parent.asInstanceOf[js.Any], abort = js.Any.fromFunction1(abort), acquire = js.Any.fromFunction0(acquire), addCommandInfoChangeListener = js.Any.fromFunction1(addCommandInfoChangeListener), addContentEventListener = js.Any.fromFunction1(addContentEventListener), addEventListener = js.Any.fromFunction1(addEventListener), addPropertiesChangeListener = js.Any.fromFunction2(addPropertiesChangeListener), addProperty = js.Any.fromFunction3(addProperty), addPropertySetInfoChangeListener = js.Any.fromFunction1(addPropertySetInfoChangeListener), createCommandIdentifier = js.Any.fromFunction0(createCommandIdentifier), createNewContent = js.Any.fromFunction1(createNewContent), dispose = js.Any.fromFunction0(dispose), execute = js.Any.fromFunction3(execute), getContentType = js.Any.fromFunction0(getContentType), getIdentifier = js.Any.fromFunction0(getIdentifier), getParent = js.Any.fromFunction0(getParent), queryCreatableContentsInfo = js.Any.fromFunction0(queryCreatableContentsInfo), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), releaseCommandIdentifier = js.Any.fromFunction1(releaseCommandIdentifier), removeCommandInfoChangeListener = js.Any.fromFunction1(removeCommandInfoChangeListener), removeContentEventListener = js.Any.fromFunction1(removeContentEventListener), removeEventListener = js.Any.fromFunction1(removeEventListener), removePropertiesChangeListener = js.Any.fromFunction2(removePropertiesChangeListener), removeProperty = js.Any.fromFunction1(removeProperty), removePropertySetInfoChangeListener = js.Any.fromFunction1(removePropertySetInfoChangeListener), setParent = js.Any.fromFunction1(setParent))
    __obj.asInstanceOf[Content]
  }
}
