package typingsSlinky.activexLibreoffice.com_.sun.star.task

import typingsSlinky.activexLibreoffice.`type`
import typingsSlinky.activexLibreoffice.com_.sun.star.uno.XInterface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** An interaction request handler. */
@js.native
trait XInteractionHandler extends XInterface {
  /** Handle an interaction request. */
  def handle(Request: XInteractionRequest): Unit = js.native
}

object XInteractionHandler {
  @scala.inline
  def apply(
    acquire: () => Unit,
    handle: XInteractionRequest => Unit,
    queryInterface: `type` => js.Any,
    release: () => Unit
  ): XInteractionHandler = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), handle = js.Any.fromFunction1(handle), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
    __obj.asInstanceOf[XInteractionHandler]
  }
  @scala.inline
  implicit class XInteractionHandlerOps[Self <: XInteractionHandler] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withHandle(value: XInteractionRequest => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("handle")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

