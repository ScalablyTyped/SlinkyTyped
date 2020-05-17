package typingsSlinky.angularToastr.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Progressbar extends js.Object {
  var progressbar: js.UndefOr[String] = js.native
  var toast: js.UndefOr[String] = js.native
}

object Progressbar {
  @scala.inline
  def apply(): Progressbar = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Progressbar]
  }
  @scala.inline
  implicit class ProgressbarOps[Self <: Progressbar] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withProgressbar(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("progressbar")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutProgressbar: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("progressbar")(js.undefined)
        ret
    }
    @scala.inline
    def withToast(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("toast")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutToast: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("toast")(js.undefined)
        ret
    }
  }
  
}

