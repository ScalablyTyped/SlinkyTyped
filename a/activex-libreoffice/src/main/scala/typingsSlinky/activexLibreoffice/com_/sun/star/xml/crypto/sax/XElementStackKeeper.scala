package typingsSlinky.activexLibreoffice.com_.sun.star.xml.crypto.sax

import typingsSlinky.activexLibreoffice.`type`
import typingsSlinky.activexLibreoffice.com_.sun.star.uno.XInterface
import typingsSlinky.activexLibreoffice.com_.sun.star.xml.sax.XDocumentHandler
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Manipulate the "key SAX events" in a SAX event stream. */
@js.native
trait XElementStackKeeper extends XInterface {
  
  /**
    * Transfers the buffered key SAX events to a document handler.
    *
    * All transferred events are removed from the buffer.
    * @param handler the document to receive key SAX events
    * @param includingTheLastEvent whether to transfer the last key SAX event
    */
  def retrieve(handler: XDocumentHandler, includingTheLastEvent: Boolean): Unit = js.native
  
  /** Starts to buffer key SAX events. */
  def start(): Unit = js.native
  
  /** Stops buffering key SAX events. */
  def stop(): Unit = js.native
}
object XElementStackKeeper {
  
  @scala.inline
  def apply(
    acquire: () => Unit,
    queryInterface: `type` => js.Any,
    release: () => Unit,
    retrieve: (XDocumentHandler, Boolean) => Unit,
    start: () => Unit,
    stop: () => Unit
  ): XElementStackKeeper = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), retrieve = js.Any.fromFunction2(retrieve), start = js.Any.fromFunction0(start), stop = js.Any.fromFunction0(stop))
    __obj.asInstanceOf[XElementStackKeeper]
  }
  
  @scala.inline
  implicit class XElementStackKeeperMutableBuilder[Self <: XElementStackKeeper] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setRetrieve(value: (XDocumentHandler, Boolean) => Unit): Self = StObject.set(x, "retrieve", js.Any.fromFunction2(value))
    
    @scala.inline
    def setStart(value: () => Unit): Self = StObject.set(x, "start", js.Any.fromFunction0(value))
    
    @scala.inline
    def setStop(value: () => Unit): Self = StObject.set(x, "stop", js.Any.fromFunction0(value))
  }
}
