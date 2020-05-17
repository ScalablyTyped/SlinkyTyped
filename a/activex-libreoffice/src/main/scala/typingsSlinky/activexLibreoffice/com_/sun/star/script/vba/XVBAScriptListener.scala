package typingsSlinky.activexLibreoffice.com_.sun.star.script.vba

import typingsSlinky.activexLibreoffice.`type`
import typingsSlinky.activexLibreoffice.com_.sun.star.lang.EventObject
import typingsSlinky.activexLibreoffice.com_.sun.star.lang.XEventListener
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait XVBAScriptListener extends XEventListener {
  def notifyVBAScriptEvent(Event: VBAScriptEvent): Unit = js.native
}

object XVBAScriptListener {
  @scala.inline
  def apply(
    acquire: () => Unit,
    disposing: EventObject => Unit,
    notifyVBAScriptEvent: VBAScriptEvent => Unit,
    queryInterface: `type` => js.Any,
    release: () => Unit
  ): XVBAScriptListener = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), disposing = js.Any.fromFunction1(disposing), notifyVBAScriptEvent = js.Any.fromFunction1(notifyVBAScriptEvent), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
    __obj.asInstanceOf[XVBAScriptListener]
  }
  @scala.inline
  implicit class XVBAScriptListenerOps[Self <: XVBAScriptListener] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withNotifyVBAScriptEvent(value: VBAScriptEvent => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("notifyVBAScriptEvent")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

