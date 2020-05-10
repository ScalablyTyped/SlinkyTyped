package typingsSlinky.babylonjs.BABYLON

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IExplorerExtensibilityOption extends js.Object {
  /**
    * Define the option label
    */
  var label: String = js.native
  /**
    * Defines the action to execute on click
    */
  def action(entity: js.Any): Unit = js.native
}

object IExplorerExtensibilityOption {
  @scala.inline
  def apply(action: js.Any => Unit, label: String): IExplorerExtensibilityOption = {
    val __obj = js.Dynamic.literal(action = js.Any.fromFunction1(action), label = label.asInstanceOf[js.Any])
    __obj.asInstanceOf[IExplorerExtensibilityOption]
  }
  @scala.inline
  implicit class IExplorerExtensibilityOptionOps[Self <: IExplorerExtensibilityOption] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAction(value: js.Any => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("action")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withLabel(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("label")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

