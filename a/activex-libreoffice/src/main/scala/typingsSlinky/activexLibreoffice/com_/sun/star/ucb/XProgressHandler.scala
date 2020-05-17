package typingsSlinky.activexLibreoffice.com_.sun.star.ucb

import typingsSlinky.activexLibreoffice.`type`
import typingsSlinky.activexLibreoffice.com_.sun.star.uno.XInterface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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
  implicit class XProgressHandlerOps[Self <: XProgressHandler] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withPop(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pop")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withPush(value: js.Any => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("push")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withUpdate(value: js.Any => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("update")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

