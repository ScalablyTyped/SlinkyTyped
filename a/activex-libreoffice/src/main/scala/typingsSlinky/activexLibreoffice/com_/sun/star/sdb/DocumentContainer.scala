package typingsSlinky.activexLibreoffice.com_.sun.star.sdb

import typingsSlinky.activexLibreoffice.com_.sun.star.beans.XPropertiesChangeNotifier
import typingsSlinky.activexLibreoffice.com_.sun.star.beans.XPropertyContainer
import typingsSlinky.activexLibreoffice.com_.sun.star.beans.XPropertySetInfoChangeNotifier
import typingsSlinky.activexLibreoffice.com_.sun.star.container.XChild
import typingsSlinky.activexLibreoffice.com_.sun.star.container.XEnumerationAccess
import typingsSlinky.activexLibreoffice.com_.sun.star.container.XHierarchicalName
import typingsSlinky.activexLibreoffice.com_.sun.star.container.XHierarchicalNameContainer
import typingsSlinky.activexLibreoffice.com_.sun.star.container.XIndexAccess
import typingsSlinky.activexLibreoffice.com_.sun.star.container.XNameContainer
import typingsSlinky.activexLibreoffice.com_.sun.star.frame.XComponentLoader
import typingsSlinky.activexLibreoffice.com_.sun.star.lang.XComponent
import typingsSlinky.activexLibreoffice.com_.sun.star.lang.XMultiServiceFactory
import typingsSlinky.activexLibreoffice.com_.sun.star.lang.XSingleServiceFactory
import typingsSlinky.activexLibreoffice.com_.sun.star.ucb.XCommandInfoChangeNotifier
import typingsSlinky.activexLibreoffice.com_.sun.star.ucb.XCommandProcessor2
import typingsSlinky.activexLibreoffice.com_.sun.star.ucb.XContent
import typingsSlinky.activexLibreoffice.com_.sun.star.ucb.XContentCreator
import typingsSlinky.activexLibreoffice.com_.sun.star.uno.XInterface
import typingsSlinky.activexLibreoffice.com_.sun.star.util.XRefreshable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * describes a container which provides access to documents embedded into a database document, usually forms and reports.
  *
  * The {@link com.sun.star.lang.XMultiServiceFactory.createInstanceWithArguments()} should be used to create sub document container or form, or report
  * objects.
  *
  * The embedded documents do not support any particular database related service, instead, they're usual com::sun::star::document::OfficeDocuments. ;
  * The only thing worth mentioning here is that they support the {@link com.sun.star.container.XChild} interface, whose {@link
  * com.sun.star.container.XChild.getParent()} method can be used to obtain the database document which the embedded document belongs to.
  * @see DocumentDefinition
  * @see OfficeDatabaseDocument
  */
@js.native
trait DocumentContainer
  extends XNameContainer
     with XIndexAccess
     with XEnumerationAccess
     with XRefreshable
     with XSingleServiceFactory
     with XContent
     with XComponent
     with XCommandProcessor2
     with XPropertiesChangeNotifier
     with XPropertyContainer
     with XPropertySetInfoChangeNotifier
     with XCommandInfoChangeNotifier
     with XContentCreator
     with XChild
     with XHierarchicalName
     with XComponentLoader
     with XMultiServiceFactory
     with XHierarchicalNameContainer {
  def createInstanceWithArguments(aArguments: String): XInterface = js.native
}

