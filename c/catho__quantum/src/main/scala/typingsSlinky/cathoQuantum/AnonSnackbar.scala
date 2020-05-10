package typingsSlinky.cathoQuantum

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonSnackbar extends js.Object {
  var button: js.UndefOr[js.Object] = js.native
  var snackbar: js.UndefOr[js.Object] = js.native
}

object AnonSnackbar {
  @scala.inline
  def apply(): AnonSnackbar = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnonSnackbar]
  }
  @scala.inline
  implicit class AnonSnackbarOps[Self <: AnonSnackbar] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withButton(value: js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("button")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutButton: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("button")(js.undefined)
        ret
    }
    @scala.inline
    def withSnackbar(value: js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("snackbar")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSnackbar: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("snackbar")(js.undefined)
        ret
    }
  }
  
}

