package typingsSlinky.activexLibreoffice.com_.sun.star.embed

import typingsSlinky.activexLibreoffice.`type`
import typingsSlinky.activexLibreoffice.com_.sun.star.lang.EventObject
import typingsSlinky.activexLibreoffice.com_.sun.star.lang.XEventListener
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** makes it possible to receive events when a transacted object is committed or reverted. */
@js.native
trait XTransactionListener extends XEventListener {
  
  /** is called after the object is committed. */
  def commited(aEvent: EventObject): Unit = js.native
  
  /** is called just before the object is committed. */
  def preCommit(aEvent: EventObject): Unit = js.native
  
  /** is called just before the object is reverted. */
  def preRevert(aEvent: EventObject): Unit = js.native
  
  /** is called after the object is reverted. */
  def reverted(aEvent: EventObject): Unit = js.native
}
object XTransactionListener {
  
  @scala.inline
  def apply(
    acquire: () => Unit,
    commited: EventObject => Unit,
    disposing: EventObject => Unit,
    preCommit: EventObject => Unit,
    preRevert: EventObject => Unit,
    queryInterface: `type` => js.Any,
    release: () => Unit,
    reverted: EventObject => Unit
  ): XTransactionListener = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), commited = js.Any.fromFunction1(commited), disposing = js.Any.fromFunction1(disposing), preCommit = js.Any.fromFunction1(preCommit), preRevert = js.Any.fromFunction1(preRevert), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), reverted = js.Any.fromFunction1(reverted))
    __obj.asInstanceOf[XTransactionListener]
  }
  
  @scala.inline
  implicit class XTransactionListenerMutableBuilder[Self <: XTransactionListener] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCommited(value: EventObject => Unit): Self = StObject.set(x, "commited", js.Any.fromFunction1(value))
    
    @scala.inline
    def setPreCommit(value: EventObject => Unit): Self = StObject.set(x, "preCommit", js.Any.fromFunction1(value))
    
    @scala.inline
    def setPreRevert(value: EventObject => Unit): Self = StObject.set(x, "preRevert", js.Any.fromFunction1(value))
    
    @scala.inline
    def setReverted(value: EventObject => Unit): Self = StObject.set(x, "reverted", js.Any.fromFunction1(value))
  }
}
