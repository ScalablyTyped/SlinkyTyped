package typingsSlinky.reactBootstrapTable2Paginator.mod

import typingsSlinky.reactBootstrapTableNext.mod.PaginationOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PaginationChildProps extends PaginationOptions {
  var bootstrap4: js.UndefOr[Boolean] = js.native
  var tableId: js.UndefOr[String] = js.native
}

object PaginationChildProps {
  @scala.inline
  def apply(): PaginationChildProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PaginationChildProps]
  }
  @scala.inline
  implicit class PaginationChildPropsOps[Self <: PaginationChildProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBootstrap4(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bootstrap4")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBootstrap4: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bootstrap4")(js.undefined)
        ret
    }
    @scala.inline
    def withTableId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tableId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTableId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tableId")(js.undefined)
        ret
    }
  }
  
}

