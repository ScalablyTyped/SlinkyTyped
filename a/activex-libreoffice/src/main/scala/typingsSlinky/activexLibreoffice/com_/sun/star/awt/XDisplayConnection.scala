package typingsSlinky.activexLibreoffice.com_.sun.star.awt

import typingsSlinky.activexLibreoffice.`type`
import typingsSlinky.activexLibreoffice.com_.sun.star.uno.XInterface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** This interface should be implemented by toolkits that want to give access to their internal message handling loop. */
@js.native
trait XDisplayConnection extends XInterface {
  /**
    * returns a identifier.
    * @returns a unique platform dependent identifier for a display connection.
    */
  val Identifier: js.Any = js.native
  /**
    * register an error handler for toolkit specific errors.
    * @param errorHandler the handler to register.
    */
  def addErrorHandler(errorHandler: XEventHandler): Unit = js.native
  /**
    * registers an event handler.
    * @param window the platform specific window id. If empty, the handler should be registered for all windows.
    * @param eventHandler the handler to register.
    * @param eventMask the event mask specifies the events the handler is interested in.
    */
  def addEventHandler(window: js.Any, eventHandler: XEventHandler, eventMask: Double): Unit = js.native
  /**
    * returns a identifier.
    * @returns a unique platform dependent identifier for a display connection.
    */
  def getIdentifier(): js.Any = js.native
  /**
    * remover an error handler from the handler list.
    * @param errorHandler the handler to remove.
    */
  def removeErrorHandler(errorHandler: XEventHandler): Unit = js.native
  /**
    * removes a eventHandler from the handler list.
    * @param window the platform specific window id the handler should be unregistered for. If empty, the handler should be unregistered completely.
    * @param eventHandler the handler to remove.
    */
  def removeEventHandler(window: js.Any, eventHandler: XEventHandler): Unit = js.native
}

object XDisplayConnection {
  @scala.inline
  def apply(
    Identifier: js.Any,
    acquire: () => Unit,
    addErrorHandler: XEventHandler => Unit,
    addEventHandler: (js.Any, XEventHandler, Double) => Unit,
    getIdentifier: () => js.Any,
    queryInterface: `type` => js.Any,
    release: () => Unit,
    removeErrorHandler: XEventHandler => Unit,
    removeEventHandler: (js.Any, XEventHandler) => Unit
  ): XDisplayConnection = {
    val __obj = js.Dynamic.literal(Identifier = Identifier.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), addErrorHandler = js.Any.fromFunction1(addErrorHandler), addEventHandler = js.Any.fromFunction3(addEventHandler), getIdentifier = js.Any.fromFunction0(getIdentifier), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), removeErrorHandler = js.Any.fromFunction1(removeErrorHandler), removeEventHandler = js.Any.fromFunction2(removeEventHandler))
    __obj.asInstanceOf[XDisplayConnection]
  }
  @scala.inline
  implicit class XDisplayConnectionOps[Self <: XDisplayConnection] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withIdentifier(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Identifier")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAddErrorHandler(value: XEventHandler => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("addErrorHandler")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withAddEventHandler(value: (js.Any, XEventHandler, Double) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("addEventHandler")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withGetIdentifier(value: () => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getIdentifier")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withRemoveErrorHandler(value: XEventHandler => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("removeErrorHandler")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withRemoveEventHandler(value: (js.Any, XEventHandler) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("removeEventHandler")(js.Any.fromFunction2(value))
        ret
    }
  }
  
}

