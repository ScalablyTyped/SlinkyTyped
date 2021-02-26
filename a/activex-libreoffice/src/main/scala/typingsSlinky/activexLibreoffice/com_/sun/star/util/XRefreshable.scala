package typingsSlinky.activexLibreoffice.com_.sun.star.util

import typingsSlinky.activexLibreoffice.`type`
import typingsSlinky.activexLibreoffice.com_.sun.star.uno.XInterface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** is supported by objects with data that can be refreshed from a data source. */
@js.native
trait XRefreshable extends XInterface {
  
  /** adds the specified listener to receive the event "refreshed." */
  def addRefreshListener(l: XRefreshListener): Unit = js.native
  
  /** refreshes the data of the object from the connected data source. */
  def refresh(): Unit = js.native
  
  /** removes the specified listener. */
  def removeRefreshListener(l: XRefreshListener): Unit = js.native
}
object XRefreshable {
  
  @scala.inline
  def apply(
    acquire: () => Unit,
    addRefreshListener: XRefreshListener => Unit,
    queryInterface: `type` => js.Any,
    refresh: () => Unit,
    release: () => Unit,
    removeRefreshListener: XRefreshListener => Unit
  ): XRefreshable = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), addRefreshListener = js.Any.fromFunction1(addRefreshListener), queryInterface = js.Any.fromFunction1(queryInterface), refresh = js.Any.fromFunction0(refresh), release = js.Any.fromFunction0(release), removeRefreshListener = js.Any.fromFunction1(removeRefreshListener))
    __obj.asInstanceOf[XRefreshable]
  }
  
  @scala.inline
  implicit class XRefreshableMutableBuilder[Self <: XRefreshable] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAddRefreshListener(value: XRefreshListener => Unit): Self = StObject.set(x, "addRefreshListener", js.Any.fromFunction1(value))
    
    @scala.inline
    def setRefresh(value: () => Unit): Self = StObject.set(x, "refresh", js.Any.fromFunction0(value))
    
    @scala.inline
    def setRemoveRefreshListener(value: XRefreshListener => Unit): Self = StObject.set(x, "removeRefreshListener", js.Any.fromFunction1(value))
  }
}
