package typingsSlinky.monacoEditor.mod.editor

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IActionDescriptor extends js.Object {
  /**
    * Control if the action should show up in the context menu and where.
    * The context menu of the editor has these default:
    *   navigation - The navigation group comes first in all cases.
    *   1_modification - This group comes next and contains commands that modify your code.
    *   9_cutcopypaste - The last default group with the basic editing commands.
    * You can also create your own group.
    * Defaults to null (don't show in context menu).
    */
  var contextMenuGroupId: js.UndefOr[String] = js.native
  /**
    * Control the order in the context menu group.
    */
  var contextMenuOrder: js.UndefOr[Double] = js.native
  /**
    * An unique identifier of the contributed action.
    */
  var id: String = js.native
  /**
    * The keybinding rule (condition on top of precondition).
    */
  var keybindingContext: js.UndefOr[String] = js.native
  /**
    * An array of keybindings for the action.
    */
  var keybindings: js.UndefOr[js.Array[Double]] = js.native
  /**
    * A label of the action that will be presented to the user.
    */
  var label: String = js.native
  /**
    * Precondition rule.
    */
  var precondition: js.UndefOr[String] = js.native
  /**
    * Method that will be executed when the action is triggered.
    * @param editor The editor instance is passed in as a convenience
    */
  def run(editor: ICodeEditor): Unit | js.Promise[Unit] = js.native
}

object IActionDescriptor {
  @scala.inline
  def apply(id: String, label: String, run: ICodeEditor => Unit | js.Promise[Unit]): IActionDescriptor = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any], run = js.Any.fromFunction1(run))
    __obj.asInstanceOf[IActionDescriptor]
  }
  @scala.inline
  implicit class IActionDescriptorOps[Self <: IActionDescriptor] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLabel(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("label")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRun(value: ICodeEditor => Unit | js.Promise[Unit]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("run")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withContextMenuGroupId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contextMenuGroupId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutContextMenuGroupId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contextMenuGroupId")(js.undefined)
        ret
    }
    @scala.inline
    def withContextMenuOrder(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contextMenuOrder")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutContextMenuOrder: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contextMenuOrder")(js.undefined)
        ret
    }
    @scala.inline
    def withKeybindingContext(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keybindingContext")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutKeybindingContext: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keybindingContext")(js.undefined)
        ret
    }
    @scala.inline
    def withKeybindings(value: js.Array[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keybindings")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutKeybindings: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keybindings")(js.undefined)
        ret
    }
    @scala.inline
    def withPrecondition(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("precondition")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPrecondition: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("precondition")(js.undefined)
        ret
    }
  }
  
}

