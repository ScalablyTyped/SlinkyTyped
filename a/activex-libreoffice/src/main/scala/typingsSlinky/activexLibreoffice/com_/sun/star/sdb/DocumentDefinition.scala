package typingsSlinky.activexLibreoffice.com_.sun.star.sdb

import typingsSlinky.activexLibreoffice.LibreOffice.SeqEquiv
import typingsSlinky.activexLibreoffice.`type`
import typingsSlinky.activexLibreoffice.com_.sun.star.beans.XPropertiesChangeListener
import typingsSlinky.activexLibreoffice.com_.sun.star.beans.XPropertyChangeListener
import typingsSlinky.activexLibreoffice.com_.sun.star.beans.XPropertySet
import typingsSlinky.activexLibreoffice.com_.sun.star.beans.XPropertySetInfo
import typingsSlinky.activexLibreoffice.com_.sun.star.beans.XPropertySetInfoChangeListener
import typingsSlinky.activexLibreoffice.com_.sun.star.beans.XVetoableChangeListener
import typingsSlinky.activexLibreoffice.com_.sun.star.lang.XComponent
import typingsSlinky.activexLibreoffice.com_.sun.star.lang.XEventListener
import typingsSlinky.activexLibreoffice.com_.sun.star.ucb.Command
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
  * specifies a sub document of a {@link OfficeDatabaseDocument} .
  *
  * Usual instances of a `DocumentDefinition` are forms and reports.
  *
  * Note that the `DocumentDefinition` does not denote the actual document (i.e. an object supporting the {@link com.sun.star.frame.XModel} interface),
  * but only a shortcut to access and load those actual documents.
  */
@js.native
trait DocumentDefinition
  extends DefinitionContent
     with XPropertySet
     with XSubDocument {
  
  /** Indicates if the document is to be used as template, for example, if a report is to be filled with data. */
  var AsTemplate: Boolean = js.native
  
  /** is the name of the document. If the document is part of the container, it is not possible to alter the name. */
  var Name: String = js.native
}
object DocumentDefinition {
  
