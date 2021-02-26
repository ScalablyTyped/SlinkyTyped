package typingsSlinky.activexLibreoffice.com_.sun.star.sdb

import typingsSlinky.activexLibreoffice.LibreOffice.SeqEquiv
import typingsSlinky.activexLibreoffice.`type`
import typingsSlinky.activexLibreoffice.com_.sun.star.beans.XPropertiesChangeListener
import typingsSlinky.activexLibreoffice.com_.sun.star.beans.XPropertySetInfoChangeListener
import typingsSlinky.activexLibreoffice.com_.sun.star.container.XHierarchicalName
import typingsSlinky.activexLibreoffice.com_.sun.star.lang.XEventListener
import typingsSlinky.activexLibreoffice.com_.sun.star.ucb.Command
import typingsSlinky.activexLibreoffice.com_.sun.star.ucb.Content
import typingsSlinky.activexLibreoffice.com_.sun.star.ucb.ContentInfo
import typingsSlinky.activexLibreoffice.com_.sun.star.ucb.XCommandEnvironment
import typingsSlinky.activexLibreoffice.com_.sun.star.ucb.XCommandInfoChangeListener
import typingsSlinky.activexLibreoffice.com_.sun.star.ucb.XContent
import typingsSlinky.activexLibreoffice.com_.sun.star.ucb.XContentEventListener
import typingsSlinky.activexLibreoffice.com_.sun.star.ucb.XContentIdentifier
import typingsSlinky.activexLibreoffice.com_.sun.star.uno.XInterface
import typingsSlinky.std.SafeArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * defines the basic functionality for an object in the hierarchy of sub documents of a {@link OfficeDatabaseDocument} .
  * @see DocumentDefinition
  * @see DocumentContainer
  */
@js.native
trait DefinitionContent
  extends Content
     with XHierarchicalName
object DefinitionContent {
  
  @scala.inline
  def apply(
    ContentType: String,
    HierarchicalName: String,
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
    composeHierarchicalName: String => String,
    createCommandIdentifier: () => Double,
    createNewContent: ContentInfo => XContent,
    dispose: () => Unit,
    execute: (Command, Double, XCommandEnvironment) => js.Any,
    getContentType: () => String,
    getHierarchicalName: () => String,
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
  ): DefinitionContent = {
    val __obj = js.Dynamic.literal(ContentType = ContentType.asInstanceOf[js.Any], HierarchicalName = HierarchicalName.asInstanceOf[js.Any], Identifier = Identifier.asInstanceOf[js.Any], Parent = Parent.asInstanceOf[js.Any], abort = js.Any.fromFunction1(abort), acquire = js.Any.fromFunction0(acquire), addCommandInfoChangeListener = js.Any.fromFunction1(addCommandInfoChangeListener), addContentEventListener = js.Any.fromFunction1(addContentEventListener), addEventListener = js.Any.fromFunction1(addEventListener), addPropertiesChangeListener = js.Any.fromFunction2(addPropertiesChangeListener), addProperty = js.Any.fromFunction3(addProperty), addPropertySetInfoChangeListener = js.Any.fromFunction1(addPropertySetInfoChangeListener), composeHierarchicalName = js.Any.fromFunction1(composeHierarchicalName), createCommandIdentifier = js.Any.fromFunction0(createCommandIdentifier), createNewContent = js.Any.fromFunction1(createNewContent), dispose = js.Any.fromFunction0(dispose), execute = js.Any.fromFunction3(execute), getContentType = js.Any.fromFunction0(getContentType), getHierarchicalName = js.Any.fromFunction0(getHierarchicalName), getIdentifier = js.Any.fromFunction0(getIdentifier), getParent = js.Any.fromFunction0(getParent), queryCreatableContentsInfo = js.Any.fromFunction0(queryCreatableContentsInfo), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), releaseCommandIdentifier = js.Any.fromFunction1(releaseCommandIdentifier), removeCommandInfoChangeListener = js.Any.fromFunction1(removeCommandInfoChangeListener), removeContentEventListener = js.Any.fromFunction1(removeContentEventListener), removeEventListener = js.Any.fromFunction1(removeEventListener), removePropertiesChangeListener = js.Any.fromFunction2(removePropertiesChangeListener), removeProperty = js.Any.fromFunction1(removeProperty), removePropertySetInfoChangeListener = js.Any.fromFunction1(removePropertySetInfoChangeListener), setParent = js.Any.fromFunction1(setParent))
    __obj.asInstanceOf[DefinitionContent]
  }
}
