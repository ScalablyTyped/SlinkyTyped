package typingsSlinky.reactRelay.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<relay-runtime.relay-runtime.PageInfo> */
@js.native
trait PartialPageInfo extends js.Object {
  var endCursor: js.UndefOr[String] = js.native
  var hasNextPage: js.UndefOr[Boolean] = js.native
  var hasPreviousPage: js.UndefOr[Boolean] = js.native
  var startCursor: js.UndefOr[String] = js.native
}

object PartialPageInfo {
  @scala.inline
  def apply(): PartialPageInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialPageInfo]
  }
  @scala.inline
  implicit class PartialPageInfoOps[Self <: PartialPageInfo] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEndCursor(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("endCursor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEndCursor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("endCursor")(js.undefined)
        ret
    }
    @scala.inline
    def withHasNextPage(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hasNextPage")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHasNextPage: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hasNextPage")(js.undefined)
        ret
    }
    @scala.inline
    def withHasPreviousPage(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hasPreviousPage")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHasPreviousPage: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hasPreviousPage")(js.undefined)
        ret
    }
    @scala.inline
    def withStartCursor(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("startCursor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStartCursor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("startCursor")(js.undefined)
        ret
    }
  }
  
}

