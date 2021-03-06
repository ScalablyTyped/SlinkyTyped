package typingsSlinky.activexLibreoffice.com_.sun.star.ucb

import typingsSlinky.activexLibreoffice.`type`
import typingsSlinky.activexLibreoffice.com_.sun.star.uno.XInterface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Handle a tasks notification that it has made some progress. */
@js.native
trait XProgressHandler extends XInterface {
  
  /** The task notifies the handler that it has finished its current activity. */
  def pop(): Unit = js.native
  
  /**
    * The task notifies the handler that it has started some new activity (possibly a sub-activity of another activity already making progress; therefore,
    * these notifications behave in a stack-like manner).
    * @param Status An object representing the new activity. There has to be an agreement between caller and callee of methods {@link XProgressHandler.push()}
    */
  def push(Status: js.Any): Unit = js.native
  
  /**
    * The task notifies the handler that its current activity is making progress.
    * @param Status An object representing the progress made. See the documentation of {@link XProgressHandler.push()} for more information.
    */
  def update(Status: js.Any): Unit = js.native
}
object XProgressHandler {
  
  @scala.inline
  def apply(
    acquire: () => Unit,
    pop: () => Unit,
    push: js.Any => Unit,
    queryInterface: `type` => js.Any,
    release: () => Unit,
    update: js.Any => Unit
  ): XProgressHandler = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), pop = js.Any.fromFunction0(pop), push = js.Any.fromFunction1(push), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), update = js.Any.fromFunction1(update))
    __obj.asInstanceOf[XProgressHandler]
  }
  
  @scala.inline
  implicit class XProgressHandlerMutableBuilder[Self <: XProgressHandler] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPop(value: () => Unit): Self = StObject.set(x, "pop", js.Any.fromFunction0(value))
    
    @scala.inline
    def setPush(value: js.Any => Unit): Self = StObject.set(x, "push", js.Any.fromFunction1(value))
    
    @scala.inline
    def setUpdate(value: js.Any => Unit): Self = StObject.set(x, "update", js.Any.fromFunction1(value))
  }
}
