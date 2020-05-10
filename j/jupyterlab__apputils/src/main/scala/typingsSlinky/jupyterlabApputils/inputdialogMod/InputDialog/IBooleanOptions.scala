package typingsSlinky.jupyterlabApputils.inputdialogMod.InputDialog

import typingsSlinky.jupyterlabApputils.dialogMod.Dialog.Header
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Constructor options for boolean input dialogs
  */
@js.native
trait IBooleanOptions extends IOptions {
  /**
    * Default value
    */
  var value: js.UndefOr[Boolean] = js.native
}

object IBooleanOptions {
  @scala.inline
  def apply(title: Header): IBooleanOptions = {
    val __obj = js.Dynamic.literal(title = title.asInstanceOf[js.Any])
    __obj.asInstanceOf[IBooleanOptions]
  }
  @scala.inline
  implicit class IBooleanOptionsOps[Self <: IBooleanOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withValue(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("value")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutValue: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("value")(js.undefined)
        ret
    }
  }
  
}

