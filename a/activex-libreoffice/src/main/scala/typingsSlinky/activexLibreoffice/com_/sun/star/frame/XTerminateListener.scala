package typingsSlinky.activexLibreoffice.com_.sun.star.frame

import typingsSlinky.activexLibreoffice.`type`
import typingsSlinky.activexLibreoffice.com_.sun.star.lang.EventObject
import typingsSlinky.activexLibreoffice.com_.sun.star.lang.XEventListener
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * has to be provided if an object wants to receive an event when the master environment (e.g., desktop) is terminated.
  * @see XDesktop.terminate()
  * @see XDesktop.addTerminateListener()
  * @see XDesktop.removeTerminateListener()
  */
@js.native
trait XTerminateListener extends XEventListener {
  /**
    * is called when the master environment is finally terminated. No veto will be accepted then.
    * @param Event describe the source of the event (e.g., the desktop)
    */
  def notifyTermination(Event: EventObject): Unit = js.native
  /**
    * is called when the master environment (e.g., desktop) is about to terminate.
    *
    * Termination can be intercepted by throwing {@link TerminationVetoException} . Interceptor will be the new owner of desktop and should call {@link
    * XDesktop.terminate()} after finishing its own operations.
    * @param Event describe the source of the event (e.g., the desktop)
    * @throws TerminationVetoException listener can disagree with this query by throwing this veto exception
    */
  def queryTermination(Event: EventObject): Unit = js.native
}

object XTerminateListener {
  @scala.inline
  def apply(
    acquire: () => Unit,
    disposing: EventObject => Unit,
    notifyTermination: EventObject => Unit,
    queryInterface: `type` => js.Any,
    queryTermination: EventObject => Unit,
    release: () => Unit
  ): XTerminateListener = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), disposing = js.Any.fromFunction1(disposing), notifyTermination = js.Any.fromFunction1(notifyTermination), queryInterface = js.Any.fromFunction1(queryInterface), queryTermination = js.Any.fromFunction1(queryTermination), release = js.Any.fromFunction0(release))
    __obj.asInstanceOf[XTerminateListener]
  }
  @scala.inline
  implicit class XTerminateListenerOps[Self <: XTerminateListener] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withNotifyTermination(value: EventObject => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("notifyTermination")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withQueryTermination(value: EventObject => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("queryTermination")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

