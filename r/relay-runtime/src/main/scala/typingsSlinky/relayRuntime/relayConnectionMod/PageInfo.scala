package typingsSlinky.relayRuntime.relayConnectionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PageInfo extends js.Object {
  var endCursor: String = js.native
  var hasNextPage: Boolean = js.native
  var hasPrevPage: Boolean = js.native
  var startCursor: String = js.native
}

object PageInfo {
  @scala.inline
  def apply(endCursor: String, hasNextPage: Boolean, hasPrevPage: Boolean, startCursor: String): PageInfo = {
    val __obj = js.Dynamic.literal(endCursor = endCursor.asInstanceOf[js.Any], hasNextPage = hasNextPage.asInstanceOf[js.Any], hasPrevPage = hasPrevPage.asInstanceOf[js.Any], startCursor = startCursor.asInstanceOf[js.Any])
    __obj.asInstanceOf[PageInfo]
  }
  @scala.inline
  implicit class PageInfoOps[Self <: PageInfo] (val x: Self) extends AnyVal {
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
    def withHasNextPage(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hasNextPage")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHasPrevPage(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hasPrevPage")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStartCursor(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("startCursor")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