  @scala.inline
  def apply(
    AsTemplate: Boolean,
    ContentType: String,
    HierarchicalName: String,
    Identifier: XContentIdentifier,
    Name: String,
    Parent: XInterface,
    PropertySetInfo: XPropertySetInfo,
    abort: Double => Unit,
    acquire: () => Unit,
    addCommandInfoChangeListener: XCommandInfoChangeListener => Unit,
    addContentEventListener: XContentEventListener => Unit,
    addEventListener: XEventListener => Unit,
    addPropertiesChangeListener: (SeqEquiv[String], XPropertiesChangeListener) => Unit,
    addProperty: (String, Double, js.Any) => Unit,
    addPropertyChangeListener: (String, XPropertyChangeListener) => Unit,
    addPropertySetInfoChangeListener: XPropertySetInfoChangeListener => Unit,
    addVetoableChangeListener: (String, XVetoableChangeListener) => Unit,
    close: () => Boolean,
    composeHierarchicalName: String => String,
    createCommandIdentifier: () => Double,
    createNewContent: ContentInfo => XContent,
    dispose: () => Unit,
    execute: (Command, Double, XCommandEnvironment) => js.Any,
    getContentType: () => String,
    getHierarchicalName: () => String,
    getIdentifier: () => XContentIdentifier,
    getParent: () => XInterface,
    getPropertySetInfo: () => XPropertySetInfo,
    getPropertyValue: String => js.Any,
    open: () => XComponent,
    openDesign: () => XComponent,
    queryCreatableContentsInfo: () => SafeArray[ContentInfo],
    queryInterface: `type` => js.Any,
    release: () => Unit,
    releaseCommandIdentifier: Double => Unit,
    removeCommandInfoChangeListener: XCommandInfoChangeListener => Unit,
    removeContentEventListener: XContentEventListener => Unit,
    removeEventListener: XEventListener => Unit,
    removePropertiesChangeListener: (SeqEquiv[String], XPropertiesChangeListener) => Unit,
    removeProperty: String => Unit,
    removePropertyChangeListener: (String, XPropertyChangeListener) => Unit,
    removePropertySetInfoChangeListener: XPropertySetInfoChangeListener => Unit,
    removeVetoableChangeListener: (String, XVetoableChangeListener) => Unit,
    setParent: XInterface => Unit,
    setPropertyValue: (String, js.Any) => Unit,
    store: () => Unit
  ): DocumentDefinition = {
    val __obj = js.Dynamic.literal(AsTemplate = AsTemplate.asInstanceOf[js.Any], ContentType = ContentType.asInstanceOf[js.Any], HierarchicalName = HierarchicalName.asInstanceOf[js.Any], Identifier = Identifier.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any], Parent = Parent.asInstanceOf[js.Any], PropertySetInfo = PropertySetInfo.asInstanceOf[js.Any], abort = js.Any.fromFunction1(abort), acquire = js.Any.fromFunction0(acquire), addCommandInfoChangeListener = js.Any.fromFunction1(addCommandInfoChangeListener), addContentEventListener = js.Any.fromFunction1(addContentEventListener), addEventListener = js.Any.fromFunction1(addEventListener), addPropertiesChangeListener = js.Any.fromFunction2(addPropertiesChangeListener), addProperty = js.Any.fromFunction3(addProperty), addPropertyChangeListener = js.Any.fromFunction2(addPropertyChangeListener), addPropertySetInfoChangeListener = js.Any.fromFunction1(addPropertySetInfoChangeListener), addVetoableChangeListener = js.Any.fromFunction2(addVetoableChangeListener), close = js.Any.fromFunction0(close), composeHierarchicalName = js.Any.fromFunction1(composeHierarchicalName), createCommandIdentifier = js.Any.fromFunction0(createCommandIdentifier), createNewContent = js.Any.fromFunction1(createNewContent), dispose = js.Any.fromFunction0(dispose), execute = js.Any.fromFunction3(execute), getContentType = js.Any.fromFunction0(getContentType), getHierarchicalName = js.Any.fromFunction0(getHierarchicalName), getIdentifier = js.Any.fromFunction0(getIdentifier), getParent = js.Any.fromFunction0(getParent), getPropertySetInfo = js.Any.fromFunction0(getPropertySetInfo), getPropertyValue = js.Any.fromFunction1(getPropertyValue), open = js.Any.fromFunction0(open), openDesign = js.Any.fromFunction0(openDesign), queryCreatableContentsInfo = js.Any.fromFunction0(queryCreatableContentsInfo), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), releaseCommandIdentifier = js.Any.fromFunction1(releaseCommandIdentifier), removeCommandInfoChangeListener = js.Any.fromFunction1(removeCommandInfoChangeListener), removeContentEventListener = js.Any.fromFunction1(removeContentEventListener), removeEventListener = js.Any.fromFunction1(removeEventListener), removePropertiesChangeListener = js.Any.fromFunction2(removePropertiesChangeListener), removeProperty = js.Any.fromFunction1(removeProperty), removePropertyChangeListener = js.Any.fromFunction2(removePropertyChangeListener), removePropertySetInfoChangeListener = js.Any.fromFunction1(removePropertySetInfoChangeListener), removeVetoableChangeListener = js.Any.fromFunction2(removeVetoableChangeListener), setParent = js.Any.fromFunction1(setParent), setPropertyValue = js.Any.fromFunction2(setPropertyValue), store = js.Any.fromFunction0(store))
    __obj.asInstanceOf[DocumentDefinition]
  }
  
  @scala.inline
  implicit class DocumentDefinitionMutableBuilder[Self <: DocumentDefinition] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAsTemplate(value: Boolean): Self = StObject.set(x, "AsTemplate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
  }
}
