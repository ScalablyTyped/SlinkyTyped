package typingsSlinky.activexLibreoffice.com_.sun.star.script

import typingsSlinky.activexLibreoffice.`type`
import typingsSlinky.activexLibreoffice.com_.sun.star.lang.EventObject
import typingsSlinky.activexLibreoffice.com_.sun.star.lang.XEventListener
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * makes it possible to receive events from a scripting engine.
  * @deprecated Deprecated
  */
@js.native
trait XEngineListener extends XEventListener {
  /** gets fired when the script execution has finished. */
  def finished(Evt: FinishEngineEvent): Unit = js.native
  /**
    * gets fired when an interrupt occurs during the script execution.
    *
    * If you call the method, the execution stops. So in this situation, the stack and variable values are still available by using the appropriate {@link
    * XDebugging} methods.
    */
  def interrupt(Evt: InterruptEngineEvent): Unit = js.native
  /** gets fired when the script gets into execution state. */
  def running(Evt: EventObject): Unit = js.native
}

object XEngineListener {
  @scala.inline
  def apply(
    acquire: () => Unit,
    disposing: EventObject => Unit,
    finished: FinishEngineEvent => Unit,
    interrupt: InterruptEngineEvent => Unit,
    queryInterface: `type` => js.Any,
    release: () => Unit,
    running: EventObject => Unit
  ): XEngineListener = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), disposing = js.Any.fromFunction1(disposing), finished = js.Any.fromFunction1(finished), interrupt = js.Any.fromFunction1(interrupt), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), running = js.Any.fromFunction1(running))
    __obj.asInstanceOf[XEngineListener]
  }
  @scala.inline
  implicit class XEngineListenerOps[Self <: XEngineListener] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFinished(value: FinishEngineEvent => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("finished")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withInterrupt(value: InterruptEngineEvent => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("interrupt")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withRunning(value: EventObject => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("running")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

