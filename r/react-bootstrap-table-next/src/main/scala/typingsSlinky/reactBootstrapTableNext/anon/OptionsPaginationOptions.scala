package typingsSlinky.reactBootstrapTableNext.anon

import typingsSlinky.reactBootstrapTableNext.mod.PaginationOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OptionsPaginationOptions extends js.Object {
  var options: js.UndefOr[PaginationOptions] = js.native
}

object OptionsPaginationOptions {
  @scala.inline
  def apply(): OptionsPaginationOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OptionsPaginationOptions]
  }
  @scala.inline
  implicit class OptionsPaginationOptionsOps[Self <: OptionsPaginationOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withOptions(value: PaginationOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("options")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOptions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("options")(js.undefined)
        ret
    }
  }
  
}

