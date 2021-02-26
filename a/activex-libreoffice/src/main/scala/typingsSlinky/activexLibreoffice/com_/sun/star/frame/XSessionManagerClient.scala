package typingsSlinky.activexLibreoffice.com_.sun.star.frame

import typingsSlinky.activexLibreoffice.`type`
import typingsSlinky.activexLibreoffice.com_.sun.star.uno.XInterface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Connect to a session manager to get information about pending desktop shutdown */
@js.native
trait XSessionManagerClient extends XInterface {
  
  /**
    * addSessionManagerListener registers a listener for session management events
    * @param xListener listener for session management events
    * @see XSessionManagerListener
    * @see XSessionManagerClient.removeSessionManagerListener()
    */
  def addSessionManagerListener(xListener: XSessionManagerListener): Unit = js.native
  
  /**
    * Call cancelShutdown to try to cancel a desktop shutdown in progress
    * @returns `TRUE` if shutdown was canceled, `FALSE` else.
    */
  def cancelShutdown(): Boolean = js.native
  
  /**
    * interactionDone is called when a listener has finished user interaction
    * @param xListener the listener done with user interaction
    * @see XSessionManagerListener
    */
  def interactionDone(xListener: XSessionManagerListener): Unit = js.native
  
  /**
    * queryInteraction issues a request for a user interaction slot from the session manager
    * @param xListener the listener requesting user interaction
    * @see XSessionManagerListener
    */
  def queryInteraction(xListener: XSessionManagerListener): Unit = js.native
  
  /**
    * removeSessionManagerListener deregisters a listener for session events
    * @param xListener listener to be removed
    * @see XSessionManagerListener
    * @see XSessionManagerClient.addSessionManagerListener()
    */
  def removeSessionManagerListener(xListener: XSessionManagerListener): Unit = js.native
  
  /**
    * saveDone signals that a listener has processed a save request
    * @param xListener the listener having finished save request processing
    * @see XSessionManagerListener
    */
  def saveDone(xListener: XSessionManagerListener): Unit = js.native
}
object XSessionManagerClient {
  
  @scala.inline
  def apply(
    acquire: () => Unit,
    addSessionManagerListener: XSessionManagerListener => Unit,
    cancelShutdown: () => Boolean,
    interactionDone: XSessionManagerListener => Unit,
    queryInteraction: XSessionManagerListener => Unit,
    queryInterface: `type` => js.Any,
    release: () => Unit,
    removeSessionManagerListener: XSessionManagerListener => Unit,
    saveDone: XSessionManagerListener => Unit
  ): XSessionManagerClient = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), addSessionManagerListener = js.Any.fromFunction1(addSessionManagerListener), cancelShutdown = js.Any.fromFunction0(cancelShutdown), interactionDone = js.Any.fromFunction1(interactionDone), queryInteraction = js.Any.fromFunction1(queryInteraction), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), removeSessionManagerListener = js.Any.fromFunction1(removeSessionManagerListener), saveDone = js.Any.fromFunction1(saveDone))
    __obj.asInstanceOf[XSessionManagerClient]
  }
  
  @scala.inline
  implicit class XSessionManagerClientMutableBuilder[Self <: XSessionManagerClient] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAddSessionManagerListener(value: XSessionManagerListener => Unit): Self = StObject.set(x, "addSessionManagerListener", js.Any.fromFunction1(value))
    
    @scala.inline
    def setCancelShutdown(value: () => Boolean): Self = StObject.set(x, "cancelShutdown", js.Any.fromFunction0(value))
    
    @scala.inline
    def setInteractionDone(value: XSessionManagerListener => Unit): Self = StObject.set(x, "interactionDone", js.Any.fromFunction1(value))
    
    @scala.inline
    def setQueryInteraction(value: XSessionManagerListener => Unit): Self = StObject.set(x, "queryInteraction", js.Any.fromFunction1(value))
    
    @scala.inline
    def setRemoveSessionManagerListener(value: XSessionManagerListener => Unit): Self = StObject.set(x, "removeSessionManagerListener", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSaveDone(value: XSessionManagerListener => Unit): Self = StObject.set(x, "saveDone", js.Any.fromFunction1(value))
  }
}
