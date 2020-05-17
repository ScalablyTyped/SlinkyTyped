package typingsSlinky.activexLibreoffice.com_.sun.star.xml.dom.events

import typingsSlinky.activexLibreoffice.`type`
import typingsSlinky.activexLibreoffice.com_.sun.star.uno.XInterface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait XEventListener extends XInterface {
  def handleEvent(evt: XEvent): Unit = js.native
}

object XEventListener {
  @scala.inline
  def apply(
    acquire: () => Unit,
    handleEvent: XEvent => Unit,
    queryInterface: `type` => js.Any,
    release: () => Unit
  ): XEventListener = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), handleEvent = js.Any.fromFunction1(handleEvent), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
    __obj.asInstanceOf[XEventListener]
  }
  @scala.inline
  implicit class XEventListenerOps[Self <: XEventListener] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withHandleEvent(value: XEvent => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("handleEvent")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

