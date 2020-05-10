package typingsSlinky.expressFormData.mod

import typingsSlinky.multiparty.mod.FormOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FormDataOptions extends FormOptions {
  var autoClean: js.UndefOr[Boolean] = js.native
}

object FormDataOptions {
  @scala.inline
  def apply(): FormDataOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FormDataOptions]
  }
  @scala.inline
  implicit class FormDataOptionsOps[Self <: FormDataOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAutoClean(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoClean")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAutoClean: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoClean")(js.undefined)
        ret
    }
  }
  
}

