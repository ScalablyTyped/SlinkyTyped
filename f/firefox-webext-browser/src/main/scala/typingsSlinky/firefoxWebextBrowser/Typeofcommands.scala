package typingsSlinky.firefoxWebextBrowser

import typingsSlinky.firefoxWebextBrowser.browser.commands.Command
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Typeofcommands extends js.Object {
  /* commands events */
  /** Fired when a registered command is activated using a keyboard shortcut. */
  val onCommand: WebExtEvent[js.Function1[/* command */ String, Unit]] = js.native
  /** Returns all the registered extension commands for this extension and their shortcut (if active). */
  def getAll(): js.Promise[js.Array[Command]] = js.native
  /**
    * Reset a command's details to what is specified in the manifest.
    * @param name The name of the command.
    */
  def reset(name: String): js.Promise[Unit] = js.native
  /* commands functions */
  /**
    * Update the details of an already defined command.
    * @param detail The new description for the command.
    */
  def update(detail: AnonDescription): js.Promise[Unit] = js.native
}

object Typeofcommands {
  @scala.inline
  def apply(
    getAll: () => js.Promise[js.Array[Command]],
    onCommand: WebExtEvent[js.Function1[/* command */ String, Unit]],
    reset: String => js.Promise[Unit],
    update: AnonDescription => js.Promise[Unit]
  ): Typeofcommands = {
    val __obj = js.Dynamic.literal(getAll = js.Any.fromFunction0(getAll), onCommand = onCommand.asInstanceOf[js.Any], reset = js.Any.fromFunction1(reset), update = js.Any.fromFunction1(update))
    __obj.asInstanceOf[Typeofcommands]
  }
  @scala.inline
  implicit class TypeofcommandsOps[Self <: Typeofcommands] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withGetAll(value: () => js.Promise[js.Array[Command]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getAll")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withOnCommand(value: WebExtEvent[js.Function1[/* command */ String, Unit]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onCommand")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withReset(value: String => js.Promise[Unit]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reset")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withUpdate(value: AnonDescription => js.Promise[Unit]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("update")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

