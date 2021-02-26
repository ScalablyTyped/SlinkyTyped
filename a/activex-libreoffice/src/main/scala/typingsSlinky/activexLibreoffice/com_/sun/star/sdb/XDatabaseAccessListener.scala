package typingsSlinky.activexLibreoffice.com_.sun.star.sdb

import typingsSlinky.activexLibreoffice.`type`
import typingsSlinky.activexLibreoffice.com_.sun.star.lang.EventObject
import typingsSlinky.activexLibreoffice.com_.sun.star.lang.XEventListener
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * is not to be used anymore
  * @deprecated Deprecated
  */
@js.native
trait XDatabaseAccessListener extends XEventListener {
  
  def approveConnectionClosing(event: EventObject): Boolean = js.native
  
  def connectionChanged(event: EventObject): Unit = js.native
  
  def connectionClosing(event: EventObject): Unit = js.native
}
object XDatabaseAccessListener {
  
  @scala.inline
  def apply(
    acquire: () => Unit,
    approveConnectionClosing: EventObject => Boolean,
    connectionChanged: EventObject => Unit,
    connectionClosing: EventObject => Unit,
    disposing: EventObject => Unit,
    queryInterface: `type` => js.Any,
    release: () => Unit
  ): XDatabaseAccessListener = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), approveConnectionClosing = js.Any.fromFunction1(approveConnectionClosing), connectionChanged = js.Any.fromFunction1(connectionChanged), connectionClosing = js.Any.fromFunction1(connectionClosing), disposing = js.Any.fromFunction1(disposing), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
    __obj.asInstanceOf[XDatabaseAccessListener]
  }
  
  @scala.inline
  implicit class XDatabaseAccessListenerMutableBuilder[Self <: XDatabaseAccessListener] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setApproveConnectionClosing(value: EventObject => Boolean): Self = StObject.set(x, "approveConnectionClosing", js.Any.fromFunction1(value))
    
    @scala.inline
    def setConnectionChanged(value: EventObject => Unit): Self = StObject.set(x, "connectionChanged", js.Any.fromFunction1(value))
    
    @scala.inline
    def setConnectionClosing(value: EventObject => Unit): Self = StObject.set(x, "connectionClosing", js.Any.fromFunction1(value))
  }
}
