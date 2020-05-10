package typingsSlinky.ejWebAll.ej.Grid

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ColumnsCommand extends js.Object {
  /** Gets or sets an object that indicates to define all the button options which are available in ejButton.
    */
  var buttonOptions: js.UndefOr[js.Any] = js.native
  /** Gets or sets a value that indicates to add the command column button. See unboundType
    */
  var `type`: js.UndefOr[UnboundType | String] = js.native
}

object ColumnsCommand {
  @scala.inline
  def apply(): ColumnsCommand = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ColumnsCommand]
  }
  @scala.inline
  implicit class ColumnsCommandOps[Self <: ColumnsCommand] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withButtonOptions(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("buttonOptions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutButtonOptions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("buttonOptions")(js.undefined)
        ret
    }
    @scala.inline
    def withType(value: UnboundType | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(js.undefined)
        ret
    }
  }
  
}

