package typingsSlinky.inquirer.mod.prompts

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents a prompt.
  */
@js.native
trait PromptBase extends js.Object {
  /**
    * Gets or sets a string which represents the state of the prompt.
    */
  var status: PromptState = js.native
  /**
    * Runs the prompt.
    *
    * @returns
    * The result of the prompt.
    */
  def run(): js.Promise[_] = js.native
}

object PromptBase {
  @scala.inline
  def apply(run: () => js.Promise[_], status: PromptState): PromptBase = {
    val __obj = js.Dynamic.literal(run = js.Any.fromFunction0(run), status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[PromptBase]
  }
  @scala.inline
  implicit class PromptBaseOps[Self <: PromptBase] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withRun(value: () => js.Promise[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("run")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withStatus(value: PromptState): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("status")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

