package typingsSlinky.activexLibreoffice.com_.sun.star.document

import typingsSlinky.activexLibreoffice.`type`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * allows to be notified of events happening in an {@link OfficeDocument}
  *
  * This interface is the successor of the {@link XEventListener} interface, which should not be used anymore.
  * @see XDocumentEventBroadcaster
  * @since OOo 3.1
  */
@js.native
trait XDocumentEventListener
  extends typingsSlinky.activexLibreoffice.com_.sun.star.lang.XEventListener {
  
  /** is called whenever a document event occurred */
  def documentEventOccured(Event: DocumentEvent): Unit = js.native
}
object XDocumentEventListener {
  
  @scala.inline
  def apply(
    acquire: () => Unit,
    disposing: typingsSlinky.activexLibreoffice.com_.sun.star.lang.EventObject => Unit,
    documentEventOccured: DocumentEvent => Unit,
    queryInterface: `type` => js.Any,
    release: () => Unit
  ): XDocumentEventListener = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), disposing = js.Any.fromFunction1(disposing), documentEventOccured = js.Any.fromFunction1(documentEventOccured), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
    __obj.asInstanceOf[XDocumentEventListener]
  }
  
  @scala.inline
  implicit class XDocumentEventListenerMutableBuilder[Self <: XDocumentEventListener] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDocumentEventOccured(value: DocumentEvent => Unit): Self = StObject.set(x, "documentEventOccured", js.Any.fromFunction1(value))
  }
}
