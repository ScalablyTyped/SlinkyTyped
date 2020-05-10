package typingsSlinky.relayRuntime.connectionInterfaceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PageInfo extends js.Object {
  var endCursor: js.UndefOr[String | Null] = js.native
  var hasNextPage: Boolean = js.native
  var hasPreviousPage: Boolean = js.native
  var startCursor: js.UndefOr[String | Null] = js.native
}

object PageInfo {
  @scala.inline
  def apply(hasNextPage: Boolean, hasPreviousPage: Boolean): PageInfo = {
    val __obj = js.Dynamic.literal(hasNextPage = hasNextPage.asInstanceOf[js.Any], hasPreviousPage = hasPreviousPage.asInstanceOf[js.Any])
    __obj.asInstanceOf[PageInfo]
  }
  @scala.inline
  implicit class PageInfoOps[Self <: PageInfo] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withHasNextPage(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hasNextPage")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHasPreviousPage(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hasPreviousPage")(value.asInstanceOf[js.Any])
        ret
    }
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
    def withEndCursorNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("endCursor")(null)
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
    @scala.inline
    def withStartCursorNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("startCursor")(null)
        ret
    }
  }
  
}

