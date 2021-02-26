package typingsSlinky.activexLibreoffice.com_.sun.star.util

import typingsSlinky.activexLibreoffice.`type`
import typingsSlinky.activexLibreoffice.com_.sun.star.lang.EventObject
import typingsSlinky.activexLibreoffice.com_.sun.star.lang.XEventListener
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** makes it possible to receive **flushed** events. */
@js.native
trait XFlushListener extends XEventListener {
  
  /** is called when the object data is flushed. */
  def flushed(rEvent: EventObject): Unit = js.native
}
object XFlushListener {
  
  @scala.inline
  def apply(
    acquire: () => Unit,
    disposing: EventObject => Unit,
    flushed: EventObject => Unit,
    queryInterface: `type` => js.Any,
    release: () => Unit
  ): XFlushListener = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), disposing = js.Any.fromFunction1(disposing), flushed = js.Any.fromFunction1(flushed), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
    __obj.asInstanceOf[XFlushListener]
  }
  
  @scala.inline
  implicit class XFlushListenerMutableBuilder[Self <: XFlushListener] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFlushed(value: EventObject => Unit): Self = StObject.set(x, "flushed", js.Any.fromFunction1(value))
  }
}
