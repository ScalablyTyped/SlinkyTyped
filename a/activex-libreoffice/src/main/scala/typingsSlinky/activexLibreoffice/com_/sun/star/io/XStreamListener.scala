package typingsSlinky.activexLibreoffice.com_.sun.star.io

import typingsSlinky.activexLibreoffice.`type`
import typingsSlinky.activexLibreoffice.com_.sun.star.lang.EventObject
import typingsSlinky.activexLibreoffice.com_.sun.star.lang.XEventListener
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** makes it possible to receive events from an active data control. */
@js.native
trait XStreamListener extends XEventListener {
  
  /**
    * gets called when data transfer terminates normally or when data transfer is terminated from outside.
    *
    * The termination could be done using the method {@link XActiveDataControl.terminate()} .
    */
  def closed(): Unit = js.native
  
  /**
    * gets called when an internal error in source or sink has occurred.
    *
    * After the method is called, the close is called on the connected streams.
    */
  def error(aException: js.Any): Unit = js.native
  
  /** gets called as soon as data transfer has started. */
  def started(): Unit = js.native
  
  /** gets called when {@link XActiveDataControl.terminate()} is called. */
  def terminated(): Unit = js.native
}
object XStreamListener {
  
  @scala.inline
  def apply(
    acquire: () => Unit,
    closed: () => Unit,
    disposing: EventObject => Unit,
    error: js.Any => Unit,
    queryInterface: `type` => js.Any,
    release: () => Unit,
    started: () => Unit,
    terminated: () => Unit
  ): XStreamListener = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), closed = js.Any.fromFunction0(closed), disposing = js.Any.fromFunction1(disposing), error = js.Any.fromFunction1(error), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), started = js.Any.fromFunction0(started), terminated = js.Any.fromFunction0(terminated))
    __obj.asInstanceOf[XStreamListener]
  }
  
  @scala.inline
  implicit class XStreamListenerMutableBuilder[Self <: XStreamListener] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setClosed(value: () => Unit): Self = StObject.set(x, "closed", js.Any.fromFunction0(value))
    
    @scala.inline
    def setError(value: js.Any => Unit): Self = StObject.set(x, "error", js.Any.fromFunction1(value))
    
    @scala.inline
    def setStarted(value: () => Unit): Self = StObject.set(x, "started", js.Any.fromFunction0(value))
    
    @scala.inline
    def setTerminated(value: () => Unit): Self = StObject.set(x, "terminated", js.Any.fromFunction0(value))
  }
}
