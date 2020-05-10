package typingsSlinky.ejWebAll.ej.datavisualization.Diagram

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CommandManagerCommands extends js.Object {
  /** A method that defines whether the command is executable at the moment or not.
    */
  var canExecute: js.UndefOr[js.Any] = js.native
  /** A method that defines what to be executed when the key combination is recognized.
    */
  var execute: js.UndefOr[js.Any] = js.native
  /** Defines a combination of keys and key modifiers, on recognition of which the command will be executed
    */
  var gesture: js.UndefOr[CommandManagerCommandsGesture] = js.native
  /** Defines any additional parameters that are required at runtime
    * @Default {null}
    */
  var parameter: js.UndefOr[js.Any] = js.native
}

object CommandManagerCommands {
  @scala.inline
  def apply(): CommandManagerCommands = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CommandManagerCommands]
  }
  @scala.inline
  implicit class CommandManagerCommandsOps[Self <: CommandManagerCommands] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCanExecute(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("canExecute")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCanExecute: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("canExecute")(js.undefined)
        ret
    }
    @scala.inline
    def withExecute(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("execute")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExecute: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("execute")(js.undefined)
        ret
    }
    @scala.inline
    def withGesture(value: CommandManagerCommandsGesture): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gesture")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGesture: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gesture")(js.undefined)
        ret
    }
    @scala.inline
    def withParameter(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parameter")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutParameter: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parameter")(js.undefined)
        ret
    }
  }
  
}

