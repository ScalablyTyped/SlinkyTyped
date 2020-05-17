package typingsSlinky.gitlab.requestHelperMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PaginationResponse extends GetResponse {
  var data: js.Array[js.Object] = js.native
  var pagination: PaginationOptions = js.native
}

object PaginationResponse {
  @scala.inline
  def apply(data: js.Array[js.Object], pagination: PaginationOptions): PaginationResponse = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], pagination = pagination.asInstanceOf[js.Any])
    __obj.asInstanceOf[PaginationResponse]
  }
  @scala.inline
  implicit class PaginationResponseOps[Self <: PaginationResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withData(value: js.Array[js.Object]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("data")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPagination(value: PaginationOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pagination")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

