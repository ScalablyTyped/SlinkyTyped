package typingsSlinky.reactBootstrapTable2Paginator.mod

import typingsSlinky.reactBootstrapTableNext.mod.PaginationOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PaginationCtxOptions extends js.Object {
  var options: js.UndefOr[PaginationOptions] = js.native
}

object PaginationCtxOptions {
  @scala.inline
  def apply(): PaginationCtxOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PaginationCtxOptions]
  }
  @scala.inline
  implicit class PaginationCtxOptionsOps[Self <: PaginationCtxOptions] (val x: Self) extends AnyVal {
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

