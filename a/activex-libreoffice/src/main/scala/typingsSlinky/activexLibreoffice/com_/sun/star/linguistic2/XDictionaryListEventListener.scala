package typingsSlinky.activexLibreoffice.com_.sun.star.linguistic2

import typingsSlinky.activexLibreoffice.`type`
import typingsSlinky.activexLibreoffice.com_.sun.star.lang.EventObject
import typingsSlinky.activexLibreoffice.com_.sun.star.lang.XEventListener
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * This interfaces allows the object to act according to dictionary-list events.
  *
  * This interface is the base class for all dictionary-list event listeners. Its single function will be called by the broadcasting dictionary-list in
  * order to notify its registered listeners.
  * @see com.sun.star.linguistic2.DictionaryListEvent
  * @see com.sun.star.linguistic2.XDictionaryList
  */
@js.native
trait XDictionaryListEventListener extends XEventListener {
  
  /**
    * is used to notify the object about dictionary-list events.
    * @param aDicListEvent the event to be notified of.
    * @see com.sun.star.linguistic2.DictionaryListEvent
    */
  def processDictionaryListEvent(aDicListEvent: DictionaryListEvent): Unit = js.native
}
object XDictionaryListEventListener {
  
  @scala.inline
  def apply(
    acquire: () => Unit,
    disposing: EventObject => Unit,
    processDictionaryListEvent: DictionaryListEvent => Unit,
    queryInterface: `type` => js.Any,
    release: () => Unit
  ): XDictionaryListEventListener = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), disposing = js.Any.fromFunction1(disposing), processDictionaryListEvent = js.Any.fromFunction1(processDictionaryListEvent), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
    __obj.asInstanceOf[XDictionaryListEventListener]
  }
  
  @scala.inline
  implicit class XDictionaryListEventListenerMutableBuilder[Self <: XDictionaryListEventListener] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setProcessDictionaryListEvent(value: DictionaryListEvent => Unit): Self = StObject.set(x, "processDictionaryListEvent", js.Any.fromFunction1(value))
  }
}
