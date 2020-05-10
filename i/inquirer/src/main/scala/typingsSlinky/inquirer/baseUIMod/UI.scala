package typingsSlinky.inquirer.baseUIMod

import typingsSlinky.inquirer.mod.prompts.PromptBase
import typingsSlinky.node.readlineMod.Interface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents a ui.
  */
@js.native
trait UI extends js.Object {
  /**
    * Gets or sets the currently active prompt.
    */
  var activePrompt: PromptBase = js.native
  /**
    * Gets or sets an object for performing read from and write to the console.
    */
  var rl: Interface = js.native
  /**
    * Releases all unmanaged resources.
    */
  /* protected */ def close(): Unit = js.native
  /**
    * Handles a forced exit of the application.
    */
  /* protected */ def onForceClose(): Unit = js.native
}

object UI {
  @scala.inline
  def apply(activePrompt: PromptBase, close: () => Unit, onForceClose: () => Unit, rl: Interface): UI = {
    val __obj = js.Dynamic.literal(activePrompt = activePrompt.asInstanceOf[js.Any], close = js.Any.fromFunction0(close), onForceClose = js.Any.fromFunction0(onForceClose), rl = rl.asInstanceOf[js.Any])
    __obj.asInstanceOf[UI]
  }
  @scala.inline
  implicit class UIOps[Self <: UI] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withActivePrompt(value: PromptBase): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("activePrompt")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withClose(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("close")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withOnForceClose(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onForceClose")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withRl(value: Interface): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rl")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

