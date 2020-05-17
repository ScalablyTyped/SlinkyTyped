package typingsSlinky.activexLibreoffice.com_.sun.star.script

import typingsSlinky.activexLibreoffice.`type`
import typingsSlinky.activexLibreoffice.com_.sun.star.lang.EventObject
import typingsSlinky.activexLibreoffice.com_.sun.star.lang.XEventListener
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * specifies a listener combining all methods of a listener interface in a single generic call.
  *
  * Without any output parameters, it is possible to adapt any interface if the {@link XAllListenerAdapterService} can generate an adapter.
  */
@js.native
trait XAllListener extends XEventListener {
  /**
    * gets called when a "vetoable event" occurs at the object.
    *
    * That happens when the listener method raises an exception, or has a return value declared.
    */
  def approveFiring(aEvent: AllEventObject): js.Any = js.native
  /** gets called when an event occurs at the object. */
  def firing(iaEvent: AllEventObject): Unit = js.native
}

object XAllListener {
  @scala.inline
  def apply(
    acquire: () => Unit,
    approveFiring: AllEventObject => js.Any,
    disposing: EventObject => Unit,
    firing: AllEventObject => Unit,
    queryInterface: `type` => js.Any,
    release: () => Unit
  ): XAllListener = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), approveFiring = js.Any.fromFunction1(approveFiring), disposing = js.Any.fromFunction1(disposing), firing = js.Any.fromFunction1(firing), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
    __obj.asInstanceOf[XAllListener]
  }
  @scala.inline
  implicit class XAllListenerOps[Self <: XAllListener] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withApproveFiring(value: AllEventObject => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("approveFiring")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withFiring(value: AllEventObject => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("firing")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

